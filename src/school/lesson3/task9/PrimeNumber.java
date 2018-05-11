package school.lesson3.task9;

/**
 * Имеется целое число, определить является ли это число простым, т.е. делится без остатка только на 1 и себя.
 */

public class PrimeNumber {

    static boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    static boolean isPrimeNumber(int number) {
        if (number == 2 || number == 1) {
            return true;
        }
        if (isEvenNumber(number)) {
            return false;
        } else {
            for (int i = 3; i < number - 1; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }


    public static void main(String[] args) {
        System.out.println(isPrimeNumber(991));
    }
}
