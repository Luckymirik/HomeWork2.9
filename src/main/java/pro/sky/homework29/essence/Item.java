package pro.sky.homework29.essence;

public class Item {
    private int id;
    private String product;

    public Item(int id, String product) {
        this.id = id;
        this.product = product;
    }

    public Item() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }
}
