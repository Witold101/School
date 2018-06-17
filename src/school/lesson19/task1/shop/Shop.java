package school.lesson19.task1.shop;

import school.lesson19.task1.buyer.Basket;
import school.lesson19.task1.buyer.Buyer;
import school.lesson19.task1.goods.*;
import java.util.*;
import java.util.concurrent.Semaphore;

public class Shop {
    private final int MIN_GOODS = 20;
    private final int MAX_GOODS = 100;
    private Semaphore semaphore;

    private int globalId = 0;

    private List<SetterId> beers;
    private List<SetterId> breads;
    private List<SetterId> buckwheats;
    private List<SetterId> chips;
    private List<SetterId> herrings;
    private List<SetterId> kefirs;
    private List<SetterId> loafList;
    private List<SetterId> milks;
    private List<SetterId> rollFromOvens;
    private List<SetterId> sausages;
    private List<SetterId> vodkas;
    private List<SetterId> yogurts;

    private Set<SetterId> assortment;

    private List<CashiersDesk> cashiersDesks;

    public Shop() {
        beers = new ArrayList<>();
        breads = new ArrayList<>();
        buckwheats = new ArrayList<>();
        chips = new ArrayList<>();
        herrings = new ArrayList<>();
        kefirs = new ArrayList<>();
        loafList = new ArrayList<>();
        milks = new ArrayList<>();
        rollFromOvens = new ArrayList<>();
        sausages = new ArrayList<>();
        vodkas = new ArrayList<>();
        yogurts = new ArrayList<>();

        assortment = new HashSet<>();

        initGoods(beers, new Beer(0, "Пиво \"Жигулевское\"", 1.8, 0.3));
        initGoods(breads, new Bread(0, "Хлеб \"Нарочанский\"", 1.1, 0.1));
        initGoods(buckwheats, new Buckwheat(0, "Гречка \"Люкс\"", 6.22, 0.77));
        initGoods(chips, new Chips(0, "Чипсы Онега", 2.8, 0.35));
        initGoods(herrings, new Herring(0, "Селедка Матиас", 4.45, 0.90));
        initGoods(kefirs, new Kefir(0, "Кефир", 0.8, 0.11));
        initGoods(loafList, new Loaf(0, "Батон", 1.1, 0.3));
        initGoods(milks, new Milk(0, "Молоко \"Классно пить\"", 0.94, 0.08));
        initGoods(rollFromOvens, new RollFromOven(0, "Булка с маком", 0.5, 0.05));
        initGoods(sausages, new Sausages(0, "Колбаски по мусульмански", 8.8, 1.06));
        initGoods(vodkas, new Vodka(0, "Водка \"Столичная\"", 9.8, 0.77));
        initGoods(yogurts, new Yogurt(0, "Йогурт", 0.65, 0.09));

        cashiersDesks = Arrays.asList(new CashiersDesk(1), new CashiersDesk(2), new CashiersDesk(3));
        this.semaphore = new Semaphore(cashiersDesks.size(), true);
    }

    private void initGoods(List<SetterId> box, SetterId goods) {
        assortment.add(goods);
        Random random = new Random();
        int randomQuantity = random.nextInt(MAX_GOODS - MIN_GOODS) + MIN_GOODS;
        for (int i = 0; i < randomQuantity; i++) {
            goods.setterId(globalId);
            box.add((SetterId) goods.cloneMy());
            globalId++;
        }
    }

    public Set<SetterId> getAssortment() {
        return assortment;
    }

