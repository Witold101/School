package school.lesson15.task4;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Задан файл с текстом. В каждой строке найти и вывести наибольшее число цифр, идущих подряд.
 */
public class Task4 {

    final static String REGUL = "[\\d]+";

    public static void main(String[] args) {

        File file = new File("SIZE4.TXT");
        Pattern pattern = Pattern.compile(Task4.REGUL);
        Matcher matcher;
        FileInputStream stream = null;
        InputStreamReader is = null;

        if (file.exists()) {
            try {
                stream = new FileInputStream(file);
                is = new InputStreamReader(stream, "UTF-8");
                BufferedReader bis = new BufferedReader(is);
                String s = null;
                String numbers = "";
                String temp = "";
                while ((s = bis.readLine()) != null) {
                    matcher = pattern.matcher(s);
                    while (matcher.find()) {
                        temp = matcher.group();
                        if (numbers.length() < temp.length()) {
                            numbers = temp;
                        }
                    }
                    if (numbers.length()>0) {
                        System.out.println(numbers);
                        numbers="";
                    }
                }
                stream.close();
                is.close();
                bis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Файл не найден!");
        }
    }
}
