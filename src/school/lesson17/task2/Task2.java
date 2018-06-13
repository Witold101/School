package school.lesson17.task2;

import java.util.Arrays;
import java.util.List;

/**
 * 2.	Дан список строк. Найти количество уникальных строк длиной более 8 символов.
 */

public class Task2 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList(
                "марка машины;"
                , "дата, с какого числа машина свободна;"
                , "грузоподъемность;"
                , "допустимый объем;"
                , "марка машины;"
                , "внутренняя погрузочная высота;"
                , "тип полуприцепа (палеты, рефрижератор, изотерма);"
                , "класс груза;"
                , "уровень аккуратности вождения;"
                , "состояния цифрового датчика по цвету маркера.");

        long quantity = list.stream()
                .filter((s) -> s.length() > 8)
                .distinct()
                .count();

        System.out.println(quantity);
    }
}