package by.lessons.homework.lesson_05;

import java.util.Scanner;

public class Lesson05_03 {
    public static void main(String[] args) {
        //3* . Ввести число с консоли, которое не заканчивается на 0.
        // Вывести число в обратном порядке. Использовать оператор %.
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите a");
        int a = sc.nextInt();

        if (a % 10 != 0) {
            while (a > 0) {
                System.out.print("" + a % 10);
                a /= 10;
            }
        } else {
            System.out.print("Число не должно заканчиваться на 0");
        }
    }
}
