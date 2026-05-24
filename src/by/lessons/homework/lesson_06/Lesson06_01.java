package by.lessons.homework.lesson_06;

public class Lesson06_01 {
    public static void main(String[] args) {
        //1. Создать массив из 10 элементов.
        // Заполните массив числами и вывести их в консоль (выводите через цикл for each).
        // Замените каждый элемент с нечётным индексом на ноль. Выведите полученный массив в консоль через цикл for each

        int[] arr = new int[10];
        int n = 100;
        for (int i = 0; i < 10; i++) {
            arr[i] = n;
            n++;
            //System.out.print(arr[i]+" ");
        }
        System.out.println("Исходный массив");
        for (int x : arr) System.out.print(x + " "); //выводим исходный массив в консоль
        System.out.println();
        System.out.println("Измененный массив");
        for (int i = 0; i < 10; i++) {
            if (i % 2 != 0) arr[i] = 0;
        }
        for (int x : arr) System.out.print(x + " "); //выводим измененный массив в консоль
    }
}
