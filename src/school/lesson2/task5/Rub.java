package school.lesson2.task5;

import java.util.Scanner;

public class Rub {

    static int setRub() {
        Scanner result = new Scanner(System.in);
        System.out.print("Введите целое число.");
        return result.nextInt();
    }

    static void getTextRub(int rub) {

        int temp = rub % 100;
        if ((temp > 19) || (temp < 11)) {
            if (temp > 19) {
                temp = temp % 10;
            }
            switch (temp) {
                case 1: {
                    System.out.print(rub + " рубль");
                }
                break;
                case 2: {
                    System.out.print(rub + " рубля");
                }
                break;
                case 3: {
                    System.out.print(rub + " рубля");
                }
                break;
                case 4: {
                    System.out.print(rub + " рубля");
                }
                break;
                default: {
                    System.out.print(rub + " рублей");
                }
            }
        } else {
            System.out.print(rub + " рублей");
        }
    }


    public static void main(String[] args) {
        getTextRub(setRub());
    }
}
