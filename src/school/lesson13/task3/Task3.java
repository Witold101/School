package school.lesson13.task3;

/**
 * Написать функцию, принимающую 2 параметра: строку и слово - и возвращающую true,
 * если строка начинается и заканчивается этим словом.
 */

public class Task3 {

    public static boolean isStringBeginEnd(String string, String word) throws NullPointerException {
        if (string != null && word != null) {
            StringBuilder builder = new StringBuilder(string);
            return (builder.indexOf(word) == 0 && builder.lastIndexOf(word) == builder.length() - word.length());
        } else {
            throw new NullPointerException();
        }
    }

    public static void main(String[] args) {
        String s1 = "Привет! Я всем когда Привет\nприхожу то говою ";
        String s2 = "Привет! Я всем когда прихожу то говою привет";
        String s3 = "привет! Я всем когда прихожу то говою Привет";
        String s4 = "Привет";
        String s5 = "";

        String s = "Привет";
        try {
            System.out.println(isStringBeginEnd(s1, s));
            System.out.println(isStringBeginEnd(s2, s));
            System.out.println(isStringBeginEnd(s3, s));
            System.out.println(isStringBeginEnd(s4, s));
            System.out.println(isStringBeginEnd(s5, s));
        }catch (NullPointerException e){
            e.printStackTrace();
        }
    }
}
