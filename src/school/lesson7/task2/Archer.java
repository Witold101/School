package school.lesson7.task2;

import school.lesson7.task1.Hero;
import school.lesson7.task3.Enemy;

public class Archer extends Hero {

    public Archer(String name) {
        super(name);
    }
    private final int DAMAGE = 80;

    public void attackEnemy() {
        System.out.println("Archer " + getName() + " attack enemy !!!");
    }

    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(this.DAMAGE);
        System.out.println("Archer " + getName() + " attack enemy !!! Enemy heals - "+enemy.getHealth());
    }
}
