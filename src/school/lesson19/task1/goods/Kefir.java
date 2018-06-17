package school.lesson19.task1.goods;

public class Kefir extends Goods implements SetterId {
    public Kefir(int id, String name, Double price, Double discount) {
        super(id, name, price, discount);
    }

    @Override
    public Object cloneMy() {
        return new Kefir(getId(), getName(), getPrice(), getDiscount());
    }
}
