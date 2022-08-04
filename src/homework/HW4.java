package homework;

public class HW4 {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
    public static final int AGE = 16;
    public static double expectedResult10;
    public static String actualResult11;

    public static String printLine() {
        return ANSI_RED + "_".repeat(15) + ANSI_BLACK;
    }

    public static void printTaskNumber(int number) {
        System.out.println(printLine() + "Task #" + ANSI_BLUE + number + printLine() + "\n");
    }

    public static int getDivisionNum(int a, int b) {
        return a / b;
    }

    public static int getQuotientNum(int a, int b) {
        return a % b;
    }

    private static int getLastNumber(int a) {
        return a % 10;
    }

    private static int getLastTwoNumbers(int a) {
        return a % 100;
    }

    private static String getAppleFirstThirdWorld(int num, String name) {
        if (num == (1)) {
            return name + "o";
        } else if (num == (2) || num == (3) || num == (4)) {
            return name + "a";
        } else {
            return name;
        }
    }

    private static String getAppleSecondWorld(int num, String name) {
        if (num == (1)) {
            return name + "у";
        } else if (num == (2) || num == (3) || num == (4)) {
            return name + "a";
        } else {
            return name;
        }
    }

    private static String getStudentWorld(int num, String name) {
        if (getLastTwoNumbers(num) == 21 || getLastTwoNumbers(num) == 31 || getLastTwoNumbers(num) == 41
                || getLastTwoNumbers(num) == 51 || getLastTwoNumbers(num) == 61 || getLastTwoNumbers(num) == 71
                || getLastTwoNumbers(num) == 81 || getLastTwoNumbers(num) == 91) {
            return name + "a";
        }

        num = getLastNumber(num);

        if (num == (1)) {
            return name;
        } else if (num == (2) || num == (3) || num == (4)) {
            return name + "a";
        } else {
            return name + "oв";
        }
    }

    public static void countApples(int num1, int num2) {
        int resultDivision = (int) (Math.round(getDivisionNum(num1, num2)));
        int resultQuotient = getQuotientNum(num1, num2);

        System.out.println("Если " + num1 + " " + getAppleFirstThirdWorld(getLastNumber(num1), "яблок")
                + " поделить на " + num2 + " " + getStudentWorld(num2, "ученик")
                + ", то каждый ученик получит по " + resultDivision + " "
                + getAppleSecondWorld(resultDivision, "яблок") + ", и " + resultQuotient + " "
                + getAppleFirstThirdWorld(resultQuotient, "яблок") + " останется учителю.");
    }

    public static void printTemperatureF(int Celsius) {
        System.out.println(Celsius + " C = " + ((Celsius * 9 / 5) + 32) + " F");
    }

    private static String printSecondLine() {
        return "|" + " ".repeat(15) + "|" + " ".repeat(15) + "|\n";
    }

    private static String printMiddleLine() {
        return "|" + printLine() + "|" + printLine() + "|\n";
    }

    private static String printModifiedLine(int i) {

        if (i >= 9 && i <= 100) {
            return "|" + i + " ^ 2" + " ".repeat(9) + "|" + (int) Math.pow(i, 2) + " ".repeat(11) + "|\n";
        } else if (i >= 100 && i <= 1000) {
            return "|" + i + " ^ 2" + " ".repeat(8) + "|" + (int) Math.pow(i, 2) + " ".repeat(9) + "|\n";
        } else if (i >= 1000 && i <= 10000) {
            return "|" + i + " ^ 2" + " ".repeat(7) + "|" + (int) Math.pow(i, 2) + " ".repeat(7) + "|\n";
        } else if (i >= 10000 && i <= 100000) {
            if ((int) Math.pow(i, 2) >= Integer.MAX_VALUE) {
                return "|" + i + " ^ 2" + " ".repeat(6) + "|" + "Too big number |\n";
            } else {
                return "|" + i + " ^ 2" + " ".repeat(6) + "|" + (int) Math.pow(i, 2) + " ".repeat(5) + "|\n";
            }
        } else {
            return "|" + i + " ^ 2" + " ".repeat(10) + "|" + (int) Math.pow(i, 2) + " ".repeat(13) + "|\n";
        }
    }

    public static void printTable(int i) {
        System.out.println(" " + printLine() + "" + printLine() + "\n" + printSecondLine() + printMiddleLine()
                + printSecondLine() + printMiddleLine() + printModifiedLine(i) + printMiddleLine());
    }

    public static void printStringDevision(int number1, int number2, String firstLetter, String secondLetter){
        System.out.println(firstLetter + " / " + secondLetter + " = " + (getDivisionNum(number1, number2))
                + ", залишок від ділення = " + (getQuotientNum(number1, number2)));
    }

