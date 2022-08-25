package homework;

import java.util.Arrays;

public class HW10 extends Utils {
    private static Object Integer;

    /**!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
     * Видео1: https://youtu.be/78ZAzmNbUYQ?t=173
     *                      Методы isEmpty(), length(), trim(), replace()*/

    /****************************************************************************************************************
     *      1. Написать метод, который принимает на вход строку.
     *      Если строка не пустая (проверить методом из видео), то примените метод по удалению пробелов
     *      в начале строки и в конце строки.
     *      Догадаться, каким методом из видео можно проверить, были ли пробелы.
     *      Якщо прогалини були, то метод повинен повернути повідомлення: "Зайві прогалини видалені".
     *       * Якщо пробілів не було, повернути повідомлення “Пробілів не було”.
     *       * Якщо рядок порожній, повернути повідомлення “Рядок порожній”.
     *
     *      Test Data:
     *      “    QA4Everyone   “ → “Лишние пробелы удалены”
     *      “QA4Everyone“ → “Пробелов не было”
     *      “” → “Строка пустая”
     */
    public static String checkSpaces(String str) {
        int length = str.length();

        if (str.isEmpty()) {
            return "Рядок порожній";
        } else {
            str = str.trim();
        }

        int newLength = str.length();

        if (length > newLength) {
            return "Зайві пробіли видалені";
        } else {
            return "Пробілів не було";
        }
    }

    /****************************************************************************************************************
     2. Написать алгоритм RemoveAlla.
     С помощью методов из видео1,  написать алгоритм, который принимает на вход строку. Если строка валидная,
     то метод удаляет все буквы a из строки, если таковые имеются. Метод возвращает обработанную строку.
     Test Data:
     “    QA4Everyone   “ →  “QA4Everyone“
     “panda   “ → “pnd”
     */
    public static String removeAlla(String str) {
        if (!str.isEmpty()) {
            str = str.trim().replace("a", "");
            return str;
        }
        return "Empty string";
    }


    /****************************************************************************************************************
     3. Написать алгоритм RemoveAllZeros.
     С помощью методов из видео1,  написать алгоритм, который принимает на вход строку, состоящую из цифр.
     Если строка валидная, то метод удаляет все пробелы из строки, если таковые имеются.
     Метод возвращает обработанную строку, в которой нет нулей.
     Test Data:
     “   3 5 0 4 2 0 9 7 0 6 0 4 0       0 0 0 “ →  “35429764“
     “ 0000000111“ → “111”
     */
    public static String removeAllZeros(String str) {
        if (!str.isEmpty()) {
            if (str.contains(" ")) {
                str = str.trim().replace(" ", "");
            }

            return str.replace("0", "");
        }

        return "Empty string";
    }

    /****************************************************************************************************************
     4. Написать алгоритм RemoveAllSpaces.
     С помощью методов из видео1,  написать алгоритм, который принимает на вход строку. Если строка валидная,
     то метод удаляет все пробелы из строки, если таковые имеются. Метод возвращает обработанную строку.
     Test Data:
     “    QA   4  Everyone   “ →  “QA4Everyone“
     “p a     n d a   “ → “panda”
     */
    public static String removeAllSpaces(String str) {
        if (str.length() != 0) {
            if (str.contains(" ")) {

                return str.trim().replace(" ", "");
            }
        }

        return "Empty string";
    }


    /**!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
     Видео2: https://www.youtube.com/watch?v=thzfsPEYXfI
     Методы charAt(), concat(), contains(), substring(), toLowerCase(),  toUpperCase()*/

