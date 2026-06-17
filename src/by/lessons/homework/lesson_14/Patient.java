package by.lessons.homework.lesson_14;

import java.util.Objects;

public class Patient implements Comparable<Patient> {
    //1.1 У пациента поля: уникальный идентификатор, имя, фамилия, диагноз, возраст, пол (сделать enum класс: Мужской, Женский).
    private Integer Id;
    private String name;
    private String surname;
    private String diagnosis;
    private int age;
    private Gender gender;

    public Patient(Integer id, String name, String surname, String diagnosis, int age, Gender gender) {
        Id = id;
        this.name = name;
        this.surname = surname;
        this.diagnosis = diagnosis;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Пациент:{" +
                "Id=" + Id +
                ", имя ='" + name + '\'' +
                ", фамилия ='" + surname + '\'' +
                ", диагноз='" + diagnosis + '\'' +
                ", возраст=" + age +
                ", пол=" + gender +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Patient patient = (Patient) object;
        return getAge() == patient.getAge() && Objects.equals(getName(), patient.getName()) && Objects.equals(getSurname(), patient.getSurname()) && getGender() == patient.getGender();
    }

    @Override
    public int hashCode() {
        //return Objects.hash(getId(), getName(), getSurname(), getDiagnosis(), getAge(), getGender());
        return /*getId() * 10 +*/ getName().hashCode() + getSurname().hashCode() + getDiagnosis().hashCode() + getAge() * 100 + getGender().hashCode();
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
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

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    //1.8*. Сортировать пациентов по идентификационному номеру.
    @Override
    public int compareTo(Patient o) {
        return Id.compareTo(o.getId());
    }
}
