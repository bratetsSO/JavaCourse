package by.lessons.homework.lesson_05;

import java.util.Scanner;

public class Lesson05_04 {
    public static void main(String[] args) {
        //4* Ввести число с консоли, которое не заканчивается на 0.
        // Вывести чётные и нечётные числа через while and if. Использовать оператор %.
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int nmbr = sc.nextInt();

        if (nmbr % 10 != 0) {
            // переворачиваем число
            int rvrs = 0, digit;
            int temp = nmbr;
            while (temp > 0) {
                digit = temp % 10;
                rvrs = rvrs * 10 + digit;
                //System.out.print("" + rvrs % 10);
                temp /= 10;
            }

            System.out.println();
            System.out.print("Чётные цифры: ");
            int tempChet = rvrs;
            while (tempChet > 0) {
                if (tempChet % 2 == 0) System.out.print(tempChet % 10 + " ");
                tempChet /= 10;
            }

            System.out.println();
            System.out.print("Нечётные цифры: ");
            int tempNechet = rvrs;
            while (tempNechet > 0) {
                if (tempNechet % 2 != 0) System.out.print(tempNechet % 10 + " ");
                tempNechet /= 10;
            }

        } else {
            System.out.print("Число не должно заканчиваться на 0");
        }
    }
}
