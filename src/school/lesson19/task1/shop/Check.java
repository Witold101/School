package school.lesson19.task1.shop;

import school.lesson19.task1.goods.SetterId;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Check {
    private static int id;
    private LocalDateTime date;
    private List<SetterId> goods;
    private Double sum;

    public Check(LocalDateTime date, List<SetterId> goods, Double sum) {
        this.date = date;
        this.goods = goods;
        this.sum = sum;
        Check.id++;
    }

    public Check() {
        this.date = LocalDateTime.now();
        this.goods = new ArrayList<>();
        this.sum = 0.0;
        Check.id++;
    }

    public int getId() {
        return id;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public List<SetterId> getGoods() {
        return goods;
    }

    public Double getSum() {
        return sum;
    }

    public void setGoods(List<SetterId> goods) {
        this.goods = goods;
    }

    public void setSum(Double sum) {
        this.sum = sum;
    }

    public void add(SetterId goods) {
        this.goods.add(goods);
    }

    public void addSum(Double sum) {
        this.sum += sum;
    }
}
