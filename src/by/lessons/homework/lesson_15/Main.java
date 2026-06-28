package by.lessons.homework.lesson_15;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //1.3. Создать сотрудников (создайте штук восемь)
        Employee emp1 = new Employee(1, "Иван", "Иванов", 25, 60000);
        Employee emp2 = new Employee(2, "Мария", "Петрова", 32, 85000);
        Employee emp3 = new Employee(3, "Алексей", "Смирнов", 45, 120000);
        Employee emp4 = new Employee(4, "Елена", "Козлова", 28, 70000);
        Employee emp5 = new Employee(5, "Дмитрий", "Новиков", 35, 95000);
        Employee emp6 = new Employee(6, "Анна", "Морозова", 22, 50000);
        Employee emp7 = new Employee(7, "Сергей", "Волков", 50, 140000);
        Employee emp8 = new Employee(8, "Ольга", "Лебедева", 30, 80000);

        //1.4. Создать мапку и записать туда созданных сотрудников в качестве ключа.,
        //а в качестве значения им присвоить им профессию.
        Map<Employee, String> employees = new HashMap<>();
        employees.put(emp1, "инженер");
        employees.put(emp2, "доктор");
        employees.put(emp3, "врач");
        employees.put(emp4, "агроном");
        employees.put(emp5, "тестировщик");
        employees.put(emp6, "инженер");
        employees.put(emp7, "столяр");
        employees.put(emp8, "слесарь");

        System.out.println("****** До повышения ЗП инженерам *******");
        printEmplInfo(employees);
        System.out.println("****** После повышения ЗП инженерам *******");
        raiseSalaryForProfession(employees, "инженер", 200);
        printEmplInfo(employees);
        System.out.println("****** Переворот *******");
        //converterMap(employees);
        printProfInfo(converterMap(employees));
    }

    // вывод информации по сотрудникам
    private static void printEmplInfo(Map<Employee, String> employees) {
        for (Map.Entry<Employee, String> e : employees.entrySet()) {
            System.out.print(e.getKey());
            System.out.print(" -> ");
            System.out.println(e.getValue());
        }
    }
    //вывод информации по профессиям
    private static void printProfInfo(Map<String, Collection<Employee>> profi) {
        for (Map.Entry<String, Collection<Employee>> e : profi.entrySet()) {
            System.out.print(e.getKey());
            System.out.print(" -> ");
            System.out.println(e.getValue());
        }
    }

    //1.5 Реализуйте статический метод в классе Main,
    // который повысит зарплату сотрудникам одной профессии.
    private static void raiseSalaryForProfession(Map<Employee, String> employees, String profession, int amountOfIncrease) {
        if (!employees.containsValue(profession)) {
            System.out.println("Нет сотрудников с профессией: " + profession);
            return;
        }
        for (Map.Entry<Employee, String> e : employees.entrySet()) {
            if (Objects.equals(e.getValue(), profession)) {// сравниваем профессии
                Employee emp = e.getKey(); // сотрудник как ключ
                emp.setSalary(emp.getSalary() + amountOfIncrease);
            }
        }
    }

    //1.6*. Необходимо написать метод,
    // который будет из мапки описанной в п.1.4
    // создаст мапку типа HashMap<String, Collection<Сотрудник>>.
    // Т.е, поменять местами профессию и сотрудника
    // (в качестве ключа будет выступать профессия,
    // в качестве значения-коллекция сотрудников).
    private static Map<String, Collection<Employee>> converterMap(Map<Employee, String> employees) {
        Map<String, Collection<Employee>> profi = new HashMap<>();
        Collection<String> professionSet = employees.values();
        for (String p : professionSet) { //добавили в новую мапу профессии и пустые коллекции
            profi.put(p, new ArrayList<>());
        }
        for (Map.Entry<Employee, String> e : employees.entrySet()) {
            Employee emp = e.getKey(); // получаем сотрудника
            String prof = e.getValue(); // получаем профессию
            profi.get(prof).add(emp); // получаем по ключу коллекцию, и добавляем туда сотрудника
        }
        return profi;
    }
}
