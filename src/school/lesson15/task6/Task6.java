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
        int positon = 0;
        while (positon < elements.length) {
            if (elements[positon].isFile()) {
                System.out.println(elements[positon].getAbsolutePath() + elements[positon].getName());
            } else if (elements[positon].isDirectory()) {
                System.out.println(elements[positon].getAbsolutePath());
                getElement(elements[positon].listFiles());
            }
            positon++;
        }
    }

    public static void main(String[] args) {
        getPath(Task6.path);
    }
}
