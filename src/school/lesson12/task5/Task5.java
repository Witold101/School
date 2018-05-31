package school.lesson12.task5;

import java.io.IOException;

/**
 * 5.	Бросить одно из существующих в JDK исключений, отловить его и выбросить своё собственное,
 * указав в качестве причины отловленное.
 */

public class Task5 {

    public void getException() throws IOException {
        throw new IOException();
    }
}
