package sergii_hw;

import homework.Utils;

public class S_HW4_1 extends Utils {

    /***********************************************************************************
     Задача №1

     Дан массив:
     int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
     необходимо вывести сумму всех значений массива.*/
    public static int getSum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println(sum);
        return sum;
    }

    /***********************************************************************************
     Задача №2

     Дан массив:
     int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
     необходимо вывести максимальное значение массива.*/
    public static int getMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        System.out.println(max);
        return max;
    }

    public static int getMax_2(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
        return max;
    }

    /***********************************************************************************
     Задача №3

     Дан массив:
     int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
     необходимо вывести минимальное значение массива.*/
    public static int getMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i : arr) {
            if (i < min) {
                min = i;
            }
        }
        System.out.println(min);
        return min;
    }

    /***********************************************************************************
     Задача №4

     Дан массив:
     int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
     необходимо вывести среднее арифметическое всех значений массива.*/
    public static double getAvg(int[] arr) {
        double avg = getSum(arr) / arr.length;
        System.out.println(avg);
        return avg;
    }


    /***********************************************************************************
     Задача №5

     Дан массив:
     int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
     необходимо вывести сумму элементов массива.*/
    public static double getAvg(int[][] arr) {

    }



        /***********************************************************************************
         Задача №6

         Дан массив:
         int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
         необходимо вывести максимальное значение массива.*/

    /***********************************************************************************
     Задача №7

     Дан массив:
     int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
     необходимо вывести количество элементов в массиве.*/

    public static void main(String[] args) {
        printTaskNUmber(1);
        getSum(new int[]{9, 2, 6, 4, 5, 12, 7, 8, 6});


        printTaskNUmber(2);
        getMax(new int[]{9, 2, 6, 4, 5, 12, 7, 8, 6});
        getMax_2(new int[]{9, 2, 6, 4, 5, 12, 7, 8, 6});


        printTaskNUmber(3);
        getMin(new int[]{9, 2, 6, 4, 5, 12, 7, 8, 6});


        printTaskNUmber(4);
        getAvg(new int[]{9, 2, 6, 4, 5, 12, 7, 8, 6});
        printNewRow();

        printTaskNUmber(5);
        printNewRow();

        printTaskNUmber(6);
        printNewRow();


    }
}
