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
import school.lesson7.task3.Enemy;

/**
 * Создать классы Warrior, Mage и Archer, представляющие собой наследников класса Hero
 *     Переопределить в них метод attackEnemy() для вывода специализированного для этого класса сообщения об атаке.
 *     Протестировать создание героев различных классов и их атаки в классе TrainingGround.
 */

public class TrainingGround {

    public static void main(String[] args) {
        Enemy enemy = new Enemy(1000);
        Hero hero = new Hero("Johnny Depp");
        hero.attackEnemy();
        hero.attackEnemy(enemy);
        Warrior warrior = new Warrior("Johnny Depp");
        warrior.attackEnemy();
        warrior.attackEnemy(enemy);
        Archer archer = new Archer("Johnny Depp");
        archer.attackEnemy();
        archer.attackEnemy(enemy);
        Mage mage = new Mage("Johnny Depp");
        mage.attackEnemy();
        mage.attackEnemy(enemy);
    }
}
