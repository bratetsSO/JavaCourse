package by.lessons.homework.lesson_06;

public class Lesson06_04 {
    public static void main(String[] args) {
        //4.* Создать массив (вручную). Отсортировать элементы массива в порядке возрастания.
        // Вывести полученный массив. Выполнить с помощью цикла for

        int[] arr = {1010, 102, 103, 104, 105, 0};

        System.out.println("Исходный массив");
        for (int k = 0; k < arr.length; k++) System.out.print(arr[k] + " ");

        //сортировка пузырьком
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j+1] = tmp;
                }
            }
        }
        System.out.println();
        System.out.println("Сортированный массив");
        for (int k = 0; k < arr.length; k++) System.out.print(arr[k] + " ");
    }
}