    /******************************************************************************************************************
     5. Напишите метод, который принимает на вход строку и считает, сколько букв а или А содержится в строке.
     Test Data:
     “Abracadabra” → 5
     “Homenum Revelio” → 0
     */
    public static int checkIfPresentAa(String str) {
        if (str.isEmpty()) {
            return 0;
        }

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'A') {
                count++;
            }
        }
        return count;
    }

    /****************************************************************************************************************
     6. Напишите метод, который принимает на вход текст и проверяет, содержится ли в тексте хотя бы одно слово Java.
     Test Data:
     “As of March 2022, Java 18 is the latest version, while Java 17, 11 and 8 are the current long-term support
     (LTS) versions. Oracle released the last zero-cost public update for the legacy version Java 8 LTS in January
     2019 for commercial use, although it will otherwise still support Java 8 with public updates for personal
     use indefinitely. Other vendors have begun to offer zero-cost builds of OpenJDK 8 and 11 that are still
     receiving security and other upgrades.” → true

     “As a decrepit father takes delight
     To see his active child do deeds of youth,
     So I, made lame by fortune’s dearest spite,
     Take all my comfort of thy worth and truth.
     For whether beauty, birth, or wealth, or wit,
     Or any of these all, or all, or more,
     Entitled in thy parts do crownèd sit,
     I make my love engrafted to this store.
     So then I am not lame, poor, nor despised,
     Whilst that this shadow doth such substance give
     That I in thy abundance am sufficed,
     And by a part of all thy glory live.
     Look what is best, that best I wish in thee.
     This wish I have; then ten times happy me.” → false
     */
    public static boolean checkIfJavaPresent(String str) {
        return str.contains("Java");
    }

    /****************************************************************************************************************
     7. Напишите метод, который принимает на вход строку, и добавляет Кавычки в начале строки, точку и кавычки
     в конце строки с помощью метода concat()
     Test Data:
     “One” → ““One.””
     “    TWO  “ → ““TWO.””
     */
    public static String addQuotes(String str) {
        if (str.isEmpty()) {
            return "String is empty";
        }
        if (str.contains(" ")) {
            str = str.replace(" ", "");
        }

        String newStr = "";
        return newStr.concat("\"").concat(str).concat(".\"");
    }

    /****************************************************************************************************************
     8. Напишите метод, кторый принимает на вход название города и исправляет написание:
     Test Data:
     “ташкент” → “Ташкент”
     “ЧикаГО” → “Чикаго”
     */

    public static String fixCityName(String cityName) {
        if (cityName.isEmpty()) {
            return "String is empty";
        }
        cityName = cityName.toLowerCase();

        return cityName.replace(String.valueOf(cityName.charAt(0)), String.valueOf(cityName.charAt(0)).toUpperCase());
    }

    public static String fixCityName_2(String cityName) {
        if (cityName.isEmpty()) {
            return "String is empty";
        }
        String result = "";

        return result.concat(cityName.substring(0, 1).toUpperCase()).concat(cityName.substring(1).toLowerCase());
    }


    /**!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
     Видео3: https://www.youtube.com/watch?v=6_RDHZfygGo
     indexOf(), lastIndexOf()*/

    /*****************************************************************************************************************
     9. Напишите метод, который принимает на вход строку и букву-параметр, и возвращает все, что находится между
     первой и последней буквой-параметром:
     Test Data:
     “Abracadabra”, “b” → “bracadab”
     “Whippersnapper”, “p” → “ppersnapp”
     */
    public static String getAllLettersBetween(String str, String letter) {
        return str.substring(str.indexOf(letter), str.lastIndexOf(letter) + 1);
    }

    /****************************************************************************************************************
     10. Напишите метод, который принимает на вход слово, и возвращает true, если слово начинается
     и заканчивается на одинаковую букву, и faulse иначе
     Test Data:
     “Abracadabra” → true
     “Whippersnapper” → false
     */
    //???????????????як тут використати indexOF??????????????????????????????
    public static boolean isSameFirstLastLetter(String str) {
        str = str.toLowerCase();

        return str.charAt(0) == str.charAt(str.length() - 1);
    }


    /**!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
     Видео4: https://youtu.be/SBByYcrsXu0?t=42
     split()*/

    /****************************************************************************************************************
     11. Напишите метод, который принимает на вход предложение и возвращает слова из этого предложения
     в виде массива слов
     Test Data:
     “QA for Everyone” → {“QA”, “for”, “Everyone”}
     “Александр Сергеевич Пушкин” → {“Александр”, “Сергеевич”, “Пушкин”}
     */
    public static String[] strToArr(String str) {
        String[] arr = str.split(" ");
        return arr;
    }

    public static String[] strToArr_1(String str) {
        return str.split(" ");
    }

    /****************************************************************************************************************
     12. Написать метод, который принимает на вход предложение, которое состоит из имени, фамилии,
     отчества и возвращает массив строк:
     Test Data:
     “Александр Сергеевич Пушкин” →
     {“Имя: Александр”, “Отчество: Сергеевич”, “Фамилия: Пушкин”}
     */
    public static String[] strToArr_2(String str) {
        String[] arr = str.split(" ");
        String[] result = new String[3];

        result[0] = "\"Ім'я: ".concat(arr[0]).concat("\"");
        result[1] = "\"По батькові: ".concat(arr[1]).concat("\"");
        result[2] = "\"Прізвище: ".concat(arr[2]).concat("\"");

        return result;
    }

    public static String[] strToArr_3(String str) {
        String[] arr = str.split(" ");
        String[] result = new String[]{"\"Ім'я: ", "\"По батькові: ", "\"Прізвище: "};

        for (int i = 0; i < arr.length; i++) {
            result[i] = result[i].concat(arr[i]).concat("\"");
        }

        return result;
    }

    /****************************************************************************************************************
     13.Написать метод, который возвращает сумму всех букв слова

     “abc” → 294
     “ABC” → 198
     “123” → 0 (это не буквы)\*/

    public static int getSumAllLetters(String str) {
        if (str.isEmpty()) {
            return 0;
        }
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 65 && str.charAt(i) <= 122) {
                sum += str.charAt(i);
            }
        }
        return sum;
    }

    /****************************************************************************************************************
     14. Написать метод,  который принимает на вход 2 буквы и возвращает true, если первая буква встречается
     раньше второй, иначе метод возвращает false
     method(“a”, “m”) → true
     method(“m”, “l”) → false
     */
    public static boolean getSumAllLetters(char letter1, char letter2) {
        return letter1 < letter2;
    }

    public static boolean getSumAllLetters(String letter1, String letter2) {
        char[] first = letter1.toCharArray();
        char[] second = letter2.toCharArray();

        if (first[0] < second[0]) {
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        printTaskNUmber(1);
        System.out.println(checkSpaces("    QA4Everyone   "));
        printSubparagraphNumber(1, "2");
        System.out.println(checkSpaces("QA4Everyone"));
        printSubparagraphNumber(1, "3");
        System.out.println(checkSpaces(""));
        printNewRow();

        printTaskNUmber(2);
        System.out.println(removeAlla("    QA4Everyone   "));
        printSubparagraphNumber(2, "2");
        System.out.println(removeAlla("panda   "));
        printSubparagraphNumber(2, "3");
        System.out.println(removeAlla(""));
        printNewRow();

        printTaskNUmber(3);
        System.out.println(removeAllZeros("   3 5 0 4 2 0 9 7 0 6 0 4 0       0 0 0 "));
        printSubparagraphNumber(3, "2");
        System.out.println(removeAllZeros(" 0000000111"));
        printSubparagraphNumber(3, "3");
        System.out.println(removeAllZeros(""));
        printSubparagraphNumber(3, "4");
        System.out.println(removeAllZeros("  hg125j k5"));
        printNewRow();

        printTaskNUmber(4);
        System.out.println(removeAllSpaces("    QA   4  Everyone   "));
        printSubparagraphNumber(4, "2");
        System.out.println(removeAllSpaces("p a     n d a   "));
        printSubparagraphNumber(4, "3");
        System.out.println(removeAllSpaces(""));
        printNewRow();

        printTaskNUmber(5);
        System.out.println(checkIfPresentAa("Abracadabra"));
        printSubparagraphNumber(5, "2");
        System.out.println(checkIfPresentAa("Homenum Revelio"));
        printSubparagraphNumber(5, "3");
        System.out.println(checkIfPresentAa(""));
        printNewRow();

        printTaskNUmber(6);
        System.out.println(checkIfJavaPresent("As of March 2022, Java 18 is the latest version, while Java 17, 11 and 8 are the current long-term support\n" +
                "     (LTS) versions. Oracle released the last zero-cost public update for the legacy version Java 8 LTS in January\n" +
                "     2019 for commercial use, although it will otherwise still support Java 8 with public updates for personal\n" +
                "     use indefinitely. Other vendors have begun to offer zero-cost builds of OpenJDK 8 and 11 that are still\n" +
                "     receiving security and other upgrades."));
        printSubparagraphNumber(6, "2");
        System.out.println(checkIfJavaPresent("As a decrepit father takes delight\n" +
                "     To see his active child do deeds of youth,\n" +
                "     So I, made lame by fortune’s dearest spite,\n" +
                "     Take all my comfort of thy worth and truth.\n" +
                "     For whether beauty, birth, or wealth, or wit,\n" +
                "     Or any of these all, or all, or more,\n" +
                "     Entitled in thy parts do crownèd sit,\n" +
                "     I make my love engrafted to this store.\n" +
                "     So then I am not lame, poor, nor despised,\n" +
                "     Whilst that this shadow doth such substance give\n" +
                "     That I in thy abundance am sufficed,\n" +
                "     And by a part of all thy glory live.\n" +
                "     Look what is best, that best I wish in thee.\n" +
                "     This wish I have; then ten times happy me."));
        printNewRow();

        printTaskNUmber(7);
        System.out.println(addQuotes("One"));
        printSubparagraphNumber(7, "2");
        System.out.println(addQuotes("    TWO  "));
        printSubparagraphNumber(7, "3");
        System.out.println(addQuotes(""));
        printNewRow();

        printTaskNUmber(8);
        System.out.println(fixCityName("myKolaiv"));
        printSubparagraphNumber(8, "2");
        System.out.println(fixCityName("bostoN"));
        printSubparagraphNumber(8, "3");
        System.out.println(fixCityName(""));
        printSubparagraphNumber(8, "2.1");
        System.out.println(fixCityName_2("myKolaiv"));
        printNewRow();


        printTaskNUmber(9);
        System.out.println(getAllLettersBetween("Abracadabra", "b"));
        printSubparagraphNumber(9, "2");
        System.out.println(getAllLettersBetween("Whippersnapper", "p"));
        printNewRow();

        printTaskNUmber(10);
        System.out.println(isSameFirstLastLetter("Abracadabra"));
        printSubparagraphNumber(10, "2");
        System.out.println(isSameFirstLastLetter("Whippersnapper"));
        printNewRow();

        printTaskNUmber(11);
        System.out.println(Arrays.toString(strToArr("QA for Everyone")));
        printSubparagraphNumber(11, "2");
        System.out.println(Arrays.toString(strToArr("River on the age of the New York city")));
        printNewRow();

        printSubparagraphNumber(12, "2");
        System.out.println(Arrays.toString(strToArr_2("Потапенко Анастасія Вікторівна")));
        printSubparagraphNumber(12, "3");
        System.out.println(Arrays.toString(strToArr_3("Потапенко Анастасія Вікторівна")));
        printNewRow();


        printTaskNUmber(13);
        System.out.println(getSumAllLetters("abc"));
        System.out.println(getSumAllLetters("ABC"));
        System.out.println(getSumAllLetters("123"));
        System.out.println(getSumAllLetters("a1 23 ;bc"));
        printNewRow();

        printTaskNUmber(14);
        System.out.println(getSumAllLetters('a', 'm'));
        System.out.println(getSumAllLetters('l', 'a'));
        printTaskNUmber(14);
        System.out.println(getSumAllLetters("a", "m"));
        System.out.println(getSumAllLetters("l", "a"));
    }
}






