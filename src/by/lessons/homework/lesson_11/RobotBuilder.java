package by.lessons.homework.lesson_11;

public class RobotBuilder implements Robot/*,RobotIngineer */{
    //РоботСроитель. Поля: модель, потребляемая мощность, страна производитель, агрегат для строительства, материал, включение робота (boolean isOn.)
    private String model;
    private double power;
    private String country;
    private String buildingUnit;
    private String material;
    private boolean isOn;

    public RobotBuilder(String model, double power, String country, String buildingUnit, String material, boolean isOn) {
        this.model = model;
        this.power = power;
        this.country = country;
        this.buildingUnit = buildingUnit;
        this.material = material;
        this.isOn = isOn;
    }

    @Override
    public void switchOn() {
        this.isOn = true;
        System.out.println("РоботСтроитель включен");
    }

    @Override
    public void switchOff() {
        this.isOn = false;
        System.out.println("РоботСтроитель выключен");
    }

    @Override
    public void uniquePossibility() {
        System.out.println("РоботСтроитель строит");
    }
}
