package by.lessons.homework.lesson_05;

public class Lesson05_01 {
    public static void main(String[] args) {
        // 1. Вывести все числа кратные 7 или 3 в диапазоне от 1 до 100.
        // (можно использовать цикл for)
        System.out.println("Числа кратные 7 или 3 (for):");
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0 | i % 3 == 0) System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("******************************************");
        System.out.println();

        System.out.println("Числа кратные 7 или 3 (while):");
        int n = 1;
        while (n <= 100) {
            if (n % 7 == 0 | n % 3 == 0) System.out.print(n + " ");
            n++;
        }

        System.out.println();
        System.out.println("******************************************");
        System.out.println();
        System.out.println("Числа кратные 7 или 3 (do-while):");
        int j = 1;
        do {
            if (j % 7 == 0 | j % 3 == 0) System.out.print(j + " ");
            j++;
        } while (j <= 100);
    }
}