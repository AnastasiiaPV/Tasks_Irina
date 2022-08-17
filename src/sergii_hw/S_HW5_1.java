package sergii_hw;

import homework.Utils;

public class S_HW5_1 extends Utils {
    //* 1. We need a function that can transform a number (integer) into a string.*/
    public static String numberToString(int num) {
        return String.valueOf(num);
    }

    public static String numberToString_2(int num) {
        return Integer.toString(num);

    }


    /******************************************************************************************************************
     * Given a non-negative integer, 3 for example, return a string with a murmur: "1 sheep...2 sheep...3 sheep...".
     * Input will always be valid, i.e. no negative integers.
     */
    public static String countingSheep(int num) {
        String s = "";
        for (int i = 1; i <= num; i++) {
            s += String.format("%s sheep...", i);
        }
        return s;
    }

    public static String countingSheep_2(int num) {
        if (num < 0) {
            return null;
        }
        String str = "";

        for (int i = 1; i <= num; i++) {
            str += i + " sheep...";
        }
        return str;
    }

    public static String countingSheep_3(int num) {
        StringBuilder sb = new StringBuilder();

        for(int i = 1; i <= num; i++){
            sb.append(i).append(" sheep...");
        }

        return sb.toString();
    }

    public static void main(String[] args) {

        printTaskNUmber(1);
        System.out.println(numberToString(5));
        printSubparagraphNumber(1, "2");
        System.out.println(numberToString(5));

        printTaskNUmber(2);
        System.out.println(countingSheep(5));
        printSubparagraphNumber(2, "2");
        System.out.println(countingSheep_2(5));
        printSubparagraphNumber(2, "3");
        System.out.println(countingSheep_2(5));
    }
}
