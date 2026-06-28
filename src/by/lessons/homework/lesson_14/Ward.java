package by.lessons.homework.lesson_14;

import java.util.*;

public class Ward {
    //1.2 У палаты поля: номер, тип палаты (энам мужская или женская), список пациентов
    private Integer number;
    private Gender type;
    private TreeSet<Patient> patientList = new TreeSet<>();

    public Ward(Integer number, Gender type) {
        this.number = number;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Палата №" + number + ", гендер - " + type;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Gender getType() {
        return type;
    }

    public void setType(Gender type) {
        this.type = type;
    }

    public TreeSet<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(TreeSet<Patient> patientList) {
        this.patientList = patientList;
    }

    // В одной палате по 3 пациента максимум
    // в палате пациенты одного пола
    public Boolean addPatient(Patient patient) {
        if (this.patientList.size() >= 3) {
            System.out.println("В палате нет мест");
            return false;
        }
        if (this.getType() != patient.getGender()) {
            System.out.println("Палата для пациентов другого пола");
            return false;
        }

        if (this.patientList.add(patient)) {
            System.out.println("Пациент " + patient.getSurname() + " " + patient.getName() + " с диагнозом " + patient.getDiagnosis() + " добавлен в палату " + this.getNumber());
            return true;
        } else {
            System.out.println("Пациент не добавлен");
            return false;
        }
    }

    // добавляем пациента по диагнозу
    public Boolean addPatientByDiagnosis(Patient patient) {
        if (this.patientList.size() >= 3) {
            System.out.println("В палате нет мест");
            return false;
        }
        if (this.getType() != patient.getGender()) {
            System.out.println("Палата для пациентов другого пола");
            return false;
        }
        if (!this.patientList.isEmpty()) {
            Patient somePatient = patientList.first();
            if (!Objects.equals(patient.getDiagnosis(), somePatient.getDiagnosis())) {
                System.out.println("В палате пациенты с другим диагнозом");
                return false;
            }
        }
        if (patientList.add(patient)) {
            System.out.println("Пациент " + patient.getSurname() + " " + patient.getName() + " с диагнозом " + patient.getDiagnosis() + " добавлен в палату " + this.getNumber());
            return true;
        } else {
            System.out.println("Пациент не добавлен");
            return false;
        }

    }

    //1.7 В классе Палата создать метод, которые выводить информацию по всем пациентам в палате.
    public void printPatientInfo() {
        System.out.println(this.toString());
        if (getPatientList().isEmpty()) {
            System.out.println("Палата пуста");
        } else {
            Collection<Patient> patients = this.getPatientList();
            for (Patient p : patients) {
                System.out.println(p.toString());
            }
        }
    }
}





