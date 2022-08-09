package homework;

public class HW6 extends Utils {

    /******************************************************************************************************
     * 1. Распечатать последовательность чисел от 0 до 9 включительно.*/
    public static void printNumberSequenceAsc() {
        for (int i = 0; i < 10; i++) {
            System.out.print(i + "\t");
        }
        printNewRow();
    }

    /********************************************************************************************************
     * 2. Распечатать последовательность чисел от 10 исключительно до 0 включительно.*/
    public static void printNumberSequenceDesc() {
        for (int i = 9; i >= 0; i--) {
            System.out.print(i + "\t");
        }
        printNewRow();
    }


    /********************************************************************************************************
     * 3. Распечатать последовательность чисел от 50 до 55 включительно с шагом 2.*/
    public static void printNumberSequence50_55() {
        for (int i = 50; i <= 55; i += 2) {
            System.out.print(i + "\t");
        }
        printNewRow();
    }


    /********************************************************************************************************
     * 4. Распечатать последовательность чисел, кратных 7, в промежутке (327, 300)*/
    public static void printNumSequence327_300() {
        for (int i = 326; i > 300; i--) {
            if (i % 7 == 0) {
                System.out.print(i + "\t");
            }
        }
        printNewRow();
    }


    /********************************************************************************************************
     * 5. Распечатать последовательность чисел в промежутке [12, 13] с шагом 0.1*/
    public static void printNumSequence_12_13(int[] arr) {
        for (double i = arr[0] + 0.1; i < arr[1]; i += 0.1) {
            System.out.print(i + "\t");
        }
        printNewRow();
    }


    /********************************************************************************************************
     * 6. Распечатать последовательность четных чисел от 215 до 237 включительно*/
    public static void printPosNumSequence_215_237() {
        for (int i = 215; i < 238; i++) {
            if (i % 2 == 0) {
                System.out.print(i + "\t");
            }
        }
        printNewRow();
    }


    /********************************************************************************************************
     * 7. Распечатать последовательность чисел, кратных 7, в промежутке от 7 исключительно до 14 исключительно.*/
    public static void printNumSequence_7_14() {
        for (int i = 8; i < 14; i++) {
            if (i % 7 == 0) {
                System.out.print(i + "\t");
            } else {
                System.out.println("Task incorrect condition");
                break;
            }
        }
        printNewRow();
    }


    /********************************************************************************************************
     * 8. Распечатать последовательность которая начинается с минимального значения типа данных short и
     * заканчивается максимальным значением short. Числа в последовательности должны быть кратны 15001.
     */
    public static void printShortNumSequence() {
        for (int i = Short.MIN_VALUE; i < Short.MAX_VALUE; i++) {
            if (i % 15001 == 0) {
                System.out.print(i + "\t");
            }
        }
        printNewRow();
    }


    /********************************************************************************************************
     * 9. Распечатать последовательность чисел в промежутке от -10 до 34 включительно. Числа, кратные 11,
     * должны быть распечатаны синим цветом. Числа, кратные 12, должны быть распечатаны красным цветом.
     *     А ноль необходимо распечатать словом ZERO.
     */
    public static void printNumSequence_mine10_34() {
        for (int i = -10; i <= 34; i++) {
            if (i == 0) {
                System.out.print("ZERO" + "\t");
            } else if (i % 11 == 0) {
                System.out.print(ANSI_BLUE + i + "\t");
            } else if (i % 12 == 0) {
                System.out.print(ANSI_RED + i + "\t");
            }
        }
        printNewRow();
    }

    /********************************************************************************************************
     * 10. Написать метод, который принимает на вход параметры start,  end, step,
     * и печатает последовательность десятичных  чисел, начиная с числа start, с шагом step.
     *     Точка выхода из цикла - число end.
     */
    public static void printTenthsNumSequence(double start, double end, double step) {
        if (start < end && step > 0) {
            for (start = start; start < end; start += step) {
                System.out.print(start + "\t");
            }
        } else if (start > end && step < 0) {
            for (start = start; start > end; start += step) {
                System.out.print(start + "\t");
            }
        } else {
            System.out.println("Invalide data");
        }
        printNewRow();
    }


