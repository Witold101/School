package school.lesson2.task3;

import java.util.Scanner;

public class QuadraticEquation {

    /**
     * Написать программу, вычисляющую корни квадратного уравнения вида ax ² + bx + c = 0,
     * где a, b и c - вводимые пользователем из консоли данные.
     * Учитывать только реальные корни (в случае отрицательного дискриминанта выводить сообщение пользователю).
     * При решении создать и использовать следующие вынесенные функции:
     * - функция isPositive, определяющая, является ли число положительным
     * - функция isZero, определяющая, является ли число нулём
     * - функция discriminant, вычисляющая дискриминанта
     *
     * @param
     */

    static double[] getABC() {
        Scanner result = new Scanner(System.in);
        double[] num = new double[3];
        System.out.print("Enter values of variables a, b, c");
        for (int i = 0; i < 3; i++) {
            num[i] = result.nextInt();
        }
        return num;
    }

    static boolean isPositive(double i) {
        if (i > 0) {
            return true;
        }
        return false;
    }

    static boolean isZero(double i) {
        if (i == 0) {
            return true;
        }
        return false;
    }

    //Returns values for a discriminant 0 - no root , 1-one root, 2 - two roots
    static int discriminant(double[] abc) {
        if (isPositive(abc[1] * abc[1] - 4 * abc[0] * abc[2])) {
            return 2;
        } else if (isZero(abc[1] * abc[1] - 4 * abc[0] * abc[2])) {
            return 1;
        } else return 0;
    }

    static double[] quadraticEquation(int discriminantFlag, double[] abc) {
        double[] result = new double[2];
        if (discriminantFlag > 0) {
            double discrim = abc[1] * abc[1] - 4 * abc[0] * abc[2];
            double temp = Math.sqrt(discrim);
            temp = -abc[1] + temp;
            result[0] = temp / (2 * abc[0]);

            if (discriminantFlag == 2) {
                temp = Math.sqrt(discrim);
                temp = -abc[1] - temp;
                result[1] = temp / (2 * abc[0]);
            }
        }
        return result;
    }

    public static void main(String[] arg) {
        double[] abc = getABC();
        switch (discriminant(abc)) {
            case 0: {
                System.out.print("The equation has no roots!");
            }
            break;
            case 1: {
                System.out.print("At the equation one root!");
            }
            break;
            case 2: {
                System.out.print("At the equation two roots!");
            }
            break;
        }

        double[] re = quadraticEquation(discriminant(abc), abc);
        if (re.length > 0) {
            for (int i = 0; i < re.length; i++) {
                System.out.println("Root" + i + "-- " + re[i]);
            }
        } else {
            System.out.println("The equation has no roots!");
        }
    }
}
