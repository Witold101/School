package school.lesson3.task2_2;

import school.lesson3.task1_1.ArrayCycle;

/**
 * Написать программу, удаляющую все повторяющиеся целые числа из массива и печатающую результат.
 */

public class SeparatorIdenticalNumbers {

    static int[] separatorIdenticalNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int temp = array[i];
            if (array[i] > 0) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[j] == temp && temp > 0) {
                        array[j] = 0;
                        if (array[i] > 0) {
                            array[i] = 0;
                        }
                    }
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {

        int[] array = ArrayCycle.randomArray(10, 1, 5);
        ArrayCycle.printArray(array);
        array=separatorIdenticalNumbers(array);
        ArrayCycle.printArray(array);

    }
}
