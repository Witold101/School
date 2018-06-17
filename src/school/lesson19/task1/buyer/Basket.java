package school.lesson19.task1.buyer;

import school.lesson19.task1.goods.SetterId;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Basket {
    List<SetterId> goods;

    public Basket() {
        goods = new ArrayList<>();
    }

    public void add(SetterId goods) {
        this.goods.add(goods);
    }

    public void dell(SetterId good) {
        if (goods.contains(good)) {
            this.goods.remove(good);
        }
    }

    public List<SetterId> getGoods() {
        return goods;
    }
}
