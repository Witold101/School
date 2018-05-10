package school.lesson3.task7;

import java.util.Random;

/**
 * Написать программу, эмулирующую выдачу случайной карты из колоды в 52 карты.
 * Вывести результат в формате "Карта of Масть". Например, "AceofSpades".
 * Валет - Jack, Дама - Queen, Король - King, Туз - Ace, Червы - Hearts, Пики - Spades, Трефы - Clubs, Бубны - Diamonds
 */

public class Cards {

    public static String getCard(int cardNumber) {
        switch (cardNumber) {
            case 0: {
                return "Ace";
            }
            case 1: {
                return "Two";
            }
            case 2: {
                return "Three";
            }
            case 3: {
                return "For";
            }
            case 4: {
                return "Five";
            }
            case 5: {
                return "Six";
            }
            case 6: {
                return "Seven";
            }
            case 7: {
                return "Eight";
            }
            case 8: {
                return "Nine";
            }
            case 9: {
                return "Ten";
            }
            case 10: {
                return "Jack";
            }
            case 11: {
                return "Quin";
            }
            case 12: {
                return "King";
            }
            default:
                return "Error";
        }
    }

    public static String getColor(int color) {
        switch (color) {
            case 0: {
                return "Hearts";
            }
            case 1: {
                return "Spades";
            }
            case 2: {
                return "Clubs";
            }
            case 3: {
                return "Diamonds";
            }
            default:
                return "Error";
        }
    }

    public static void main(String[] args) {
        Random random = new Random();
        System.out.println(getCard(random.nextInt(13))+"of" + getColor(random.nextInt(4)));
    }
}
