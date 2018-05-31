package school.lesson11.task4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Реализовать структуру «Черный ящик» хранящую целые числа. Структура должна поддерживать
 * операции добавления числа и возвращение К-го по минимальности числа и N-ного по максимальности элемента из ящика.
 */

public class BlackBox {
    private ArrayList<Integer> box;

    public BlackBox() {
        this.box = new ArrayList<>();
    }

    public void add(Integer number) {
        if (number != null) {
            box.add(number);
            Collections.sort(box);
        }
    }

    public Integer getMinNumber(int position) {
        if (position > box.size()) {
            System.out.println("В ящике нет запрашиваемого числа ввиду малой заполненности ящика.");
            return null;
        }else if(position==0){
            System.out.println("Введены не коректные данные.");
            return null;
        }
        else {
            return box.get(position-1);
        }
    }

    public int getMaxNumber(int position) {

    }
}
