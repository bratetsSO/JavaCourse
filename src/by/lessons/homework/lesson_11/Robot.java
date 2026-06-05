package by.lessons.homework.lesson_11;

public interface Robot /*extends RobotIngineer*/{
    //1. Создать интерфейс Робот.
    // В нём определены методы:
    // Дефолтный метод:  Отремонтировать робота и
    // абстрактные методы: включить робота, выключить, продемонстрировать уникальные способности (uniquePossibility).
    default void repair() {
        System.out.println("Робот отремонтирован");
    }
    public abstract void switchOn(); //Включить
    public abstract void switchOff();//Выключить
    public abstract void uniquePossibility(); //продемонстрировать уникальные способности
}
