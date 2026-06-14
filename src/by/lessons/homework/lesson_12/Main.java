package by.lessons.homework.lesson_12;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Автомобиль Skoda", 101);
        Motorcycle motorcycle = new Motorcycle("Мотоцикл Triumph", 88);
        // вариант 1
        System.out.println("======== Вариант с одним гаражом ======");
        Garage<Vehicle> garage = new Garage<>();
        // мотоцикл
        if (garage.isEntryPermitted(motorcycle)) {
            System.out.println(motorcycle.getName() + " - въезд в гараж разрешён");
        } else {
            System.out.println(motorcycle.getName() + " - въезд в гараж запрещен");
        }
        // автомобиль
        if (garage.isEntryPermitted(car)) {
            System.out.println(car.getName() + " - въезд в гараж разрешён");
        } else {
            System.out.println(car.getName() + " - въезд в гараж запрещен");
        }
        //вариант 2
        System.out.println("======== Вариант с двумя гаражами ======");
        System.out.println("======== Гараж для автомобиля ======");
        Garage<Car> carGarage = new Garage<>(car);
        // автомобиль
        if (carGarage.isEntryPermitted(car)) {
            System.out.println(car.getName() + " - въезд в гараж разрешён");
        } else {
            System.out.println(car.getName() + " - въезд в гараж запрещен");
        }
        System.out.println("======== Гараж для мотоцикла ======");
        Garage<Motorcycle> motorcycleGarage = new Garage<>(motorcycle);
        // мотоцикл
        if (motorcycleGarage.isEntryPermitted(motorcycle)) {
            System.out.println(motorcycle.getName() + " - въезд в гараж разрешён");
        } else {
            System.out.println(motorcycle.getName() + " - въезд в гараж запрещен");
        }

    }
}
