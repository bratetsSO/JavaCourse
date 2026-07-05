package by.lessons.homework.lesson_18;

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
        auto01.start();
        auto02.start();
    }

    public static void driveWithStop() {
        //1.2 Дать возможность каждой машине останавливаться на определённое время. (метод sleep).
        // Передавать в конструктор параметр по остановке, которое будет записываться в поле (время остановки).
        // В последствии поток будет спать переданное время.

        Auto auto01 = new Auto("MAZ", "0101MZ", 500);
        Auto auto02 = new Auto("BELAZ", "0202BZ", 1000);
        auto01.start();
        auto02.start();
    }

    public static void driveWithJoin() {
        Auto auto01 = new Auto("MAZ", "0101MZ", 500);
        Auto auto02 = new Auto("BELAZ", "0202BZ", 1000);
        Auto auto03 = new Auto("KAMAZ", "0303KZ", 1500);
        try {
            auto01.start();
            auto01.join();
            auto02.start();
            auto03.start();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
