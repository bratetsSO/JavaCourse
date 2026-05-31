package by.lessons.homework.lesson_09;

public class Dog extends Animal {
    // * В классе собака определить имя, порода, средний вес.
    // * В классе Собака реализовать методы: лаять, кусать, бегать, играть, прыгать.
    // * При этом, в консоли должны выводится имя собаки вместе с описанием действия (пример. Рекс прыгает).
    private String name;
    private String breed; //порода
    private double averageWeight;

    public Dog(String color, int maxLifeSpan, String eatType, String name, String breed, double averageWeight) {
        super(color, maxLifeSpan, eatType);
        this.name = name;
        this.breed = breed;
        this.averageWeight = averageWeight;
    }

    // --- методы -----
    @Override
    public void makeSound() {
        System.out.println(name + " лает");
    }

    @Override
    public void play() {
        System.out.println(name + " играет");
    }

    public void run() {
        System.out.println(name + " бегает");
    }

    public void jump() {
        System.out.println(name + " прыгает");
    }

    public void bite() {
        System.out.println(name + " кусает");
    }

    public String toString() {
        return "id = " + getId() + "; Окрас = " + getColor() + "; максимальная продолжительность жизни = " + getMaxLifeSpan() + "; тип еды которой питаются = " + getEatType() + "; кличка = " + name + "; порода = " + breed + "; средний вес = " + averageWeight + ".";
    }

    // task 10
    public boolean equals(Dog dog) {
        return this.getId() == dog.getId() && this.getColor() == dog.getColor() && this.getMaxLifeSpan() == dog.getMaxLifeSpan() && this.getEatType() == dog.getEatType() && this.name == dog.name && this.breed == dog.breed && this.averageWeight == dog.averageWeight;
    }

    public int hashCode() {
        int res = this.getId() + this.getColor().hashCode() + this.getMaxLifeSpan() + this.getEatType().hashCode() + this.name.hashCode() + this.breed.hashCode() + (int) this.averageWeight*100;
        return res;
    }

    // --- геттеры и сеттеры ---
    public String getName() {
        return name;
    }


}
