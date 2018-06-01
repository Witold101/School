package school.lesson5.task3;

import java.math.BigDecimal;

/**
 * Определить класс, который при инициализации принимает на вход 2 аргумента целого или вещественного типа.
 * Задать методы возвращающие результат арифметических операций над заданными полями и полями типа BigDecimal.
 */

public class Accounting {

    private final int SCALE =5;

    private BigDecimal arg1;
    private BigDecimal arg2;


    public Accounting(Number arg1, Number arg2) {
        if (arg1 != null && arg2 != null) {
            if (arg1 instanceof BigDecimal) {
                this.arg1 = (BigDecimal) arg1;
            } else {
                this.arg1 = new BigDecimal(arg1.toString());
            }
            if (arg2 instanceof BigDecimal) {
                this.arg2 = (BigDecimal) arg2;
            } else {
                this.arg2 = new BigDecimal(arg2.toString());
            }
        } else {
            this.arg1 = new BigDecimal(0);
            this.arg2 = new BigDecimal(0);
        }
    }

    public BigDecimal Addition() {
        return arg1.add(arg2);
    }

    public BigDecimal Subtraction() {
        return arg1.subtract(arg2);
    }

    public BigDecimal Division() {
        if (arg2.floatValue() == 0.0){
            return null;
        }
            return arg1.divide(arg2,SCALE,BigDecimal.ROUND_HALF_UP);
    }

    public BigDecimal Multiplication() {
        return arg1.multiply(arg2);
    }

}
