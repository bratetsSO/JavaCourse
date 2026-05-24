package by.lessons.homework.lesson_03;

public class Lesson03_02 {
    public static void main(String[] args) {
        // 2. x=x+5; y=y*9; z=z-6;
        // Необходимо укоротить данные выражения, чтобы результат не изменился. x=8; y=9; z=12;
        // (операции присваивания, нужно просто написать по-другому)
        int x = 8, y = 9, z = 12;
        x += 5;
        y *= 9;
        z -= 6;
        System.out.println("x=" + x); // x=13
        System.out.println("y=" + y); // y=81
        System.out.println("z=" + z); // z=6
    }
}
