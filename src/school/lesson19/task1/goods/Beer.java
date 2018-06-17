package school.lesson19.task1.goods;

public class Beer extends Goods implements SetterId {

    public Beer(int id, String name, Double price, Double discount) {
        super(id, name, price, discount);
    }

    @Override
    public void setterId(int id) {
        super.setId(id);
    }

    @Override
    public Object cloneMy() {
        return new Beer(getId(), getName(), getPrice(), getDiscount());
    }
}
