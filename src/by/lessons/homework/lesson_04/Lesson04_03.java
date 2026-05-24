package by.lessons.homework.lesson_04;

import java.util.Scanner;

public class Lesson04_03 {
    public static void main(String[] args) {
        // 3. Дано 15/x=result, где x-число, которое вводится с командной строки, result-результат вычисления.
        // Написать программу, которая будет выводит разный текст, в зависимости от значения result.
        // В случае result=3, вывести: "Результат деления равен 3"
        // В случае result=5 вывести: "Результат деления равен 5"
        // В других случаях вывести: "Результат деления равен дробному числу".
        // При этом в последнем случае вывести точный результат деления (использовать приведение типов)

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите x");
        int x = sc.nextInt();
        int result = (15 / x);

        switch (result) {
            case 3: {
                System.out.println("Результат деления равен 3");
                break;
            }
            case 5: {
                System.out.println("Результат деления равен 5");
                break;
            }
            default: {
                System.out.println("Результат деления равен дробному числу: " + (double) 15/x); // можно (float)
            }
        }
    }
}
