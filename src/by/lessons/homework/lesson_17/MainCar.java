package by.lessons.homework.lesson_17;

import java.io.*;

public class MainCar {
    public static void main(String[] args) {
        Car car = new Car("BELAZ", 70, "Belarus");
        serialize(car, "testFolder\\car.txt");
        Car carDeserialize = deserialize("testFolder\\car.txt");
        System.out.println(carDeserialize);
    }

    static String serialize(Car car, String filePathName) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filePathName))) { //специальный класс в Java (наследник OutputStream), который используется для сериализации объектов.
            objectOutputStream.writeObject(car);//Метод writeObject(): Автоматически разбирает объект на байты, включая все его внутренние объекты (если они тоже Serializable).
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        return filePathName;
    }

    static Car deserialize(String filePathName) {
        Car car;
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(filePathName))) {
            car = (Car) objectInputStream.readObject();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        return car;
    }
}
