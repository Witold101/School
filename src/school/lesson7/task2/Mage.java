package school.lesson7.task2;

import school.lesson7.task1.Hero;
import school.lesson7.task3.Enemy;

public class Mage extends Hero {
    private final int DAMAGE = 60;

    public Mage(String name) {
        super(name);
    }

    public void attackEnemy(){
        System.out.println("Mage "+ getName()+" attack enemy !!!");
    }

    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(this.DAMAGE);
        System.out.println("Mage " + getName() + " attack enemy !!! Enemy heals - "+enemy.getHealth());
    }
}