    /********************************************************************************************************
     * 11. Написать метод, который принимает параметр  l и печатает  последовательность четных чисел от нуля.
     * Длина последовательности = L.
     */
    public static void printPositiveNumSequence_0_L(int l) {
        for (int i = 0; i <= l; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }


    /********************************************************************************************************
     * 12. Напишите метод, который принимает целое число n, и выводит все степени числа 2 от 1 до n включительно*/
    public static void printNumPowSequence(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(String.format("%2.0f", Math.pow(2, i)) + " ");
        }
    }


    /********************************************************************************************************
     * 13. Вывести последовательность 012345678900112233445566778899000…  до числа 9999 включительно.*/
    public static void printNumSequence13_1() {
        for (int i = 1; i <= 4; i++) {
            int count = i;
            for (int j = 0; j <= 9; j++) {
                while (count > 0) {
                    System.out.print(j);
                    count--;
                }
                count = i;
            }
        }
    }

    public static void printNumSequence13_2() {
        for (int i = 1; i <= 4; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 1; k <= i; k++) {
                    System.out.print(j);
                }
            }
        }
    }

    public static void printNumSequence13_3(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.print("0".repeat(i)
                    + "1".repeat(i)
                    + "2".repeat(i)
                    + "3".repeat(i)
                    + "4".repeat(i)
                    + "5".repeat(i)
                    + "6".repeat(i)
                    + "7".repeat(i)
                    + "8".repeat(i)
                    + "9".repeat(i));
        }
    }


    /********************************************************************************************************
     * 14.  Распечатайте последовательность чисел:
     0, 1, -1, 2, -2, 3, -3, 4, -4, 5, -5*/
    public static void printNumSequence_14() {
        int count = 1;
        while (count <= 5) {
            for (int i = 0; i < 5; i++) {
                for (int j = i; j <= count; j++) {
                    if (j == i) {
                        System.out.print((j * -1) + ", ");
                    } else {
                        System.out.print(j + ", ");
                    }
                }
                count++;
            }
        }
        System.out.print(-5);
    }

    public static void printNumSequence_14_2() {
        for (int i = 0, j = 1; i > -6 || j <= 5; i--, j++) {
            if (j < 6) {
                System.out.print(i + ", " + j + ", ");
            } else {
                System.out.print(i);
            }
        }
    }

    public static void printNumSequence_14_3() {
        System.out.print(0);
        for (int i = 1; i < 6; i++) {
            System.out.print(", " + i + ", " + (i * -1));
        }
    }

    public static void printNumSequence_14_4() {
        for (int i = 0; i < 6; i++) {
            System.out.print(i + ", ");
            if (i >= 1) {
                System.out.print(i * (-1) + ", ");
            }
        }
    }


    /********************************************************************************************************
     * 15. Распечатать последовательность чисел:
     0, 3, 5, 6, 9, 10, 12, 15, 18, 20, 21, 24, 25*/
    public static void printNumSequence15(int a) {
        for (int i = 0; i <= a; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.print(i + ", ");
            }
        }
    }

    /********************************************************************************************************
     * 16. Написать метод, который принимает параметры n, m, l, и печатает последовательность нечетных чисел
     * начиная с числа n, с шагом m,  длина последовательности  l.
     */
    public static void printNumSequence16(int n, int m, int l) {
        int j = 0;
        for (int i = n; j < l; i += m) {
            if (i % 2 != 0) {
                System.out.print(i + ", ");
                j++;
            }
        }
    }

    public static void printNumSequence16_2(int n, int m, int l) {
        for (int i = n; i <= l; i += m) {
            if (i % 2 != 0) {
                System.out.print(i + ", ");
            }
        }
    }

    /********************************************************************************************************
     * 17.  Сгенерируйте и распечатайте последовательность по формуле:
     n + 1 = n + 2*/
    public static void printNumSequence17(int n, int l) {
        for (int i = n; i < l; i++) {
            System.out.print(n + " ");
            n += 2;
        }
    }

    public static void printNumSequence17_2(int n) {
        int l = n + 5;
        for (; n < l; n++) {
            System.out.println("[" + (n +1) + "] = " + (n +2) + " ");
        }
    }


    /********************************************************************************************************
     * 18. Написать метод, который принимает параметры l, n, и печатает последовательность чисел, начиная с числа n,
     * по формуле для n + 1 члена последовательности:
     *      n + 1 = 2n
     *      Длина последовательности  l.
     */
    public static void printNumSequence18(int n, int l) {
        for (int i = n+1; i < l; i++) {
            System.out.print(n + " ");
            n *= 2;
        }
    }

    public static void printNumSequence18_2(int n, int l) {
        System.out.println("[" + (n) + "] = " + (n) + " ");

        for (n = n; n < l; n++) {
            System.out.println("[" + (n + 1) + "] = " + (n * 2) + " ");
        }
    }

    /********************************************************************************************************
     * 19.  Сгенерируйте последовательность целых положительных  двузначных чисел,
     * в которых разница между первой цифрой (десятки) и второй цифрой (единицы) не превышает 3.
     */
    public static void printNumSequence19() {
        for (int i = 10; i < 100; i++) {
            int firstDigit = i / 10;
            int secondDigit = i % 10;
            if (i % 2 == 0) {
                if (Math.abs(firstDigit - secondDigit) <= 3) {
                    System.out.print(i + ", ");
                }
            }
        }
    }

    /********************************************************************************************************
     * 20.  Написать метод, который вычислит значение функции: */
    public static void printNumSequence20(int l, int x) {
        double y;
        double sum = 0;
        for (int i = x; i < l; i++) {
            if (x > 1.5) {
                y = 2.5 * Math.pow(x, 3) + 6 * Math.pow(x, 2) - 30;
            } else if (0 <= x && x <= 1.5) {
                y = x + 1;
            } else {
                y = x;
            }
            sum += y;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {

        printTaskNUmber(1);
        printNumberSequenceAsc();

        printTaskNUmber(2);
        printNumberSequenceDesc();

        printTaskNUmber(3);
        printNumberSequence50_55();

        printTaskNUmber(4);
        printNumSequence327_300();

        printTaskNUmber(5);
        printNumSequence_12_13(new int[]{12, 13});

        printTaskNUmber(6);
        printPosNumSequence_215_237();

        printTaskNUmber(7);
        printNumSequence_7_14();

        printTaskNUmber(8);
        printShortNumSequence();

        printTaskNUmber(9);
        printNumSequence_mine10_34();

        printTaskNUmber(10);
        printTenthsNumSequence(-15.1, 30.9, 5.5);

        printTaskNUmber(10);
        printTenthsNumSequence(15.9, 0, -1.45);

        printTaskNUmber(10);
        printTenthsNumSequence(15.9, 0, 1);

        printTaskNUmber(10);
        printTenthsNumSequence(-15.9, 0, -1);

        printTaskNUmber(11);
        printPositiveNumSequence_0_L(25);
        printNewRow();

        printTaskNUmber(12);
        printNumPowSequence(10);
        printNewRow();

        printTaskNUmber(13);
        printNumSequence13_1();
        printNewRow();

        printTaskNUmber(13);
        printNumSequence13_2();
        printNewRow();

        printTaskNUmber(13);
        printNumSequence13_3(5);
        printNewRow();

        printTaskNUmber(14);
        printNumSequence_14();
        printNewRow();

        printSubparagraphNumber(14, "2");
        printNumSequence_14_2();
        printNewRow();

        printSubparagraphNumber(14, "3");
        printNumSequence_14_3();
        printNewRow();

        printSubparagraphNumber(14, "4");
        printNumSequence_14_4();
        printNewRow();


        printTaskNUmber(15);
        printNumSequence15(25);
        printNewRow();

        printTaskNUmber(16);
        printNumSequence16(5, 3, 20);
        printNewRow();

        printSubparagraphNumber(16,"2");
        printNumSequence16_2(5, 3, 20);
        printNewRow();

        printTaskNUmber(17);
        printNumSequence17(5, 20);
        printNewRow();

        printSubparagraphNumber(17, "2");
        printNumSequence17_2(5);
        printNewRow();

        printTaskNUmber(18);
        printNumSequence18(1, 10);
        printNewRow();

        printSubparagraphNumber(18, "2");
        printNumSequence18_2(1, 10);
        printNewRow();


        printTaskNUmber(19);
        printNumSequence19();
        printNewRow();

        printTaskNUmber(20);
        printNumSequence20(5, -2);


    }
}

