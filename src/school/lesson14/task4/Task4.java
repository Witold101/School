package school.lesson14.task4;

import school.lesson14.task3.Task3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Написать программу, выполняющую поиск в строке мобильных телефонных номеров в формате +375XXYYYYYYY
 * и заменяющую каждый телефон на тот же, но в формате +375 (XX) YYY-YY-YY
 * X - код оператора
 * Y - номер телефона
 */

public class Task4 {
    private static String s = " +375257898789 У+37525789878990меня +375257898789 номеров много из них телефооные не все.+375257898789/l";
    private static String REG = "(^|\\s){1}\\+375(\\d{2})(\\d{3})(\\d{2})(\\d{2})($|\\b)";

    public static void main(String[] args) {
        Pattern p = Pattern.compile(Task4.REG);
        Matcher matcher = p.matcher(s);
        StringBuffer buffer = new StringBuffer();
        while (matcher.find()){
            String cod = matcher.group(2);
            String numberNew = " +375 (".concat(matcher.group(2)).concat(") ").concat(matcher.group(3)).concat(" ")
            .concat(matcher.group(4)).concat(" ").concat(matcher.group(5));
            matcher.appendReplacement(buffer,numberNew);
        }
        matcher.appendTail(buffer);
        System.out.println(buffer);
    }
}
