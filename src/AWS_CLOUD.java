import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.document.DynamoDB;
import com.amazonaws.services.dynamodbv2.document.Item;
import com.amazonaws.services.dynamodbv2.document.Table;
import com.fasterxml.jackson.databind.ObjectMapper;

public class SaveOrderFunction implements RequestHandler<APIGatewayProxyRequestEvent, APIGatewayProxyResponseEvent> {

    private static final String auto_shop = "Orders"; 

    private final AmazonDynamoDB dynamoDBClient;
    private final DynamoDB dynamoDB;
    private final Table ordersTable;

    public SaveOrderFunction() {
        dynamoDBClient = AmazonDynamoDBClientBuilder.defaultClient();
        dynamoDB = new DynamoDB(dynamoDBClient);
        ordersTable = dynamoDB.getTable(DYNAMODB_TABLE_NAME);
    }

    @Override
    public APIGatewayProxyResponseEvent handleRequest(APIGatewayProxyRequestEvent input, Context context) {
        try {
            Order order = parseInputData(input.getBody());

            saveOrder(order);

            return new APIGatewayProxyResponseEvent().withStatusCode(200).withBody("Order saved successfully");
        } catch (Exception e) {
            return new APIGatewayProxyResponseEvent().withStatusCode(500).withBody("Error saving order: " + e.getMessage());
        }
    }


private Order parseInputData(String inputData) throws IOException {
    ObjectMapper objectMapper = new ObjectMapper();
    return objectMapper.readValue(inputData, Order.class);
}
    private void saveOrder(Order order) {
        
        Item item = new Item()
                .withPrimaryKey("orderId", order.getOrderId())
                .withString("customerName", order.getCustomerName())
                .withString("orderDetails", order.getOrderDetails());

        ordersTable.putItem(item);
    }
}
