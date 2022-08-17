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
    public static void getTriangle_1 () {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10 - i; j++) {
                System.out.print(j+" ");
            }
            System.out.print("\n");
        }
    }


    /***********************************************************************************************************
     * Задача №2

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
    public static void getTriangle_2 () {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10 - i; j++) {
                System.out.print(j + " ");
            }
            System.out.print("\n" + " ".repeat((i+1)*2));
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
    public static void getTriangle_3 () {
        for (int i = 0; i < 10; i++) {
            for (int j = 9-i; j > 0; j--) {
                System.out.print(j+" ");
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
       8 7 6 5 4 3 2 1 0 1 2 3 4 5 6 7 8
         7 6 5 4 3 2 1 0 1 2 3 4 5 6 7
           6 5 4 3 2 1 0 1 2 3 4 5 6
             5 4 3 2 1 0 1 2 3 4 5
               4 3 2 1 0 1 2 3 4
                 3 2 1 0 1 2 3
                   2 1 0 1 2
                     1 0 1
                       0*/
    public static void getTriangle_4 () {
        for (int i = 0; i < 10; i++) {
            for (int j = 9 - i; j > 0; j--) {
                System.out.print(j + " ");
            }
            for (int j = 0; j < 10 - i; j++) {
                System.out.print(j + " ");
            }
            System.out.print("\n" + " ".repeat((i+1) * 2));
        }
    }



        public static void main(String[] args) {
        getTriangle_1();
        getTriangle_2();
        printNewRow();
        getTriangle_3();
        printNewRow();
        getTriangle_4();


        }
}
