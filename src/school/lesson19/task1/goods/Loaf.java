package school.lesson19.task1.goods;

public class Loaf extends Goods implements SetterId {
    public Loaf(int id, String name, Double price, Double discount) {
        super(id, name, price, discount);
    }

    @Override
    public Object cloneMy() {
        return new Loaf(getId(), getName(), getPrice(), getDiscount());
    }
}
