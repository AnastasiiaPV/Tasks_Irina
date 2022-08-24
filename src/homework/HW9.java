package homework;

import java.util.Arrays;

public class HW9 extends Utils {

    /******************************************************************************************************************
     *  1.  Создать алгоритм OddEven, который принимает на вход целое число, возвращает “Odd”,
     *  если число нечетное, и “Even”, если число четное. Во всех остальных случаях результат будет “Undefined”.
     *
     *      Test Data:
     *      -345 →  “Odd”
     *      0 →  “Even”
     *      222222 →  “Even”
     *      2147483647 + 1 →  “Undefined”*/
    public static String getOddEven(int n) {
        if (n % 2 == 0 || n == 0) {
            return "Even";
        } else if (n % 2 != 0) {
            return "Odd";
        } else {
            return "Undefined";
        }
    }


    /******************************************************************************************************************
     2. Написать алгоритм OddIndices, который принимает массив чисел,  и возвращает массив значений нечетных индексов
     Test Data:
     Input = {-45, 590, 234, 985, 12, 68}
     Expected Result =  {590, 985, 68}
     */
    public static int[] getOddIndices(int[] n) {
        int[] newArray = {};
        for (int i = 0; i < n.length; i++) {
            if (i % 2 != 0) {
                newArray = Arrays.copyOf(newArray, newArray.length + 1);
                newArray[newArray.length - 1] = n[i];
            }
        }
        return newArray;
    }

    /******************************************************************************************************************
     3. Написать алгоритм SumArray, который возвращает сумму всех чисел массива
     Test Data:
     {0, 1, 2, 3, 4, 5} → 15
     {-7, -3} → -10
     */
    public static int getSumArray(int[] n) {
        int sum = 0;
        for (int arg : n) {
            sum += arg;
        }
        return sum;
    }

