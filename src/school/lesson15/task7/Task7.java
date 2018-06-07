package school.lesson15.task7;

import school.lesson15.task4.Task4;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * . Задан файл с java-кодом.
 * Прочитать текст программы из файла и записать в другой файл в обратном порядке символы каждой строки.
 */

public class Task7 {

    private static void readString(File fileRead, File fileWrite) {
        FileInputStream stream = null;
        InputStreamReader is = null;

        if (fileRead.exists()) {
            try {
                stream = new FileInputStream(fileRead);
                is = new InputStreamReader(stream, "UTF-8");
                BufferedReader bis = new BufferedReader(is);
                String s = null;
                boolean flagWriteInEndFile = false;
                while ((s = bis.readLine()) != null) {
                    StringBuffer sb = new StringBuffer(s);
                    writeStringLine(fileWrite, sb.reverse().toString(), flagWriteInEndFile);
                    flagWriteInEndFile = true;
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

    private static void writeStringLine(File fileName, String stringWrite, boolean writeInEnd) {
        try {
            if (!fileName.exists()) {
                if (!fileName.createNewFile()) {
                    System.out.println("Файл не создан!");
                    throw new IOException();
                }
            }
            FileWriter fos = new FileWriter(fileName, writeInEnd);
            BufferedWriter bw = new BufferedWriter(fos);
            fos.write(stringWrite);
            fos.append('\n');
            bw.flush();
            fos.close();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        File fileRead = new File("java.txt");
        File fileWrite = new File("java_revers.txt");
        readString(fileRead, fileWrite);
    }
}
