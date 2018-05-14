package school.lesson4.task2;

/**
 * Создать класс, описывающий банкомат.
 * Набор купюр, находящихся в банкомате должен задаваться тремя свойствами:
 * количеством купюр номиналом 20, 50 и 100. Сделать методы для добавления денег в банкомат.
 * Сделать функцию, снимающую деньги, которая принимает сумму денег, а возвращает булевое значение - успешность
 * выполнения операции.
 * При снятии денег функция должна распечатывать каким количеством купюр какого номинала выдаётся сумма.
 * Создать конструктор с тремя параметрами - количеством купюр каждого номинала.
 */

public class Atm {
    private final int NOMINAL_20 = 20;
    private final int NOMINAL_50 = 50;
    private final int NOMINAL_100 = 100;

    private int nominal20;
    private int nominal50;
    private int nominal100;

    public Atm(int nomina20, int nomina50, int nomina100) {
        this.nominal20 = nomina20;
        this.nominal50 = nomina50;
        this.nominal100 = nomina100;
    }

    public int getNominal20() {
        return nominal20;
    }

    public void setNominal20(int nominal20) {
        this.nominal20 = nominal20;
    }

    public int getNominal50() {
        return nominal50;
    }

    public void setNominal50(int nominal50) {
        this.nominal50 = nominal50;
    }

    public int getNominal100() {
        return nominal100;
    }

    public void setNominal100(int nominal100) {
        this.nominal100 = nominal100;
    }

    /**
     * Return quantity banknotes [0]- nominal 20, [1]- nominal 50, [2]- nominal 100
     */
    private int[] getBanknotesStep1(int sum) {
        int[] tempBanknotes = new int[]{0, 0, 0};

        if (sum % NOMINAL_20 == 0) {
            tempBanknotes[0] = sum / NOMINAL_20;
        } else if (sum >= NOMINAL_50) {
            sum = sum - NOMINAL_50;
            tempBanknotes[0] = sum / NOMINAL_20;
            tempBanknotes[1]++;
        } else {
            tempBanknotes[0] = 0;
            tempBanknotes[1] = 0;
            return tempBanknotes;
        }
        if (tempBanknotes[0] >= NOMINAL_100 / NOMINAL_20) {
            tempBanknotes[2] = tempBanknotes[0] / (NOMINAL_100 / NOMINAL_20);
            tempBanknotes[0] = tempBanknotes[0] - tempBanknotes[2] * (NOMINAL_100 / NOMINAL_20);
        }
        return tempBanknotes;
    }


//    private boolean getMany(int quantityBanknotes,int nominal, int sum){
//        while (quantityBanknotes > 0 && sum >= nominal) {
//            sum = sum - NOMINAL_50;
//            this.nominal50--;
//            tempBanknotes[1]++;
//        }
//    }


    private boolean getBanknotesStep2(int sum) {
        int[] tempBanknotes = new int[]{0, 0};

        while (this.nominal50 > 0 && sum >= NOMINAL_50 * 2) {
            sum = sum - NOMINAL_50;
            this.nominal50--;
            tempBanknotes[1]++;
        }
        if (sum < NOMINAL_50 * 2 && this.nominal50 > 0) {
            if (sum == NOMINAL_50) {
                sum = sum - NOMINAL_50;
                this.nominal50--;
                tempBanknotes[1]++;
            } else {
                while (sum != 50 && sum != 0) {
                    sum = sum - NOMINAL_20;
                    this.nominal20--;
                    tempBanknotes[0]++;
                }
                if (sum == NOMINAL_50) {
                    sum = sum - NOMINAL_50;
                    this.nominal50--;
                    tempBanknotes[1]++;
                }
            }
        }
        if (sum % NOMINAL_20 == 0) {
            while (sum > 0 && this.nominal20 > 0) {
                sum = sum - NOMINAL_20;
                nominal20--;
                tempBanknotes[0]++;
            }
        } else {
            this.nominal50++;
            sum = +NOMINAL_50;
            while (sum > 0 && this.nominal20 > 0) {
                sum = sum - NOMINAL_20;
                nominal20--;
                tempBanknotes[0]++;
            }
        }

        return sum == 0;
    }

    public boolean getMany(int sum) {
        int[] tempBanknotes = getBanknotesStep1(sum);

        if (this.nominal100 >= tempBanknotes[2]) {
            setNominal100(getNominal100() - tempBanknotes[2]);
            sum = sum - NOMINAL_100 * tempBanknotes[2];
            tempBanknotes[2] = 0;
        } else {
            tempBanknotes[2] = tempBanknotes[2] - getNominal100();
            sum = sum - NOMINAL_100 * getNominal100();
            setNominal100(0);
            tempBanknotes[1] = tempBanknotes[1] + tempBanknotes[2] * (NOMINAL_100 / NOMINAL_50);
            tempBanknotes[2] = 0;
        }
        return getBanknotesStep2(sum);
    }

    public void printCash() {
        System.out.println("Количество банкнот номиналом 20 - " + getNominal20());
        System.out.println("Количество банкнот номиналом 50 - " + getNominal50());
        System.out.println("Количество банкнот номиналом 100 - " + getNominal100());
    }
}
