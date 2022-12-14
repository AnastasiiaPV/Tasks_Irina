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
    public static double getSumElementsFromMultiArray(int[][] arr) {
            int sum = 0;
            for (int[] ints : arr) {
                for (int j = 0; j < ints.length; j++) {
                    sum += ints[j];
                }
            }
            System.out.println(sum);
            return sum;
        }


    /***********************************************************************************
     Задача №6

     Дан массив:
     int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
     необходимо вывести максимальное значение массива.*/
    public static int getMaxNumInMultipleArray(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int j = 0; j < ints.length; j++) {
                if (ints[j] > max) {
                    max = ints[j];
                }
            }
        }
        System.out.println(max);
        return max;
    }

    /***********************************************************************************
     Задача №7

     Дан массив:
     int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
     необходимо вывести количество элементов в массиве.*/
    public static double countElementsFromMultiArray(int[][] arr) {
        int count = 0;
        for (int[] ints : arr) {
            for (int j = 0; j < ints.length; j++) {
                count++;
            }
        }
        System.out.println(count);
        return count;
    }

    public static double countElementsFromMultiArray_2(int[][] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count += arr[i].length;
        }
        System.out.println(count);
        return count;
    }


    public static void main(String[] args) {
        printTaskNUmber(1);
        getSum(new int[]{9, 2, 6, 4, 5, 12, 7, 8, 6});


        printTaskNUmber(2);
        getMax(new int[]{9, 2, 6, 4, 5, 12, 7, 8, 6});
        getMax_2(new int[]{9, 2, 6, 4, 5, 12, 7, 8, 6});


        printTaskNUmber(3);
        getMin(new int[]{9, 2, 6, 4, 5, 12, 7, 8, 6});


        printTaskNUmber(4);
        getAvg(new int[]{1,2,3,4,5,6,7,8,9});
        printNewRow();

        printTaskNUmber(5);
        getSumElementsFromMultiArray(new int[][]{{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}});
        printNewRow();

        printTaskNUmber(6);
        getMaxNumInMultipleArray(new int[][]{{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}});
        printNewRow();

        printTaskNUmber(7);
        countElementsFromMultiArray(new int[][]{{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}});
        printNewRow();

        printSubparagraphNumber(7,"2");
        countElementsFromMultiArray_2(new int[][]{{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}});
    }
}
