package school.lesson12.task7;

import java.io.IOException;
import java.util.Random;

/**
 * 7.	Написать метод, который в 50% случаев бросает исключение.
 * Вызвать этот метод в конструкции try-catch-finally. Протестировать работу блока finally.
 */

public class Task7 {

    static int fiftyFyfty() throws IOException {
        if (new Random().nextInt(2) == 0) {
            throw new IOException();
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        int i = 0;
        try {
            i = fiftyFyfty();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println(" fiftyFifty return - "+i);
        }
    }
}
