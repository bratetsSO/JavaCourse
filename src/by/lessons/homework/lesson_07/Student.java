package by.lessons.homework.lesson_07;

public class Student {
    //1. Создать класс Student c полями
    // id (тип int),
    // name (тип String),
    // surname (тип String),
    // faculty (факультет, тип String ),
    // course(тип int) ,
    // Группа(тип String), --> group
    // средняя оценка (тип int). --> averageGrade
    // Инициализацию студента в классе main выполнять через конструктор с параметрами. Также определите конструктор без параметров.
    int id;
    String name;
    String surname;
    String faculty;
    int course;
    String group;
    int averageGrade;

    //конструктор без парамтеров
    public Student() {
    }

    //конструктор с параметрами
    public Student(int id, String name, String surname, String faculty, int course, String group, int averageGrade) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
        this.averageGrade = averageGrade;
    }

    //2. Создать метод, который будет выводить информацию по полям которые есть в классе и назвать его info
    public String info() {
        String res = "id = " + id + "; имя = " + name + "; фамилия = " + surname + "; факультет = " + faculty + "; курс = " + course + "; группа = " + group + "; средний балл = " + averageGrade + ".";
        return res;
    }

    //3. Создать метод, который будет изменять текущую группу студента (сам метод в качестве параметра будет принимать новую группу)
    public void setGroup(String newGroup) {//changeGroup
        this.group = newGroup;
    }

    //4. Создать метод, который будет возвращать текущую группу студента.
    public String getGroup() {
        return group;
    }

    public int getAverageGrade() { //получение оценки
        return averageGrade;
    }

    //5. Создать метод, который будет изменять оценку студента и группу студента.
    public void changeStudent(String group, int averageGrade) {
        this.group = group;
        this.averageGrade = averageGrade;
    }

    //7. Создать метод в классе Student, который будет принимать массив студентов
    // и возвращать из этих студентов, массив студентов у которых оценка выше переданной оценке в методе.
    // (Сигнатура метода будет выглядеть так PublicStudent[]getStudents(Students[] students, int mark)
    public static Student[] getStudents(Student[] students, int mark) {
        //получаем количство (для создания массива)
        int count = 0;
        for (Student x : students) {
            if (x.getAverageGrade() > mark) count++;
        }
        //инициализируем массив и наполняем
        Student[] fltrStudents = new Student[count];
        int i = 0;
        for (Student x : students) {
            if (x.getAverageGrade() > mark) {
                fltrStudents[i] = x;
                i++;
            }
        }
        return fltrStudents;
    }
}
