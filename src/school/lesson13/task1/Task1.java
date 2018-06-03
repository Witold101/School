package school.lesson13.task1;

/**
 * Написать два цикла, выполняющих многократное сложение строк, один с помощью оператора сложения и String,
 * второй с помощью StringBuilder и метода append. Сравнить скорость их выполнения.
 */
public class Task1 {

    private static String string1 = "Привет я первая строка! ";
    private static String string2 = "Привет я вторая строка! ";
    private static String string3 = "Привет я третяя строка! ";
    private static String string4 = "Привет я четвертая строка! ";
    private static String string5 = "Привет я пятая строка! ";


    public static long getSpeedPlus(String... arg) {
        String str = "";
        long timeStart = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            for (String s : arg) {
                str += s;
            }
        }
        long timeEnd = System.currentTimeMillis();
        return timeEnd - timeStart;
    }

    public static long getSpeedBuilder(String... arg) {
        StringBuilder builder = new StringBuilder();
        long timeStart = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            for (String s : arg) {
                builder = builder.append(s);
            }
        }
        long timeEnd = System.currentTimeMillis();
        return timeEnd - timeStart;
    }

    public static void main(String[] args) {

        long plus = 0;

        for (int i = 0; i < 100; i++) {
            plus += getSpeedPlus(string1, string2, string3, string4, string5);
        }
        System.out.println(plus);
        plus=0;
        for (int i = 0; i < 100; i++) {
            plus+=getSpeedBuilder(string1, string2, string3, string4, string5);
        }
        System.out.println(plus);
    }

}
