package school.lesson14.task1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Написать программу, проверяющую, является ли введённая строка адресом электронного почтового ящика.
 * В названии почтового ящика разрешить использование только букв, цифр и нижних подчёркиваний, при этом
 * оно должно начинаться с буквы.
 * Возможные домены верхнего уровня: .org .com
 */

public class Task1 {

    public static boolean isMail(String mail) {
        Pattern pattern = Pattern.compile("\\w[\\w\\d_]*@{1}[\\w\\d]+(.[\\w\\d_]+)*.[\\w]{2,}");
        Matcher math = pattern.matcher(mail.trim());
        return math.find();
    }

    public static void main(String[] args) {
        String mail = "info@tut.by4.";
        System.out.println(isMail(mail));
    }
}
