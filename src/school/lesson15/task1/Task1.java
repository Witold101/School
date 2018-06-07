package school.lesson15.task1;

import java.io.*;
import java.util.Scanner;

/**
 * Задан файл с многострочным тестом. Прочитать и вывести этот файл в консоль построчно.
 */

public class Task1 {

    public static void main(String[] args) {
        File file = new File("SIZE!.TXT");
        if (file.exists()) {
            try {
                FileReader bis = new FileReader(file);
                Scanner scanner = new Scanner(bis);
                while (scanner.hasNextLine()) {
                    System.out.println(scanner.nextLine());
                }
                bis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("файл " + file.getName() + "не существует по этому создали файл");
        }

    }
}
