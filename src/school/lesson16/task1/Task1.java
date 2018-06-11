package school.lesson16.task1;

import jdk.internal.util.xml.impl.Input;
import school.lesson15.task7.Task7;

import java.io.*;

/**
 * 1.	Сравнить скорость чтения и записи 5 МБ символов при использовании классов буфиризированого и не
 * буфиризированого символьного ввода вывода.
 */
public class Task1 {

    private static void readWriteFile(File readFile, File writeFile) {
        InputStream fis = null;
        InputStreamReader isr = null;
        FileOutputStream fos = null;
        OutputStreamWriter osw = null;
        try {
            if (!writeFile.exists()) {
                if (!writeFile.createNewFile()) {
                    System.out.println("Файл не создан!");
                    throw new IOException();
                }
            }
            fis = new FileInputStream(readFile);
            isr = new InputStreamReader(fis, "UTF-8");
            fos = new FileOutputStream(writeFile);
            osw = new OutputStreamWriter(fos);
            int s;
            while ((s = isr.read()) >= 0) {
                osw.write((char) s);
            }
            fis.close();
            isr.close();
            osw.flush();
            osw.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void bufferedReadWriteFile(File readFile, File writeFile) {
        FileInputStream fis = null;
        BufferedInputStream bis = null;
        FileOutputStream fos = null;
        BufferedOutputStream bos = null;
        try {
            if (!writeFile.exists()) {
                if (!writeFile.createNewFile()) {
                    System.out.println("Файл не создан!");
                    throw new IOException();
                }
            }
            fis = new FileInputStream(readFile);
            bis = new BufferedInputStream(fis);
            fos = new FileOutputStream(writeFile);
            bos = new BufferedOutputStream(fos);
            int s;
            while ((s = bis.read()) != -1) {
                bos.write((char) s);
            }
            fis.close();
            bis.close();
            bos.flush();
            bos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {

        String FILENAME_BEGIN = "NOTICE.txt";
        String FILENAME_END = "notice_end.txt";
        File fileBegin = new File(FILENAME_BEGIN);
        File fileEnd = new File(FILENAME_END);

        long beginTime = System.nanoTime();
        readWriteFile(fileBegin, fileEnd);
        System.out.println("Скорость выполнения не буфферезированного потока = " + (System.nanoTime() - beginTime));

        beginTime = System.nanoTime();
        bufferedReadWriteFile(fileBegin, fileEnd);
        System.out.println("Скорость выполнения буфферезированного потока = " + (System.nanoTime() - beginTime));
    }
}
