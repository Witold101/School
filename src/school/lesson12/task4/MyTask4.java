package school.lesson12.task4;

/**
 * 4.	Повторить предыдущее упражнение, но наследуя свой класс от класса RuntimeException
 * Добавить вконструктор своего класса возможность указания сообщения.
 */

public class MyTask4 {

    public void getException() throws TestRuntimeException {
        throw new TestRuntimeException("It is my RuntimeException");
    }

    class TestRuntimeException extends RuntimeException {
        public TestRuntimeException() {
        }

        TestRuntimeException(String message) {
            super(message);
        }
    }
}


