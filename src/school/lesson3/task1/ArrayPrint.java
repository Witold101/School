package school.lesson3.task1;

public class ArrayPrint {

    static void arrayPrint(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        for (int i = array.length; i > 0; i--) {
            System.out.println(array[i-1]);
        }
    }

    public static void main(String[] args) {

        arrayPrint(new int[]{2,18,34,5,43,11});
    }
}
