package sergii_hw;

import homework.Utils;

public class S_HW4_2 extends Utils {

    /*********************************************************************************************************
     Задача №1

     Дана строка:
     String s = "Перестановочный алгоритм быстрого действия";
     необходимо вывести все буквы "о" из этой строки.
     Для указанной строки ответ будет "ооооо" (или в столбик)     */
    public static String getLetter(String str, char letter) {
        String strO = "";
        char[] array = str.toCharArray();

        for (int i = 0; i < str.length(); i++) {
            if (array[i] == letter) {
                strO += array[i];
            }
        }
        System.out.print(strO);
        return strO;
    }

    public static String getLetter_2(String str, char letter) {
        String strO = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == letter) {
                strO += str.charAt(i);
            }
        }
        System.out.print(strO);
        return strO;
    }

    /*********************************************************************************************************
     Задача №2

     Дана строка:
     String s = "Перевыборы выбранного президента";
     необходимо подсчитать количество букв "е" в строке.
     Для указанной строки ответ будет 4.     */
    public static int countLetter(String str, char letter) {
        int count = 0;
        char[] array = str.toCharArray();


        for (int i = 0; i < str.length(); i++) {
            if (array[i] == letter) {
                count++;
            }
        }
        System.out.print(count);
        return count;
    }

    public static int countLetter_2(String str, char letter) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == letter) {
                count++;
            }
        }
        System.out.print(count);
        return count;
    }

    /*********************************************************************************************************
     Задача №3

     Дана строка:
     String s = "Посмотрите как Рите нравится ритм";
     необходимо вывести индексы начала всех подстрок - "рит", независимо от регистра.
     Для указанной строки ответ будет 6, 15, 29.     */
    public static String getIndexSubstring(String str, String subString) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.toLowerCase().charAt(i) == subString.toLowerCase().charAt(0)) {
                if (str.toLowerCase().charAt(i + 1) == subString.toLowerCase().charAt(1)) {
                    if (str.toLowerCase().charAt(i + 2) == subString.toLowerCase().charAt(2)) {
                        result += i + ", ";
                        System.out.print(i + ", ");
                    }
                }
            }
        }
        return result;
    }

    public static String getIndexSubstring_2(String str, String subString) {
        str = str.toLowerCase();

        String newStr = "";
        int index = str.indexOf(subString);

        while (index != -1) {
            newStr += index + ", ";

            index = str.indexOf(subString, index + 1);
        }
        System.out.println(newStr);
        return newStr;
    }

    /*********************************************************************************************************
     Экстра задача

     Дан массив:
     String[][] array = {{"Привет", "всем", "кто"}, {"изучает", "язык", "программирования"}, {"java"}};
     необходимо подсчитать количество строк в массиве, которые не содержат буквы "е".     */
    public static int countStringWithoutLetter(String[][] str,  char letter) {
        int count = 0;

        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str[i].length; j++) {
                if (!str[i][j].contains("е")) {
                    count++;
                }
            }
        }
        System.out.println(count);
        return count;
    }
    public static void main(String[] args) {
        printTaskNUmber(1);
        getLetter("Перестановочный алгоритм быстрого действия", 'о');
        printNewRow();
        printSubparagraphNumber(1, "2");
        getLetter_2("Перестановочный алгоритм быстрого действия", 'о');
        printNewRow();


        printTaskNUmber(2);
        countLetter("Перевыборы выбранного президента", 'е');
        printNewRow();

        printSubparagraphNumber(2, "2");
        countLetter("Перевыборы выбранного президента", 'е');
        printNewRow();

        printTaskNUmber(3);
        getIndexSubstring("Посмотрите как Рите нравится ритм", "рит");
        printNewRow();
        printSubparagraphNumber(3, "2");
        getIndexSubstring_2("Посмотрите как Рите нравится ритм", "рит");
        printNewRow();

        printTaskNUmber(4);
        countStringWithoutLetter(new String[][]{{"Привет", "всем", "кто"}, {"изучает", "язык", "программирования"}, {"java"}}, 'е');
        printNewRow();
    }
}
