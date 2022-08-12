package hw8;

import homework.Utils;

import java.util.Arrays;

public class HW8 extends Utils {

    static Integer secondInt = 6;
    static Double secondDouble = 3.5;
    static String secondString = "String1";

    public static boolean compareDouble(Double a, Double b) {
        return a.equals(b);
    }

    public static boolean compareInteger(Integer a, Integer b) {
        return a.equals(b);
    }

    public static boolean compareString(String a, String b) {
        return a.equals(b);
    }


    public static void printResult() {
        System.out.println("HW8" + " ".repeat(14) + "|HW8_1" + " ".repeat(14) + "|areEquals?\n" + printLine().repeat(3)
                + "\nDouble d = " + HW8_1.firstDouble + " ".repeat(4) + "|Double d_1 = " + secondDouble
                + " ".repeat(4) + "|" + compareDouble(HW8_1.firstDouble, secondDouble) + " ".repeat(2)
                + "\nInteger i = " + HW8_1.firstInt + " ".repeat(5) + "|Integer i_2 = " + secondInt
                + " ".repeat(5) + "|" + compareInteger(HW8_1.firstInt, secondInt) + " ".repeat(2)
                + "\nString s = " + HW8_1.firstString + "|String s_1 = " + secondString
                + "|" + compareString(HW8_1.firstString, secondString) + " ".repeat(2));
    }

    /***************************************************************************************************************
     *  7. Написать метод, который принимает на вход 5 целых чисел,  и возвращает массив из этих же чисел*/
    public static int[] getArrayInt_10(int a, int b, int c, int d, int e) {
        int[] arr = new int[5];
        arr[0] = a;
        arr[1] = b;
        arr[2] = c;
        arr[3] = d;
        arr[4] = e;

        return arr;
    }

    /***************************************************************************************************************
     * 8. Написать метод, который принимает на вход 5 чисел типа double,  и возвращает массив из этих же чисел*/
    public static double[] getArrayDouble(double a, double b, double c, double d, double e) {
        double[] arr = new double[5];
        arr[0] = a;
        arr[1] = b;
        arr[2] = c;
        arr[3] = d;
        arr[4] = e;

        return arr;
    }

    /***************************************************************************************************************
     *  9. Написать метод, который принимает на вход 5 слов, и возвращает массив из этих слов*/
    public static String[] getArrayString(String a, String b, String c, String d, String e) {
        String[] arr = new String[5];
        arr[0] = a;
        arr[1] = b;
        arr[2] = c;
        arr[3] = d;
        arr[4] = e;

        return arr;
    }

    /***************************************************************************************************************
     *  10. Написать метод, который принимает на вход массив целых чисел,  и возвращает массив тех же чисел,
     умноженных на 2.5*/
    //(5, 7, 105, 63, 17)
    public static int[] getArrayInt_10(int[] array) {
        int[] newArray = {};

        for (int j : array) {
            newArray = Arrays.copyOf(newArray, newArray.length + 1);
            newArray[newArray.length - 1] = (int) Math.round(j * 2.5);
        }

        return newArray;
    }


    /***************************************************************************************************************
     *  11. Написать метод, который принимает на вход массив целых положительных чисел,
     * и возвращает количество четных чисел в этом массиве
     */
    public static int getArrayEven(int[] array) {
        int count = 0;

        for (int j : array) {
            if (j % 2 == 0) {
                count++;
            }
        }
        return count;
    }


    /***************************************************************************************************************
     * 12. Написать метод, который принимает на вход массив целых положительных чисел,
     * и возвращает массив нечетных чисел
     * */
    public static int[] getArrayOdd(int[] array) {
        int[] odd = {};

        for (int j : array) {
            odd = Arrays.copyOf(odd, odd.length + 1);
            odd[odd.length - 1] = j * -1;
        }
        return odd;
    }

    /***************************************************************************************************************
     13. Написать метод, который принимает на вход массив целых чисел,  и возвращает массив значений true или false,
     если числа больше 10*/
    //1, 60, 22, 48, 82, 6, 5
    public static boolean[] getArrayBoolean(int[] array) {
        boolean[] newArray = {};

        for (int j : array) {
            newArray = Arrays.copyOf(newArray, newArray.length + 1);
            newArray[newArray.length - 1] = j > 10;
        }
        return newArray;
    }


    /***************************************************************************************************************
     14. Написать метод, который принимает на вход массив слов,  и возвращает строку, состоящую из этих слов*/
    public static String getArrayString_14(String[] array) {
        StringBuilder sb = new StringBuilder();

        for (String j : array) {
            sb.append(j).append(" ");
        }
        return sb.toString();
    }

