package sergii_hw;

import homework.Utils;

public class S_HW5_2 extends Utils {
    /**********************************************************************************************************
     * Вывести следующие строки с соответствующим форматированием (как пирамиды):


     Задача №1

     0  1  2  3  4  5  6  7  8  9
     0  1  2  3  4  5  6  7  8
     0  1  2  3  4  5  6  7
     0  1  2  3  4  5  6
     0  1  2  3  4  5
     0  1  2  3  4
     0  1  2  3
     0  1  2
     0  1
     0
     */
    public static void getTriangle_1() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10 - i; j++) {
                System.out.print(j + " ");
            }
            System.out.print("\n");
        }
    }


    /***********************************************************************************************************
     * Задача №2

     0  1  2  3  4  5  6  7  8  9
     ...0  1  2  3  4  5  6  7  8
     ......0  1  2  3  4  5  6  7
     .........0  1  2  3  4  5  6
     ............0  1  2  3  4  5
     ...............0  1  2  3  4
     ..................0  1  2  3
     .....................0  1  2
     ........................0  1
     ...........................0
     */
    public static void getTriangle_2() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10 - i; j++) {
                System.out.print(j + " ");
            }
            System.out.print("\n" + " ".repeat((i + 1) * 2));
        }
    }


    /*********************************************************************************************************
     * Задача №3

     9 8 7 6 5 4 3 2 1 0 1 2 3 4 5 6 7 8 9
     8 7 6 5 4 3 2 1 0 1 2 3 4 5 6 7 8
     7 6 5 4 3 2 1 0 1 2 3 4 5 6 7
     6 5 4 3 2 1 0 1 2 3 4 5 6
     5 4 3 2 1 0 1 2 3 4 5
     4 3 2 1 0 1 2 3 4
     3 2 1 0 1 2 3
     2 1 0 1 2
     1 0 1
     0*/
    public static void getTriangle_3() {
        for (int i = 0; i < 10; i++) {
            for (int j = 9 - i; j > 0; j--) {
                System.out.print(j + " ");
            }
            for (int k = 0; k < 10 - i; k++) {
                System.out.print(k + " ");
            }
            System.out.print("\n");
        }
    }

    /*********************************************************************************************************
     * Задача №4

     9 8 7 6 5 4 3 2 1 0 1 2 3 4 5 6 7 8 9
     ..8 7 6 5 4 3 2 1 0 1 2 3 4 5 6 7 8
     ....7 6 5 4 3 2 1 0 1 2 3 4 5 6 7
     ......6 5 4 3 2 1 0 1 2 3 4 5 6
     ........5 4 3 2 1 0 1 2 3 4 5
     ..........4 3 2 1 0 1 2 3 4
     ............3 2 1 0 1 2 3
     ..............2 1 0 1 2
     ................1 0 1
     ..................0*/
    public static void getTriangle_4() {
        for (int i = 0; i < 10; i++) {
            for (int j = 9 - i; j > 0; j--) {
                System.out.print(j + " ");
            }
            for (int j = 0; j < 10 - i; j++) {
                System.out.print(j + " ");
            }
            System.out.print("\n" + " ".repeat((i + 1) * 2));
        }
    }

    /*********************************************************************************************************
     * Задача №5

     0
     0 1
     0 1 2
     0 1 2 3
     0 1 2 3 4
     0 1 2 3 4 5
     0 1 2 3 4 5 6
     0 1 2 3 4 5 6 7
     0 1 2 3 4 5 6 7 8
     0 1 2 3 4 5 6 7 8 9
     */
    public static void getTriangle_5() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.print("\n");
        }
    }

    /*********************************************************************************************************
     * Задача №6

     ..................0
     ................1 0
     ..............2 1 0
     ............3 2 1 0
     ..........4 3 2 1 0
     ........5 4 3 2 1 0
     ......6 5 4 3 2 1 0
     ....7 6 5 4 3 2 1 0
     ..8 7 6 5 4 3 2 1 0
     9 8 7 6 5 4 3 2 1 0
     */
    public static void getTriangle_6() {
        for (int i = 0; i < 10; i++) {
            System.out.print(" ".repeat(20 - i * 2));

            for (int j = 0; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.print("\n");
        }
    }

    /*********************************************************************************************************
     * Задача №7

     ..................0
     ................1 0 1
     ..............2 1 0 1 2
     ............3 2 1 0 1 2 3
     ..........4 3 2 1 0 1 2 3 4
     ........5 4 3 2 1 0 1 2 3 4 5
     ......6 5 4 3 2 1 0 1 2 3 4 5 6
     ....7 6 5 4 3 2 1 0 1 2 3 4 5 6 7
     ..8 7 6 5 4 3 2 1 0 1 2 3 4 5 6 7 8
     9 8 7 6 5 4 3 2 1 0 1 2 3 4 5 6 7 8 9
     */
    public static void getTriangle_7() {
        for (int i = 0; i < 10; i++) {
            System.out.print(" ".repeat(20 - (i * 2)));

            for (int j = i; j >= 0; j--) {
                System.out.print(j + " ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.print("\n");
        }
    }


    /**************************************************************************************************
     * * Задача №8

     * ................. 0
     ..................1 0 1
     ................2 1 0 1 2
     ..............3 2 1 0 1 2 3
     ............4 3 2 1 0 1 2 3 4
     ..........5 4 3 2 1 0 1 2 3 4 5
     ........6 5 4 3 2 1 0 1 2 3 4 5 6
     ......7 6 5 4 3 2 1 0 1 2 3 4 5 6 7
     ....8 7 6 5 4 3 2 1 0 1 2 3 4 5 6 7 8
     ..9 8 7 6 5 4 3 2 1 0 1 2 3 4 5 6 7 8 9
     ....8 7 6 5 4 3 2 1 0 1 2 3 4 5 6 7 8
     ......7 6 5 4 3 2 1 0 1 2 3 4 5 6 7
     ........6 5 4 3 2 1 0 1 2 3 4 5 6
     ..........5 4 3 2 1 0 1 2 3 4 5
     ............4 3 2 1 0 1 2 3 4
     ..............3 2 1 0 1 2 3
     ................2 1 0 1 2
     ..................1 0 1
     ....................0
*/
     public static void getTriangle_8() {
        int count = 2;
        int step1 = 8;
        int step2 = 9;

        for (int i = 0; i < 20; i++) {
            if (i < 10) {
                System.out.print(" ".repeat(18 - (i * 2)));

                for (int j = i; j >= 0; j--) {
                    System.out.print(j + " ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                }

                System.out.print("\n");

            } else {
                System.out.print(" ".repeat(count));

                for (int j = step1; j > 0; j--) {
                    System.out.print(j + " ");
                }
                for (int k = 0; k < step2; k++) {
                    System.out.print(k + " ");
                }

                count += 2;
                step1--;
                step2--;
                System.out.print("\n");
            }
        }
        System.out.print("\n");
    }

    /**************************************************************************************************
     * * Задача №9
     ..................0
     ................0 1 0
     ..............0 1 2 1 0
     ............0 1 2 3 2 1 0
     ..........0 1 2 3 4 3 2 1 0
     ........0 1 2 3 4 5 4 3 2 1 0
     ......0 1 2 3 4 5 6 5 4 3 2 1 0
     ....0 1 2 3 4 5 6 7 6 5 4 3 2 1 0
     ..0 1 2 3 4 5 6 7 8 7 6 5 4 3 2 1 0
     0 1 2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 1 0
     ..0 1 2 3 4 5 6 7 8 7 6 5 4 3 2 1 0
     ....0 1 2 3 4 5 6 7 6 5 4 3 2 1 0
     ......0 1 2 3 4 5 6 5 4 3 2 1 0
     ........0 1 2 3 4 5 4 3 2 1 0
     ..........0 1 2 3 4 3 2 1 0
     ............0 1 2 3 2 1 0
     ..............0 1 2 1 0
     ................0 1 0
     ..................0
     */
    public static void getTriangle_9() {
        int count = 2;
        int step = 8;

        for (int i = 0; i < 20; i++) {
            if (i < 10) {
                System.out.print(" ".repeat(18 - (i * 2)));

                for (int j = 0; j <= i; j++) {
                    System.out.print(j + " ");
                }
                for (int j = i-1; j >= 0; j--) {
                    System.out.print(j + " ");
                }

                System.out.print("\n");

            } else {
                System.out.print(" ".repeat(count));

                for (int j = 0; j < step; j++) {
                    System.out.print(j + " ");
                }
                for (int k = step; k >= 0; k--) {
                    System.out.print(k + " ");
                }

                count += 2;
                step--;
                System.out.print("\n");
            }
        }
        System.out.print("\n");
    }


    public static void main(String[] args) {
        printTaskNUmber(1);
        getTriangle_1();

        printTaskNUmber(2);
        getTriangle_2();
        printNewRow();

        printTaskNUmber(3);
        getTriangle_3();
        printNewRow();

        printTaskNUmber(4);
        getTriangle_4();
        printNewRow();

        printTaskNUmber(5);
        getTriangle_5();
        printNewRow();

        printTaskNUmber(6);
        getTriangle_6();
        printNewRow();

        printTaskNUmber(7);
        getTriangle_7();
        printNewRow();

        printTaskNUmber(8);
        getTriangle_8();
        printNewRow();

        printTaskNUmber(9);
        getTriangle_9();
        printNewRow();
    }
}
