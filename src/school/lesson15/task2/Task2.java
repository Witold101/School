package school.lesson15.task2;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Задан файл с текстом, найти и вывести в консоль все слова, начинающиеся с гласной буквы.
 */
public class Task2 {

    public static void main(String[] args) {
        String REGUL =
                "(\\s[аеёиоуыэюяАЕЁИОУЫЭЮЯ]+[а-яёЁА-Я]*)|(^[аеёиоуыэюяАЕЁИОУЫЭЮЯ]+[а-яёЁА-Я]*)|(\\b[aeiouyAEIOUY]+[A-Za-z]*)";

        File file = new File("SIZE3.TXT");
        Pattern pattern = Pattern.compile(REGUL);
        Matcher matcher = null;

        if (file.exists()) {
            try {
                FileInputStream stream = new FileInputStream(file);
                InputStreamReader is = new InputStreamReader(stream, "UTF-8");
                BufferedReader bis = new BufferedReader(is);
                String s = null;
                while ((s = bis.readLine()) != null){
                    System.out.println(s);
                    matcher = pattern.matcher(s);
                    while (matcher.find()) {
                        System.out.println(matcher.group().trim());
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
