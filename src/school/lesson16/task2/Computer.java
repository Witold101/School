package school.lesson16.task2;

import java.io.Serializable;

/**
 * Создать класс Computer. Добавить ему несколько полей, создать объект этого класса, сериализовать в файл.
 * Десериализовать объект из того же файла, вывести значения полей в консоль.
 */

public class Computer implements Serializable {
    private String name ;
    private String cpu;
    private boolean laptop;

    public Computer(String name, String cpu, boolean laptop) {
        this.name = name;
        this.cpu = cpu;
        this.laptop = laptop;
    }

    public String getName() {
        return name;
    }

    public String getCpu() {
        return cpu;
    }

    public boolean isLaptop() {
        return laptop;
    }

    @Override
    public String toString() {
        return "Computer{" +
                " name='" + name + '\'' +
                ", cpu='" + cpu + '\'' +
                ", laptop=" + laptop +
                '}';
    }
}