    public synchronized Basket putGoodsInBasket(Map<SetterId, Integer> planPurchase, Buyer buyer) {
        Basket basket = new Basket();

        for (SetterId goods : planPurchase.keySet()) {
            if (goods instanceof Beer) {
                while (this.beers.size() > 0 && planPurchase.get(goods) > 0) {
                    Beer result = (Beer) beers.get(0);
                    basket.add(beers.remove(0));
                    planPurchase.replace(goods, planPurchase.get(goods) - 1);
                    System.out.println("Покупатель №"+buyer.getId()+" положил в карзину " + result.getName()
                            + " ID = " + result.getId());
                    if (this.beers.size() == 0 && planPurchase.get(goods) > 0) {
                        System.out.println("Долбаный магазин нет " + result.getName());
                    }
                }
            } else if (goods instanceof Bread) {
                while (this.breads.size() > 0 && planPurchase.get(goods) > 0) {
                    Bread result = (Bread) breads.get(0);
                    basket.add(breads.remove(0));
                    planPurchase.replace(goods, planPurchase.get(goods) - 1);
                    System.out.println("Покупатель №"+buyer.getId()+" положил в карзину " + result.getName() + " ID = " + result.getId());
                    if (this.beers.size() == 0 && planPurchase.get(goods) > 0) {
                        System.out.println("Долбаный магазин нет " + result.getName());
                    }
                }
            } else if (goods instanceof Buckwheat) {
                while (this.buckwheats.size() > 0 && planPurchase.get(goods) > 0) {
                    Buckwheat result = (Buckwheat) buckwheats.get(0);
                    basket.add(buckwheats.remove(0));
                    planPurchase.replace(goods, planPurchase.get(goods) - 1);
                    System.out.println("Покупатель №"+buyer.getId()+" положил в карзину " + result.getName() + " ID = " + result.getId());
                    if (this.buckwheats.size() == 0 && planPurchase.get(goods) > 0) {
                        System.out.println("Долбаный магазин нет " + result.getName());
                    }
                }
            } else if (goods instanceof Chips) {
                while (this.chips.size() > 0 && planPurchase.get(goods) > 0) {
                    Chips result = (Chips) chips.get(0);
                    basket.add(chips.remove(0));
                    planPurchase.replace(goods, planPurchase.get(goods) - 1);
                    System.out.println("Покупатель №"+buyer.getId()+" положил в карзину " + result.getName() + " ID = " + result.getId());
                    if (this.chips.size() == 0 && planPurchase.get(goods) > 0) {
                        System.out.println("Долбаный магазин нет " + result.getName());
                    }
                }
            } else if (goods instanceof Herring) {
                while (this.herrings.size() > 0 && planPurchase.get(goods) > 0) {
                    Herring result = (Herring) herrings.get(0);
                    basket.add(herrings.remove(0));
                    planPurchase.replace(goods, planPurchase.get(goods) - 1);
                    System.out.println("Покупатель №"+buyer.getId()+" положил в карзину " + result.getName() + " ID = " + result.getId());
                    if (this.herrings.size() == 0 && planPurchase.get(goods) > 0) {
                        System.out.println("Долбаный магазин нет " + result.getName());
                    }
                }
            } else if (goods instanceof Kefir) {
                while (this.kefirs.size() > 0 && planPurchase.get(goods) > 0) {
                    Kefir result = (Kefir) kefirs.get(0);
                    basket.add(kefirs.remove(0));
                    planPurchase.replace(goods, planPurchase.get(goods) - 1);
                    System.out.println("Покупатель №"+buyer.getId()+" положил в карзину " + result.getName() + " ID = " + result.getId());
                    if (this.kefirs.size() == 0 && planPurchase.get(goods) > 0) {
                        System.out.println("Долбаный магазин нет " + result.getName());
                    }
                }
            } else if (goods instanceof Loaf) {
                while (this.loafList.size() > 0 && planPurchase.get(goods) > 0) {
                    Loaf result = (Loaf) loafList.get(0);
                    basket.add(loafList.remove(0));
                    planPurchase.replace(goods, planPurchase.get(goods) - 1);
                    System.out.println("Покупатель №"+buyer.getId()+" положил в карзину " + result.getName() + " ID = " + result.getId());
                    if (this.loafList.size() == 0 && planPurchase.get(goods) > 0) {
                        System.out.println("Долбаный магазин нет " + result.getName());
                    }
                }
            } else if (goods instanceof Milk) {
                while (this.milks.size() > 0 && planPurchase.get(goods) > 0) {
                    Milk result = (Milk) milks.get(0);
                    basket.add(milks.remove(0));
                    planPurchase.replace(goods, planPurchase.get(goods) - 1);
                    System.out.println("Покупатель №"+buyer.getId()+" положил в карзину " + result.getName() + " ID = " + result.getId());
                    if (this.milks.size() == 0 && planPurchase.get(goods) > 0) {
                        System.out.println("Долбаный магазин нет " + result.getName());
                    }
                }
            } else if (goods instanceof RollFromOven) {
                while (this.rollFromOvens.size() > 0 && planPurchase.get(goods) > 0) {
                    RollFromOven result = (RollFromOven) rollFromOvens.get(0);
                    basket.add(rollFromOvens.remove(0));
                    planPurchase.replace(goods, planPurchase.get(goods) - 1);
                    System.out.println("Покупатель №"+buyer.getId()+" положил в карзину " + result.getName() + " ID = " + result.getId());
                    if (this.rollFromOvens.size() == 0 && planPurchase.get(goods) > 0) {
                        System.out.println("Долбаный магазин нет " + result.getName());
                    }
                }
            } else if (goods instanceof Sausages) {
                while (this.sausages.size() > 0 && planPurchase.get(goods) > 0) {
                    Sausages result = (Sausages) sausages.get(0);
                    basket.add(sausages.remove(0));
                    planPurchase.replace(goods, planPurchase.get(goods) - 1);
                    System.out.println("Покупатель №"+buyer.getId()+" положил в карзину " + result.getName() + " ID = " + result.getId());
                    if (this.sausages.size() == 0 && planPurchase.get(goods) > 0) {
                        System.out.println("Долбаный магазин нет " + result.getName());
                    }
                }
            } else if (goods instanceof Vodka) {
                while (this.vodkas.size() > 0 && planPurchase.get(goods) > 0) {
                    Vodka result = (Vodka) vodkas.get(0);
                    basket.add(vodkas.remove(0));
                    planPurchase.replace(goods, planPurchase.get(goods) - 1);
                    System.out.println("Покупатель №"+buyer.getId()+" положил в карзину " + result.getName() + " ID = " + result.getId());
                    if (this.vodkas.size() == 0 && planPurchase.get(goods) > 0) {
                        System.out.println("Долбаный магазин нет " + result.getName());
                    }
                }
            } else if (goods instanceof Yogurt) {
                while (this.yogurts.size() > 0 && planPurchase.get(goods) > 0) {
                    Yogurt result = (Yogurt) yogurts.get(0);
                    basket.add(yogurts.remove(0));
                    planPurchase.replace(goods, planPurchase.get(goods) - 1);
                    System.out.println("Покупатель №"+buyer.getId()+" положил в карзину " + result.getName() + " ID = " + result.getId());
                    if (this.yogurts.size() == 0 && planPurchase.get(goods) > 0) {
                        System.out.println("Долбаный магазин нет " + result.getName());
                    }
                }
            }
        }
        return basket;
    }

    public synchronized CashiersDesk getFreeCashDesk() {
        try {
            semaphore.acquire();
            for (CashiersDesk cd : cashiersDesks) {
                if (cd.isFree()) {
                    cd.setFree(false);
                    return cd;
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Semaphore getSemaphore(){
        return this.semaphore;
    }
}