    /******************************************************************************************************************
     4. Напишите алгоритм BiggerValue, который из двух параметров типа int возвращает бОльшее значение.
     Test Data:
     3333, 9999
     Expected Result = 9999
     */
    public static int getBiggerValue(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static int getBiggerValue_2(int a, int b) {
        return Math.max(a, b);
    }

    /******************************************************************************************************************
     5. Напишите алгоритм IsPositiveNumber, который возвращает true, если численный  параметр больше или равен нулю,
     и возвращает false, если параметр меньше 0.
     Проверьте работу метода на числах 555, 0 и -555.*/
    public static boolean isPositiveNumber(int a) {
        return a >= 0;
    }

    /******************************************************************************************************************
     6. Напишите алгоритм AreNumbersEqual, который принимает на вход 2 любых int числа, и возвращает
     0, если числа равны
     -1, если первое число меньше второго
     1, если первое число больше второго

     Test Data:
     89, 89
     Expected result: 0
     -89, 89
     Expected result: -1
     89, -89
     Expected result: 1
     */

    public static int checkAreNumbersEqual(int a, int b) {
        if (a == b) {
            return 0;
        } else if (a < b) {
            return -1;
        } else {
            return 1;
        }
    }

    public static int checkAreNumbersEqual_2(int a, int b) {
        return Integer.compare(a, b);
    }

    /******************************************************************************************************************
     7. Given an integer M perform the following conditional actions:
     If M is multiple of 3 and 5 then return "Good Number".
     If M is only multiple of 3 and not of 5 then return "Bad Number"
     If M is only multiple of 5 and not of 3 then return "Poor Number"
     If M doesn't satisfy any of the above conditions then return "-1"
     */
    public static String checkGoodBadPoorNum(int m) {
        if (m % 3 == 0 && m % 5 == 0) {
            return "Good Number";
        } else if (m % 3 == 0) {
            return "Bad Number";
        } else if (m % 5 == 0) {
            return "Poor Number";
        } else {
            return "-1";
        }
    }

    /******************************************************************************************************************
     ?????????????????????????????????????????????????????????????????????????????
     8. Написать алгоритм MinMaxAve, который принимает массив чисел int[]  и 2 значения индексов.
     Алгоритм возвращает массив, который содержит минимальное значение, максимальное значение,
     и среднее среди всех значений между 2-мя индексами.

     Test Data:
     ({1, 2, 3, 4, 5, 6, 7, 8}, 2, 6) →  {3, 7, 5}
     */

    public static int[] getMinMaxAve(int[] n, int index1, int index2) {
        int min = getMin(n, index1, index2);
        int max = getMax(n, index1, index2);
        int avg = getAvg(n, index1, index2);

        return new int[]{min, max, avg};
    }

    private static int getMin(int[] n, int index1, int index2) {
        int min = Integer.MAX_VALUE;

        for (int i = index1; i <= index2; i++) {
            if (n[i] < min) {
                min = n[i];
            }
        }
        return min;
    }

    private static int getMax(int[] n, int index1, int index2) {
        int max = Integer.MIN_VALUE;

        for (int i = index1; i <= index2; i++) {
            if (n[i] > max) {
                max = n[i];
            }
        }
        return max;
    }

    private static int getAvg(int[] n, int index1, int index2) {
        int avg = 0;

        for (int i = index1; i < index2; i++) {
            for (int j = i + 1; j < index2 - 1; j++) {
                if (n[i] > avg && n[i] < n[j]) {
                    avg = n[i];
                } else if (n[i] > avg && n[i] > n[j]) {
                    avg = n[j];
                }
            }
        }
        return avg;
    }

//                if (n[i] < n[j] && n[i] < n[j + 1]) {
//                    avg = n[i];

    /******************************************************************************************************************
     9. 	Написать алгоритм Intersection, который принимает на вход 2 массива целых чисел и
     возвращает массив общих элементов.
     Test Data:
     {1, 2, 4, 5, 89}, {8, 9, 4, 2} → {2, 4}
     {1, 2, 4, 5, 8, 9}, {8, 9, -4, -2} → {8, 9}
     {1, 2, 4, 5, 89}, {8, 9, 45} → {}
     */
    private static int[] getIntersection(int[] a, int[] b) {
        int[] newArr = {};
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    newArr = Arrays.copyOf(newArr, newArr.length + 1);
                    newArr[newArr.length - 1] = a[i];
                }
            }
        }
        return newArr;
    }

    private static int[] getIntersection_2(int[] a, int[] b) {
        int[] newArr = {};
        for (int k : a) {
            for (int i : b) {
                if (k == i) {
                    newArr = Arrays.copyOf(newArr, newArr.length + 1);
                    newArr[newArr.length - 1] = k;
                }
            }
        }
        return newArr;
    }

    /******************************************************************************************************************

     10.	Написать алгоритм PeakElement,  который принимает на вход массив целых чисел и
     возвращает значения пиковых элементов (элементы, которые больше своих соседей).
     Test Data:
     {3, 2, 7, 5, 1, 9, 23, 1} → {3, 7, 23}
     */
    private static int[] getPeakElement(int[] a) {
        int[] newArr = {};

        if (a[0] > a[1]) {
            newArr = Arrays.copyOf(newArr, newArr.length + 1);
            newArr[newArr.length - 1] = a[0];
        }

        for (int i = 1; i < a.length - 1; i++) {
            if (a[i - 1] < a[i] && a[i] > a[i + 1]) {
                newArr = Arrays.copyOf(newArr, newArr.length + 1);
                newArr[newArr.length - 1] = a[i];
                ;
            }
        }

        if (a[a.length - 1] > a[a.length - 2]) {
            newArr = Arrays.copyOf(newArr, newArr.length + 1);
            newArr[newArr.length - 1] = a[a.length - 2];
        }

        return newArr;
    }


    /******************************************************************************************************************

     11.	 Написать алгоритм ReverseArray, который принимает на вход массив целых чисел,
     и возвращает “перевернутый” массив.
     Test Data:
     {2, 7, 3, 10} → {10, 3, 7, 2}
     */
    private static int[] getReverseArray(int[] a) {
        int[] newArr = new int[a.length];
        int count = 0;

        for (int i = a.length - 1; i >= 0; i--) {
            newArr[count] = a[i];
            count++;
        }

        return newArr;
    }


    /******************************************************************************************************************
     12.	Написать алгоритм SortArray, который принимает на вход массив целых чисел,
     и сортирует элементы массива в порядке возрастания.
     Test Data:
     {4, 3, 7, 12, 5, 2, 9, 4, 12} → {2, 3, 4, 4, 5, 7, 9, 12, 12}
     */
    private static int[] sortArrayDesc(int[] a) {
        int temp;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }

    private static int[] sortArrayAsc(int[] a) {
        int temp;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] < a[j]) {
                    temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
        return a;
    }


    /******************************************************************************************************************
     13. Написать алгоритм KthLargest, который принимает на вход массив целых чисел и число k,
     и возвращает k-тый максимальный элемент.
     Test Data:
     ({4, 3, 7, 12, 5, 2, 9, 4, 12}, 3) → 9*/

    private static int getKthLargest(int[] a, int k) {
        int max = 0;

            for (int i = 0; k > 0; i++) {
                if (a[i] < a[i+1]) {
                    max = a[i + 1];
                    k--;
            }
        }
        return max;
    }
     /**(12 и 12 - первый и второй самые большие элементы)*/
    private static int[] getKthLargest_2(int[] a) {
        int max1 = a[0];
        int max2 = a[0];
        int positionMax1 = 0;

        for (int i = 1; i < a.length; i++) {
            if (a[i] > max1) {
                max1 = a[i];
                positionMax1 = i;
            }
        }
        a[positionMax1] = 0;

        for (int i = 1; i < a.length; i++) {
            if (a[i] > max2) {
                max2 = a[i];
            }
        }

        return new int[]{max1, max2};
    }


     /******************************************************************************************************************
     13. Написать алгоритм NegativeOnTheRight, который принимает на вход массив целых чисел, и возвращает массив,
     в котором все негативные числа находятся во второй половине массива
     Test Data:
     {4, -3, 7, -12, 5, -2, 9, 4, 12} → {4, 7, 5, 9, 4, 12, -3, -12, -2}
      //мій результат                   [4, 7, 5, 9, 4, 12, -2, -12, -3]
     */
     private static int[] getNegativeOnTheRight(int[] arr) {
         int temp;

         for (int i = 0; i < arr.length; i++) {
             for (int j = 0; j < arr.length; j++) {
                 if (arr[j] < 0) {
                     temp = arr[j];
                     arr[j] = arr[i];
                     arr[i] = temp;
                 }
             }
         }
         return arr;
     }


    /******************************************************************************************************************
     14.	Написать алгоритм SumOfTwo, который принимает на вход массив целых чисел,  и число n.
     Алгоритм  возвращает пары элементов, которые в сумме дают число n.
     Test Data:
     ({4, 3, 7, 12, 5, 2, 9, 4, 12}, 12)  → {{3, 9}, {7, 5}}
     */
    private static int[][] getSumOfTwo(int[] arr, int n) {
        int[][] result = {};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int[] pair = new int[2];

                if(arr[i] + arr[j] == n){
                    pair[0] = arr[i];
                    pair[1] = arr[j];
                    result = Arrays.copyOf(result, result.length+1);
                    result[result.length-1] = pair;
                }
            }
        }
        return result;
    }

    /******************************************************************************************************************
     15.	Написать алгоритм NumberOccurrences,  который принимает на вход массив целых чисел,  и возвращает массив пар
     {число, сколько раз число встречается в массиве}
     Test Data:
     {3, 2, 5, 3, 1, 5, 4, 2, 1, 4, 5, 3, 2, 1, 4, 5, 3, 2, 1} →
     {{1, 4}, {2, 4}, {3, 4}, {4, 3}, {5, 4}}
     */

    public static void main(String[] args) {
//           Test Data:
//           -345 →  “Odd”
//           0 →  “Even”
//           222222 →  “Even”
//           2147483647 + 1 →  “Undefined”*/
        printTaskNUmber(1);
        System.out.println(getOddEven(-345));
        System.out.println(getOddEven(0));
        System.out.println(getOddEven(222222));
        System.out.println(getOddEven(2147483647 + 1));


//        Input = {-45, 590, 234, 985, 12, 68}
//        Expected Result =  {590, 985, 68}
        printTaskNUmber(2);
        System.out.println(Arrays.toString(getOddIndices(new int[]{-45, 590, 234, 985, 12, 68})));


//     Test Data:
//     {0, 1, 2, 3, 4, 5} → 15
//     {-7, -3} → -10
        printTaskNUmber(3);
        System.out.println(getSumArray(new int[]{0, 1, 2, 3, 4, 5}));
        System.out.println(getSumArray(new int[]{-7, -3}));

//        Test Data:
//        3333, 9999
//        Expected Result = 9999
        printTaskNUmber(4);
        System.out.println(getBiggerValue(3333, 9999));
        System.out.println(getBiggerValue_2(3333, 9999));

//        555, 0 и -555.
        printTaskNUmber(5);
        System.out.println(isPositiveNumber(555));
        System.out.println(isPositiveNumber(0));
        System.out.println(isPositiveNumber(-555));


//        Test Data:
//        89, 89
//        Expected result: 0
//                -89, 89
//        Expected result: -1
//        89, -89
//        Expected result: 1
        printTaskNUmber(6);
        System.out.println(checkAreNumbersEqual(89, 89));
        System.out.println(checkAreNumbersEqual(-89, 89));
        System.out.println(checkAreNumbersEqual(89, -89));
        System.out.println(checkAreNumbersEqual_2(89, 89));
        System.out.println(checkAreNumbersEqual_2(-89, 89));
        System.out.println(checkAreNumbersEqual_2(89, -89));


//        If M is multiple of 3 and 5 then return "Good Number".
//        If M is only multiple of 3 and not of 5 then return "Bad Number"
//        If M is only multiple of 5 and not of 3 then return "Poor Number"
//        If M doesn't satisfy any of the above conditions then return "-1"
        printTaskNUmber(7);
        System.out.println(checkGoodBadPoorNum(15));
        System.out.println(checkGoodBadPoorNum(9));
        System.out.println(checkGoodBadPoorNum(25));
        System.out.println(checkGoodBadPoorNum(0));
        System.out.println(checkGoodBadPoorNum(22));

//        Test Data:
//        ({1, 2, 3, 4, 5, 6, 7, 8}, 2, 6) →  {3, 7, 5}
//     */
        printTaskNUmber(8);                                           //3, 4, 5, 6, 7, -> min=3, max =7 avg = 5
        System.out.println(Arrays.toString(getMinMaxAve(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 2, 6)));
        System.out.println(Arrays.toString(getMinMaxAve(new int[]{5, 1, 6, 2, 4, 8, 7, 3}, 2, 6)));
        //6, 2, 4, 8, 7,-> min=2, max =8 avg = 6

//        Test Data:
//        {1, 2, 4, 5, 89}, {8, 9, 4, 2} → {2, 4}
//        {1, 2, 4, 5, 8, 9}, {8, 9, -4, -2} → {8, 9}
//        {1, 2, 4, 5, 89}, {8, 9, 45} → {}
        printTaskNUmber(9);
        System.out.println(Arrays.toString(getIntersection(new int[]{1, 2, 4, 5, 89}, new int[]{8, 9, 4, 2})));
        System.out.println(Arrays.toString(getIntersection(new int[]{1, 2, 4, 5, 8, 9}, new int[]{8, 9, -4, -2})));
        System.out.println(Arrays.toString(getIntersection(new int[]{1, 2, 4, 5, 89}, new int[]{8, 9, 45})));


//        Test Data:
//        {3, 2, 7, 5, 1, 9, 23, 1} → {3, 7, 23}
        printTaskNUmber(10);
        System.out.println(Arrays.toString(getPeakElement(new int[]{3, 2, 7, 5, 1, 9, 23, 1})));


//        Test Data:
//        {2, 7, 3, 10} → {10, 3, 7, 2}
        printTaskNUmber(11);
        System.out.println(Arrays.toString(getReverseArray(new int[]{2, 7, 3, 10})));

//        Test Data:
//        {4, 3, 7, 12, 5, 2, 9, 4, 12} → {2, 3, 4, 4, 5, 7, 9, 12, 12}
        printTaskNUmber(12);
        System.out.println(Arrays.toString(sortArrayDesc(new int[]{4, 3, 7, 12, 5, 2, 9, 4, 12})));
        printTaskNUmber(12);
        System.out.println(Arrays.toString(sortArrayAsc(new int[]{4, 3, 7, 12, 5, 2, 9, 4, 12})));



//        Test Data:
//        ({4, 3, 7, 12, 5, 2, 9, 4, 12}, 3) → 9
        printTaskNUmber(13);
        System.out.println(getKthLargest(new int[]{4, 3, 7, 12, 5, 2, 9, 4, 12}, 3));
        System.out.println(getKthLargest(new int[]{2, 3, 5, 0, 1}, 2));
        //        (12 и 12 - первый и второй самые большие элементы)*/
        printSubparagraphNumber(13,"2");
        System.out.println(Arrays.toString(getKthLargest_2(new int[]{4, 3, 7, 12, 5, 2, 9, 4, 12})));
        System.out.println(Arrays.toString(getKthLargest_2(new int[]{4, 3, 7, 12, 5, 2, 9, 4, 13})));



//        Test Data:
//        {4, -3, 7, -12, 5, -2, 9, 4, 12} → {4, 7, 5, 9, 4, 12, -3, -12, -2}
        printTaskNUmber(13);
        System.out.println(Arrays.toString(getNegativeOnTheRight(new int[]{4, -3, 7, -12, 5, -2, 9, 4, 12})));


//        Test Data:
//        ({4, 3, 7, 12, 5, 2, 9, 4, 12}, 12)  → {{3, 9}, {7, 5}}
        printTaskNUmber(14);
        System.out.println(Arrays.deepToString(getSumOfTwo(new int[]{4, 3, 7, 12, 5, 2, 9, 4, 12}, 12)));
    }
}
