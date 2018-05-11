package school.lesson3.task10;

/**
 * Написать алгоритм расчета факториала , используя циклы (for и while).
 */

public class Factorial {

    static long factorialFor(int number) {
        long factorial = number;
        for (int i = number; i > 1; i--) {
            factorial = factorial * (i - 1);
        }
        return factorial;
    }

    static long factorialWhile(int number) {
        long factorial = number;
        while (number > 1) {
            factorial = factorial * (number - 1);
            number--;
        }
        return factorial;
    }

    public static void main(String[] args) {
        System.out.println(factorialFor(10));
        System.out.println(factorialWhile(1));

    }
}
