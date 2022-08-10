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


    public static int[] getCatsAgesInt() {
        return new int[]{5, 3, 15, 0, 10, 6, 5, 4};
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
        System.out.println(new StringBuilder().append("Name: ").append(getCatsNames_2()[getCatsNames_2().length - 1])
                .append("\nColor: ").append(getCatsColors()[getCatsColors().length - 1])
                .append("\nAge: ").append(getCatsAges()[getCatsAges().length - 1]));
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


    /**************************************************************************************************************
     * 12. Распечатать средний возраст котов из массива catsAges*/
    public static void printAvgAge() {
        double avg = 0;
        for (int i = 0; i < getCatsAges().length; i++) {
            avg += getCatsAges()[i];
        }
        System.out.println(avg/getCatsAges().length-1);
    }


    /**************************************************************************************************************
     * 13. Распечатать возраст самого молодого кота*/
    public static void printYoungestCat() {
        double min = Double.MAX_VALUE;
        for (int i = 0; i < getCatsAges().length; i++) {
            if (getCatsAges()[i] < min){
                min = getCatsAges()[i];
            }
        }
        System.out.println(min);
    }

    /**************************************************************************************************************
     * 14. Распечатать возраст самого старого кота*/
    public static void printOldestCat() {
        double max = Double.MIN_VALUE;
        for (int i = 0; i < getCatsAges().length; i++) {
            if (getCatsAges()[i] > max){
                max = getCatsAges()[i];
            }
        }
        System.out.println(max);
    }

    /**************************************************************************************************************
     * 15. Распечатать количество серых котов*/
    public static void printNumGrayCats() {
        int count = 0;
        for (int i = 0; i < getCatsColors().length; i++) {
            if (getCatsColors()[i].equals("Gray")){
                count++;
            }
        }
        System.out.println(count);
    }


    /**************************************************************************************************************
     * 16. Распечатать имя кота, если кот находится в коробке с четным индексом и его возраст не больше 3 лет*/
    //[0,      1,      2,           3,            4,      5,     6,      7]
    //[Ruddy,  Черныш, Light Ruddy, Middle Ruddy, Рыжик,  Grey,  Yellow, Dark Gray]
    //[1.2,    3.0,    15.1,        0.9,          10.0,   6.6,   5.0,    3.2]
    public static void printCat_16() {
        for (int i = 0; i < getCatsNames_2().length; i++) {
            if (i % 2 == 0 && getCatsAges()[i] <= 3) {
                System.out.println(getCatsNames_2()[i]);
            }
        }
    }


    /**************************************************************************************************************
     * 17. Создать массив четных положительных чисел, значения которых не больше 10.
     (заполняем значения с помощью цикла for)*/
    public static int[] getPositiveNum() {
        int[] result = {0};
        for (int i = 1; i < 11; i++) {
            if(i % 2 == 0) {
                result = Arrays.copyOf(result, result.length+1);
                result[result.length-1] = i;
            }
        }
        System.out.println(Arrays.toString(result));
        return result;
    }


    /**************************************************************************************************************
     * 18. Написать метод, который принимает на вход массив int, и возвращает среднее значение.
     Проверить работу метода тестом, если параметр - массив catsAges*/
    public static double getAverage(int[] arr) {
        double avg = 0;
        for (int j : arr) {
            avg += j;
        }
        return avg/arr.length;
    }

    /**************************************************************************************************************
     * 19. Создать массив нечетных отрицательных чисел в промежутке от -1000 до -900*/
    public static int[] getNegativeNum() {
        int[] result = {};
        for (int i = -1000; i < -900; i++) {
            if(i % 2 != 0) {
                result = Arrays.copyOf(result, result.length+1);
                result[result.length-1] = i;
            }
        }
        System.out.println(Arrays.toString(result));
        return result;
    }


    /**************************************************************************************************************
     * 20. Создать массив из 10 случайных положительных целых чисел*/
    public static int[] getRandomNumArr() {
        int[] arr = {};
        int i = 0;
        while(i < 10) {
            int num = Math.abs((int)Math.round(Math.random() * 10));
            arr = Arrays.copyOf(arr, arr.length + 1);
            arr[arr.length-1] = num;
            i++;
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }


    /**************************************************************************************************************
     * 21. Создать метод, который принимает на вход массив int,  и возвращает минимальное значение,
     максимальное значение и среднее значение всех чисел массива. Проверить работу метода на массиве из задания 20.*/
    public static void getMinMaxAvg(int[] arr) {
        double avg = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min){
                min = arr[i];
            }
            if (arr[i] > max){
                max = arr[i];
            }
            avg += arr[i];
        }
        System.out.println("Average: " + avg/arr.length + ";\nMin: " + min + ";\nMax: " + max + ";");
    }

    /**************************************************************************************************************
     * 22. Создать массив четных чисел и массив нечетных чисел из элементов массива из задания 20.*/
    public static void getEvenOddNum(int[] arr) {
        int[] odd = {};
        int[] even = {};

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 != 0) {
                odd = Arrays.copyOf(odd, odd.length + 1);
                odd[odd.length - 1] = arr[i];
            } else {
                even = Arrays.copyOf(even, even.length + 1);
                even[even.length - 1] = arr[i];
            }
        }
        System.out.println(Arrays.toString(even) + "\n" + Arrays.toString(odd));
    }

    public static void getEvenOddNum_2(int[] arr) {
        int[] odd = {};
        int[] even = {};

        for (int j : arr) {
            if (j % 2 != 0) {
                odd = Arrays.copyOf(odd, odd.length + 1);
                odd[odd.length - 1] = j;
            } else {
                even = Arrays.copyOf(even, even.length + 1);
                even[even.length - 1] = j;
            }
        }
        System.out.println(Arrays.toString(even) + "\n" + Arrays.toString(odd));
    }


    public static void main(String[] args) {
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

        printTaskNUmber(12);
        printAvgAge();

        printTaskNUmber(13);
        printYoungestCat();

        printTaskNUmber(14);
        printOldestCat();

        printTaskNUmber(15);
        printNumGrayCats();

        printTaskNUmber(16);
        printCat_16();

        printTaskNUmber(17);
        getPositiveNum();

        printTaskNUmber(18);
        System.out.println(getAverage(getCatsAgesInt()));
        verifyEquals(getAverage(getCatsAgesInt()), 6);

        printTaskNUmber(19);
        getNegativeNum();
        printNewRow();

        printTaskNUmber(20);
        getRandomNumArr();
        printNewRow();

        printTaskNUmber(21);
        getMinMaxAvg(getRandomNumArr());
        printNewRow();

        printTaskNUmber(22);
        getEvenOddNum(getRandomNumArr());
        printNewRow();

    }


    /**************************************************************************************************************
     * 23. Создать двумерный массив, который состоит из имен, возрастов, цветов котов:
     Распечатать все данные котов в коробках с четными индексами, используя двумерный массив.*/
    /**************************************************************************************************************
     * 24. Создать двумерный массив целых случайных чисел от 1 до 10 размерности 4*8.*/
    /**************************************************************************************************************
     * 25. Вывести сумму всех четных чисел массива из задания 24.*/

}
