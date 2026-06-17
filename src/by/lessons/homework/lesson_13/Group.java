package by.lessons.homework.lesson_13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Group {
    //У группы: номер группы, коллекция студентов (List<Student> students)
    String number;
    //List<Student> students;
    // Инициализируем сразу пустой изменяемый список
    private List<Student> students = new ArrayList<>();

    public Group(String number/*, List<Student> students*/) {
        this.number = number;
        //this.students = new ArrayList<>(students) ; // т.к. инициализируем пустой список выше
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    //1.4. Реализовать метод в классе Group,
    // который должен пройти по всем студентам в группе
    // и удалить тех, у кого средний бал ниже переданной оценки в параметре метода. (метод remove).
    // Сигнатура метода: public void removeStudentsByMark(int mark);
    public void removeStudentsByMark(double mark) {
        //плохой вариант
//        for (Student s : students) {
//            if (s.avarageMark < mark) {
//                students.remove(s);
//            }
//        }
        // хороший вариант 1
        /*Iterator<Student> studentIterator = students.iterator();
        while (studentIterator.hasNext()) {//пока есть студенты
            Student nextStudent = studentIterator.next(); //следующий элемент
            if (nextStudent.avarageMark < mark) {
                studentIterator.remove();//удаляем студента
            }
        }*/
        //хороший вариант 2
        students.removeIf(s -> s.avarageMark < mark);
    }

    //1.5. Реализовать метод, если в группе меньше 2 человек,
    // перевести этих студентов в другую группу.
    // (методы коллекций size(), addAll());
    // Сигнатура метода: public void transferToGroup(Group newGroup);
    public void transferToGroup(Group newGroup) {
        if (this.students.size() < 2) {
            newGroup.students.addAll(this.getStudents());
        }
    }

    //1.6. Реализовать метод в классе Group,
    // который считает средний бал по группе.
    // Сигнатуру и название придумайте сами.
    public double groupAverageMark() {
        //int count = 0;
        double sumMark = 0;
        double res = 0;
        if (!students.isEmpty()) {
            for (Student s : students) {
                //count++;
                sumMark += s.getAvarageMark();
            }
            res = sumMark / students.size();
        }
        return res;
    }

    @Override
    public String toString() {
        return "Группа: " + "номер='" + number + "'";
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
