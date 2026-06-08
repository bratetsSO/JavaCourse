package by.lessons.homework.lesson_12;

public class Garage<T extends Vehicle> {
    //1.3 Создать generic класс Garage<T extends Vehicle >, который может хранить только объекты типа наследуемого от Vehicle.
    //1.4 Реализовать метод в классе Garage,
    // который будет разрешать или запрещать въезд в гараж в зависимости от количество выбросов транспортного средства. (Boolean isEntryPermitted());
    // Реализовать этот метод: если количество выбросов больше 100, тогда въезд запрещён, если меньше 100 – въезд разрешён.

    private T vehicle;

    public Garage(T t) {
        this.vehicle = t;
    }
    // пустой конструктор
    public Garage() {

    }

    public Boolean isEntryPermitted(T vehicle) {
//        Boolean res = true;
//        if (vehicle.getEmissions() > 100) {
//            res = false;
//        }
//        return res;
        return vehicle.getEmissions() <= 100;
    }
}
