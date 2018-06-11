package school.lesson16.task2;

import java.io.*;

public class Task2 {

    public static void main(String[] args) {
        Computer computer = new Computer("Lenovo", "CORE-i7", true);
        File file = new File("comp.dat");
        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(computer);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Computer comp = (Computer) ois.readObject();
            ois.close();
            fis.close();
            System.out.println(comp.getName());
            System.out.println(comp.getCpu());
            System.out.println(comp.isLaptop());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
