package school.lesson3.task1_1;

import java.util.Random;

/**
 * Напишите программу, которая циклически сдвигает элементы массива вправо на одну позицию, и печатает результат.
 * Цикличность означает, что последний элемент массива становится самым первым его элементом.
 */


public class ArrayCycle {

    static int[] arrayCycle(int[] array, int step) {
        int temp;
        for (int i = 0; i < step; i++) {
            temp = array[array.length - 1];
            for (int j = array.length - 1; j > 0; j--) {
                array[j] = array[j - 1];
            }
            array[0] = temp;
        }
        return array;
    }

    public static int[] randomArray(int maxIndex, int minInt, int maxInt) {
        int[] array = new int[maxIndex];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(maxInt+1 - minInt) + minInt;
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(i+": " + array[i]);
        }
    }

    public static void main(String[] args) {
        int[] array = randomArray(15, 7, 20);
        printArray(array);
        array = arrayCycle(array, 1);
        printArray(array);
    }
}
