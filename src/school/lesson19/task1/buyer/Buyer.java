package school.lesson19.task1.buyer;

import school.lesson19.task1.goods.SetterId;
import school.lesson19.task1.shop.CashiersDesk;
import school.lesson19.task1.shop.Check;
import school.lesson19.task1.shop.Shop;

import java.util.*;

public class Buyer implements Runnable {
    private int MAX_GOODS = 5;
    private int id;
    private Map<SetterId, Integer> planPurchase;
    private Set<SetterId> assortmentInShop;
    private Basket basket;
    private Shop shop;
    private Check check;

    public Buyer(Shop shop, int id) {
        this.planPurchase = new HashMap<>();
        this.shop = shop;
        this.assortmentInShop = shop.getAssortment();
        generatePlanPurchase();
        this.basket = new Basket();
        this.id = id;
    }

    private void generatePlanPurchase() {
        if (this.assortmentInShop != null) {
            Random random = new Random();
            for (SetterId s : this.assortmentInShop) {
                this.planPurchase.put(s, random.nextInt(MAX_GOODS));
            }
        }
    }

    public Map<SetterId, Integer> getPlanPurchase() {
        return planPurchase;
    }

    public int getId() {
        return id;
    }

    public synchronized void toFillABasket() {
        this.basket = this.shop.putGoodsInBasket(planPurchase, this);
    }

    public void toCashiersDesk() {
        CashiersDesk freeCashDesk = this.shop.getFreeCashDesk();
        this.check = freeCashDesk.buildCheck(this.basket);
        freeCashDesk.setFree(true);
        freeCashDesk.printCheck(check);
        shop.getSemaphore().release();
    }

    @Override
    public void run() {
        System.out.println("Покупатель №"+getId()+" вошел в магазин.");
        this.toFillABasket();
        this.toCashiersDesk();
        System.out.println("Покупатель №"+getId()+" вышел из магазина.");
    }
}
