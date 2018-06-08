package school.lesson7.task2;

import school.lesson7.task1.Hero;

public class Archer extends Hero {

    public Archer(String name) {
        super(name);
    }

    public void attackEnemy(){
        System.out.println("Archer "+ getName()+" attack enemy !!!");
    }
}
