package by.lessons.homework.lesson_05;

import java.util.Scanner;

public class Lesson05_02 {
    public static void main(String[] args) {
        //2. Ввести 2 положительных числа с консоли с помощью сканера.
        // Вывести сумму всех чисел от одного числа до другого. (Используйте цикл while).
        // Подсказка. До цикла объявите переменную int sum=0. В самом цикле перезаписывайте в эту переменную сумму чисел.
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите a");
        int a = sc.nextInt();
        System.out.println("Введите b");
        int b = sc.nextInt();

        if (a < b && a > 0) { // проверку b>0 делать не обязательно
            int sum = 0;
            System.out.print("Сумма чисел от " + a + " до " + b + " равна ");
            while (a <= b) {
                sum += a;
                a++;
            }
            System.out.println(sum);
        } else {
            System.out.println("Число a должно быть: меньше b и больше 0");
        }
    }
}