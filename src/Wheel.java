public class Wheel extends Item{
    private int WheelSize;
    private int WheelWidth;

    public Wheel(int id, String name, int price, int size, int width) {
        super(id, name, price);
        this.WheelSize = size;
        this.WheelWidth = width;
    }

    public int getWheelSize() {
        return WheelSize;
    }

    public void setWheelSize(int wheelSize) {
        WheelSize = wheelSize;
    }

    public int getWheelWidth() {
        return WheelWidth;
    }

    public void setWheelWidth(int wheelWidth) {
        WheelWidth = wheelWidth;
    }
}
