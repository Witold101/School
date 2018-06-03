package school.lesson13.task4;

import java.util.Formatter;

/**
 *Написать функцию, принимающую в качестве параметров имя, фамилию и отчество и возвращающую инициалы
 *     в формате "Ф.И.О". Учесть, что входные параметры могут быть в любом регистре, а результирующая строка
 *     должна быть в верхнем.
 */
public class Task4 {

    public static String getFIO(String name, String surname, String father){
        return String.format("%S %S. %S.", surname.trim().toUpperCase(),name.trim().toUpperCase().charAt(0)
                ,father.trim().toUpperCase().charAt(0));
    }

    public static void main(String[] args) {
        System.out.println(getFIO(" Ольга","    Василюс "," Александровна  "));
    }
}
