package school.lesson11.task4;

import java.util.*;

/**
 * Реализовать структуру «Черный ящик» хранящую целые числа. Структура должна поддерживать
 * операции добавления числа и возвращение К-го по минимальности числа и N-ного по максимальности элемента из ящика.
 */

public class BlackBox {
    private TreeSet<Integer> box;

    public BlackBox() {
        this.box = new TreeSet<>();
    }

    public TreeSet<Integer> getBox() {
        return box;
    }

    public void add(Integer number) {
        if (number != null) {
            box.add(number);
        }
    }

    public Integer getMinNumber(int position) {
        if (position > box.size()) {
            System.out.println("В ящике нет запрашиваемого числа ввиду малой заполненности ящика.");
            return null;
        } else if (position <= 0) {
            System.out.println("Введены не коректные данные.");
            return null;
        } else {
            Iterator<Integer> iterator = box.iterator();
            for (int i = 0; i < position - 1; i++) {
                iterator.next();
            }
            return iterator.next();
        }
    }


    public Integer getMaxNumber(int position) {
        if (position > box.size()) {
            System.out.println("В ящике нет запрашиваемого числа ввиду малой заполненности ящика.");
            return null;
        } else if (position <= 0) {
            System.out.println("Введены не коректные данные.");
            return null;
        } else {
            Iterator<Integer> iterator = box.iterator();
            for (int i = 0; i < box.size() - position; i++) {
                iterator.next();
            }
            return iterator.next();
        }
    }

    @Override
    public String toString() {
        Iterator<Integer> iterator = getBox().iterator();
        String s = "";
        int i = 0;
        while (iterator.hasNext()) {
            i++;
            s = s + "Position (" + i + ") = " + iterator.next() + "\n";
        }
        return s;
    }
}
