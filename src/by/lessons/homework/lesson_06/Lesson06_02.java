package by.lessons.homework.lesson_06;

public class Lesson06_02 {
    public static void main(String[] args) {
        //2.Создать массив из 5 чисел и заполните этот массив вручную.
        // Создайте второй массив с размерностью больше на 1 чем первый массив.
        // Необходимо скопировать первый массив со всеми значениями во второй массив.
        // Последний элемент во втором массиве пусть будет 0.
        // Выведите второй массив в консоль с помощью цикла for each.

        //int[] arr1 = new int[5];
        int[] arr1 = {101, 102, 103, 104, 105};
        int[] arr2 = new int[arr1.length + 1];

        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }
        for (int x : arr2) System.out.print(x + " "); //выводим второй массив в консоль
    }
}
