package school.lesson12.task4;

public class Test {

    public static void main(String[] args) {
        MyTask4 task4 = new MyTask4();
        try {
            task4.getException();
        } catch (MyTask4.TestRuntimeException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
