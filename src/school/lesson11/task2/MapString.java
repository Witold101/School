package school.lesson11.task2;

import java.util.*;

/**
 * Написать метод isUnique, который принимает Map<String, String> и возвращает true,
 * если два различных ключа не соответствуют двум одинаковым значениям.
 * Например, в данном случае вернётся true:
 * <p>
 * {Marty=Stepp, Stuart=Reges, Jessica=Miller, Amanda=Camp, Hal=Perkins}
 * <p>
 * Авданном false:
 * <p>
 * {Kendrick=Perkins, Stuart=Reges, Jessica=Miller, Bruce=Reges, Hal=Perkins}
 */

public class MapString {

    public static boolean isUnique(Map<String, String> stringMap) {
        Set<String> stringSet = new HashSet<>(stringMap.values());
        return stringMap.keySet().size() == stringSet.size();
    }

    public static void main(String[] args) {
        Map<String, String> map1 = new TreeMap<>();
        map1.put("Marty", "Stepp");
        map1.put("Stuart", "Reges");
        map1.put("Jessica", "Miller");
        map1.put("Amanda", "Camp");
        map1.put("Hal", "Perkins");

        Map<String, String> map2 = new TreeMap<>();
        map2.put("Kendrick", "Perkins");
        map2.put("Stuart", "Reges");
        map2.put("Jessica", "Miller");
        map2.put("Bruce", "Reges");
        map2.put("Hal", "Perkins");

        System.out.println(isUnique(map1));
        System.out.println(isUnique(map2));
    }
}
