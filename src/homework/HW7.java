package homework;

import java.util.Arrays;

public class HW7 extends Utils {
    /**************************************************************************************************************
     *  1. Создать массив catsNames, заполнить его любыми значениями (см картинку котов из презентации).*/
    public static void getCatsNames() {
        String[] catsNames = {"Ruddy", "Black", "Light Ruddy", "Middle Ruddy", "Light Yellow", "Grey", "Yellow",
                "Dark Gray"};
        System.out.println(Arrays.toString(catsNames));
    }


    /**************************************************************************************************************
     * 2. В массиве catsNames изменить значение элемента с индексом 4 на “Рыжик”,
     * а значение элемента с индексом 1 на “Черныш”.
     */
    public static String[] getCatsNames_2() {
        String[] catsNames = {"Ruddy", "Black", "Light Ruddy", "Middle Ruddy", "Light Yellow", "Grey", "Yellow",
                "Dark Gray"};
        catsNames[4] = "Рыжик";
        catsNames[1] = "Черныш";

        return catsNames;
    }


    /**************************************************************************************************************
     * 3. Создать массив catsColors и заполнить его значениями.*/
    public static String[] getCatsColors() {
        return new String[]{"Gray", "Black", "Yellow", "Gray", "Red", "Pockmarked", "Red", "Gray"};
    }


    /**************************************************************************************************************
     * 4. Создать массив catsAges и заполнить его любыми значениями.*/
    public static double[] getCatsAges() {
        return new double[]{1.2, 3, 15.1, 0.9, 10, 6.6, 5, 3.2};
    }


    /**************************************************************************************************************
     * 5. Создать массив isCatRed и заполнить его соответствующими значениями*/
    public static boolean isCatRed(String color) {
        boolean[] isCatRed = {true, false};
        if (color.equals("Red") || color.equals("Рыжик")) {
            System.out.println(isCatRed[0]);
            return true;
        } else {
            System.out.println(isCatRed[1]);
            return false;
        }
    }

    /**************************************************************************************************************
     * 6. Распечатать для массивов catsNames и catsColors:
     a. имя кота в коробке с номером 6
     b. имена котов из коробок с четными индексами
     c. имена котов из коробок, чьи индексы кратны 4
     d. цвет котов из коробок с нечетными индексами
     e. цвет котов из коробок, чьи индексы кратны 3*/
    public static void printName() {
        System.out.print("a. имя кота в коробке с номером 6 = \n" + getCatsNames_2()[6]);

        StringBuilder b = new StringBuilder("b. имена котов из коробок с четными индексами = \n");
        printNewRow();
        StringBuilder c = new StringBuilder("c. имена котов из коробок, чьи индексы кратны 4 = \n");
        printNewRow();
        StringBuilder d = new StringBuilder("d. цвет котов из коробок с нечетными индексами = \n");
        printNewRow();
        StringBuilder e = new StringBuilder("e. цвет котов из коробок, чьи индексы кратны 3 = \n");
        printNewRow();

        //""Ruddy", "Black", "Light Ruddy", "Middle Ruddy", "Рыжик", "Grey", "Yellow", "Dark Gray""
        for (int i = 0; i < getCatsNames_2().length; i++) {
            if (i % 2 == 0) {
                b.append(getCatsNames_2()[i]).append("\n");
            }
            if (i % 4 == 0) {
                c.append(getCatsNames_2()[i]).append("\n");
            }
        }
        //"Gray", "Black", "Yellow", "Gray", "Red", "Pockmarked", "Red", "Gray"
        for (int i = 0; i < getCatsColors().length; i++) {
            if (i % 2 != 0) {
                d.append(getCatsColors()[i]).append("\n");
            }
            if (i % 3 == 0) {
                e.append(getCatsColors()[i]).append("\n");
            }
        }
        System.out.println(b + "\n" + c + "\n" + d + "\n" + e);
    }

    /**************************************************************************************************************
     * 7. Распечатать “Накорми кота!” для всех серых котов*/
    //"Gray", "Black", "Yellow", "Gray", "Red", "Pockmarked", "Red", "Gray"
    public static void feedGrayCats() {
        StringBuilder result = new StringBuilder();
        String feedTheCat = "Накорми кота!";

        for (int i = 0; i < getCatsColors().length; i++) {
            if (getCatsColors()[i].equals("Gray")) {
                result.append(i).append(getCatsColors()[i]).append(" ").append(feedTheCat).append("\n");
            }
        }
        System.out.println(result);
    }

    /**************************************************************************************************************
     * 8. Распечатать “Отнеси кота на прививку!”, если возраст кота меньше 2 лет*/
    //[1.2, 3.0, 15.1, 0.9, 10.0, 6.6, 5.0, 3.2]
        public static void doTheShot() {
            StringBuilder result = new StringBuilder();

            for (int i = 0; i < getCatsAges().length; i++) {
                if (getCatsAges()[i] < 2) {
                    result.append(getCatsAges()[i]).append(" - Отнеси кота на прививку!").append("\n");
                }
            }
            System.out.println(result);
        }


