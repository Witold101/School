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
        char[] chars = polynomial.trim().toCharArray();
        HashMap<Integer, Integer> map = new HashMap<>();
        Integer[] temp = new Integer[2];
        String buffer = "";
        int sign = 1;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != ' ') {
                switch (chars[i]) {
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
                        for (int j = 0; j < temp.length; j++) {
                            temp[j] = null;
                        }
                    }
                    break;
                    case '-': {
                        if (!buffer.equals("")) {
                            temp[1] = Integer.parseInt(buffer);
                            sign = -1;
                            buffer = "";
                        } else {
                            if (i == 0) {
                                sign = -1;
                            } else {
                                temp[1] = 1;
                                sign = -1;
                            }
                        }
                        if (i != 0) {
                            map.put(temp[1], temp[0]);
                            for (int j = 0; j < temp.length; j++) {
                                temp[j] = null;
                            }
                        }
                    }
                    break;
                    default: {
                        if (chars[i] != '^') {
                            buffer = buffer + chars[i];
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

    // Метод преобразует элемент в строку
    private static String getStringElement(Integer degree, Integer number, boolean newString) {
        if (degree != null && number != null) {
            if (newString) {
                if (degree > 1) {
                    return number.toString() + "x^" + degree;
                } else if (degree == 1) {
                    return number.toString() + "x";
                } else {
                    return number.toString();
                }
            } else {
                if (number < 0) {
                    if (degree > 1) {
                        return " - " + Math.abs(number) + "x^" + degree;
                    } else if (degree == 1) {
                        return " - " + Math.abs(number) + "x";
                    } else {
                        return " - " + Math.abs(number);
                    }
                } else if (number > 0) {
                    if (degree > 1) {
                        return " + " + Math.abs(number) + "x^" + degree;
                    } else if (degree == 1) {
                        return " + " + Math.abs(number) + "x";
                    } else {
                        return " + " + Math.abs(number);
                    }
                }
            }
        }
        return "";
    }

    // Метод преобразовывает HashMap в строку многочлен
    public static String getStringPolynomial(HashMap<Integer, Integer> polynomial) {
        if (polynomial != null) {
            String s = "";
            List<Integer> listKey = new ArrayList<>(polynomial.keySet());
            Collections.sort(listKey);
            for (int i = listKey.size() - 1; i >= 0; i--) {
                s = s + getStringElement(listKey.get(i), polynomial.get(listKey.get(i)), i == listKey.size() - 1);
            }
            return s;
        } else {
            return "";
        }
    }

    // Метод складывает два выражения и возвращает результат в HashMap
    public static HashMap<Integer, Integer> sumPolynomial(HashMap<Integer, Integer> polynomial1
            , HashMap<Integer, Integer> polynomial2) {

        if (polynomial1 != null && polynomial2 != null) {
            Integer temp;
            HashMap<Integer, Integer> mapResult = new HashMap<>(polynomial1);
            for (Integer key : polynomial2.keySet()) {
                if (mapResult.containsKey(key)) {
                    temp = mapResult.get(key) + polynomial2.get(key);
                    mapResult.put(key,temp);
                }else {
                    mapResult.put(key,polynomial2.get(key));
                }
            }
            return mapResult;
        }else {
            return null;
        }
    }

    public static void main(String[] args) {
        String polynomial1 = "-24x^7 - 24x^6 - 4x^4 + 90x^3 + 8";
        String polynomial2 = " 224x^7 + 21x^4 + 3x^3 - 3x - 23";

        HashMap<Integer, Integer> polynomialHashMap1 = getPolynomial(polynomial1);
        HashMap<Integer, Integer> polynomialHashMap2 = getPolynomial(polynomial2);

        System.out.println(getStringPolynomial(polynomialHashMap1));
        System.out.println(getStringPolynomial(polynomialHashMap2));
        System.out.println(getStringPolynomial(sumPolynomial(polynomialHashMap1,polynomialHashMap2)));
    }
}
