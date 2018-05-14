package school.lesson4.task1;

/**
 * Создать класс, описывающий промежуток времени.
 * Сам промежуток времени должен задаваться тремя свойствами: секундами, минутами и часами.
 * Создать метод для получения полного количества секунд в объекте
 * Создать два конструктора: первый принимает общее количество секунд, второй - часы, минуты и секунды по отдельности.
 * Создать метод для вывода данных.
 * Написать программу для тестирования возможностей класса.
 */

public class PartTime {
    private final int SECONDS_IN_HOUR = 3600;
    private final int SECONDS_IN_MINUTE = 60;

    private int second;
    private int minute;
    private int hour;

    public PartTime(int second, int minute, int hour) {
        this.second = second;
        this.minute = minute;
        this.hour = hour;
    }

    public PartTime(int second) {
        this.hour = second / this.SECONDS_IN_HOUR;
        second = second - hour * this.SECONDS_IN_HOUR;
        this.minute = second / this.SECONDS_IN_MINUTE;
        this.second = second % this.SECONDS_IN_MINUTE;
    }

    public int[] ret() {
        return new int[]{this.second, this.minute, this.hour};
    }

}
