package school.lesson15.task3;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * . Задан файл с текстом, найти и вывести в консоль
 * все слова,  для которых последняя буква одного слова совпадает с первой буквой следующего слова
 */
public class Task3 {
    final static String REGUL = "[\\w]*([A-Za-z])\\b[\\s]+\\b\\1[\\w]*";

    public static void main(String[] args) {

        File file = new File("SIZE2.TXT");
        Pattern pattern = Pattern.compile(Task3.REGUL);
        Matcher matcher;
        FileInputStream stream = null;
        InputStreamReader is = null;

        if (file.exists()) {
            try {
                stream = new FileInputStream(file);
                is = new InputStreamReader(stream, "UTF-8");
                BufferedReader bis = new BufferedReader(is);
                String s = null;
                while ((s = bis.readLine()) != null) {
                    matcher = pattern.matcher(s);
                    while (matcher.find()){
                        System.out.println(matcher.group());
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
