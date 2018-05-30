package school.lesson11.task3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Сложить два многочлена заданной степени, если коэффициенты многочленов хранятся в двух объектах HashMap в виде:
 * Ключ: номер степени
 * Значение: значение множителя
 * <p>
 * Вывести результирующий многочлен в виде строки: ax^6 + bx^4 + cx^3 + dx + 8
 */

public class Sum {

    // Метод для преобразования текста выражения в HashMap
    public static HashMap<Integer, Integer> getPolynomial(String polynomial) {
        char[] chars = polynomial.toCharArray();
        HashMap<Integer, Integer> map = new HashMap<>();
        Integer[] temp = new Integer[2];
        String buffer = "";
        int sign = 1;

        for (char ch : chars) {
                if (ch != ' ') {
                    switch (ch) {
                        case 'x': {
                            temp[0] = Integer.parseInt(buffer) * sign;
                            buffer = "";
                        }
                        break;
                        case '+': {
                            if (!buffer.equals("")) {
                                temp[1] = Integer.parseInt(buffer);
                                sign = 1;
                                buffer = "";
                            } else {
                                temp[1] = 1;
                                sign = 1;
                            }
                            map.put(temp[1],temp[0]);
                        }
                        break;
                        case '-': {
                            if (!buffer.equals("")) {
                                temp[1] = Integer.parseInt(buffer);
                                sign = -1;
                                buffer = "";
                            } else {
                                temp[1] = 1;
                                sign = -1;
                            }
                            map.put(temp[1],temp[0]);
                        }
                        break;
                        default: {
                            if (ch != '^') {
                                buffer = buffer + ch;
                            }
                        }
                        break;
                    }
                }
        }
        if(!buffer.equals("")&& temp[1]==null){
            temp[0]=Integer.parseInt(buffer);
            temp[1]=0;
            map.put(temp[1],temp[0]);
        }else if( !buffer.equals("")&& temp[1]!=null){
            temp[1]=Integer.parseInt(buffer);
            map.put(temp[1],temp[0]);
        }
        return map;
    }

    public static String getStringPolynomial(HashMap<Integer, Integer> polynomial) {
        return null;
    }

    public static HashMap<Integer, Integer> sumPolynomial(HashMap<Integer, Integer> polynomial1
            , HashMap<Integer, Integer> polynomial2) {

        return null;
    }

    public static void main(String[] args) {
        String polynomial1 = "24x^6 + 4x^4 + 90x^3 + 3x + 8";
        String polynomial2 = " 224x^7 + 21x^4 + 3x^3 - 3x^2 ";

        HashMap<Integer, Integer> polyamial = getPolynomial(polynomial2);

//        System.out.println(getStringPolynomial());
    }
}
