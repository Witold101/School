package school.lesson15.task5;

import java.io.*;
import java.util.Random;

/**
 * Записать в двоичный файл 20 случайных чисел типа int.
 * Прочитать записанный файл, распечатать числа и их среднее арифметическое.
 */

public class Task5 {
    private static final String FAILE_NAME = "SIZE5.INT";

    private static int[] randomInt() {
        int[] array = new int[20];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10000);
        }
        return array;
    }

    public static void writeArray(String filename) {
        File file = new File(filename);
        try {
            if (file.exists()) {
                if (!file.delete()) {
                    System.out.println("Ошибка удаления файла!");
                    throw new IOException();
                } else {
                    if (!file.createNewFile()) {
                        System.out.println("Ошибка создания файла!");
                        throw new IOException();
                    }
                }
            } else {
                if (!file.createNewFile()) {
                    System.out.println("Ошибка создания файла!");
                    throw new IOException();
                }
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            DataOutputStream stream = new DataOutputStream(fileOutputStream);
            int[] array = randomInt();
            int counter = 0;
            for (int i : array) {
                System.out.println(counter + " = " + i);
                stream.writeInt(i);
                stream.flush();
                counter++;
            }
            fileOutputStream.close();
            stream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int[] readArray(String filename, int lengthArray) {
        int[] array = new int[lengthArray];
        File file = new File(filename);
        try {
            if (file.exists()) {
                FileInputStream fileInputStream = new FileInputStream(file);
                DataInputStream stream = new DataInputStream(fileInputStream);
                int counter = 0;
                while (stream.available() > 0) {
                    if (counter < lengthArray) {
                        System.out.println(array[counter] = stream.readInt());
                    } else {
                        System.out.println("Не попала в выходной массив = " + stream.readInt());
                    }
                    counter++;
                }
                fileInputStream.close();
                stream.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return array;
    }

    public static void main(String[] args) {
        int lengthArray = 20;
        writeArray(Task5.FAILE_NAME);
        int[] array = readArray(Task5.FAILE_NAME, lengthArray);
        long result = 0;
        for (int i = 0; i < array.length; i++) {
            result += array[i];
        }
        System.out.println("Среднее арифметическое = " + (float) result / array.length);
    }
}
