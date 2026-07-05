package by.lessons.homework.lesson_18.runnable;

import by.lessons.homework.lesson_18.Auto;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Едем параллельно");
            drivePrl();
            Thread.sleep(3000);
            System.out.println("*****************************");


            System.out.println("Едем с остановками");
            driveWithStop();
            Thread.sleep(10000);
            System.out.println("*****************************");

            System.out.println("Все равны, но кто-то равнее");
            driveWithJoin();
            System.out.println("*****************************");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void drivePrl() {
        //1.1 Создать два потока (две машины, которые будут ехать параллельно).
        Auto auto01 = new Auto("MAZ", "0101MZ", 0);
        Auto auto02 = new Auto("BELAZ", "0202BZ", 0);

        Thread thr01 = new Thread(auto01);
        Thread thr02 = new Thread(auto02);

        thr01.start();
        thr02.start();
    }

    public static void driveWithStop() {
        //1.2 Дать возможность каждой машине останавливаться на определённое время. (метод sleep).
        // Передавать в конструктор параметр по остановке, которое будет записываться в поле (время остановки).
        // В последствии поток будет спать переданное время.

        Auto auto01 = new Auto("MAZ", "0101MZ", 500);
        Auto auto02 = new Auto("BELAZ", "0202BZ", 1000);

        Thread thr01 = new Thread(auto01);
        Thread thr02 = new Thread(auto02);
        thr01.start();
        thr02.start();
    }

    public static void driveWithJoin() {
        Auto auto01 = new Auto("MAZ", "0101MZ", 500);
        Auto auto02 = new Auto("BELAZ", "0202BZ", 1000);
        Auto auto03 = new Auto("KAMAZ", "0303KZ", 1500);
        Thread thr01 = new Thread(auto01);
        Thread thr02 = new Thread(auto02);
        Thread thr03 = new Thread(auto03);

        try {
            thr01.start();
            thr01.join();
            thr02.start();
            thr03.start();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
