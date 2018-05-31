package school.lesson12.task5;

import java.io.IOException;

public class Test {

    public static void main(String[] args) {
        Task5 task5 = new Task5();
        try {
            task5.getException();
        } catch (IOException e) {
            MyIOException ex = new MyIOException(e, "Перехвачен объект IOException!");
            System.out.println(ex.getMessage());
            ex.printStackTrace();
            ex.getE().printStackTrace();
        }
    }

    private static class MyIOException extends Exception {
        Exception e;

        MyIOException(IOException e, String s) {
            super(s);
            this.e = e;
        }

        Exception getE() {
            return e;
        }
    }
}
