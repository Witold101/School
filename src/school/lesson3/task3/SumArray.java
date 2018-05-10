package school.lesson3.task3;

public class SumArray {

    /**
     * Определить сумму элементов целочисленного массива, расположенных между минимальным и максимальным значениями.
     */

    static int[] sortArray(int[] array) {
        int left = 0;
        int right = array.length - 1;
        int temp;

        do {
            for (int i = 0; i < right; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
            right--;
            for (int i = right; i > left; i--) {
                if (array[i] < array[i - 1]) {
                    temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                }
            }
            left++;
        } while (right > left);

        return array;
    }

    static int[] searchIndexMinimumMaximumValueArray(int[] array) {
        int minimum[] = new int[]{0, 0};
        int maximum[] = new int[]{0, 0};

        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                minimum[0] = i;
                minimum[1] = array[i];
                maximum[0] = i;
                maximum[1] = array[i];
            } else {
                if (array[i] <= minimum[1]) {
                    minimum[0] = i;
                    minimum[1] = array[i];
                }
                if (array[i] > maximum[1]) {
                    maximum[0] = i;
                    maximum[1] = array[i];
                }
            }
        }
        return new int[]{minimum[0], maximum[0]};
    }

    static int sumArrayValue(int minimumIndex, int maximumIndex, int[] array) {
        int result = 0;

        if (minimumIndex>maximumIndex){
            int temp = minimumIndex;
            minimumIndex=maximumIndex;
            maximumIndex=temp;
        }
        if (minimumIndex < maximumIndex-1) {
            for (int i =minimumIndex+1;i<=maximumIndex-1;i++){
                result=result+array[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {

        int[] array = {1,18,9,1};
        int minimumIndex=searchIndexMinimumMaximumValueArray(array)[0];
        int maximumIndex=searchIndexMinimumMaximumValueArray(array)[1];

        System.out.print("The sum of numbers equal- " + sumArrayValue(minimumIndex,maximumIndex,array));
    }
}
