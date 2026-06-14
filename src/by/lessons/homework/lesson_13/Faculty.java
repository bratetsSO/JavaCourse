package by.lessons.homework.lesson_13;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Faculty {
    //У факультета: наименование факультета, список групп (List<Group> groups. )
    String name;
    List<Group> groups;
    //Enum
    Status status;

    //1.8* Реализовать метод по смене статуса факультета:
    // Если общее количество студентов на факультете меньше 20
    // -сделать факультет неактитвным. (Метод size() в коллекции)
    public void changeStatus(int countStudents) {
        int countFacStudents = 0;
        if (!groups.isEmpty()) {
            for (Group g : groups) {
                countFacStudents += g.getStudents().size();
            }
        }
        if (countFacStudents < countStudents) {
            this.setStatus(Status.NOT_ACTIVE);
        }
    }
    //1.9*. Вывести студентов в порядке возрастания среднего бала

    public List<Student> allFacStudentSort() {
        List<Student> allFacStudent = new ArrayList<>();
        //собираем
        for (Group g : this.getGroups()) {
            allFacStudent.addAll(g.getStudents());
        }
        //сортируем (сначала по среднему балу, потом - по фамилии)
        //allFacStudent.sort(Comparator.comparingDouble(Student::getAvarageMark).thenComparing(Student::getSurname));

        // сортировка пузырьком (возрастание)
        for (int i = 0; i < allFacStudent.size() - 1; i++) {
            for (int j = 0; j < allFacStudent.size() - 1 - i; j++) {
                if (allFacStudent.get(j).avarageMark > allFacStudent.get(j + 1).avarageMark) {
                    Student tmp = allFacStudent.get(j);
                    allFacStudent.set(j, allFacStudent.get(j + 1));
                    allFacStudent.set(j + 1, tmp);
                }
            }
        }
        return allFacStudent;
    }


    public void printStudents(List<Student> students) {
        for (Student s : students) {
            System.out.println(s.toString());
        }
    }

    public Faculty(String name, List<Group> groups, Status status) {
        this.name = name;
        this.groups = groups;
        this.status = status;//enum
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    @Override
    public String toString() {
        return "Факультет '" + name + "', статус - " + status.getDescription() + ".";
    }

    //1.7
    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
