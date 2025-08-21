public class ArithmeticOperations {
    public static void main(String[] args) {
        System.out.println("---Арифметические операции---");
        System.out.println("Даны два числа. Выведите их сумму.");
        System.out.println(5 + 10);
        System.out.println("Вычислить значения x = a - b и вывести результат.");
        int a = 100;
        int b = 30;
        int x = a - b;
        System.out.println(x);
        System.out.println("Вычислить площадь прямоугольника.");
        a = 4;
        b = 5;
        int s = a * b;
        System.out.println("Первая сторона: " + a + " Вторая сторона: " + b);
        System.out.println(s);
        System.out.println("Написать программу вычисления выражения: a = (3*x + y)*(x–4*y).");
        x = 2;
        int y = 1;
        a = (3 * x + y) * (x - 4 * y);
        System.out.println(a);
        System.out.println("Даны 2 целых числа, вычислить остаток от деления первого на второе.");
        System.out.println(17 % 2);
        System.out.println("Даны 2 целых числа, поменять значения друг друга.");
        a = 5;
        b = 9;
        System.out.println("a = " + a + " b = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = " + a + " b = " + b);
        System.out.println("Дано число. Выведите его последнюю цифру.");
        System.out.println(5678 % 10);
        System.out.println("Дано двузначное число. Выведите первую цифру.");
        System.out.println(78 / 10);
        System.out.println("Дано целое трехзначное число, необходимо вычислить сумму его цифр.");
        a = 578;
        int sum = a % 10;
        a = a / 10;
        sum = sum + a % 10;
        a = a / 10;
        sum = sum + a % 10;
        a = a / 10;
        System.out.println("sum = " + sum + " a = " + a);
    }
}