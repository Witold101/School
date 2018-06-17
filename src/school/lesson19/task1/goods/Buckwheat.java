package school.lesson19.task1.goods;

public class Buckwheat extends Goods implements SetterId {
    public Buckwheat(int id, String name, Double price, Double discount) {
        super(id, name, price, discount);
    }

    @Override
    public Object cloneMy() {
        return new Buckwheat(getId(), getName(), getPrice(), getDiscount());
    }
}
