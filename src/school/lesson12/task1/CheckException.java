package school.lesson12.task1;

import java.util.ArrayList;

/**
 * 1.	Объявите переменную со значением null. Вызовите метод у этой переменной.
 * Отловите возникшее исключение.
 */
public class CheckException {

    public static void main(String[] args) {
        ArrayList<Integer> list = null;
        try {
            list.size();
        } catch (NullPointerException e) {
            System.out.println("Не правильно инициализирована переменная list.");
            e.printStackTrace();
        }
    }
}
