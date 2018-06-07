package school.lesson14.task2;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    /**
     * Написать программу, выполняющую поиск в строке шестнадцатеричных чисел, записанных по правилам Java,
     * с помощью регулярных выражений и выводящую их на страницу.
     */

    public static void main(String[] args) {
        String s = "lkjljkl 0xADD8 0xKJHhkj0xKJTYkj0xKJHhkj0xKJHhkj 0xA9 JHhkj0xAAAJHhkj0xKJHhkj0xKJHhkj";

        Pattern p = Pattern.compile("\\b(0x[A-F\\d]+)\\b");
        Matcher matcher = p.matcher(s);
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
