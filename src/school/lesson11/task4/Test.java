package school.lesson11.task4;

public class Test {

    public static void main(String[] args) {
        BlackBox blackBox=new BlackBox();
        blackBox.add(2);
        blackBox.add(0);
        blackBox.add(12);
        blackBox.add(1);
        blackBox.add(2);
        blackBox.add(45);
        blackBox.add(-34);
        blackBox.add(20);
        blackBox.add(0);
        blackBox.add(2);
        blackBox.add(22);


        System.out.println(blackBox.toString());
        System.out.println("Ответ на запрос = "+ blackBox.getMinNumber(2));
        System.out.println("Ответ на запрос = "+ blackBox.getMaxNumber(5));

    }
}
