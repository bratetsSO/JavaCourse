package by.lessons.homework.lesson_04;

import java.util.Scanner;

public class Lesson04_01 {
    public static void main(String[] args) {
        //1. На вход даны 3 числа. Вывести в консоль только четные числа
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите a");
        int a = sc.nextInt();
        System.out.println("Введите b");
        int b = sc.nextInt();
        System.out.println("Введите c");
        int c = sc.nextInt();

        System.out.print("Четные числа =>");
        if (a % 2 == 0) System.out.print(" " + a);
        if (b % 2 == 0) System.out.print(" " + b);
        if (c % 2 == 0) System.out.print(" " + c);
    }
}