package school.lesson13.task2;

/**
 * Заменить все грустные смайлы :( в строке на весёлые :)
 */

public class Task2 {

    public static void main(String[] args) {
        String s = "Нам то :( грустно то весело ): но больше грустно :( :( :(.";
        System.out.println(s);
        StringBuilder builder = new StringBuilder(s);
        int index = 0;

        do {
            index = builder.indexOf(":(", index);
            if (index >= 1) {
                builder.replace(index, index + 2, "):");
            }
        }
        while (index > -1);
        System.out.println(builder.toString());
    }
}
