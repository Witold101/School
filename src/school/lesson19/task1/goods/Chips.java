package school.lesson19.task1.goods;

public class Chips extends Goods implements SetterId {
    public Chips(int id, String name, Double price, Double discount) {
        super(id, name, price, discount);
    }

    @Override
    public Object cloneMy() {
        return new Chips(getId(), getName(), getPrice(), getDiscount());
    }
}
