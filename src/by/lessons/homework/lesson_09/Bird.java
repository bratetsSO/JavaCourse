package by.lessons.homework.lesson_09;

public class Bird extends Animal {
    // - Определить поля в классе Птица: семейство, максимальная высота полёта.
    // - В классе птица методы-петь, клевать, высиживать птенцов.
    // - При этом, в консоли должны выводиться поля семейства птиц с соответствующим поведением (пример: Воробей поёт).
    private String family;
    private double maxHeightFly;

    public Bird(String color, int maxLifeSpan, String eatType, String family, double maxHeightFly) {
        super(color, maxLifeSpan, eatType);
        this.family = family;
        this.maxHeightFly = maxHeightFly;
    }

    @Override
    public void makeSound() {
        System.out.println(family + " поёт");
    }
    @Override
    public void play() {
        System.out.println(family + " играет");
    }

    public void peck() {
        System.out.println(family + " клюёт");
    }

    public void incubate() {
        System.out.println(family + " высиживает птенцов");
    }

    public String toString() {
        return "id = " + getId() + "; Окрас = " + getColor() + "; максимальная продолжительность жизни = " + getMaxLifeSpan() + "; тип еды которой питаются = " + getEatType() + "; семейство = " + family + "; максимальная высота полёта = " + maxHeightFly + ".";
    }
    // task 10
    public boolean equals(Bird bird) {
        return this.getId() == bird.getId() && this.getColor() == bird.getColor() && this.getMaxLifeSpan() == bird.getMaxLifeSpan() && this.getEatType() == bird.getEatType() && this.family == bird.family && this.maxHeightFly == bird.maxHeightFly;
    }

    public int hashCode() {
        int res = this.getId() + this.getColor().hashCode() + this.getMaxLifeSpan() + this.getEatType().hashCode() + this.family.hashCode() + (int) this.maxHeightFly*100;
        return res;
    }
}
