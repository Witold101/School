package school.lesson19.task1.shop;

import school.lesson15.task7.Task7;
import school.lesson19.task1.buyer.Basket;
import school.lesson19.task1.goods.SetterId;
import java.io.File;

public class CashiersDesk {

    private int id;
    private Double moneyInCashier;
    private Basket basket;
    private boolean free;

    public CashiersDesk(int id) {
        this.moneyInCashier = 0.0;
        basket = null;
        this.id = id;
        free = true;
    }

    public synchronized void printCheck(Check check) {
        File file = new File("check"+this.id+".txt");
        String SEPARATOR = "----------------------";
        Task7.writeStringLine(file, SEPARATOR, true);
        Task7.writeStringLine(file, "Kacca № " + this.id, true);
        Task7.writeStringLine(file, SEPARATOR, true);
        Task7.writeStringLine(file, "ЧЕК № " + check.getId(), true);
        Task7.writeStringLine(file, check.getDate().toString(), true);
        Task7.writeStringLine(file, SEPARATOR, true);
        check.getGoods().stream()
                .forEach((s) -> Task7.writeStringLine
                                (file, "ID = " + s.getId() + " " + s.getName() + " -- " + s.getPrice(), true));
        Task7.writeStringLine(file, SEPARATOR, true);
        Task7.writeStringLine(file, "СУММА - " + String.format("%.2f", check.getSum()), true);
    }

    public synchronized Check buildCheck(Basket basket) {
        Check check = new Check();
        for (SetterId goods : basket.getGoods()) {
            check.add(goods);
            check.addSum(goods.getSum());
        }
        return check;
    }

    public boolean isFree() {
        return this.free;
    }

    public void setFree(boolean flag) {
        this.free = flag;
    }
}