package school.lesson19.task1.goods;

public class Yogurt extends Goods  implements SetterId{
    public Yogurt(int id, String name, Double price, Double discount) {
        super(id, name, price, discount);
    }

    @Override
    public Object cloneMy() {
        return new Yogurt(getId(), getName(), getPrice(), getDiscount());
    }
}
