package school.lesson12.task3;

/**
 * 3.	Создать собственный класс-исключение - наследник класса Exception.
 *           Создать метод, выбрасывающий это исключение.
 *           Вызвать этот метод и отловить исключение. Вывести stacktrace в консоль.
 */

public class MyTask3 {

    public void getException() throws TestException {
        throw new TestException();
    }


    class TestException extends Exception{
    }

}
