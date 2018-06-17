package school.lesson19.task1.goods;

public class Sausages extends Goods implements SetterId {
    public Sausages(int id, String name, Double price, Double discount) {
        super(id, name, price, discount);
    }

    @Override
    public Object cloneMy() {
        return new Sausages(getId(), getName(), getPrice(), getDiscount());
    }
}
