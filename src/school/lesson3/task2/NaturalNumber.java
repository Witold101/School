package school.lesson3.task2;

public class NaturalNumber {

    /**
     * Напишите программу, заносящую в массив первые 100 натуральных чисел,
     * делящихся на 13 или на 17, и печатающую его.
     */

    static int[] setNaturalNumbers() {

        int[] temp = new int[100];
        temp[0] = 0;
        int number = 0;

        for (int i = 1; i < temp.length; i++) {
            number=number+17;
            temp[i] = number;
        }
        return temp;
    }

    static void arrayPrint(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {
        arrayPrint(setNaturalNumbers());
    }
}
