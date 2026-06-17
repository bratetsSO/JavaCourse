package by.lessons.homework.lesson_14;

public class Main {
    public static void main(String[] args) {

        Department department01 = new Department("Терапевтическое");
        //Department department02 = new Department("Ангинщики");

        Ward femalePalata101 = new Ward(101, Gender.Female);
        Ward malePalata102 = new Ward(102, Gender.Male);
        Ward femalePalata201 = new Ward(201, Gender.Female);
        Ward malePalata202 = new Ward(202, Gender.Male);

        department01.addWard(femalePalata101);
        department01.addWard(malePalata102);
        department01.addWard(femalePalata201);
        department01.addWard(malePalata202);

        Patient patient01 = new Patient(1, "Иван", "Иванов", "Ангина", 25, Gender.Male);
        Patient patient07 = new Patient(1, "Иван", "Иванов", "Ангина", 25, Gender.Male);
        Patient patient02 = new Patient(2, "Петр", "Петров", "Грипп", 30, Gender.Male);
        Patient patient03 = new Patient(3, "Сидор", "Сидоров", "Ангина", 28, Gender.Male);
        Patient patient04 = new Patient(4, "Ирина", "Иринова", "Грипп", 22, Gender.Female);
        Patient patient05 = new Patient(5, "Марина", "Маринина", "Ангина", 23, Gender.Female);
        Patient patient06 = new Patient(6, "Юля", "Юлина", "Ангина", 27, Gender.Female);
        Patient patient08 = new Patient(8, "Юля", "Юлинова", "Грипп", 37, Gender.Female);

        System.out.println("********** Добавляем пациентов с учетом пола *********");
        System.out.print("Попытка добавить мужчину в женскую палату => ");
        femalePalata101.addPatient(patient01);
        System.out.print("Попытка добавить женщину в мужскую палату => ");
        malePalata102.addPatient(patient04);

        System.out.print("Попытка добавить мужчину в мужскую палату => ");
        malePalata102.addPatient(patient01);
        System.out.print("Попытка добавить мужчину (с другим диагнозом) в туже мужскую палату => ");
        malePalata102.addPatientByDiagnosis(patient02);
        System.out.println("Добавляем пациента с 'одинаковыми данными' => ");
        malePalata102.addPatient(patient07);
        malePalata102.printPatientInfo();

        System.out.println("************* Распределяем по палатам *******************");
        malePalata102.addPatient(patient03);
        malePalata202.addPatient(patient02);
        femalePalata101.addPatient(patient04);
        femalePalata101.addPatient(patient08);
        femalePalata201.addPatient(patient05);
        femalePalata201.addPatientByDiagnosis(patient06);
        System.out.println("******** Пациенты в платах ********");
        malePalata102.printPatientInfo();
        malePalata202.printPatientInfo();
        femalePalata101.printPatientInfo();
        femalePalata201.printPatientInfo();

        System.out.println("************ Считалочка *************************");
        System.out.println("Количество женщин в отделении => " + department01.countByGender(Gender.Female));
        System.out.println("Количество мужчин в отделении => " + department01.countByGender(Gender.Male));
    }

}
