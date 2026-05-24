package by.lessons.homework.lesson_03;

public class Lesson03_01 {
    public static void main(String[] args) {
        //1.Дано уравнение x/6+25=98. Найти x и вывести его в консоль
        // => x/6 = 98-25
        int x = (98 - 25) * 6;
        System.out.println("Результат: x=" + x); //x=438
        System.out.println("Проверка: 98=" + (x/6+25)); //98=98
    }
}