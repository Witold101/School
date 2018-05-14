package school.lesson4.task2;

public class Test {

    public static void main(String[] args) {
        int quantity100 = 4;
        int quantity50 = 10;
        int quantity20 = 35;

        AtmNew atmNew = new AtmNew(quantity20, quantity50, quantity100);
        atmNew.printCash();
        if (atmNew.getSum(20)) {
            atmNew.printCash();
            System.out.println("Выдано купюрами по 100 р - " + (quantity100 - atmNew.getNominal100()));
            System.out.println("Выдано купюрами по 50 р - " + (quantity50 - atmNew.getNominal50()));
            System.out.println("Выдано купюрами по 20 р - " + (quantity20 - atmNew.getNominal20()));

        } else {
            System.out.println("Ошибка данных!!!");
        }


    }
}
