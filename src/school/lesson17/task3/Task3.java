package school.lesson17.task3;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 3.	Дана Map<String, Integer>. Найти сумму всех значений, длина ключей которых меньше 7 символов.
 */

public class Task3 {

    public static double getSumMapValue(Map<String, Integer> map) {

        return map.keySet().stream()
                .filter(s -> s.length() < 7)
                .collect(Collectors.toMap(c -> c, map::get))
                .values()
                .stream()
                .mapToInt(s -> s)
                .sum();
    }

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Mama",23);
        map.put("Mыла",10);
        map.put("Раму",26);
        map.put("Большууууую",100);

        System.out.println(getSumMapValue(map));


    }
}
