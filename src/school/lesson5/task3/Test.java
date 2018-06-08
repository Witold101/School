package school.lesson5.task3;

public class Test {

    public static void main(String[] args) {
        Accounting accounting = new Accounting(new Integer(890), new Long(0));
        System.out.println(accounting.Addition());
        System.out.println(accounting.Division());
        System.out.println(accounting.Multiplication());
        System.out.println(accounting.Subtraction());
    }
}
