public class Suspension extends Item {
    private int size;
    private int diamater;


    public Suspension(String name, int price, int size, int diamater) {
        super(name,price);
        this.size = size;
        this.diamater = diamater;
    }

    public int getSize() {
        return this.size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getDiamater() {
        return this.diamater;
    }

    public void setDiamater(int diamater) {
        this.diamater = diamater;
    }

}
