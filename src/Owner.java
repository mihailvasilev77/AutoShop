public class Owner extends User{
    Owner(String name, String password){
        super(name, password);
    }    

    public void StockUpParts(Item part, AutoShop shop){
        shop.addPart(part);
    }
}
