package school.lesson13.task6;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

/**
 * Написать функцию, заменяющую несколько последовательных одинаковых символов в строке одним.
 * <p>
 * Пример: aaabbcdeef ->abcdef
 */
public class Task6 {

    public static String stringNew(String s) {
        if (s != null && s.length() > 0) {
            Queue<Character> chars = new PriorityQueue<>();
            String result = "";
            for (int i = 0; i < s.length(); i++) {
                if (i < s.length() - 1) {
                    if (s.charAt(i) != s.charAt(i + 1)) {
                        chars.add(s.charAt(i));
                    }
                } else if (i == s.length() - 1) {
                    chars.add(s.charAt(i));
                }
            }
            while (chars.peek() != null) {

       //         result = result.concat(chars.poll().toString());
                result = result+chars.poll();
            }
            return result;
        } else {
            return null;
        }
    }


    public static void main(String[] args) {
        String s1 = "aaabbcdeef99   55";
        System.out.println(s1);
        System.out.println(stringNew(s1));
    }
}
