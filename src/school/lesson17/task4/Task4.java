package school.lesson17.task4;

import java.util.Arrays;
import java.util.List;

/**
 * 4.	Дан список целых чисел, вывести строку, представляющую собой конкатенацию строковых представлений этих чисел.
 * Пример: список {5, 2, 4, 2, 1}
 * Результирующая строка: "52421"
 */

public class Task4 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 2, 4, 2, 1);
        String s = list.stream()
                .map(String::valueOf)
                .reduce(String::concat)
                .get();
        System.out.println(s);
    }
}
