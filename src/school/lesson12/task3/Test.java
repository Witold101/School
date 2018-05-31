package school.lesson12.task3;

public class Test {

    public static void main(String[] args) {
        MyTask3 task3 = new MyTask3();
        try {
            task3.getException();
        } catch (MyTask3.TestException e) {
            e.printStackTrace();
        }
    }
}
