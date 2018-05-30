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
        Set<String> stringSet =new HashSet<>(stringMap.values());
        return stringMap.keySet().size()==stringSet.size();
    }

    Map<String,String> map = new HashMap<>();
    
}
