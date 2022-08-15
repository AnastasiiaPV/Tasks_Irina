package sergii_hw;

import homework.Utils;

public class HW3_2 extends Utils {
    /***********************************************************************************************************
     Задача №2
     Необходимо вывести все положительные степени числа 5 которые меньше 10000, вывести результат возведения в степень.*/
    public static void getAllPositivePow(int n, int range) {
        double num = 0;
        for (int i = 1; num < range; i++) {
            num = Math.pow(n, i);
            if (num > range) {
                break;
            }
            System.out.print(num + ", ");
        }
    }

    /*****************************************************************************************************************
     * Задача №3
     Необходимо вывести все числа кратные 4 между числами 40 и 60 включительно.
     Реализовать 2 варианта:
     - a) использовать конструкцию if для определения кратности (цикл с шагом 1, i = i + 1);*/

    public static void getAllNumDivideOnFour(int a, int b) {
        for (int i = a; i <= b; i++) {
            if (i % 4 == 0) {
                System.out.print(i + ", ");
            }
        }
    }

    /**
     * b) без использования конструкции if (шаг цикла на ваше усмотрение).
     */
    public static void getAllNumDivideOnFour_2(int a, int b) {
        for (int i = a; i <= b; i += 4) {
            System.out.print(i + ", ");
        }
    }

    public static void main(String[] args) {
        printTaskNUmber(2);
        getAllPositivePow(5, 10000);
        printNewRow();

        printSubparagraphNumber(3, "1");
        getAllNumDivideOnFour(40, 60);
        printNewRow();
        printSubparagraphNumber(3, "2");
        getAllNumDivideOnFour(40, 60);
        printNewRow();


    }
}
