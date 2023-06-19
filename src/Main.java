public class Main {
    public static void main(String[] args) {
        AutoShop shop = new AutoShop();
        Breaks br = new Breaks("spi", 4, "rachki", 0);
        Suspension sus = new Suspension("Suspenison", 0, 0, 0);
        Wheel wh = new Wheel("name",1,1,1);

        shop.addPart(wh);
        shop.addPart(sus);
        shop.addPart(br);

        shop.displayAllParts();
        shop.sortPartsByPrice();
        shop.displayAllParts();


    }
}