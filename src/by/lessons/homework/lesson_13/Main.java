package by.lessons.homework.lesson_13;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //1.1. Создать несколько студентов.
        Student student01 = new Student("Иван", "Иванов", "01/01/2001", "Минск", 9.88);
        Student student02 = new Student("Петр", "Петров", "02/02/2002", "Гродно", 9.77);
        Student student03 = new Student("Сидор", "Сидоров", "03/03/2003", "Витебск", 8.88);
        Student student04 = new Student("Родион", "Родионов", "04/04/2004", "Магадан", 9.56);
        Student student05 = new Student("Дима", "Димов", "05/05/2005", "Албена", 9.44);
        Student student06 = new Student("Алекс", "Немирофф", "06/06/2006", "Остин", 7.65);
        Student student07 = new Student("Антон", "Антонов", "07/07/2007", "Урюпинск", 8.88);

        //1.2. Создать несколько групп. По этим группам распределить студентов.
        Group group01 = new Group("Гр-01");
        group01.addStudent(student01);
        group01.addStudent(student03);
        group01.addStudent(student05);

        Group group02 = new Group("Гр-02");
        group02.addStudent(student02);
        group02.addStudent(student04);

        Group group03 = new Group("Гр-03");
        group03.addStudent(student06);
        group03.addStudent(student07);

        System.out.print(group01.toString());
        System.out.println(group01.getStudents().toString());
        System.out.println("Средний бал по группе: " + group01.groupAverageMark());
        System.out.println("!!!!Clearing!!!!!");//была засада с удалением :-)
        group01.removeStudentsByMark(9.45);
        System.out.print(group01);
        System.out.println(group01.getStudents().toString());
        System.out.println("!!!!MoveToOtherGroup!!!!!");
        System.out.print("ДО -> " + group02.toString());
        System.out.println(group02.getStudents().toString());
        group01.transferToGroup(group02);
        System.out.print("ПОСЛЕ -> " + group02);
        System.out.println(group02.getStudents().toString());

        System.out.println("=============================================");
        System.out.println("=============================================");
        //1.3. Создать Факультет. Распределить туда группы.
        //Faculty faculty = new Faculty("Фак-01", List.of(group01,group02,group03));
        Faculty faculty = new Faculty("Фак-01", new ArrayList<>(), Status.ACTIVE);
        faculty.groups.add(group01);
        faculty.groups.add(group02);
        faculty.groups.add(group03);

        System.out.println(faculty.toString());
        System.out.println("Список групп факультета:");
        System.out.println(faculty.getGroups());
        System.out.println("=============================================");
        System.out.println("Список студентов факультета (в порядке возрастания среднего бала):");
        faculty.printStudents(faculty.allFacStudentSort());
        System.out.println("=============================================");
        System.out.println("Список студентов факультета (в порядке убывания среднего бала):");
        faculty.printStudents(faculty.allFacStudentSort().reversed());
        System.out.println("=============================================");
        System.out.println("!!!!ChangeFacultyStatus!!!!!");
        System.out.println("Число студентов факультета " + faculty.getName() + ": " + faculty.allFacStudentSort().size());
        faculty.changeStatus(20);
        System.out.println(faculty);
    }
}
