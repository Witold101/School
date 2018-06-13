package school.lesson17.task5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * 5.	Дан класс Person с полями firstName, lastName, age.
 * Вывести полное имя самого старшего человека, у которого длина этого имени не превышает 15 символов.
 */

public class Task5 {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(new Person("Alex", "Nomad", 43),
                new Person("Bob", "Namasy", 25),
                new Person("Ethelbergin", "Nomad", 61)
        );

        Person result = people.stream()
                .sorted(Comparator.comparing(Person::getAge).reversed())
                .filter(s -> (s.getFirstName().concat(s.getLastName())).length() <= 15)
                .findFirst()
                .get();
        System.out.println(result.getFirstName()+" "+result.getLastName());
    }
}
