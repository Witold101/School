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

    static boolean isEquals(int number, int[][] array) {
        int i = randomInt(4);
        int j = randomInt(13);
        if (array[i][j] == 0) {
            array[i][j] = number;
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int[][] deck = new int[4][13];
        for (int i = 0; i < 52; i++) {
            while (!isEquals(i + 1, deck)) ;
        }
        for (int a = 1; a < 53; a++) {
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 13; j++) {
                    if (deck[i][j] == a) {
                        System.out.println(a + ":" + Cards.getColor(i) + "of" + Cards.getCard(j));
                    }
                }
            }
        }
    }
}
