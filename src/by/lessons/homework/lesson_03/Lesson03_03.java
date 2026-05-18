package by.lessons.homework.lesson_03;

public class Lesson03_03 {
    public static void main(String[] args) {
        //3. Даны числа a=35, b=65.
        // Если а>b, то присвоить числу c значение 5 иначе, присвоить числу c значение 10. (тернарный оператор)
        int a = 35, b = 65;
        int res = (a > b) ? 5 : 10;
        System.out.println("res = " + res);
    }
}
