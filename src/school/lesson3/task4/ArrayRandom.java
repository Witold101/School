package school.lesson3.task4;

import java.util.Random;

public class ArrayRandom {

    /**
     * Создать массив из 4 случайных целых чисел из отрезка [10;99], вывести его на экран в строку.
     * Определить и вывести на экран сообщение о том, является ли массив строго возрастающей последовательностью.
     */

    static int[] arrayGeneration() {
        Random random = new Random();
        int[] array = new int[4];
        for (int i = 0; i < 4; i++) {
            array[i] = random.nextInt(90)+10;
        }
        return array;
    }

    static boolean sequence(int[] array) {
        boolean flag = false;
        for (int i = 0; i < array.length-1; i++) {
            if (array[i] < array[i + 1]) {
                flag = true;
            }else {
                flag=false;
                break;
            }
        }
        return flag;
    }


    public static void main(String[] args) {
        int[] array = arrayGeneration();
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.print(sequence(array));
    }
}
