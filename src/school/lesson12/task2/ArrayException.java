package school.lesson12.task2;

/**
 * 2.	Написать код, который создаст, а затем отловит ArrayIndexOutOfBoundsException.
 */

public class ArrayException {

    Integer[] array;

    public ArrayException() {
        this.array = new Integer[]{2, 4, 5, 13, 4, 90};
    }

    public Integer getElement(int index) {
        try {
            Integer i = this.array[index];
            return i;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ваш индекс за пределами массива. \n Максимальное значение индекса = " + (array.length - 1)
                    + "\n Мы исправили индекс на максимально допустимое значение.");
            return getElement(this.array.length - 1);
        }
    }


}
