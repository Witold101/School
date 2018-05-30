package school.lesson11.task3;

import java.util.*;

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
                        map.put(temp[1], temp[0]);
                        for (int i = 0; i < temp.length; i++) {
                            temp[i] = null;
                        }
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
                        map.put(temp[1], temp[0]);
                        for (int i = 0; i < temp.length; i++) {
                            temp[i] = null;
                        }
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
        if (!buffer.equals("") && temp[1] == null) {
            temp[0] = Integer.parseInt(buffer);
            temp[1] = 0;
            map.put(temp[1], temp[0]);
        } else if (!buffer.equals("") && temp[1] != null) {
            temp[1] = Integer.parseInt(buffer);
            map.put(temp[1], temp[0]);
        } else if (buffer.equals("") && temp[1] != null) {
            temp[1] = 1;
            map.put(temp[1], temp[0]);
        }
        return map;
    }

    // Метод преобразовывает HashMap в строку многочлен
    public static String getStringPolynomial(HashMap<Integer, Integer> polynomial) {
        String s = "";
        List<Integer> listKey = new ArrayList<>(polynomial.keySet());
        Collections.sort(listKey);
        Integer value;
        for (int i = listKey.size() - 1; i < 0; i++) {
            value = polynomial.get(listKey.get(i));
            if (value >= 0 && i > 0) {
                if (s.equals("")) {
                    s = value.toString() +
                }
                s = s +
            }

        }
        return null;
    }

    public static HashMap<Integer, Integer> sumPolynomial(HashMap<Integer, Integer> polynomial1
            , HashMap<Integer, Integer> polynomial2) {

        return null;
    }

    public static void main(String[] args) {
        String polynomial1 = "24x^6 + 4x^4 + 90x^3 + 8";
        String polynomial2 = " 224x^7 + 21x^4 + 3x^3 - 3x + 23";

        HashMap<Integer, Integer> polyamial = getPolynomial(polynomial1);
        getStringPolynomial(polyamial);

//        System.out.println(getStringPolynomial());
    }
}
