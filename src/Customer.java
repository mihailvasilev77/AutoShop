public class Customer extends User{
    private String email;


    public Customer(String name, String password, String email) {
        super(name, password);
        this.email = email;
    }


    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void BuyParts(Item part, AutoShop shop){
        shop.removePart(part);
    }
    
    
}
