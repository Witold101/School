package school.lesson19.task1.goods;

public class Bread extends Goods  implements SetterId{
    public Bread(int id, String name, Double price, Double discount) {
        super(id, name, price, discount);
    }

    @Override
    public Object cloneMy() {
        return new Bread(getId(), getName(), getPrice(), getDiscount());
    }
}
