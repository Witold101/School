package school.lesson18.task1.detal;

import java.util.Random;

public class FactoryDetail {

    private FactoryDetail(){
    }

    public static Detail getDetail(){
        Random random = new Random();
        switch (random.nextInt(9)){
            case 0:{
                return new Body("Body");
            }
            case 1:{
                return new CPU("CPU");
            }
            case 2:{
                return new HDD("HDD");
            }
            case 3:{
                return new Head("Head");
            }
            case 4:{
                return new LeftHand ("Left Hand");
            }
            case 5:{
                return new LeftLed("Left Led");
            }
            case 6:{
                return new RAM("RAM");
            }
            case 7:{
                return new RightHand("Right Hand");
            }
            case 8:{
                return new RightLed("Right Led");
            }
            default:{
                return null;
            }
        }
    }
}
