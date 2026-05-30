package by.lessons.homework.lesson_07;

import static by.lessons.homework.lesson_07.Student.getStudents;

public class Main {
    public static void main(String[] args) {

        //8. В классе main из полученных студентов из задания 7 пройтись в цикле по массиву и вызвать на каждом студенте метод info, который вы создавали в задании 2
        int fltrMark = 90;
        Student[] PublicStudent = getStudents(arrayStudent(), fltrMark);
        System.out.println("Вывод отфильтрованного массива студентов, у которых средний бал не меньше " + fltrMark + ":");
        for (Student x : PublicStudent) {
            System.out.println(x.info());
        }
    }

    //6. В классе main создать массив из пяти студентов.
    public static Student[] arrayStudent() {
        Student st1 = new Student(1, "Иван", "Иванов", "Машфак", 1, "01", 80);
        Student st2 = new Student(2, "Петр", "Петров", "Машфак", 2, "02", 75);
        Student st3 = new Student(3, "Сидор", "Сидоров", "Мехмат", 3, "03", 99);
        Student st4 = new Student(4, "Аванес", "Аванесов", "ФИТР", 4, "04", 88);
        Student st5 = new Student(5, "Кирилл", "Кириллов", "Прогмат", 5, "05", 95);
        Student[] arrStudent = new Student[5];
        arrStudent[0] = st1;
        arrStudent[1] = st2;
        arrStudent[2] = st3;
        arrStudent[3] = st4;
        arrStudent[4] = st5;
        return arrStudent;
    }
}
