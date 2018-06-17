package school.lesson19.task1.goods;

public class Vodka extends Goods  implements SetterId{

    public Vodka(int id, String name, Double price, Double discount) {
        super(id, name, price, discount);
    }

    @Override
    public Object cloneMy() {
        return new Vodka(getId(), getName(), getPrice(), getDiscount());
    }
}
