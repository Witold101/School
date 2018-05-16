package school.lesson3.task4_4;

import school.lesson3.task1_1.ArrayCycle;

/**
 * Написать функцию linearize, которая принимает в качестве параметра двумерный массив
 * и возвращает одномерный массив со всеми элементами двумерного.
 */

public class LineArize {

    static int[] linearize(int[][]array){
        int lengthArray=0;
        for (int i = 0; i < array.length; i++) {
            lengthArray=array[i].length+lengthArray;
        }
        int[]result=new int[lengthArray];

        int token=0;
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array[i].length; j++) {
                result[token]=array[i][j];
                token++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][]array = new int[][]{{12,3,4,56},{20,45},{},{45,9,8,7,6}};
        ArrayCycle.printArray(linearize(array));
    }
}
