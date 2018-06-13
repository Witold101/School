package school.lesson17.task1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.DoubleSupplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * 1.	Дан список целых чисел. Найти среднее всех нечётных чисел, делящихся на 5.
 */

public class Task1 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(24, 76, 85, 87, 15, 10, 96, 100, 94, 1);
        double v = list.stream()
                .filter(s -> s % 5 == 0)
                .mapToInt((s) -> s)
                .average()
                .orElse(0)
                ;
        System.out.println(v);
    }
}


