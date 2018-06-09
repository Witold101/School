package school.lesson7.task1;

import school.lesson7.task3.Enemy;

/**
 * Создать класс Hero, представляющий собой героя и содержащий поле name.
 *     Добавить конструктор, принимающий имя героя и геттер для имени (сеттер не нужен).
 *     Добавить метод attackEnemy(), выводящий в консоль сообщение о том, что герой атакует врага.
 *     Создать класс TrainingGround, содержащий метод main. Протестировать создание героя и его атаку.
 */

/**
 * Сделать класс Hero и его метод attackEnemy абстрактными.
 */

public class Hero {
    private String name;
    private final int DAMAGE = 10;

    public Hero(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void attackEnemy(int damage){};

    public void attackEnemy(){
        System.out.println(getName()+" attack enemy !!!");
    }
    public void attackEnemy(Enemy enemy){
        enemy.takeDamage(this.DAMAGE);
        System.out.println(getName()+" attack enemy !!! Heals - "+enemy.getHealth());
    }
}
