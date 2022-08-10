package homework;

import java.util.Arrays;

public class Utils extends Variables {

    public static void printNewRow() {
        System.out.println("\n");
    }

    public static String printLine() {
        return ANSI_PURPLE + "*".repeat(15) + ANSI_BLACK;
    }

    public static void printTaskNUmber(int number) {
        System.out.println(printLine() + "_Task " + ANSI_BLUE + number + "_" + printLine());
    }

    public static void printSubparagraphNumber(int number, String letter) {
        System.out.println(printLine() + "_Task " + ANSI_BLUE + number + "_" + letter + printLine());
    }

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

    public static String[] turnArrToString(double[] arr) {
        String ages = Arrays.toString(arr);
        String[] newArray = ages.split(", ");

        for (int i = 0; i < newArray.length; i++) {
            if(newArray[i].contains("[")) {
                newArray[i] = newArray[i].replace("[","");
            } else if (newArray[i].contains("]")) {
                newArray[i] = newArray[i].replace("]","");
            }
        }

        return newArray;
    }
}
