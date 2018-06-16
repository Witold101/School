package school.lesson18.task1;

/**
 * Многопоточность. ДЗ
 * <p>
 * 1.	Двое безумных учёных устроили соревнование, кто из них соберёт больше роботов за 100 ночей. Для этого каждую
 * ночь каждый из них отправляет своего прислужника на свалку фабрики роботов за деталями.
 * Чтобы собрать одного робота им нужно:
 * Голова, Тело, Левая рука, Правая рука, Левая нога, Правая нога, CPU, RAM, HDD
 * В первую ночь на свалке находится 20 случайных деталей. Каждую последующую ночь фабрика выбрасывает на свалку
 * от 1 до 4 случайных деталей.
 * В то же самое время прислужники обоих учёных отправляются на свалку, и каждый собирает от 1 до 4 случайных деталей.
 * Если на свалке деталей нет – прислужник уходит ни с чем.
 * Затем они возвращаются домой и отдают детали хозяевам.
 * Учёные пытаются собрать как можно больше роботов из деталей, которые они получили.
 * Написать программу, симулирующую этот процесс. Для симуляции принять, что каждая ночь наступает через 100мс.
 * Фабрика и два прислужника действуют в одно и то же время.
 * После 100 ночей (около 10 секунд) определить победителя соревнования.
 */

public class Task1 {

    public static void main(String[] args) {
        Damp damp = new Damp();
        Scientist sc1 = new Scientist("Bob");
        Scientist sc2 = new Scientist("Alex");

        ScientistThread st1 = new ScientistThread(damp, sc1);
        ScientistThread st2 = new ScientistThread(damp, sc2);
        for (int i = 0; i < 100; i++) {
            Thread tr1 = new Thread(st1);
            Thread tr2 = new Thread(st2);
            System.out.println("Ночь = " + i);
            tr1.start();
            tr2.start();
            try {
                tr1.join();
                tr2.join();
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            damp.night();
        }
    }
}