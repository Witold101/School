package school.lesson4.task2;

public class AtmNew {
    private final int NOMINAL_20 = 20;
    private final int NOMINAL_50 = 50;
    private final int NOMINAL_100 = 100;

    private int nominal20;
    private int nominal50;
    private int nominal100;

    public AtmNew(int nominal20, int nominal50, int nominal100) {
        this.nominal20 = nominal20;
        this.nominal50 = nominal50;
        this.nominal100 = nominal100;
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
     * @param sum               - all sum
     * @param nominal           - nominal banknotes
     * @param quantityBanknotes - quantity banknotes in ATM this nominal
     * @return [0] sum, [1]- quantity banknotes
     */
    private int[] getBanknotes(int sum, int nominal, int quantityBanknotes) {
        int[] result = new int[]{sum, 0};
        while (result[0] >= nominal && quantityBanknotes > 0) {
            result[0] = result[0] - nominal;
            result[1]++;
            quantityBanknotes--;
        }
        return result;
    }

    public boolean getSum(int sum) {
        int[] sumAndQuantityBanknotes;

        sumAndQuantityBanknotes = getBanknotes(sum, NOMINAL_100, nominal100);
        setNominal100(getNominal100() - sumAndQuantityBanknotes[1]);
        if (sumAndQuantityBanknotes[0] < NOMINAL_50 && sumAndQuantityBanknotes[0] % NOMINAL_20 > 0 &&
                sumAndQuantityBanknotes[1] > 0) {
            setNominal100(getNominal100()+1);
            sumAndQuantityBanknotes[0]=sumAndQuantityBanknotes[0]+NOMINAL_100;
        }
        sumAndQuantityBanknotes = getBanknotes(sumAndQuantityBanknotes[0], NOMINAL_50, nominal50);
        setNominal50(getNominal50() - sumAndQuantityBanknotes[1]);

        if (sumAndQuantityBanknotes[0] % NOMINAL_20 == 0) {
            sumAndQuantityBanknotes = getBanknotes(sumAndQuantityBanknotes[0], NOMINAL_20, nominal20);
            setNominal20(getNominal20() - sumAndQuantityBanknotes[1]);
        } else if (sumAndQuantityBanknotes[1] > 0) {
            sumAndQuantityBanknotes[0] = sumAndQuantityBanknotes[0] + NOMINAL_50;
            setNominal50(getNominal50() + 1);
            sumAndQuantityBanknotes = getBanknotes(sumAndQuantityBanknotes[0], NOMINAL_20, nominal20);
            setNominal20(getNominal20() - sumAndQuantityBanknotes[1]);
        } else {
            return false;
        }
        return sumAndQuantityBanknotes[0] == 0;
    }

    public void printCash() {
        System.out.println("Количество банкнот номиналом 20 - " + getNominal20());
        System.out.println("Количество банкнот номиналом 50 - " + getNominal50());
        System.out.println("Количество банкнот номиналом 100 - " + getNominal100());
    }
}
