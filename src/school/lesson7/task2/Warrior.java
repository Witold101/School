package school.lesson7.task2;

import school.lesson7.task1.Hero;
import school.lesson7.task3.Enemy;

public class Warrior extends Hero {
    private final int DAMAGE =120;

    public Warrior(String name) {
        super(name);
    }

    public void attackEnemy(){
        System.out.println("Warrior "+ getName()+" attack enemy !!!");
    }

    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(this.DAMAGE);
        System.out.println("Warrior " + getName() + " attack enemy !!! Enemy heals - "+enemy.getHealth());
    }
}
