package school.lesson7.task2;

import school.lesson7.task1.Hero;

public class Mage extends Hero {

    public Mage(String name) {
        super(name);
    }

    public void attackEnemy(){
        System.out.println("Mage "+ getName()+" attack enemy !!!");
    }
}