    /***************************************************************************************************************
     15. Написать метод, который принимает массив целых чисел и считает сумму чисел во второй половине массива*/
    // {1, 60, 22, 48, 82, 6, 5} 117
    // {1, 60, 22, 48, 82, 6} 136
    // {1, 60, 22, 5, 82, 6, 5} 95.5
    public static double getSum_15(int[] array) {
        double sumHalf = 0;

        if (array.length % 2 != 0) {
            for (int i = array.length / 2 + 1; i < array.length; i++) {
                sumHalf += array[i];
            }
            sumHalf += (double) array[array.length / 2] / 2;
        } else {
            for (int i = array.length / 2; i < array.length; i++) {
                sumHalf += array[i];
            }
        }
        return sumHalf;
    }


    /***************************************************************************************************************
     16. Написать метод, который принимает на вход целое положительные число в пределах от 1 до 10 исключительно,
     и возвращает таблицу умножения на это число в виде массива
     Например, метод(2) -> {0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20}*/
    public static int[] getMultiplicationTable(int a) {
        int[] array = {};

        if (a < 1 || a > 10) {
            System.out.println("Wrong number");
            return null;
        }

        for (int i = 0; i <= 10; i++) {
            array = Arrays.copyOf(array, array.length + 1);
            array[array.length - 1] = a * i;
        }
        return array;
    }

    /***************************************************************************************************************
     17. Написать метод, который принимает массив целых чисел и возвращает массив четных чисел, если четных чисел больше,
     или массив нечетных чисел, если нечетных чисел больше.*/
    // {1, 60, 22, 48, 82, 6, 5}
    public static int[] getEvenOrOdd(int[] array) {
        int countEven = 0;
        int countOdd = 0;
        int[] newArrayEven = {};
        int[] newArrayOdd = {};

        for (int j : array) {
            if (j % 2 == 0) {
                countEven++;
                newArrayEven = Arrays.copyOf(newArrayEven, newArrayEven.length + 1);
                newArrayEven[newArrayEven.length - 1] = j;
            } else {
                countOdd++;
                newArrayOdd = Arrays.copyOf(newArrayOdd, newArrayOdd.length + 1);
                newArrayOdd[newArrayOdd.length - 1] = j;
            }
        }
        if (countEven > countOdd) {
            return newArrayEven;
        } else if (countEven < countOdd) {
            return newArrayOdd;
        } else {
            System.out.println(Arrays.toString(newArrayEven) + ", " + Arrays.toString(newArrayOdd));
            return null;
        }
    }

    /***************************************************************************************************************
     18. Написать метод, который принимает на вход длину массива и генерирует массив случайных положительных чисел
     от 0 до 100 исключительно.*/
    public static int[] getRandomNum(int l) {
        int[] array = new int[l];

        for (int i = 0; i < l; i++) {
            array[i] = (int) Math.round(Math.random() * 100 + 0);
        }
        return array;
    }


    /***************************************************************************************************************
     19.  Написать метод, который принимает на вход длину массива l и количество знаков d
     (однозначные, двузначные, трехзначные и тд числа), и генерирует массив случайных целых положительных чисел длины l,
     в котором все числа имеют количество знаков d*/
    public static int[] getRandomNum_19(int l, int d) {
        int[] array = new int[l];
        int num = 1;

        for (int i = 0; i < d; i++) {
            num *= 10;
        }
        for (int i = 0; i < l; i++) {
            array[i] = (int) (Math.random() * (num - (num / 10) + 1)) + (num / 10);
        }
        return array;
    }

    /***************************************************************************************************************
     20. Написать метод, который принимает на вход массив целых положительных чисел, и возвращает массив только
     двузначных чисел. ПРоверить работу метода на массиве из задания 18.*/
    public static int[] getTwoDigitArray(int[] array) {
        int[] newArray = {};

        for (int j : array) {
            if (j < 100 && j > 9) {
                newArray = Arrays.copyOf(newArray, newArray.length + 1);
                newArray[newArray.length - 1] = j;
            }
        }
        return newArray;
    }

    /***************************************************************************************************************
     21. Написать метод, который принимает на вход массив целых положительных двузначных чисел,
     и возвращает массив разниц между десятками и единицами*/
    //{60, 22, 48, 82}
    public static int[] getDifference(int[] array) {
        int[] newArray = {};

        for(int j : array) {
            newArray = Arrays.copyOf(newArray, newArray.length + 1);
            newArray[newArray.length - 1] = (j / 10) - (j % 10);
            //newArray[newArray.length - 1] = j  - (j % 10);
        }
        return newArray;
    }


    /***************************************************************************************************************
     22. Написать метод, который принимает массив из 11 целых положительных чисел от 0 до 9, и возвращает массив,
     который содержит номер телефона, состоящий из этих чисел,  и название страны, которой номер принадлежит.
     Например:
     method({1, 8, 0, 0, 1, 2, 3, 4, 5, 6, 7}) -> {“1(800)123-45-67”, “USA”}*/
//    public static String[] getPhoneNum(int[] array) {
//        String[] newArray = {};
//        if (array.length > 11) {
//            System.out.println("Wrong array");
//        }
//
//        for (int i = 1; i < array.length; i++) {
//            newArray = Arrays.copyOf(newArray, newArray.length + 1);
//            StringBuilder sb = new StringBuilder();
//
//            sb.append(array[0]).append("(");
//            if(i < 4) {
//                sb.append(array[i]);
//            } else if()
//            newArray[newArray.length - 1] = ;
//
//        }
//    }


