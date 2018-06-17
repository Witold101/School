package school.lesson19.task1.goods;

public class Milk extends Goods  implements SetterId{
    public Milk(int id, String name, Double price, Double discount) {
        super(id, name, price, discount);
    }

    @Override
    public Object cloneMy() {
        return new Milk(getId(), getName(), getPrice(), getDiscount());
    }
}