    /**************************************************************************************************************
     * 9. Для кота в последней коробке распечатать имя, цвет, возраст*/
    //[Ruddy, Черныш, Light Ruddy, Middle Ruddy, Рыжик, Grey, Yellow, Dark Gray]
    //[Gray, Black, Yellow, Gray, Red, Pockmarked, Red, Gray]
    //[1.2, 3.0, 15.1, 0.9, 10.0, 6.6, 5.0, 3.2]
    public static void printLastCat() {
        System.out.println(new StringBuilder().append("Name: ").append(getCatsNames_2()[getCatsNames_2().length-1])
                .append("\nColor: ").append(getCatsColors()[getCatsColors().length-1])
                .append("\nAge: ").append(getCatsAges()[getCatsAges().length-1]));
    }


    /**************************************************************************************************************
     * 10. Распечатать имена всех котов, чей возраст больше 2 лет*/
    //[1.2,    3.0,     15.1,          0.9,       10.0, 6.6,   5.0,    3.2]
    //[Ruddy, Черныш, Light Ruddy, Middle Ruddy, Рыжик, Grey, Yellow, Dark Gray]
    public static void printCatsNames_10() {
        StringBuilder result = new StringBuilder("Bозраст больше 2 лет:\n");

        for (int i = 0; i < getCatsAges().length; i++) {
            if (getCatsAges()[i] > 2) {
                result.append(getCatsNames_2()[i]).append("\n");
            }
        }
        System.out.println(result);
    }


    /**************************************************************************************************************
     * 11.  Распечатать “Накорми кота!” если имя кота “Рыжик” и значение isCatRed == true*/
    //[Ruddy, Черныш, Light Ruddy, Middle Ruddy, Рыжик,  Grey,        Yellow, Dark Gray]
    //[Gray,  Black,  Yellow,      Gray,         Red,  Pockmarked, Red,    Gray]
    public static void feedCat_11() {
        StringBuilder result = new StringBuilder();
        String feedTheCat = "Накорми кота!";

        for (int i = 0; i < getCatsNames_2().length; i++) {
            if (getCatsNames_2()[i].equals("Рыжик") && isCatRed(getCatsColors()[i])) {
                result.append(i).append(". ").append(getCatsColors()[i]).append(" ").append(feedTheCat).append("\n");
            }
        }
        System.out.println(result);
    }

            public static void main (String[]args){
            printTaskNUmber(1);
            getCatsNames();
            printNewRow();

            printTaskNUmber(2);
            System.out.println(Arrays.toString(getCatsNames_2()));
            printNewRow();

            printTaskNUmber(3);
            System.out.println(Arrays.toString(getCatsColors()));
            printNewRow();

            printTaskNUmber(4);
            System.out.println(Arrays.toString(getCatsAges()));
            printNewRow();

            printTaskNUmber(5);
            System.out.println(isCatRed("Red"));
            System.out.println(isCatRed("Black"));
            printNewRow();

            printTaskNUmber(6);
            printName();

            printTaskNUmber(7);
            feedGrayCats();

            printTaskNUmber(8);
            doTheShot();

            printTaskNUmber(9);
            printLastCat();

            printTaskNUmber(10);
            printCatsNames_10();

            printTaskNUmber(11);
            feedCat_11();

        }




        /**************************************************************************************************************
         * 12. Распечатать средний возраст котов из массива catsAges*/
        /**************************************************************************************************************
         * 13. Распечатать возраст самого молодого кота*/
        /**************************************************************************************************************
         * 14. Распечатать возраст самого старого кота*/
        /**************************************************************************************************************
         * 15. Распечатать количество серых котов*/
        /**************************************************************************************************************
         * 16. Распечатать имя кота, если кот находится в коробке с четным индексом и его возраст не больше 3 лет*/
        /**************************************************************************************************************
         * 17. Создать массив четных положительных чисел, значения которых не больше 10.
         (заполняем значения с помощью цикла for)*/
        /**************************************************************************************************************
         * 18. Написать метод, который принимает на вход массив int, и возвращает среднее значение.
         Проверить работу метода тестом, если параметр - массив catsAges*/
        /**************************************************************************************************************
         * 19. Создать массив нечетных отрицательных чисел в промежутке от -1000 до -900*/
        /**************************************************************************************************************
         * 20. Создать массив из 10 случайных положительных целых чисел*/


        /**************************************************************************************************************
         * 21. Создать метод, который принимает на вход массив int,  и возвращает минимальное значение,
         максимальное значение и среднее значение всех чисел массива. Проверить работу метода на массиве из задания 20.*/
        /**************************************************************************************************************
         * 22. Создать массив четных чисел и массив нечетных чисел из элементов массива из задания 20.*/
        /**************************************************************************************************************
         * 23. Создать двумерный массив, который состоит из имен, возрастов, цветов котов:
         Распечатать все данные котов в коробках с четными индексами, используя двумерный массив.*/
        /**************************************************************************************************************
         * 24. Создать двумерный массив целых случайных чисел от 1 до 10 размерности 4*8.*/
        /**************************************************************************************************************
         * 25. Вывести сумму всех четных чисел массива из задания 24.*/

    }
