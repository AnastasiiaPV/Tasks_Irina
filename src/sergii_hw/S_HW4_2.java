package sergii_hw;

import homework.Utils;

public class S_HW4_2 extends Utils {

    /*********************************************************************************************************
     Задача №1

     Дана строка:
     String s = “Перестановочный алгоритм быстрого действия”;
     необходимо вывести все буквы “о” из этой строки.
     Для указанной строки ответ будет “ооооо” (или в столбик)     */
    public static String getLetter(String str, char letter) {
        String strO = "";
        char[] array = str.toCharArray();

        for (int i = 0; i < str.length(); i++) {
            if (array[i] == letter){
                strO += array[i];
            }
        }
        System.out.print(strO);
        return strO;
    }

    /*********************************************************************************************************
    Задача №2

    Дана строка:
    String s = “Перевыборы выбранного президента”;
    необходимо подсчитать количество букв “е” в строке.
    Для указанной строки ответ будет 4.     */
    public static int countLetter(String str,  char letter) {
        int count = 0;
        char[] array = str.toCharArray();

        for (int i = 0; i < str.length(); i++) {
            if (array[i] == letter){
                count++;
            }
        }
        System.out.print(count);
        return count;
    }

    public static int countLetter_2(String str,  char letter) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == letter){
                count++;
            }
        }
        System.out.print(count);
        return count;
    }

    /*********************************************************************************************************
     Задача №3

     Дана строка:
     String s = “Посмотрите как Рите нравится ритм”;
     необходимо вывести индексы начала всех подстрок - “рит”, независимо от регистра.
     Для указанной строки ответ будет 6, 15, 29.     */
    public static String getIndexSubstring(String str,  String subString) {
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


    /*********************************************************************************************************
     Экстра задача

     Дан массив:
     String[][] array = {{“Привет”, “всем”, “кто”}, {“изучает”, “язык”, “программирования”}, {“java”}};
     необходимо подсчитать количество строк в массиве, которые не содержат буквы “е”.     */
//    public static int countStringWithoutLetter(String[][] str,  char letter) {
//        int count = 0;
//
//        for (int i = 0; i < str.length; i++) {
//            for (int j = 0; j < str[i].length; j++) {
//                if (str[i][j].charAt([i][j]).equals(letter)) {
//                    count++;
//                }
//            }
//        }
//        System.out.println(count);
//        return count;
//    }

        public static void main(String[] args) {
        printTaskNUmber(1);
        getLetter("Перестановочный алгоритм быстрого действия", 'о');
        printNewRow();


        printTaskNUmber(2);
        countLetter("Перевыборы выбранного президента", 'е');
        printNewRow();

        printSubparagraphNumber(2,"2");
        countLetter("Перевыборы выбранного президента", 'е');
        printNewRow();

        printTaskNUmber(3);
        getIndexSubstring("Посмотрите как Рите нравится ритм", "рит");
        printNewRow();
//
//        printTaskNUmber(4);
//        getAvg(new int[]{1,2,3,4,5,6,7,8,9});
//        printNewRow();

    }
}
