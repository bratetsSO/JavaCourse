package by.lessons.homework.lesson_04;

import java.util.Scanner;

public class Lesson04_02 {
    public static void main(String[] args) {
        // На вход даны 3 числа.
        // Вывести в консоль только те числа, которые делятся на 2 и на 5
        // (используйте оператор % для проверки деления без остатка)
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите a");
        int a = sc.nextInt();
        System.out.println("Введите b");
        int b = sc.nextInt();
        System.out.println("Введите c");
        int c = sc.nextInt();

        System.out.print("Числа, которые делятся на 2 и 5 =>");
        // одинарный & - всегда проверяется два условия, двойной && (укороченный оператор) - второе условия проверяется в случае истинности первого
        if (a % 2 == 0 && a % 5 == 0) System.out.print(" " + a);
        if (b % 2 == 0 && b % 5 == 0) System.out.print(" " + b);
        if (c % 2 == 0 && c % 5 == 0) System.out.print(" " + c);
    }
}
