import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        AutoShop shop = new AutoShop();
        
        Breaks br_test = new Breaks("spi", 4, "rachki", 12);
        Suspension sus_test = new Suspension("Suspenison", 0, 0, 0);
        Wheel wh_test = new Wheel("name",1,1, 32);

        shop.addPart(wh_test);
        shop.addPart(sus_test);
        shop.addPart(br_test);


        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Welcome to the our Autoshop");
            System.out.println("1. Sort by ID and display items");
            System.out.println("2. Sort by price and display items");
            System.out.println("3. Add item");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Sorting by ID");
                        shop.sortPartsByID();
                        shop.displayAllParts();
                    break;
                case 2:
                    System.out.println("Sorting by price");
                        shop.sortPartsByPrice();
                        shop.displayAllParts();
                    break;
                case 3:
                    System.out.println("Add item");
                    // to do 
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            System.out.println();
        } while (choice != 4);

        scanner.close();
    }



}
