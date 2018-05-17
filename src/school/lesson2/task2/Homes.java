package school.lesson2.task2;

import java.util.Scanner;

public class Homes {

    /**
     * Имеются два дома размерами a на b и c на d. Размеры вводятся польователем с консоли.
     * Проверить, помещаются ли эти дома на участке размерами e на f.
     * Стороны домов - параллельны сторонам участка, в остальном размещение может быть любым.
     */


    static int[] setSize(boolean flagSort) {
        Scanner result = new Scanner(System.in);
        int[] num = new int[2];
        for (int i = 0; i < num.length; i++) {
            num[i] = result.nextInt();
        }
        if (flagSort) {
            for (int j = 0; j < num.length; j++) {
                int temporary;
                for (int i = 0; i < num.length - 1; i++) {
                    if (num[i] > num[i + 1]) {
                        temporary = num[i + 1];
                        num[i + 1] = num[i];
                        num[i] = temporary;
                    }
                }
            }
        }
        return num;
    }


    static int[][] getBigHomes(int[] home1, int[] home2) {
        int[] sizeBlock1 = new int[2];
        int[] sizeBlock2 = new int[2];
        int[] sizeBlock3 = new int[2];
        int[] temp;
        int[][] result = new int[3][2];

        if (home1[1] < home2[1]) {
            temp = home1;
            home1 = home2;
            home2 = temp;
        }

        sizeBlock1[0] = home1[0] + home2[0];
        sizeBlock1[1] = home1[1];

        sizeBlock2[1] = home1[1] + home2[0];
        if (home1[0] <= home2[1]) {
            sizeBlock2[0] = home2[1];
        } else {
            sizeBlock2[0] = home1[0];
        }

        sizeBlock3[1] = home1[1] + home2[1];
        if (home1[0] >= home2[0]) {
            sizeBlock3[0] = home1[0];
        } else {
            sizeBlock3[0] = home2[0];
        }
        result[0] = sizeBlock1;
        result[1] = sizeBlock2;
        result[2] = sizeBlock3;
        return result;
    }

    static boolean checkInstallationHouse(int[][] bigHomes, int[] area) {
        for (int i = 0; i < bigHomes.length; i++) {
            if ((bigHomes[i][0] > bigHomes[i][1]) && (bigHomes[i][0] <= area[1])) {
                if (bigHomes[i][1] <= area[0]) {
                    return true;
                }
            } else if ((bigHomes[i][1] > bigHomes[i][0]) && (bigHomes[i][1] <= area[1])) {
                if (bigHomes[i][0] <= area[0]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] arg) {

        int[][] bigHomes;
        int[] home1;
        int[] home2;
        int[] area;
        System.out.print("Enter length and width of the house1.");
        home1 = setSize(true);
        System.out.print("Enter length and width of the house2.");
        home2 = setSize(true);
        System.out.print("Enter length and width of the area.");
        area = setSize(true);
        bigHomes = getBigHomes(home1, home2);

        System.out.print(checkInstallationHouse(bigHomes,area));
    }
}