        /***************************************************************************************************************
         23. Написать метод, который принимает массив целых положительных чисел больше 0, и возвращает массив
         уникальных чисел.*/
        //{1,5,1,7,7,2,8})
        public static int[] getUniqueNum(int[] arr) {
            int[] newArray = {};

            for (int j = 0; j < arr.length; j++) {
                boolean equalityFlag = false;

                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] == arr[j] && i != j) {
                        equalityFlag = true;
                        break;
                    }
                }
                if(!equalityFlag) {
                    newArray = Arrays.copyOf(newArray, newArray.length + 1);
                    newArray[newArray.length - 1] = arr[j];
                }
            }

            return newArray;
        }

    /***************************************************************************************************************
     24. Написать метод, который принимает на вход массив целых положительных чисел, и возвращает
     количество уникальных и неуникальных элементов в этом массиве*/
//     public static int[] getSumUniqueNonUnique(int[] arr) {
//
//     }


     /***************************************************************************************************************
      25. Написать метод, который принимает на вход массив целых положительных чисел, и 2 целых положительных числа
         (значения индексов). Метод возвращает массив, который содержит только числа из первого массива в
         промежутке между индексами.
         Например:
         method({1, 2, 3, 4, 5}, 1, 3) -> {2, 3, 4}*/

    /***************************************************************************************************************
     26. Написать метод, который принимает на вход 2 массива int[] и возвращает объединенный массив уникальных
     неповторяющихся элементов*/


    public static void main(String[] args) {

        printTaskNUmber(6);
        printResult();
        printNewRow();


        printTaskNUmber(7);
        System.out.println(Arrays.toString(getArrayInt_10(5, 7, 105, 63, 17)));
        printNewRow();


        printTaskNUmber(8);
        System.out.println(Arrays.toString(getArrayDouble(5.9, 7, 105.04, 0.63, 17)));
        printNewRow();


        printTaskNUmber(9);
        System.out.println(Arrays.toString(getArrayString("a", "b", "c", "d", "e")));
        printNewRow();


        printTaskNUmber(10);
        System.out.println(Arrays.toString(getArrayInt_10(getArrayInt_10(5, 7, 105, 63, 17))));
        printNewRow();


        printTaskNUmber(11);
        System.out.println(getArrayEven(new int[]{6, 10, 3, 25, 16}));
        printNewRow();


        printTaskNUmber(12);
        System.out.println(Arrays.toString(getArrayOdd(new int[]{60, 22, 48, 82, 6})));
        printNewRow();


        printTaskNUmber(13);
        System.out.println(Arrays.toString(getArrayBoolean(new int[]{1, 60, 22, 48, 82, 6, 5})));
        printNewRow();


        printTaskNUmber(14);
        System.out.println(getArrayString_14(new String[]{"Flowers", "blum", "all", "day", "long"}));
        printNewRow();


        printTaskNUmber(15);
        System.out.println(getSum_15(new int[]{1, 60, 22, 48, 82, 6, 5}));
        System.out.println(getSum_15(new int[]{1, 60, 22, 48, 82, 6}));
        System.out.println(getSum_15(new int[]{1, 60, 22, 5, 82, 6, 5}));
        printNewRow();


        printTaskNUmber(16);
        System.out.println(Arrays.toString(getMultiplicationTable(5)));
        System.out.println(Arrays.toString(getMultiplicationTable(-5)));
        System.out.println(Arrays.toString(getMultiplicationTable(0)));
        printNewRow();


        printTaskNUmber(17);
        System.out.println(Arrays.toString(getEvenOrOdd(new int[]{1, 60, 22, 48, 82, 6, 5})));
        System.out.println(Arrays.toString(getEvenOrOdd(new int[]{1, 3, 22, 5, 81, 6, 5})));
        System.out.println(Arrays.toString(getEvenOrOdd(new int[]{1, 60, 22, 5, 81, 6})));
        printNewRow();


        printTaskNUmber(18);
        System.out.println(Arrays.toString(getRandomNum(15)));
        printNewRow();

        printTaskNUmber(19);
        System.out.println(Arrays.toString(getRandomNum_19(5, 2)));
        System.out.println(Arrays.toString(getRandomNum_19(5, 5)));
        System.out.println(Arrays.toString(getRandomNum_19(5, 1)));


        printTaskNUmber(20);
        System.out.println(Arrays.toString(getTwoDigitArray(getRandomNum(15))));

        printTaskNUmber(21);
        System.out.println(Arrays.toString(getDifference(new int[]{60, 22, 48, 82})));
        printNewRow();

        printTaskNUmber(23);
        System.out.println(Arrays.toString(getUniqueNum(new int[]{1,5,1,7,7,2,8})));;
    }
}
