package homework;

public class HW5 {

    public static String expectedResultSt;
    public static int expectedResultInt;


    private static String printLine() {
        String line = Variables.ANSI_PURPLE + "*".repeat(15) + Variables.ANSI_BLACK;
        return line;
    }

    private static void printTaskNUmber(int number) {
        System.out.println(printLine() + "_Task " + Variables.ANSI_BLUE + number + "_" + printLine());
    }

    private static void printNewRow() {
        System.out.println("\n");
    }

    /**
     * 1. ВСЕ!!! результаты должны быть протестированы, для этого необходимо создать метод с названием
     * verifyEquals(expectedResult, actualResult)
     */
    public static void verifyEquals(String expectedResult, String actualResult) {
        if (expectedResult.equals(actualResult)) {
            System.out.println(Variables.ANSI_GREEN + "Pass");
        } else {
            System.out.println(Variables.ANSI_RED + "Fail");
        }
        printNewRow();
    }

    public static void verifyEquals(int expectedResult, int actualResult) {
        if (expectedResult == actualResult) {
            System.out.println(Variables.ANSI_GREEN + "Pass");
        } else {
            System.out.println(Variables.ANSI_RED + "Fail");
        }
        printNewRow();
    }

    public static void verifyEquals(double expectedResult, double actualResult) {
        if (expectedResult == actualResult) {
            System.out.println(Variables.ANSI_GREEN + "Pass");
        } else {
            System.out.println(Variables.ANSI_RED + "Fail");
        }
        printNewRow();
    }

    /********************************************************************************************
     * 2. Написать метод, который принимает на вход число от 1 до 7  и возвращает день недели.
     */
    private static String dayOfTheWeek(int number) {
        if (number < 1 || number > 7) {
            return "Number is out of bound";
        } else if (number == 1) {
            return "Sunday";
        } else if (number == 2) {
            return "Monday";
        } else if (number == 3) {
            return "Tuesday";
        } else if (number == 4) {
            return "Wednesday";
        } else if (number == 5) {
            return "Thursday";
        } else if (number == 6) {
            return "Friday";
        } else {
            return "Saturday";
        }
    }

    /***********************************************************************************
     * 3. Example 2 - Given three values x, y, and z, determine the largest value and
     *     assign this value to the variable largest.
     */
    public static int getMaxNumber(int x, int y, int z) {
        printTaskNUmber(3);
        int largest = Math.max((Math.max(x, y)), z);
        System.out.println("Max number = " + largest);
        return largest;
    }

    /*************************************************************************************
     * 4. Using nested if statements, write a fragment of code that prints  the smallest value contained in
     * thee variables a, b, and c.
     */
    public static int getMinNumber(int a, int b, int c) {
        printTaskNUmber(4);
        int smallest;
//        if (a < b) {
//            smallest = a;
//        } else {
//            smallest = b;
//        }
//        if (c < smallest) {
//            smallest = c;
//        }

        if (a < b) {
            if (a < c) {
                smallest = a;
            } else {
                smallest = c;
            }
        } else {
            if (b < c) {
                smallest = b;
            } else {
                smallest = c;
            }
        }

        System.out.println("Min number = " + smallest);
        return smallest;
    }

    /***********************************************************************************************
     * 5. Написать алгоритм вычисления среднего значения из 5 показателей температуры тела кота.*/
    public static double getAverageT(double a, double b, double c, double d, double e) {
        return (a + b + c + d + e) / 5;
    }

    public static double getAverageT() {
        int sum = 0;

        for (int i = 1; i < 6; i++) {
            sum += i;
        }
        return (double) sum / 5;
    }

    public static double getAverageT(int firstNum, int secondNum) {
        int sum = firstNum;

        for (int i = firstNum; i < secondNum; i++) {
            sum++;
        }
        return (double) sum / (secondNum - firstNum + 1);
    }

    /******************************************************************************************************
     *  6. Написать метод, который принимает на вход десятичное число (например, 10.75), и возвращает строку
     * “10 руб 75 коп”.*/
    public static String getPrice(double num) {
        int firstNum = (int) num;
        int secondNum = (int) Math.ceil((num - firstNum) * 100);

        return firstNum + " грн " + secondNum + " коп";
    }

    /***************************************************************************************************
     * 7. Написать метод, который принимает на вход десятичное число и возвращает строку “10 кг 75 гр”.*/
    public static String getWeight(double num) {
        int firstNum = (int) num;
        int secondNum = (int) Math.ceil((num - firstNum) * 100);

        return firstNum + " кг " + secondNum + " гр";
    }

    /*********************************************************************************************
     * 8. Написать метод, который принимает на вход 2 параметра -  цену и количество товара
     *(может быть вес товара, или количество в штуках). Алгоритм возвращает сумму покупки в виде десятичного числа
     */
    public static double getSum(double price, int quantity) {
        return price * quantity;
    }

    /*******************************************************************************************
     * 9. Написать метод, который принимает на вход необходимые параметры, и печатает чек.
     Например:

     Яблоки
     Цена за 1 кг			50 руб 13 коп
     Количество товара	         3 кг 400 гр
     _______________________________________
     Сумма к оплате		170 руб 44 коп

     или

     Хлеб
     Цена за 1 шт		30 руб 50 коп
     Количество товара	5 шт
     _______________________________________
     Сумма к оплате		152 руб 50 коп
     */

