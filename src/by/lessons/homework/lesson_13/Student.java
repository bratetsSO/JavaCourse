package by.lessons.homework.lesson_13;

import java.time.LocalDate;
import java.util.Date;

public class Student {
    //У студента поля: имя, фамилия, дата рождения, город рождения, средний бал.
    String name;
    String surname;
    String birthday;
    String placeBirthday;
    Double avarageMark;

    public Student(String name, String surname, String birthday, String placeBirthday, Double avarageMark) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.placeBirthday = placeBirthday;
        this.avarageMark = avarageMark;
    }

    @Override
    public String toString() {
        return "Студент " + surname + " " + name + " - средний балл: " + avarageMark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getPlaceBirthday() {
        return placeBirthday;
    }

    public void setPlaceBirthday(String placeBirthday) {
        this.placeBirthday = placeBirthday;
    }

    public Double getAvarageMark() {
        return avarageMark;
    }

    public void setAvarageMark(Double avarageMark) {
        this.avarageMark = avarageMark;
    }
}
