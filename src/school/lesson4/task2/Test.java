package school.lesson4.task2;

public class Test {

    public static void main(String[] args) {
        int quantity100 = 4;
        int quantity50 = 10;
        int  quantity20 = 35;

        Atm atm =new Atm(quantity20,quantity50,quantity100);
        atm.printCash();
        int sum = 1580;

        System.out.println("-------------------------------------");
        if (atm.getMany(sum)){
            System.out.println("Сумма в размере "+sum+" выдана в полном объеме!!!");
            System.out.println("Банкноты номиналом 100 рубл - "+(quantity100-atm.getNominal100()));
            System.out.println("Банкноты номиналом 50 рубл - "+(quantity50-atm.getNominal50()));
            System.out.println("Банкноты номиналом 20 рубл - "+(quantity20-atm.getNominal20()));
        }else {
            System.out.println("Ошибка выполнения программы!!!");
        }
        System.out.println("---------------------------------------");

        atm.printCash();

    }
}
