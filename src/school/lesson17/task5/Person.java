package school.lesson17.task5;

import java.util.Comparator;

/**
 * 5.	Дан класс Person с полями firstName, lastName, age.
 * Вывести полное имя самого старшего человека, у которого длина этого имени не превышает 15 символов.
 */

public class Person implements Comparable<Person> {
    private String firstName;
    private String lastName;
    private Integer age;

    public Person(String firstName, String lastName, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getAge() {
        return age;
    }


    @Override
    public int compareTo(Person o) {
        return this.age.compareTo(o.getAge());
    }
}
