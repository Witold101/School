package school.lesson15.task6;

import java.io.*;

/**
 * Вывести список файлов и каталогов выбранного каталога на диске с учетом вложенности директориев.
 * Для этого использовать рекурсию (пример рекурсии тут и тут).
 */

public class Task6 {
    private static final String path = "c:\\Program Files\\Git\\";

    private static void getPath(String path) {
        File directory = new File(path);
        getElement(directory.listFiles());
    }

    private static void getElement(File[] elements) {
        int position = 0;
        while (position < elements.length) {
            if (elements[position].isFile()) {
                System.out.println(elements[position].getAbsolutePath() + elements[position].getName());
            } else if (elements[position].isDirectory()) {
                System.out.println(elements[position].getAbsolutePath());
                getElement(elements[position].listFiles());
            }
            position++;
        }
    }

    public static void main(String[] args) {
        getPath(Task6.path);
    }
}
