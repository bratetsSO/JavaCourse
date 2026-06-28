package by.lessons.homework.lesson_14;

import java.util.HashSet;
import java.util.Set;

public class Department {
    //1.3 У отделения поля: наименование отделения, список палат (коллекция Set)
    private String name;
    private Set<Ward> wardSet = new HashSet<>();

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Ward> getWardSet() {
        return wardSet;
    }

    public void setWardSet(Set<Ward> wardSet) {
        this.wardSet = wardSet;
    }

    @Override
    public String toString() {
        return "Отделение - " + name;
    }

    // добавление палаты
    public void addWard(Ward ward){
        this.wardSet.add(ward);
    }

    //1.5 Посчитать количество мужчин и женщин в отделении.
    public Integer countByGender(Gender gender) {
        int count = 0;
        for (Ward ward : wardSet) {
            for (Patient patient : ward.getPatientList()) {
                if (patient.getGender() == gender) {
                    count++;
                }
            }
        }
        return count;
    }
}
