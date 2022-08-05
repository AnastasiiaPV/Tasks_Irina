package homework;

public class HW5 extends Utils{

    /**
     * 1. ВСЕ!!! результаты должны быть протестированы, для этого необходимо создать метод с названием
     * verifyEquals(expectedResult, actualResult)
     */

    /********************************************************************************************
     * 2. Написать метод, который принимает на вход число от 1 до 7  и возвращает день недели.
     */
    private static String getDayOfTheWeek(int number) {
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
        int secondNum = (int) Math.round((num - firstNum) * 100);

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
    public static double getSalary(int year, String month, int hoursPerDay, int salaryPerHour) {
        if (year != 2022) {
            System.out.println("Wrong year. There is available verification only for year 2022");
            return 0;
        }
        return hoursPerDay * salaryPerHour * getDaysOfTheMonth(month);
    }

    private static int getDaysOfTheMonth(String month) {
        switch (month) {
            case "January":
            case "April":
            case "July":
            case "October":
                return 21;
            case "March":
            case "August":
                return 23;
            case "May":
            case "June":
            case "September":
            case "November":
            case "December":
                return 22;
            default:
                return 20;
        }
    }

    private static int getDaysOfTheMonth1(String month) {
        if (month.equals("January") || month.equals("April") || month.equals("July") || month.equals("October")) {
            return 21;
        } else if (month.equals("March") || month.equals("August")) {
            return 23;
        } else if (month.equals("May") || month.equals("June") || month.equals("September")
                || month.equals("November") || month.equals("December")) {
            return 22;
        } else {
            return 20;
        }
    }


    /**********************************************************************************************************
     * 11. Написать метод, который принимает на вход необходимые параметры и печатает строку ведомости выдачи
     * зарплаты сотрудникам.
     Например:

     Смирнова Мария Ивановна 		70000 руб 00 коп

     Распечатать ведомость для нескольких сотрудников, например:

     Март 2022
     Смирнова Мария Ивановна 		70000 руб 00 коп
     Серебряков Иван Петрович 		128059 руб 00 коп
     */
    public static String getSalaryReport(String name, double salary) {
        return name + "\t".repeat(6) + getPrice(salary);
    }

    public static String getFirstReportLine(String month, int year) {
        return month + "\t" + year + "\n";
    }

    public static String getAllReports(String month, int year, String allReports) {
        StringBuilder report = new StringBuilder(getFirstReportLine(month, year));

        return report.append(allReports).toString();
    }


    /**************************************************************************************
     * 12. Записать в виде метода:*/
    public static String getIfElseSchema(int x) {
        if (x < 0) {
            return x + " is negative";
        } else if (x > 0) {
            return x + " is positive";
        } else {
            return x + " is zero";
        }
    }


    /*****************************************************************************************************
     *  13. Написать метод, который принимает на вход год рождения и возвращает ваше счастливое число.
     * Счастливое число рассчитывается по формуле: сумма всех чисел, если результат больше 9,
     * снова считается сумма всех чисел.
     Например:
     год рождения 1999
     1 + 9 + 9 + 9 = 28
     2 + 8 = 10
     1 + 0 = 1
     Счастливое число - 1
     */
    public static String getLuckyNumber(int yearOfBirth) {
        int luckyNumber = sumDigits(yearOfBirth);

        while (luckyNumber > 9) {
            luckyNumber = sumDigits(luckyNumber);
        }
        return "Lucky number = " + luckyNumber;
    }

    private static int sumDigits(int number) {
        int sum = 0;

        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }


    /*****************************************************************************************************************
     * 14.
     * а) Дано 3 числа. Необходимо рассчитать разницу между средним значением и медианой (median) значением.
     Если разница больше 2, необходимо показать сообщение: “Среднее значение … отличается от медианы … на … “.
     Иначе показать сообщение: “Среднее значение =  …, медиана =  … ”.
     */

    public static String result(int a, int b, int c) {
        int median;
        int result;
        int average = (a + b + c) / 3;

        if (a > b) {
            if (a < c) {
                median = a;
            } else if (c < b) {
                median = c;
            } else {
                median = c;
            }
        } else if (b < c) {
            median = b;
        } else {
            median = c;
        }

        result = Math.abs(average - median);
        if (result > 2) {
            return "Среднее значение " + average + " отличается от медианы " + median + " на " + result + ";";
        } else {
            return "Среднее значение = " + average + ", медиана = " + median + ";";
        }
    }

    /**
     * b) Посчитать все то же самое с помощью методов класса Math, где возможно их использовать
     * Медиана - это серединное число в отсортированном наборе чисел.
     * 1, 3, 9 → медиана 3
     * 12, 13, 101 → медиана 13
     * 14, 2, 12 → медиана 12
     */
    public static String resultB(int a, int b, int c) {
        int median;
        int result;
        int average = (a + b + c) / 3;

        int min = Math.min(Math.min(a, b), c);
        int max = Math.max(Math.max(a, b), c);

        if (a != min && a != max) {
            median = a;
        } else if (b != min && b != max) {
            median = b;
        } else {
            median = c;
        }

        result = Math.abs(average - median);
        if (result > 2) {
            return "Среднее значение " + average + " отличается от медианы " + median + " на " + result + ";";
        } else {
            return "Среднее значение = " + average + ", медиана = " + median + ";";
        }
    }


    /******************************************************************************************************************
     * 15. Написать метод, который использует методы класса Math, принимает на вход сумму к оплате (например, 10.75)
     * и округляет сумму в пользу покупателя. Метод возвращает новую сумму к оплате в виде строки,
     * например “10 руб 00 коп”.
     * */
    public static String getSum(double sum) {
        return getPrice(Math.floor(sum));
    }


    /************************************************************************************************************
     * 16. Посчитать с помощью методов класса Math
     a = 3
     b = 4
     c = 20

     ((a * b + c) * ab)
     Вернуть значение с округлением в бОльшую сторону.
     */
    public static double getResult(int a, int b, int c) {
        return Math.ceil((Math.sqrt((a * b + c) * Math.pow(a, b))) / Math.PI);
    }

    public static double getResult1(int a, int b, int c) {
        return Math.ceil((Math.sqrt((Math.fma(a, b, c)) * Math.pow(a, b))) / Math.PI);
    }


    /**********************************************************************************************************
     * 17.
     * 1. Write the java statement that assigns 1 to x if y is greater than 0*/
    public static int javaStatement1(int y) {
        int x;
        if (y > 0) {
            return x = 1;
        } else {
            return 0;
        }
    }

    /**
     * 2. Suppose that score is a variable of type double. Write the java statement that increases the score by
     * 5 marks if score is between 80 and 90
     */
    public static double javaStatement2(double score) {
        if (score < 90 && score > 80) {
            return score + 5;
        } else {
            return score;
        }
    }

    /**
     * 3. Rewrite in Java the following statement without using the NOT (!) operator:
     * item = !((i<10) || (v>=50))
     */
    public static String javaStatement3() {
        return "(i >= 10) && (v < 50)";
    }

    /**
     * 4. Write a java statement that prints true if x is an odd number and positive.
     */
    public static String javaStatement4(int x) {
        if ((x % 2 != 0) && (x > 0)) {
            return "true";
        } else {
            return "false";
        }
    }

    /**
     * 5. Write a java statement that prints true if both x and y are positive number.
     */
    public static String javaStatement5(int x, int y) {
        if (y >= 0 && x >= 0) {
            return "true";
        } else {
            return "false";
        }
    }


    /**
     * 6. Write a java statement that prints true if x and y  have the same sign (-/+);
     */
    public static String javaStatement6(int x, int y) {
        if ((x % 2 == 0) && (y % 2 == 0)) {
            return "true";
        } else if ((x % 2 != 0) && (y % 2 != 0)) {
            return "true";
        } else
            return "false";
    }


    /*************************************************************************************************************
     *  18. Написать метод, который с помощью методов класса Math высчитывает любую степень сгенерированного
     * случайного числа. Метод возвращает математически округленное целое значение и выводит на экран:
     “Число … в степени … = …”

     Число может быть в пределах от 0 до 1 исключительно.
     Степень числа может быть от 0 до 10 включительно
     */
    public static String getRandomPowNum() {
        double number = (Math.random());
        double power = Math.round(Math.random() * 10);
        double result = Math.round(Math.pow(number, power));

        return "Число " + number + " в степени " + power + " = " + result + ";";
    }


    /**********************************************************************************************************
     *  19. Написать метод, который возвращает случайное число в пределах от 1 до 99 включительно.
     */
    public static double getRandomNum() {//not correct
    double case1 = Math.round(Math.random() * 10);

    if (case1 == 1) {
        System.out.println(1);
        return Math.round(Math.random() * 10);
    } else if (case1 == 2) {
        System.out.println(2);
        double result = Math.round(Math.random() * 100);
        if (result == 100) {
            result--;
        }
        return result;
    }
        return case1;
    }

    public static double getRandomNum1() {
        return (int)((Math.random() * 100) + 1);
    }

    /***********************************************************************************************************
     * 20. Assume that the following declarations have been made:
     * int year;
     * boolean isLeapYear;
     * Write a fragment that will assign isLeapYear to true if year represents a leap year and false otherwise.
     *
     * Note: The simplest definition of a leap year is any year that is divisible by four. For a challenge,
     * you could research the full definition of a leap year and create a fragment to detect a proper leap year.
     */
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 !=0) {
                return true;
            } else if (year % 400 == 0){
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        printTaskNUmber(2);
        System.out.println(getDayOfTheWeek(7));
        verifyEquals(getDayOfTheWeek(6), "Saturday");


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
        verifyEquals(printCheck("Apple", 50.13, 3.400), "Apple\n" +
                "Ціна за 1 кг        50 грн 14 коп\n" +
                "Кількість товару    3 кг 40 гр\n" +
                "___________________________________\n" +
                "Cума до сплати      170 грн 45 коп");


        printTaskNUmber(9);
        System.out.println(printCheck("Bread", 15.3, 5));
        verifyEquals(printCheck("Bread", 15.3, 5), "Bread\n" +
                "Ціна за 1 кг        15 грн 31 коп\n" +
                "Кількість товару    5 шт\n" +
                "___________________________________\n" +
                "Cума до сплати      76 грн 50 коп");


        printTaskNUmber(10);
        System.out.println(getSalary(2022, "February", 8, 30));
        verifyEquals(getSalary(2022, "February", 8, 30), 4800);
        System.out.println(printLine().repeat(3));
        System.out.println(getSalary(2021, "February", 8, 30));
        verifyEquals(getSalary(2021, "February", 8, 30), 4800);


        printTaskNUmber(11);
        System.out.println(getAllReports("May", 2022, getSalaryReport("Потапенко Віктор Васильович", 55)));
        System.out.println(getSalaryReport("Петро Пертович", 66.5));
        verifyEquals(getAllReports("May", 2022, getSalaryReport("Потапенко Віктор Васильович", 55)),
                "May\t2022\n" + "Потапенко Віктор Васильович\t\t\t\t\t\t55 грн 0 коп");


        printTaskNUmber(12);
        System.out.println(getIfElseSchema(-5));
        verifyEquals(getIfElseSchema(-5), "-5 is negative");
        System.out.println(printLine().repeat(2));

        System.out.println(getIfElseSchema(0));
        verifyEquals(getIfElseSchema(0), "0 is zero");
        System.out.println(printLine().repeat(2));

        System.out.println(getIfElseSchema(5));
        verifyEquals(getIfElseSchema(5), "5 is positive");


        printTaskNUmber(13);
        System.out.println(getLuckyNumber(1986));
        verifyEquals(getLuckyNumber(1986), "Lucky number = 6");

        printSubparagraphNumber(14, "a");
        System.out.println(result(1, 3, 9));
        System.out.println(result(12, 13, 101));
        System.out.println(result(14, 2, 12));

        printSubparagraphNumber(14, "b");
        System.out.println(result(1, 3, 9));
        System.out.println(result(12, 13, 101));
        System.out.println(result(14, 2, 12));


        printTaskNUmber(15);
        System.out.println(getSum(10.55));
        verifyEquals(getSum(10.55), "10 грн 0 коп");


        printTaskNUmber(16);
        System.out.println(getResult(3, 4, 20));
        verifyEquals(getResult(3, 4, 20), 17);
        System.out.println(getResult1(3, 4, 20));


        printTaskNUmber(17);
        printSubparagraphNumber(17, "/1");
        System.out.println(javaStatement1(5));

        printSubparagraphNumber(17, "/2");
        System.out.println(javaStatement2(15.2));

        printSubparagraphNumber(17, "/3");
        System.out.println(javaStatement3());

        printSubparagraphNumber(17, "/4");
        System.out.println(javaStatement4(5));

        printSubparagraphNumber(17, "/5");
        System.out.println(javaStatement5(5, 10));

        printSubparagraphNumber(17, "/6");
        System.out.println(javaStatement5(6, 36));


        printTaskNUmber(18);
        System.out.println(getRandomPowNum());

        printTaskNUmber(19);
        System.out.println(getRandomNum());
        printSubparagraphNumber(19,"b");
        System.out.println(getRandomNum1());


            printTaskNUmber(20);
        System.out.println(isLeapYear(2024));
        System.out.println(isLeapYear(1900));
        System.out.println(isLeapYear(2000));
    }
}