    public static void testIntegerResult(double expectedResult, double actualResult) {
        if (expectedResult == actualResult) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }

    public static void testStringResult(String expectedResult, String actualResult) {
        if (expectedResult.equals(actualResult)) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }


    public static void main(String[] args) {

        /** 3. Записать в виде кода следующие логические выражения:
         * 1) (2 = 2) И (7 = 7);
         *      2) Не(15 < 3);
         *      3) ("Сосна" = "Дуб") ИЛИ ("Вишня" = "Клён");
         *      4) Не("Сосна" = "Дуб");
         *      5) (Не(15 < 3)) И (10 > 20);
         *      6) ("Глаза даны, чтобы видеть") И ("Под третьим этажом находится второй этаж");
         *      7) (6/2 = 3) ИЛИ (7*5 = 20).
         */
        printTaskNumber(3);
        System.out.println((2 == 2) && (7 == 7));
        System.out.println(!(15 < 3));
        System.out.println("Сосна".contentEquals("Дуб") || "Вишня".contentEquals("Клён"));
        System.out.println(!("Сосна".contentEquals("Дуб")));
        System.out.println(!(15 < 3) && (10 > 20));
        System.out.println("Глаза даны, чтобы видеть".equals(true) && "Под третьим этажом находится второй этаж".equals(true));
        System.out.println((6 / 2 == 3) || (7 * 5 == 20));
        printLine();

        /** 4. Записать в виде кода:
         * 1) ("В минуте 70 секунд") ИЛИ ("Работающие часы показывают время");
         *      2) !(28 > 7) И !(300/5 = 60);
         *      3) ("Телевизор - электрический прибор") И ("Стекло - дерево");
         *      4) Не((300 < 100))  → ("Жажду можно утолить водой");
         *      5) (75 < 81) → (88 = 88).
         */
        printTaskNumber(4);
        System.out.println("В минуте 60 секунд".contentEquals("В минуте 60 секунд") || "Работающие часы показывают время"
                .contentEquals("Работающие часы показывают время"));
        System.out.println(!(28 > 7) && !(300 / 5 == 60));
        System.out.println("Телевизор - электрический прибор".contentEquals("Телевизор - электрический прибор")
                && "Стекло - дерево".contentEquals("Стекло - дерево"));
        System.out.println("if (!(300 < 100)) → (\"Жажду можно утолить водой\")");
        System.out.println("if (75 < 81) → (88 = 88)");
        printLine();


        /** 5. Записать в виде кода следующие выражения:
         *     а) Андрей старше Светы. Наташа старше Светы.
         *      б) На полке стоят учебники, а на столе лежат справочники.
         *      в) БОльшая часть детей — девочки. Остальные - мальчики.
         */
        printTaskNumber(5);
        System.out.println("Андрей старше Светы".equals(true) && "Наташа старше Светы.".equals(true));
        System.out.println("На полке стоят учебники".equals(true) && "на столе лежат справочники".equals(true));
        System.out.println("БОльшая часть детей - девочки".equals(true) && "Остальные - мальчики.".equals(true));
        printLine();


        /** 6. “Водительские права можно получить, только когда исполнится 16 лет.”*/
        printTaskNumber(6);

        if (AGE >= 16 && AGE < 100) {
            System.out.println("Here your driver licens");
        } else if (AGE > 0 && AGE < 16) {
            System.out.println("Водительские права можно получить, только когда исполнится 16 лет.");
        } else {
            System.out.println("Wrong data");
        }
        printLine();


        /** 7. ”Петя не едет в автобусе, но при этом читает книгу или не смотрит в окно”*/
        printTaskNumber(7);
        System.out.println("Петя не едет в автобусе".equals(false) && ("читает книгу".equals(true) || "не смотрит в окно".equals(false)));
        printLine();


        /** 8. “Если с другом ты, это хорошо, а когда наоборот - плохо”*/
        printTaskNumber(8);
        String you = "not с другом";
        if (you.equals("с другом")) {
            System.out.println("Если с другом ты, это хорошо");
        } else {
            System.out.println("плохо");
        }
        printLine();

        /**9. Записать выражения в виде условий if-else:*/
        // Если тебе больше 18 лет, то ты взрослый. Иначе, ты - ребенок.
        printTaskNumber(9);
        if (AGE > 18 && AGE < 120) {
            System.out.println("ты взрослый");
        } else {
            System.out.println("ты - ребенок");
        }
        printLine();
        // Если земля сухая, значит, нет дождя. Если земля мокрая, то идет дождь.
        String earth = "земля сухая";
        if (earth.equals("земля сухая")) {
            System.out.println("нет дождя");
        } else if (earth.equals("земля мокрая")) {
            System.out.println("идет дождь");
        }
        printLine();
        // Если земля сухая, значит, нет дождя. Если земля мокрая, то идет дождь. Иначе идет снег.
        earth = "земля мокрая";
        if (earth.equals("земля сухая")) {
            System.out.println("нет дождя");
        } else if (earth.equals("земля мокрая")) {
            System.out.println("идет дождь");
        } else {
            System.out.println("идет снег");
        }
        printLine();
        // Если на небе тучи, идет дождь, иначе идет “слепой” дождь.
        String clouds = "на небе тучи";
        if (clouds.equals("на небе тучи")) {
            System.out.println("идет дождь");
        } else {
            System.out.println("идет “слепой” дождь");
        }
        printLine();
        // Если сегодня суббота, значит, завтра воскресенье. Если сегодня пятница, значит, вчера был четверг.
        // Иначе вчера был не четверг, а завтра - не воскресенье
        String dayOfWeek = "сегодня пятница";
        if (dayOfWeek.equals("сегодня суббота")) {
            System.out.println("завтра воскресенье");
        } else if (dayOfWeek.equals("сегодня пятница")) {
            System.out.println("вчера был четверг");
        } else {
            System.out.println("вчера был не четверг, а завтра - не воскресенье");
        }
        printLine();
        // Если на горе свистнул рак, значит, прошла вечность, иначе ждите дальше.
        String prislivya = "на горе свистнул рак";
        if (prislivya.equals("на горе свистнул рак")) {
            System.out.println("прошла вечность");
        } else {
            System.out.println("ждите дальше");
        }
        printLine();
        //Если тебе 18 или ты закончил школу, то ты можешь не жить с родителями, иначе живи с родителями.
        String status = "not ты закончил школу";
        if (AGE == 18 || status.equals("ты закончил школу")) {
            System.out.println("ты можешь не жить с родителями");
        } else {
            System.out.println("живи с родителями");
        }
        printLine();

        double actualResult10;

        /** 10. Проверьте число на четность. Если число четное, удвойте это число, иначе возведите число в квадрат.
         *     Выведите результат работы алгоритма на печать.
         *      Найдите в презентации, какой блок схеме соответствует ваш алгоритм.
         */
        printTaskNumber(10);
        double number = 6;
        if (number % 2 == 0) {
            number *= 2;
        } else {
            //number *= number;
            number = Math.pow(number, 2);
        }
        actualResult10 = Math.round(number);
        System.out.println(actualResult10);
        printLine();


        /** 11. Напишите алгоритм проверки возраста на соответствие условиям (if-else):
         *     Голосовать можно с 18 лет
         *      Машину можно водить с 16 лет
         *      В школу можно идти с 5 лет
         *      Выведите результат работы алгоритма на печать.
         *
         *      Найдите в презентации, какой блок схеме соответствует ваш алгоритм.
         */
        printTaskNumber(11);
        if(AGE < 0 || AGE > 120) {
            actualResult11 = "Wrong data ";
            System.out.println(actualResult11);
        } else if (AGE >= 5) {
            actualResult11 = "В школу можно идти с 5 лет ";
            System.out.println("В школу можно идти с 5 лет ");
            if (AGE >= 16) {
                actualResult11 = actualResult11 + "Машину можно водить с 16 лет ";
                System.out.println("Машину можно водить с 16 лет ");
                if (AGE >= 18) {
                    actualResult11 = actualResult11 + "Голосовать можно с 18 лет ";
                    System.out.println("Голосовать можно с 18 лет ");
                }
            }
        }
        printLine();

        /** 12. Напишите алгоритм программы, которая проверяет оценку ученика и выполняет следующие действия:
         *     5 - выдать похвальную грамоту и перевести в следующий класс
         *      4 - перевести в следующий класс
         *      3 - дать задание на лето и перевести в следующий класс
         *      2 - вызвать родителей и оставить в текущем классе на второй год
         *      Выведите результат работы алгоритма на печать.
         *
         *      Найдите в презентации, какой блок схеме соответствует ваш алгоритм.
         */
        printTaskNumber(12);
        int rating = 2;
        if (rating == 5) {
            System.out.println("выдать похвальную грамоту и перевести в следующий класс");
        } else if (rating == 4) {
            System.out.println("перевести в следующий класс");
        } else if (rating == 3) {
            System.out.println("дать задание на лето и перевести в следующий класс");
        } else if (rating == 2) {
            System.out.println("вызвать родителей и оставить в текущем классе на второй год");
        } else {
            System.out.println("Wrong rating data");
        }
        printLine();

        /** 13. Напишите алгоритм программы, которая проверяет 2 числа. Программа складывает числа,
         * которые делятся на 3 без остатка, и вычитает числа, которые делятся на 5 без остатка.
         * Программа умножает числа, которые делятся на 2 без остатка, но если хотя бы одно число отрицательное,
         * программа умножает результат предыдущего действия на (-1).
         * Если числа не прошли ни одну проверку, программа выводит на печать ошибку о невозможности произвести действия.
         */
        printTaskNumber(13);
        int number1 = 4;
        int number2 = 2;
        double result = 0;

        if (number1 % 3 == 0 && number2 % 3 == 0) {
            result = number1 + number2;
            System.out.println("number1 + number2 = " + number1 + number2);
        }
        if (number1 % 5 == 0 && number2 % 5 == 0) {
            result = number1 - number2;
            System.out.println("number1 - number2 = " + result);
        }
        if (number1 < 0 || number2 < 0) {
            result = result * (-1);
            System.out.println("result = result * (-1) = " + result);
        } else if (number1 % 2 == 0 && number2 % 2 == 0) {
            result = number1 * number2;
            System.out.println("number1 * number2 = " + result);
        } else {
            System.out.println("ERROR");
        }
        printLine();


        /** 14. Распечатать следующие выражения, используя метод и параметры:
         *     Результат деления k на l = …, а остаток от деления  = …
         *      Результат деления k на m = …, а остаток от деления  = …
         *      Результат деления l на m = …, а остаток от деления  = …
         *      Результат деления m на k = …, а остаток от деления  = …
         *      И так далее все возможные варианты.
         *      Сравнить код из HW2 с кодом из HW4. Что для вас легче?
         */
        printTaskNumber(14);
        printStringDevision(2,3,"k","l");
        printStringDevision(2,4,"k","m");
        printStringDevision(3,4,"l","m");
        printStringDevision(3,2,"l","k");
        printStringDevision(4,2,"m","k");
        printStringDevision(4,3,"m","l");
        printLine();


        /** 15. Выполнить задание 18 из HW2 с помощью метода и параметров:
         *     а) Создать переменные apple и  student и присвоить им значения 40 и 6 соответственно. Распечатать выражение:
         *      Если … яблок(а) поделить на … учеников, то каждый ученик получит по … яблок(a), и … яблок(а) останется учителю.
         *      Распечатать это же выражение со значениями 100 и 21.
         */
        printTaskNumber(15);
        countApples(40, 6);
        printLine();
        countApples(100, 21);
        printLine();


        /** 16. Выполнить задание 18 из HW2 с помощью метода и параметров:
         *     Написать метод так, чтобы правильные склонения слов (н-р, яблок или яблока) печатались автоматически в
         *     зависимости от значений параметров.
         *      Распечатать выражение с параметрами:
         *      apple = 42, 55, 1
         *      student = 42, 5, 2
         */
        printTaskNumber(16);
        countApples(42, 42);
        printLine();
        countApples(55, 5);
        printLine();
        countApples(1, 2);
        printLine();
        countApples(100, 7);
        printLine();

        /** 17. Напишите метод, который примет на вход параметр температуры в Цельсиях,
         * и распечатает результат температуры в Цельсиях и в Фаренгейтах.
         */
        printTaskNumber(17);
        printTemperatureF(28);
        printLine();


        /** 18. а) Создать метод, который примет на вход параметр i и распечатает таблицу:
         *     i ^ 2
         *      значение i ^ 2
         *      b) поменять значение i и распечатать таблицу с новым значением i
         */
        printTaskNumber(18);
        printTable(50);
        printTable(999);
        printTable(9999);
        printTable(99999);
        printLine();


        /** 19. Напишите тест, который валидирует (проверит правильность работы) ваш код из задания №10.
         *     Тестовые данные - 2, 5, 0.
         */
        printTaskNumber(19);
        testIntegerResult(12,actualResult10);
        testIntegerResult(-2,actualResult10);
        testIntegerResult(5,actualResult10);
        testIntegerResult(0,actualResult10);
        printLine();


        /** 20. Напишите тест, который валидирует ваш код из задания №11.
         *     Придумайте тестовые данные. Выведите результат проверки на печать.
         */
        printTaskNumber(20);
        testStringResult("В школу можно идти с 5 лет Машину можно водить с 16 лет ", actualResult11);
        printLine();


        /** 21. Напишите алгоритм программы, которая проверяет число типа short на количество разрядов,
         *     и выводит результат проверки.
         *      ( Например, “It’s a two-digit number.”, “It’s a five-digit number.”, etc)
         *      Выведите результат проверки на печать.
         */
        printTaskNumber(21);

        printLine();
    }
}
