package school.lesson2.task1;

import java.util.Scanner;

public class Main {

    /**
     * Имеются три числа - день, месяц и год, вводимые пользователем с консоли.
     * Вывести дату следующего дня в формате "День.Месяц.Год".
     * Учесть переход на следующий месяц, а также следующий год.
     * Форматирование строки "День.Месяц.Год" вынести в отдельную функцию.
     */

    /* Returns the massif where 0 element - day, 1 element - month, 2 element - year.*/
    static int[] setDateMonthYear() {
        Scanner result = new Scanner(System.in);
        int[] num = new int[3];
        System.out.print("Enter day, month, year through a gap and press ENTER.");
        for (int i = 0; i < 3; i++) {
            num[i] = result.nextInt();
        }
        return num;
    }

    static boolean leapYear(int year) {

        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }


    public static String getDateMonthYear(int[] date){
        int day= date[0];
        int month = date[1];
        int year = date[2];

        switch (month){
            case 1:{
                if (day+1==32){
                    day = 1;
                    month++;
                }else {
                    day++;
                }
            }break;
            case 2:{
                if (day+1==29){
                    if (leapYear(year)){
                       day++;
                    } else {
                        day=1;
                        month++;
                    }
                } else if(day+1==30){
                    day=1;
                    month++;
                }else {
                    day++;
                }
                break;
            }
            case 3:{
                if (day+1==32){
                    day = 1;
                    month++;
                }else {
                    day++;
                }
            }break;
            case 4:{
                if (day+1==31){
                    day = 1;
                    month++;
                }else {
                    day++;
                }
            }break;
            case 5:{
                if (day+1==32){
                    day = 1;
                    month++;
                }else {
                    day++;
                }
            }break;
            case 6:{
                if (day+1==31){
                    day = 1;
                    month++;
                }else {
                    day++;
                }
            }break;
            case 7:{
                if (day+1==32){
                    day = 1;
                    month++;
                }else {
                    day++;
                }
            }break;
            case 8:{
                if (day+1==32){
                    day = 1;
                    month++;
                }else {
                    day++;
                }
            }break;
            case 9:{
                if (day+1==31){
                    day = 1;
                    month++;
                }else {
                    day++;
                }
            }break;
            case 10:{
                if (day+1==32){
                    day = 1;
                    month++;
                }else {
                    day++;
                }
            }break;
            case 11:{
                if (day+1==31){
                    day = 1;
                    month++;
                }else {
                    day++;
                }
            }break;
            case 12:{
                if (day+1==32){
                    day = 1;
                    month=1;
                    year++;
                }else {
                    day++;
                }
            }break;
        }
        return day+"."+month+"."+year;
    }


    public static void main(String[] args) {
        int[] dateMonthYear = setDateMonthYear();

        System.out.print(getDateMonthYear(dateMonthYear));
    }
}
