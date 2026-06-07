package by.lessons.homework.lesson_11;

import java.io.DataOutput;

public class RobotCook implements Robot {
    //РоботПовар поля: модель, потребляемая мощность, страна производитель, агрегат для приготовления, включение робота (boolean isOn).
    private String model;
    private double power;
    private String country;
    private String cookingUnit;
    private boolean isOn;

    public RobotCook(String model, double power, String country, String cookingUnit, boolean isOn) {
        this.model = model;
        this.power = power;
        this.country = country;
        this.cookingUnit = cookingUnit;
        this.isOn = isOn;
    }

    public String getModel() {
        return model;
    }

    @Override
    public void switchOn() {
        this.isOn = true;
        System.out.println("РоботПовар включен");
    }

    @Override
    public void switchOff() {
        this.isOn = false;
        System.out.println("РоботПовар выключен");
    }

    @Override
    public void uniquePossibility() {
        System.out.println(getModel() + " - РоботПовар готовит");
    }
}
