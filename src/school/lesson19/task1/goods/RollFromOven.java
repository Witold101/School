package school.lesson19.task1.goods;

public class RollFromOven extends Goods  implements SetterId{

    public RollFromOven(int id, String name, Double price, Double discount) {
        super(id, name, price, discount);
    }

    @Override
    public Object cloneMy() {
        return new RollFromOven(getId(), getName(), getPrice(), getDiscount());
    }
}
