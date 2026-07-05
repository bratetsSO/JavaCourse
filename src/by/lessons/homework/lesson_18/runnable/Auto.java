package by.lessons.homework.lesson_18.runnable;

public class Auto implements Runnable {
    //1.Создать класс авто. Поля в классе будут: имя машины, гос. номер, время остановки.
    // Определить в нём метод, при котором авто будет просто ехать (выводить в консоль сообщение в цикле).
    private String brand;
    private String number;
    private Integer timeToStop;

    public Auto(String brand, String number, Integer timeToStop) {
        this.brand = brand;
        this.number = number;
        this.timeToStop = timeToStop;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getTimeToStop() {
        return timeToStop;
    }

    public void setTimeToStop(Integer timeToStop) {
        this.timeToStop = timeToStop;
    }

    @Override
    public void run() {
        drive();
    }

    public void drive() {
        try {
            String str = Thread.currentThread().getName();
            System.out.println("Поток " + str + " стартовал");
            for (int i = 1; i <= 5; i++) {//едем 5 кругов
                System.out.println("Автомобиль " + getBrand() + "(" + getNumber() + ") едет. Круг => " + i);
                if (getTimeToStop() > 0) {
                    System.out.println("Автомобиль " + getBrand() + "(" + getNumber() + ") остановился на " + getTimeToStop() + "мс.");
                    Thread.sleep((long) getTimeToStop());
                }
            }
            System.out.println("Автомобиль " + getBrand() + "(" + getNumber() + ") закончил поездку");
            System.out.println("Поток " + str + " остановлен");
        } catch (Exception e) {
            throw new RuntimeException("Ошибка");
        }
    }
}
