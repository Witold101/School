package school.lesson3.task5;

public class Butterfly {

    /**
     * Создать двухмерный квадратный массив, и заполнить его "бабочкой", т.е. таким образом:
     * <p>
     * 1 1 1 1 1
     * 0 1 1 1 0
     * 0 0 1 0 0
     * 0 1 1 1 0
     * 1 1 1 1 1
     * <p>
     * Вывести его на экран, заменив 1 символом *, а 0 - пробелом.
     */

    static int[][] butterfly() {
        int[][] array = new int[5][5];
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length - i; j++) {
                array[i][j] = 1;
                array[array.length - 1 - i][j] = 1;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[][] array = butterfly();
        for (int i = 0; i < array.length; i++) {
            String s = "";
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] == 1) {
                    s = s + "*";
                } else {
                    s = s + " ";
                }
            }
            System.out.println(s);
        }
    }
}
