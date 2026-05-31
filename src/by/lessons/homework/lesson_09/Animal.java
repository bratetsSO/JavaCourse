package by.lessons.homework.lesson_09;

public class Animal {
    //1.Создать классы: Животное, Собака, Птица.
    // Поля в классе животное: окрас, максимальная продолжительность жизни, тип еды которой питаются (мясо, насекомые, растения).
    // Определить методы в классе животное: (издание звуков, животное играет)
    // * В классе собака определить имя, порода, средний вес.
    // * В классе Собака реализовать методы: лаять, кусать, бегать, играть, прыгать.
    // * При этом, в консоли должны выводится имя собаки вместе с описанием действия (пример. Рекс прыгает).
    // - Определить поля в классе Птица: семейство, максимальная высота полёта.
    // - В классе птица методы-петь, клевать, высиживать птенцов.
    // - При этом, в консоли должны выводиться поля семейства птиц с соответствующим поведением (пример: Воробей поёт).
    // Использовать наследование, где суперкласс-Животное.
    // Переопределить методы, которые есть в родительском классе животное (издание звуков, животное играет)  в классах Собака и Птица.

    //1.9* Добавить поле в класс животное называемое номер (id).
    // Присвоить уникальный номер каждому животному в зоопарке, увеличивая значение на единицу.
    // Реализуйте метод, который будет выводить все информацию о каждом животном в зоопарке.
    // Реализовать метод по удалению животного из зоопарка по номеру (id).
    // Вывести информацию о все у животных в зоопарке. "

    public static int idCounter = 1; //счетчик id

    private final int id;//присваевается один раз
    private String color;
    private int maxLifeSpan;
    private String eatType;

    public Animal(String color, int maxLifeSpan, String eatType) {
        this.id = idCounter++;//присваем и увеличивем на единицу
        this.color = color;
        this.maxLifeSpan = maxLifeSpan;
        this.eatType = eatType;
    }

    public void makeSound() {
        System.out.println("Животное издает звук");
    }

    public void play() {
        System.out.println("Животное играет");
    }

    public String toString() {
        return "id = " + id + "; Окрас = " + color + "; максимальная продолжительность жизни = " + maxLifeSpan + "; тип еды которой питаются = " + eatType + ".";
    }

    // --- геттеры и сеттеры ---

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxLifeSpan() {
        return maxLifeSpan;
    }

    public void setMaxLifeSpan(int maxLifeSpan) {
        this.maxLifeSpan = maxLifeSpan;
    }

    public String getEatType() {
        return eatType;
    }

    public void setEatType(String eatType) {
        this.eatType = eatType;
    }

    public int getId() {
        return id;
    }
}
