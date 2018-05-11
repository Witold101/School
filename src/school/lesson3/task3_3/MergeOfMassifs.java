package school.lesson3.task3_3;

import school.lesson3.task1_1.ArrayCycle;

/**
 * Заданы 2 массива целых чисел произвольной длины.
 * Написать программу, создающую третий массив, представляющий собой слияние 2-х заданных.
 * Пример:
 * 1-й массив: {1, 2, 3, 4, 5}
 * 2-й массив: {5, 6, 7}
 * <p>
 * Результат: {1, 5, 2, 6, 3, 7, 4, 5}
 */

public class MergeOfMassifs {

    static int[] writeToPosition(int[] array, int position, int value) {
        if (array.length > position) {
            array[position] = value;
        }
        return array;
    }


    static int[] mergeOfMassifs(int[] array1, int[] array2) {
        int[] result = new int[array1.length + array2.length];
        // flag - Shows from what massif takes value
        int flag = 1;
        int iteratorArray1 = 0;
        int iteratorArray2 = 0;

        for (int i = 0; i < result.length; i++) {
            switch (flag) {
                case 1: {
                    if (array1.length > iteratorArray1) {
                        result = writeToPosition(result, i, array1[iteratorArray1]);
                        iteratorArray1++;
                    } else {
                        i--;
                    }
                    flag = 2;
                }
                break;
                case 2: {
                    if (array2.length > iteratorArray2) {
                        result = writeToPosition(result, i, array2[iteratorArray2]);
                        iteratorArray2++;
                    } else {
                        i--;
                    }
                    flag = 1;
                }
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array1 = ArrayCycle.randomArray(2, 0, 20);
        int[] array2 = ArrayCycle.randomArray(5, 4, 20);
        int[] result;

        ArrayCycle.printArray(array1);
        ArrayCycle.printArray(array2);
        result = mergeOfMassifs(array1, array2);
        ArrayCycle.printArray(result);
    }
}
