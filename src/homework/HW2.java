package homework;

public class HW2 {

    public static void main(String[] args) {

//    Part 2
//    11. Создать целочисленные переменные k, l, m и присвоить им значения на ваше усмотрение
//    Вывести значения переменных в столбик
//    Вывести значения переменных в строку
        System.out.println("Task 11");
        int k = 5;
        int l = 10;
        int m = 15;

        System.out.println("Task 12");
        System.out.println(k + "\n" + l + "\n" + m);
        System.out.println("____________________");


        System.out.println("Task 13");
        System.out.print(k + " " + l + " " + m +"\n");
        System.out.println("____________________");


//    14. Используя конкатенацию, вывести значения переменных в строку через запятую,чтобы было напечатано, например:
//            5, 10, 15 или 8, 13, 113
        System.out.println("Task 14");
        System.out.println(k + ", " + l + ", " + m);
        System.out.println("____________________");

/**    15. Вывести значения этих переменных так, чтобы было понятно, какое значение к какой переменной относится.
 *   Например, должно быть распечатано:
 *  int a = 5 или a = 5
*/
        System.out.println("Task 15");
        System.out.println("int k = " + k + "; int l = " + l + "; int m = " + m + ";");
        System.out.println("____________________");

//    16.Распечатать следующие выражения, где вместо … будет выведен результат арифметической операции:
//    Sum of k and l = …
//    k * m = …
//    Разность переменных l и m = …
        System.out.println("Task 16");
        System.out.println("k + l = " + (k + l));
        System.out.println("k * l = " + (k * l));
        System.out.println("k - l = " + (k - l));
        System.out.println("____________________");

//    17. Распечатать следующие выражения:
//    Результат деления k на l = …, а остаток от деления  = …
//    Результат деления k на m = …, а остаток от деления  = …
//    Результат деления l на m = …, а остаток от деления  = …
//    Результат деления m на k = …, а остаток от деления  = …
        System.out.println("Task 17");
        System.out.println("k / l = " + (k / l) + ", залишок від ділення = " + (k % l));
        System.out.println("k / m = " + (k / m) + ", залишок від ділення = " + (k % m));
        System.out.println("l / m = " + (l / m) + ", залишок від ділення = " + (l % m));
        System.out.println("k / l = " + (m / k) + ", залишок від ділення = " + (m % k));
        System.out.println("____________________");

//    18. Создать переменные apple и  student и присвоить им значения 40 и 6 соотетственно. Распечатать выражение:
//    Если … яблок поделить на … учеников, то каждый ученик получит по … яблок(a), и … яблок(а) останется учителю.
        System.out.println("Task 18");
        int apple = 40;
        int student = 6;
        System.out.println("Если " + apple + " яблок поделить на " + student + " учеников, то каждый ученик получит"
                + " по " + (apple / student) + " яблок(a), и " + (apple % student) + " яблок(а) останется учителю.");
        System.out.println("____________________");

//    Распечатать это же выражение со значениями 100 и 21.
        apple = 100;
        student = 21;
        System.out.println("Если " + apple + " яблок поделить на " + student + " учеников, то каждый ученик получит"
               + " по " + (apple / student) + " яблок(a), и " + (apple % student) + " яблок(а) останется учителю.");
        System.out.println("____________________");

//    19.Распечатать вычисления и итоговый результат:
//    Сумма чисел k, l, m++ и sumKLM-- = …, а разность m++ и  sumLKM = …
        System.out.println("Task 19");
        m++;
        System.out.println("sumKLM++ = " + (Integer.sum(Integer.sum(k,l), m)));
        System.out.println("k, l, m++ = " + (k + l + m));
        m--;
        System.out.println("sumKLM-- =  " + (Integer.sum(Integer.sum(k,l), m)));
        System.out.println(k + l + m);
        System.out.println("____________________");

//    20. Показать, что число 48 кратно 8, и что оба этих числа - четные. А числа 47 и 49 - нечетные.
        System.out.println("Task 20");
        System.out.println("число 48 кратно 8 : 48%8= " + (48%8));
        System.out.println("48 - четное : 48%2= " + (48%2));
        System.out.println("8 - четное : 8%2= " + (8%2));
        System.out.println("47 - нечетное : 47%2= " + (47%2));
        System.out.println("49 - нечетное : 49%2= " + (49%2));
        System.out.println("____________________");

//            Part 3
//    ___________________________________________________
//    Для всех заданий:
//    x = 2,   y = 3,  a = k, b = l, c = m, d = y - x
        double x = 2;
        double y = 3;
        int a = k;
        int b = l;
        int c = m;
        double d = y - x;

//    a. Вывести на печать математическое выражение из заданий 21, 22 и 23
        double result21 = Math.pow((x + 3),2);
        double result22 = (((3+4*x)/5) - (10*(y-5)*(a+b+c))/x) + (9*(4/x+((9+x)/y)));
        double result23 = ((5*x + 7*y) / (8*x + 10*y)) / ((3*x - y)/(x + y));

        System.out.println("(x+3)^2 = " + result21);
        System.out.println("(3+4x)/5 - 10*(y-5)*(a+b+c)/x + 9*((4/x)+((9+x)/y)) = " + result22);
        System.out.println("((5*x + 7*y) / (8*x + 10*y)) / ((3*x - y)/(x + y)) = " + result23);

//    b. Посчитать значения из задания a и вывести результат на печать в виде таблицы.
//            result21, result22 и result23 - результаты вычислений в каждом выражении
//            (считать с помощью программы, а не вручную!)
        System.out.println("|task   |result    |\n|21     |" + result21 + "|\n|22     |"
                + result22 + "|\n|23     |" + result23 + "|");
//
//
//    task
//            result
//21
//    result21
//22
//    result22
//23
//    result23
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//            ((5x + 7y) / (8x + 10y)) / ((3x - y)/(x + y))
//
//
//
//
//
//            8x + 10y != 0
//            3x - y != 0
//    x + y !=0
//    keep-change-flip
//
//
//
//
//
//
//
    }
}
