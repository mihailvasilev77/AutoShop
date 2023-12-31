public class Breaks extends Item {
    private String material;
    private int size;

    public Breaks(String name, int price, String material, int size) {
        super(name, price);
        this.material = material;
        this.size = size;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
