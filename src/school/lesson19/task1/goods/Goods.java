package school.lesson19.task1.goods;

public class Goods {
    private int id;
    private String name;
    private float price;
    private float discount;

    public Goods(int id, String name, float price, float discount) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public float getDiscount() {
        return discount;
    }
}
