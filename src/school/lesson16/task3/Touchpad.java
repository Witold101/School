package school.lesson16.task3;

import java.io.Serializable;

public class Touchpad implements Serializable {
    String color;
    String size;

    public Touchpad(String color, String size) {
        this.color = color;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Touchpad{" +
                " color='" + color + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
