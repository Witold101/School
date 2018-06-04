package school.lesson13.task6;

/**
 * Написать функцию, заменяющую несколько последовательных одинаковых символов в строке одним.
 * <p>
 * Пример: aaabbcdeef ->abcdef
 */
public class Task6 {

    public static String stringNew(String s) {
        if (s != null && s.length() > 0) {
            char[] chars = new char[s.length()];
            int counter = 0;
            for (int i = 0; i < s.length(); i++) {
                if (i < s.length() - 1) {
                    if (s.charAt(i) != s.charAt(i + 1)) {
                        chars[counter] = s.charAt(i);
                        counter++;
                    }
                } else if (i == s.length() - 1) {
                    chars[counter] = s.charAt(i);
                }
            }
            return String.copyValueOf(chars);
        } else {
            return null;
        }
    }


    public static void main(String[] args) {
        String s1 = "aaabbcdeef99   55 dddssqaaaa";
        System.out.println(s1);
        System.out.println(stringNew(s1));
    }
}
