package school.lesson16.task3;

import school.lesson16.task2.Computer;

import java.io.Serializable;

/**
 * 3.	Создать класс Notebook - наследник Computer. В этом классе должно быть поле типа Touchpad - также созданного
 * класса со своими полями.
 * Добавить в класс Notebook transient-поле. Создать объект класса Notebook, сериализовать в файл.
 * Десериализовать объект из файла, продемонстрировать, что transient-поля не сериализуются.
 */

public class Notebook extends Computer implements Serializable {
    private Touchpad touchpad;
    private transient String quantity;

    public Notebook(Touchpad touchpad, String name, String cpu,
                    boolean laptop, String quantity) {
        super(name, cpu, laptop);
        this.touchpad = touchpad;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                " touchpad=" + touchpad +
                " name=" + super.getName() +
                " CPU=" + super.getCpu() +
                " laptop=" + super.isLaptop() +
                ", quantity=" + quantity +
                '}';
    }
}
