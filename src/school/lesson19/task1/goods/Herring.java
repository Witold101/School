package school.lesson19.task1.goods;

public class Herring extends Goods implements SetterId {
    public Herring(int id, String name, Double price, Double discount) {
        super(id, name, price, discount);
    }

    @Override
    public Object cloneMy() {
        return new Herring(getId(), getName(), getPrice(), getDiscount());
    }
}
