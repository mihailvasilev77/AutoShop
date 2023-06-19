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
        for (Item part : parts) {
            System.out.println(part);
        }
        System.out.println();
    }

    public void sortPartsByPrice() {
        Collections.sort(parts, Comparator.comparingDouble(Item::getPrice));
    }
}
