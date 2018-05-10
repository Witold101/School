package school.lesson2.task4;

import java.util.Scanner;

public class Word {

    /**
     * Запросить у пользователя 2 слова. Если они одинаковы - вывести "Отлично! Слова одинаковы".
     * Если они отличаются лишь регистром - "Хорошо. Почти одинаковы"
     * Если они отличаются, но одной длины - "Ну, хотя бы они одной длины"
     * Использовать методы класса String: equals(String string), equalsIgnoreCase(String string), length()
     *
     * @param
     */


    static String[] setWord() {
        Scanner result = new Scanner(System.in);
        String[] words = new String[2];
        for (int i = 0; i < words.length; i++) {
            words[i] = result.next();
        }
        return words;
    }



    public static void main(String[] args) {

        System.out.print("Введите два слова");
        String[] words=setWord();
        if( words[0].equals(words[1])){
            System.out.print("Отлично! Слова одинаковы");
        }else if ( words[0].equalsIgnoreCase(words[1])){
            System.out.print("Хорошо. Почти одинаковы");
        }else if (words[0].length()==words[1].length()){
            System.out.print("Ну, хотя бы они одной длины");
        }else{
            System.out.print("Вообще разные");
        }
    }
}
