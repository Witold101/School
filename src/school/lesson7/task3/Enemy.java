package school.lesson7.task3;

/**
 * Создать класс Enemy, представляющий собой врага и содержащий поле health (количество здоровья).
 * Добавить конструктор, принимающий количество здоровья, а также сеттер и геттер.
 * Добавить метод takeDamage(int damage), который уменьшает количество здоровья в соответствии с полученным уроном.
 * <p>
 * Переписать метод attackEnemy класса Hero, добавив ему параметр типа Enemy.
 * Метод должен вызывать у врага метод takeDamage и передавать в него определённое количество урона.
 * Переопределить метод в подклассах Warrior, Mage и Archer так, чтобы каждый герой наносил врагу разное количество урона.
 */

public class Enemy {
    private int health;

    public Enemy(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void takeDamage(int damage) {
        setHealth(getHealth() - damage);
    }
}
