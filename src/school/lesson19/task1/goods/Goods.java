package school.lesson19.task1.goods;

public class Goods implements SetterId {
    private int id;
    private String name;
    private Double price;
    private Double discount;

    public Goods(int id, String name, Double price, Double discount) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public Double getDiscount() {
        return discount;
    }

    @Override
    public void setterId(int id) {
        this.id = id;
    }

    @Override
    public Object cloneMy() {
        return new Goods(this.id, this.name, this.price, this.discount);
    }

    @Override
    public Double getSum() {
        return this.price;
    }

}
