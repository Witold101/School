package school.lesson7.task1;

/**
 * Создать класс Hero, представляющий собой героя и содержащий поле name.
 *     Добавить конструктор, принимающий имя героя и геттер для имени (сеттер не нужен).
 *     Добавить метод attackEnemy(), выводящий в консоль сообщение о том, что герой атакует врага.
 *     Создать класс TrainingGround, содержащий метод main. Протестировать создание героя и его атаку.
 */

import school.lesson7.task2.Archer;
import school.lesson7.task2.Mage;
import school.lesson7.task2.Warrior;

/**
 * Создать классы Warrior, Mage и Archer, представляющие собой наследников класса Hero
 *     Переопределить в них метод attackEnemy() для вывода специализированного для этого класса сообщения об атаке.
 *     Протестировать создание героев различных классов и их атаки в классе TrainingGround.
 */

public class TrainingGround {

    public static void main(String[] args) {
        Hero hero = new Hero("Johnny Depp");
        hero.attackEnemy();
        Warrior warrior = new Warrior("Johnny Depp");
        warrior.attackEnemy();
        Archer archer = new Archer("Johnny Depp");
        archer.attackEnemy();
        Mage mage = new Mage("Johnny Depp");
        mage.attackEnemy();
    }
}
