package school.lesson7.task2;

import school.lesson7.task1.Hero;

public class Warrior extends Hero {

    public Warrior(String name) {
        super(name);
    }

    public void attackEnemy(){
        System.out.println("Warrior "+ getName()+" attack enemy !!!");
    }
}
