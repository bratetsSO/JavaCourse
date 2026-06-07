package by.lessons.homework.lesson_11;

public class RobotSapper implements Robot, RobotIngineer {
    //РоботСапёр. Поля: модель, потребляемая мощность, средство для разминирования (шасси номер), материал, включение робота (boolean isOn)
    private String model;
    private double power;
    private int chassisNumber;
    private String material;
    private boolean isOn;

    public RobotSapper(String model, double power, int chassisNumber, String material, boolean isOn) {
        this.model = model;
        this.power = power;
        this.chassisNumber = chassisNumber;
        this.material = material;
        this.isOn = isOn;
    }

    public String getModel() {
        return model;
    }

    @Override
    public void switchOn() {
        this.isOn = true;
        System.out.println("РоботСапер включен");
    }

    @Override
    public void switchOff() {
        this.isOn = false;
        System.out.println("РоботСапер выключен");
    }

    @Override
    public void uniquePossibility() {
        System.out.println(getModel() + " - РоботСапер разминирует");
    }

    @Override
    public void repair() {
        System.out.println("РобоСапер отремонтирован");
    }

    @Override
    public void createItem() {
        System.out.println(getModel() + " - РоботСапёр создаёт приспособление для разминирования");
    }
}
