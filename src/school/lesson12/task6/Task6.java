package school.lesson12.task6;

import java.io.IOException;
import java.util.Random;

/**
 * 6.	Создать метод случайным образом выбрасывающий одно из 3-х видов исключений.
 * Вызвать этот метод в блоке try-catch, отлавливающем любое из 3-х.
 */

public class Task6 {

    public static void getException() throws NullPointerException, IOException, ArithmeticException {
        Random random = new Random();
        switch (random.nextInt(3)) {
            case 0: {
                throw new NullPointerException();
            }
            case 1: {
                throw new IOException();
            }
            case 2: {
                throw new ArithmeticException();
            }
        }
    }

    public static void main(String[] args) {
        try {
            getException();
        } catch (NullPointerException e) {
            System.out.println("It is NullPointerException ");
            e.printStackTrace();

        } catch (IOException e) {
            System.out.println("It is IOException ");
            e.printStackTrace();

        } catch (ArithmeticException e) {
            System.out.println("It is ArithmeticException ");
            e.printStackTrace();
        }

    }
}
