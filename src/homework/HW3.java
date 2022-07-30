package homework;

public class HW3 {
    private static final String TASK = "TASK #";
    private static final String SPACES = " ";
    private static final String NEW_LINE = "\n";
    private static final String SEMICOLONS = ";";
    private static final String UNDERLINE = "_________________________________";
    private static final String PIPE = "|";

    private static void print(String text) {
        System.out.println(text);
    }

    public static void main(String[] args) {
        /**2. Создать переменные a и b типа byte, присвоить им значения из допустимого диапазона.*/
        print(TASK + "2");
        byte a = -127;
        byte b = 126;
        print("a = " + a + SEMICOLONS + NEW_LINE + "b = " + b + SEMICOLONS + NEW_LINE);

        /**3. Создать переменные s и t типа short, присвоить им негативное и позитивное значения с разницей 60000.*/
        print(TASK + "3");
        short s = Short.MAX_VALUE;
        short t = Short.MAX_VALUE - 60000;
        print("s = " + s + SEMICOLONS + NEW_LINE + "t = " + t + SEMICOLONS + NEW_LINE);

        /**4. Создать переменную i типа int и присвоить ей минимально возможное значение этого типа.
         * Затем присвоить максимально возможное значение этого типа. Распечатать оба значения в виде таблицы:
         */
        print(TASK + "4");
        int iMin = Integer.MIN_VALUE;
        int iMax = Integer.MAX_VALUE;
        print(UNDERLINE + NEW_LINE
                + "| iMin               | " + iMin + PIPE + NEW_LINE + PIPE + UNDERLINE + PIPE + NEW_LINE
                + "| iMax               | " + iMax + " |" + NEW_LINE + PIPE + UNDERLINE + PIPE + NEW_LINE);

        /**5. Создать переменную phoneNumber и присвоить ей значение номера телефона с кодом страны и города
         * (можно ненастоящий номер телефона, например, 18009998877)
         */
        print(TASK + "5");
        long phoneNumber = 18009998877L;
        print("phoneNumber = " + phoneNumber + SEMICOLONS + NEW_LINE);

        /**6. Создать переменную f типа float и присвоить ей значение 100.101101.
         *         Создать переменную d типа double и присвоить ей значение 100.101101.
         *         Распечатать результат в виде таблицы:
         */
        print(TASK + "6");
        float f = 100.101101f;
        double d = 100.101101;
        print(UNDERLINE + NEW_LINE
                + "| f               | " + f + "    |" + NEW_LINE + PIPE + UNDERLINE + PIPE + NEW_LINE
                + "| d               | " + d + "    |" + NEW_LINE + PIPE + UNDERLINE + PIPE + NEW_LINE);

        /**7.
         * a) Создать переменную типа Double с именем dd  и инициализировать её результатом суммы чисел 10.09999 и 20.099999.
         * b) Создать переменную типа Float с именем ff  и инициализировать её результатом суммы чисел 10.09999 и 20.099999.
         *Распечатать результаты задания №7, как продолжение таблицы из задания № 6.
         */
        print(TASK + "7");
        double dd = 10.09999 + 20.099999;
        float ff = 10.09999f + 20.099999f;
        print(UNDERLINE + NEW_LINE
                + "| dd      | " + dd + "    |" + NEW_LINE + PIPE + UNDERLINE + PIPE + NEW_LINE
                + "| ff      | " + ff + "              |" + NEW_LINE + PIPE + UNDERLINE + PIPE + NEW_LINE);

        /**8. Создать переменную result и присвоить ей значение выражения 10 / 3 (с максимальной точностью)*/
        print(TASK + "8");
        float result = 10 / 3f;
        print("result = " + result + SEMICOLONS + NEW_LINE);

        /**9. Создать переменные sum, product, quotient и remainder, и  присвоить им значения вычислений переменных f и d*/
        print(TASK + "9");
        double sum = f + d;
        double product = f * d;
        double quotient = f / d;
        double remainder = f % d;
        print(UNDERLINE + NEW_LINE
                + "| sum      | " + sum + "   |" + NEW_LINE + PIPE + UNDERLINE + PIPE + NEW_LINE
                + "| product  | " + product + "    |" + NEW_LINE + PIPE + UNDERLINE + PIPE + NEW_LINE
                + "| quotient | " + quotient + PIPE + NEW_LINE + PIPE + UNDERLINE + PIPE + NEW_LINE
                + "| remainder| " + remainder + PIPE + NEW_LINE + PIPE + UNDERLINE + PIPE + NEW_LINE);

        /**10. Распечатать слово HELLO точками*/
        print(TASK + "10");
        print(". .  ...  .   .    ..");
        print(". .  .    .   .   .  .");
        print("...  ...  .   .   .  .");
        print(". .  .    .   .   .  .");
        print(". .  ...  ... ...  .." + NEW_LINE);

        /**11.Создать переменные подходящего ссылочного типа данных(выбирать минимально достаточный диапазон значений):
         *         t1 = 0;
         *         t2 = 150;
         *         t3 = -120;
         *         t4 = - 505.505;
         *         t5 = 100100;
         *         t6 = 100010001000;
         *         t7 = 2.66666666666666;
         *         t8 = - 1000000.001;
         *         t9 = 1010;
         *         Распечатать значения всех переменных.
         */
        print(TASK + "11");
        byte t1 = 0;
        short t2 = 150;
        byte t3 = -120;
        double t4 = -505.505;
        int t5 = 100100;
        long t6 = 100010001000L;
        float t7 = 2.66666666666666f;
        double t8 = -1000000.001;
        short t9 = 1010;
        print("byte t1 = " + t1 + SPACES + NEW_LINE + "short t2 = " + t2 + SPACES + NEW_LINE
                + "byte t3 = " + t3 + SPACES + NEW_LINE + "double t4 = " + t4 + SPACES + NEW_LINE
                + "int t5 = " + t5 + SPACES + NEW_LINE + "long t6 = " + t6 + SPACES + NEW_LINE
                + "float t7 = " + t7 + SPACES + NEW_LINE + "double t8 = " + t8 + SPACES + NEW_LINE
                + "short t9 = " + t9 + SPACES + NEW_LINE);

        /**12. С помощью полей классов ссылочного типа распечатать таблицу:*/
        print(TASK + "12");
        print(PIPE + " Type           " + PIPE + "Size in bits     " + PIPE + " min                          " + PIPE + " max                          "
                + PIPE + NEW_LINE + PIPE + UNDERLINE + UNDERLINE + UNDERLINE + NEW_LINE
                + PIPE + " byte           " + PIPE + " 8               " + PIPE + " "+ Byte.MIN_VALUE
                + "                         " + PIPE + " "+ Byte.MIN_VALUE + "                          "
                + PIPE + NEW_LINE + PIPE + UNDERLINE + UNDERLINE + UNDERLINE + NEW_LINE
                + PIPE + " short          " + PIPE + " 16              " + PIPE + " -32,768                      " + PIPE + " 32,747                       "
                + PIPE + NEW_LINE + PIPE + UNDERLINE + UNDERLINE + UNDERLINE + NEW_LINE
                + PIPE + " int            " + PIPE + " 32              " + PIPE + " " + Integer.MIN_VALUE
                + "                  " + PIPE + " " + Integer.MAX_VALUE + "                  "
                + PIPE + NEW_LINE + PIPE + UNDERLINE + UNDERLINE + UNDERLINE + NEW_LINE
                + PIPE + " long           " + PIPE + " 64              " + PIPE + " -9,223,372,036,854,775,808   " + PIPE + " 9,223,372,036,854,775,807    "
                + PIPE + NEW_LINE + PIPE + UNDERLINE + UNDERLINE + UNDERLINE + NEW_LINE
                + PIPE + " float          " + PIPE + " 32              " + PIPE + " -3.4E+38                     " + PIPE + " -3.4E+38                     "
                + PIPE + NEW_LINE + PIPE + UNDERLINE + UNDERLINE + UNDERLINE + NEW_LINE
                + PIPE + " double         " + PIPE + " 64              " + PIPE + " -1.7E+308                    " + PIPE + " 1.7E+308                     "
                + PIPE + NEW_LINE + PIPE + UNDERLINE + UNDERLINE + UNDERLINE + NEW_LINE);

        /**13.Создать 2 переменные референсного типа Integer - num1 и num2, присвоить им одинаковые значения,
         * сравнить 2 переменные друг с другом с помощью метода .equal.
         * Вывести результат сравнения на печать в виде выражения:
         * “Если num1 = num2, то результат сравнения методом .equal = …”
         * Присвоить переменным разные значения, сравнить,  и вывести результат на печать:
         * “Если num1 не равно num2, то результат сравнения методом .equal = …”
         */
        print(TASK + "13");
        Integer num1 = 1000;
        Integer num2 = 1000;
        if (num1.equals(num2)) {
            print("Если " + num1 + " = " + num2 + ", то результат сравнения методом .equal = true");
        }
        num1 = 1500;
        if (!num1.equals(num2)) {
            print("Если " + num1 + " не равно " + num2 + ", то результат сравнения методом .equal = false" + NEW_LINE);
        }

        /**14. Создать 2 переменные примитивного типа int - number1 and number2. Инициализаровать их
         * а) одинаковыми значениями
         * b) number1 < number2
         * c) number1 > number2
         * сравнить их подходящим методом класса Integer (посмотрите, какой метод подойдет),
         * и вывести результаты сравнения на печать в виде выражений:
         * “Если number1 = number2, то результат сравнения методом … = …”
         * “Если number1 < number2, то результат сравнения методом … = …”
         * “Если number1 > number2, то результат сравнения методом … = …”
         */
        print(TASK + "14");
        int number1 = 500;
        int number2 = 500;
        if (0 == Integer.compare(number1, number2)) {
            print("Если " + number1 + " = " + number2 + ", то результат сравнения методом compare = 0 = "
                    + Integer.compare(number1, number2));
        }
        number1 = 300;
        number2 = 500;
        if (0 > Integer.compare(number1, number2)) {
            print("Если " + number1 + " < " + number2
                    + ", то результат сравнения методом compare = \"value less than 0 = \""
                    + Integer.compare(number1, number2));
        }
        number1 = 600;
        number2 = 200;
        if (0 < Integer.compare(number1, number2)) {
            print("Если " + number1 + " > " + number2
                    + ", то результат сравнения методом compare = \"value greater than 0 = \""
                    + Integer.compare(number1, number2) + NEW_LINE);
        }

        /**15. Создать переменную типа Float, присвоить ей значение 234.9999 и распечатать значение в int*/
        print(TASK + "15");
        Float floatInt = 234.9999f;
        print(Math.round(floatInt) + NEW_LINE);
        print(floatInt.intValue() + NEW_LINE);


        /**16. С помощью метода sum() класса Double посчитать сумму двух переменных типа double.*/
        print(TASK + "16");
        double firstNumber = 50.55;
        double secondNumber = 100.45;
        print(Double.sum(firstNumber, secondNumber) + NEW_LINE);


        /**17. С помощью метода sum() класса Integer посчитать сумму двух переменных типа Float.*/
        print(TASK + "17");
        Float thirdNumber = 50.55f;
        Float fourthNumber = 100.45f;
        print(Integer.sum(Math.round(thirdNumber), Math.round(fourthNumber)) + NEW_LINE);

        /**18. Создать 2 переменные типа Short:
         *         short1 = 12000
         *         short2 = 12300
         *         Распечатать фразу:
         *         “12000 - 12300 = -300”
         *         где значение -300 выведено с помощью метода класса Short, а не операцией вычисления
         *         Присвоить переменной short1 значение 12500, вывести фразу:
         *         “12500 - 12300 = 200”
         *         где значение 200 выведено с помощью метода класса Short, а не операцией вычисления
         */
        print(TASK + "18");
        Short short1 = 12000;
        Short short2 = 12300;
        print(short1 + " - " + short2 + " = " + Short.compare(short1, short2) + SEMICOLONS);
        short1 = 12500;
        print(short1 + " - " + short2 + " = " + Short.compare(short1, short2) + SEMICOLONS + NEW_LINE);


        /**19. Создать переменные:
         *         String str1 = "123.56";
         *         String str2 = "123.55";
         *         Double doub1 = 123.56;
         *         Double doub2 = 123.55;
         *         Распечатать результат doub1 - doub2
         *         Используя методы ссылочного типа данных, посчитать и распечатать результат str1 - str2
         */
        print(TASK + "19");
        String str1 = "123.56";
        String str2 = "123.55";
        Double doub1 = 123.56;
        Double doub2 = 123.55;
        print("doub1 - doub2 = " + (doub1 - doub2) + SEMICOLONS);
        print("str1 - str2 = " + (Double.parseDouble(str1) - Double.parseDouble(str2)) + SEMICOLONS + NEW_LINE);
        print("str1 - str2 = " + (Double.valueOf(str1) - Double.valueOf(str2)) + SEMICOLONS + NEW_LINE);


        /**20. Создать переменную подходящего типа данных для хранения результатов измерения температуры тела кота
         *         (значения температуры в Цельсиях). Присвоить этой переменной сначала максимальное значение,
         *         затем минимальное значение. Посчитать и распечатать среднее значение,
         *         округленное с помощью метода класса Math.
         *         Распечатать результат среднего значения температуры тела кота.
         */
        print(TASK + "20");
        double tMaxCat = 39.2;
        double tMinCat = 37.8;
        print("Average Temperatura of cats body is = " + Math.round((tMaxCat + tMinCat) / 2) + NEW_LINE);

        /**21. Создать переменную n типа Number, присвоить ей максимально возможное значение.
         *         Присвоить n значение 10,
         *         затем присвоить n значение 10.999999999.
         *
         *         Распечатать результаты в виде выражения:
         *         “Переменная n может принимать значения:
         *          n =  …
         *          n =  …
         *          n =  …
         *          Это возможно, потому что …”
         */
        print(TASK + "21");
        Number n = 10;
        n = 10.999999999;
        print("Переменная n может принимать значения:\n" +
                "n = " + Double.MAX_VALUE  + SEMICOLONS + NEW_LINE +
                "n = " + n.intValue() + SEMICOLONS + NEW_LINE +
                "n = " + n + SEMICOLONS + NEW_LINE);

        /**22. Создать переменную Integer numberInteger = 100.
         *        Доказать, что numberInteger имеет тип Integer,
         * а numberInteger.toString() имеет тип String.
         */
        print(TASK + "22");
        Integer numberInteger = 100;
        String numberString = numberInteger.toString();

        System.out.println(numberInteger.getClass());
        System.out.println(numberString.getClass() + NEW_LINE);


        /**23. Вывести на экран следующие выражения, используя для печати только переменные:
         *  “36.6 градусов по Цельсию  = … градусов по Фаренгейту”, где значение по Фаренгейту должно быть вычислено по формуле
         *   “50 kilogram = … lbs,  50 lb = … kg”, где значения должны быть вычислены по формулам
         */
        print(TASK + "23");
        double fahrenheit = (36 * 9 / 5) + 32;
        double lbs = 50 / 0.45359237;
        double kg = 50 * 0.45359237;
        print("36.6 градусов по Цельсию  = " + fahrenheit + " градусов по Фаренгейту," + NEW_LINE +
                "50 kilogram = " + lbs + " lbs,  50 lb = " + kg + " kg" + NEW_LINE);

        print(TASK + "100");

        test1(23);
        test1(69);
        test1(968);
    }

    /**
     * 100.
     */
    public static int task(int number) {
        if (number % 2 != 0) {
            if (number % 3 == 0) {
                print("Число НЕпарне та ділться на 3 = " + number / 3);
                return number / 3;
            } else {
                print("Число НЕпарне та НЕділться на 3 = " + number * 3);
                return number * 3;
            }
        } else {
            print("Число парне =  " + (number * (number / 2)));
            return number * (number / 2);
        }
    }

    public static boolean test1(int n) {
        int expectedResult = task(44);

        if(expectedResult == n){
            System.out.println("\u001B[32m" + "Pass");
            return true;
        } else {
            System.out.println("\u001B[31m" + "Fail");
            return false;
        }
    }
}
