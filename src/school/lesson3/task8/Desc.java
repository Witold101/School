package school.lesson3.task8;

import school.lesson3.task7.Cards;

import java.util.Random;

/**
 * Написать программу, перемешивающую и печатающую список карт в колоде.
 * Воспользоваться результатом предыдущей задачи.
 */

public class Desc {

    static int randomInt(int maximum) {
        final Random random = new Random();
        return random.nextInt(maximum);
    }

    /**
     * The procedure writes down an integer in a casual cell of the
     * two-dimensional massif if the value of a cell is equal to 0
     *
     * @param number integer for write
     * @param array array for write
     * @param index1 first index array
     * @param index2 second index array
     * @return tru or false
     */
    static boolean isEqualsArray(int number, int[][] array, int index1, int index2) {
        int i = randomInt(index1);
        int j = randomInt(index2);
        if (array[i][j] == 0) {
            array[i][j] = number;
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int index1 = 4;
        int index2 = 13;
        int[][] deck = new int[index1][index2];
        for (int i = 0; i < 52; i++) {
            while (!isEqualsArray(i + 1, deck,index1,index2)) ;
        }
        for (int a = 1; a < 53; a++) {
            for (int i = 0; i < index1; i++) {
                for (int j = 0; j < index2; j++) {
                    if (deck[i][j] == a) {
                        System.out.println(a + ":" + Cards.getColor(i) + "of" + Cards.getCard(j));
                    }
                }
            }
        }
    }
}
