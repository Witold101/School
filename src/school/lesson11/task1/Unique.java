package school.lesson11.task1;

import java.util.*;

public class Unique {

    /**
     * Написать метод countUnique, который принимает целочисленный список в качестве параметра и возвращает
     * количество уникальных целых чисел в этом списке.
     * При получении пустого списка метод должен возвращать 0.
     * Пример:
     * <p>
     * [3, 7, 3, -1, 2, 3, 7, 2, 15, 15] вернёт 5.
     */

    public static int countUnique(List<Number> numbers) {
        if (numbers != null) {
            return new HashSet<>(numbers).size();
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        List<Number> numbersDouble = new ArrayList<>();
        numbersDouble.add(3d);
        numbersDouble.add(7d);
        numbersDouble.add(3d);
        numbersDouble.add(-1d);
        numbersDouble.add(2d);
        numbersDouble.add(3d);
        numbersDouble.add(7d);
        numbersDouble.add(2d);
        numbersDouble.add(15d);
        numbersDouble.add(15d);

        List<Number> numbersInteger = new ArrayList<>();
        numbersInteger.add(3);
        numbersInteger.add(7);
        numbersInteger.add(3);
        numbersInteger.add(-1);
        numbersInteger.add(2);
        numbersInteger.add(3);
        numbersInteger.add(7);
        numbersInteger.add(2);
        numbersInteger.add(15);
        numbersInteger.add(15);

        System.out.println(countUnique(numbersDouble));
        System.out.println(countUnique(numbersInteger));
    }
}
