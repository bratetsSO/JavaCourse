package by.lessons.homework.lesson_06;

public class Lesson06_03 {
    public static void main(String[] args) {
        //3.* Создать массив вручную.
        // Заменить максимальный и минимальный элемент массива.
        // Новый минимальный элемент будет (-1000), новый максимальный элемент 1000.

        int[] arr1 = {1010, 102, 103, 104, 105, 0};
        int minVal = -1000;
        int maxVal = 1000;
        int tmpMaxInd = 0;
        //int tmpMaxVal = arr1[0];
        int tmpMinInd = 0;
        //int tmpMinVal = arr1[0];

        System.out.println("Массив до изменений");
        for (int x : arr1) System.out.print(x + " "); //выводим массив до изменений

        /*
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > tmpMaxVal) {
                tmpMaxInd = i;
                tmpMaxVal = arr1[i];
            }
            if (arr1[i] < tmpMinVal) {
                tmpMinInd = i;
                tmpMinVal = arr1[i];
            }
        }*/
        //заменит только первый встречный (так как используется строгое сравнение < и >). Если нужно заменить последний, замените знаки на <= и >=.
        //если надо поменять "все" - нужно добавлять цикл с заменой  проверкой по значению
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > arr1[tmpMaxInd]) {
                tmpMaxInd = i;
            }
            if (arr1[i] < arr1[tmpMinInd]) {
                tmpMinInd = i;
            }
        }

        arr1[tmpMaxInd] = maxVal;
        arr1[tmpMinInd] = minVal;

        System.out.println();
        System.out.println("Массив после изменений");
        for (int x : arr1) System.out.print(x + " "); //выводим массив после изменений
    }
}
