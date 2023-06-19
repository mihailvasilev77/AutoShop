public abstract class Item {
    private static int s_id = 1;
    int id;
    private String name;
    private int price;

    public Item() {
        this.id += 1;
        this.name = null;
        this.price = 0;
    }

    public Item(String name, int price) {
        this.id = this.s_id;
        s_id++;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
