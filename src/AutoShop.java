import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AutoShop {
    private List<Item> parts;

    public AutoShop() {
        parts = new ArrayList<>();
    }

    public void addPart(Item part) {
        parts.add(part);
    }

    public void removePart(Item part) {
        parts.remove(part);
    }

    public List<Item> getAllParts() {
        return parts;
    }

    public void displayAllParts() {
        System.out.println("Available Auto Parts:");
        System.out.println("ID : Name   : Price");
        for (Item part : parts) {
            System.out.printf("%d : %s : %d lea \n", part.getId(), part.getName(), part.getPrice());
            
        }
        System.out.println();
    }

    public void sortPartsByPrice() {
        Collections.sort(parts, Comparator.comparingDouble(Item::getPrice));
    }
    public void sortPartsByID() {
        Collections.sort(parts, Comparator.comparingDouble(Item::getId));
    }
}