    public static String printCheck(String grocery, double price, double quantity) {
        String quantityS = "";
        String sumS = getPrice(price * quantity);
        String priceS = getPrice(price);

        double checkIfInt = quantity - (int) quantity;

        if (checkIfInt == 0) {
            quantityS = (int) quantity + " шт";
        } else {
            quantityS = getWeight(quantity);
        }

        return grocery + "\nЦіна за 1 кг" + " ".repeat(8) + priceS + "\nКількість товару" + " ".repeat(4) + quantityS +
                "\n" + "_".repeat(35) + "\n" + "Cума до сплати" + " ".repeat(6) + sumS;
    }

    /*****************************************************************************************************************
     * 10 . Написать метод, который принимает на вход количество часов работы в день и стоимость одного часа работы,
     и возвращает заработную плату в месяц.*/


    public static void main(String[] args) {
        printTaskNUmber(2);
        System.out.println(dayOfTheWeek(7));
        verifyEquals(dayOfTheWeek(6), "Saturday");


        verifyEquals(getMaxNumber(5, 11, -6), 11);


        verifyEquals(getMinNumber(5, 11, -6), -6);


        printTaskNUmber(5);
        System.out.println(getAverageT(37.8, 38, 38.5, 39, 39.2));
        verifyEquals(getAverageT(37.8, 38, 38.5, 39, 39.2), 17.2);

        printTaskNUmber(5);
        System.out.println(getAverageT());
        verifyEquals(getAverageT(), 3);

        printTaskNUmber(5);
        System.out.println(getAverageT(5, 10));
        verifyEquals(getAverageT(), 3);


        printTaskNUmber(6);
        System.out.println(getPrice(27.15));
        verifyEquals(getPrice(27.15), "25грн 15коп");


        printTaskNUmber(7);
        System.out.println(getWeight(10.75));
        verifyEquals(getWeight(10.75), "10кг 75гр");


        printTaskNUmber(8);
        System.out.println(getSum(10.75, 10));
        verifyEquals(getSum(10.75, 10), 107.5);


        printTaskNUmber(9);
        System.out.println(printCheck("Apple", 50.13, 3.400));
        verifyEquals(printCheck("Apple", 50.13, 3.400),"Apple\n" +
                "Ціна за 1 кг        50 грн 14 коп\n" +
                "Кількість товару    3 кг 40 гр\n" +
                "___________________________________\n" +
                "Cума до сплати      170 грн 45 коп");


        printTaskNUmber(9);
        System.out.println(printCheck("Bread", 15.3, 5));
        verifyEquals(printCheck("Bread", 15.3, 5),"Bread\n" +
                "Ціна за 1 кг        15 грн 31 коп\n" +
                "Кількість товару    5 шт\n" +
                "___________________________________\n" +
                "Cума до сплати      76 грн 50 коп");

    }





    /** 11. Написать метод, который принимает на вход необходимые параметры и печатает строку ведомости выдачи
     * зарплаты сотрудникам.
     Например:

     Смирнова Мария Ивановна 		70000 руб 00 коп

     Распечатать ведомость для нескольких сотрудников, например:

     Март 2022
     Смирнова Мария Ивановна 		70000 руб 00 коп
     Серебряков Иван Петрович 		128059 руб 00 коп
     */

    /** 12. Записать в виде метода:*/


    /** 13. Написать метод, который принимает на вход год рождения и возвращает ваше счастливое число.
     * Счастливое число рассчитывается по формуле: сумма всех чисел, если результат больше 9,
     * снова считается сумма всех чисел.
     Например:
     год рождения 1999
     1 + 9 + 9 + 9 = 28
     2 + 8 = 10
     1 + 0 = 1
     Счастливое число - 1
     */


    /** 14.
     * а) Дано 3 числа. Необходимо рассчитать разницу между средним значением и медианой (median) значением.
     Если разница больше 2, необходимо показать сообщение: “Среднее значение … отличается от медианы … на … “.
     Иначе показать сообщение: “Среднее значение =  …, медиана =  … ”.

     b) Посчитать все то же самое с помощью методов класса Math, где возможно их использовать
     *Медиана - это серединное число в отсортированном наборе чисел.
     1, 3, 9 → медиана 3
     12, 13, 101 → медиана 13
     14, 2, 12 → медиана 12
     */


    /** 15. Написать метод, который использует методы класса Math, принимает на вход сумму к оплате (например, 10.75)
     * и округляет сумму в пользу покупателя. Метод возвращает новую сумму к оплате в виде строки,
     * например “10 руб 00 коп”.
     * */


    /** 16. Посчитать с помощью методов класса Math
     a = 3
     b = 4
     c = 20

     ((a * b + c) * ab)
     Вернуть значение с округлением в бОльшую сторону.
     */

    /** 17 */


    /** 18. Написать метод, который с помощью методов класса Math высчитывает любую степень сгенерированного
     * случайного числа. Метод возвращает математически округленное целое значение и выводит на экран:
     “Число … в степени … = …”

     Число может быть в пределах от 0 до 1 исключительно.
     Степень числа может быть от 0 до 10 включительно
     */

    /** 19. Написать метод, который возвращает случайное число в пределах от 1 до 99 включительно.
     */

    /**20 */


}
