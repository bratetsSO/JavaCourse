package by.lessons.homework.lesson_17;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

public class Car implements Serializable {
    @Serial
    private static final long serialVersionUID = -3709158694518048549L;
    //2.1 Создать объект Автомобиль с полями (Марка автомобиля, максимальная скорость, страна производства).
    // Переопределите метод toString(), equals(), hashcode(), гетеры и сетеры (генерируйте с помощью идеи).
    // В классе Main создать объект автомобиль. Выполнить сериализацию объекта. Реализуйте соответствующий метод в классе Main

    private String brend;
    private Integer maxSpeed;
    private String Country;

    public Car(String brend, Integer maxSpeed, String country) {
        this.brend = brend;
        this.maxSpeed = maxSpeed;
        Country = country;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brend='" + brend + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", Country='" + Country + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Car car = (Car) object;
        return Objects.equals(getBrend(), car.getBrend()) && Objects.equals(getMaxSpeed(), car.getMaxSpeed()) && Objects.equals(getCountry(), car.getCountry());
    }

    @Override
    public int hashCode() {
        return getBrend().hashCode() + getMaxSpeed() * 10 + getCountry().hashCode();
        //return Objects.hash(getBrend(), getMaxSpeed(), getCountry());
    }

    public String getBrend() {
        return brend;
    }

    public void setBrend(String brend) {
        this.brend = brend;
    }

    public Integer getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(Integer maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }
}
