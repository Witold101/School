package school.lesson16.task3;

import java.io.*;

/**
 * 3.	Создать класс Notebook - наследник Computer. В этом классе должно быть поле типа Touchpad - также созданного
 * * класса со своими полями.
 * * Добавить в класс Notebook transient-поле. Создать объект класса Notebook, сериализовать в файл.
 * * Десериализовать объект из файла, продемонстрировать, что transient-поля не сериализуются.
 */
public class Task3 {

    public static void main(String[] args) {
        File file = new File("comp.dat");
        Notebook notebook = new Notebook(new Touchpad("Black", "23*23"), "HP",
                "Intel CORE i7", false, "090");
        Notebook not = null;
        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(notebook);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            not = (Notebook) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(not.toString());
    }
}
