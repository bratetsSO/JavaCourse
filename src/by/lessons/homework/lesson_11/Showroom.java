package by.lessons.homework.lesson_11;

import by.lessons.homework.lesson_09.Animal;

public class Showroom{

    Robot[] robots = new Robot[0];

    public void addRobot(Robot robot) {
        // создаем новый массив, с длинной больше на 1
        Robot[] newRobots = new Robot[this.robots.length + 1];
        // переносим "старый" массив в "новый"
        for (int i = 0; i < this.robots.length; i++) {
            newRobots[i] = this.robots[i];
        }
        // добавляем нового робота
        newRobots[newRobots.length - 1] = robot;
        //newAnimals[this.animals.length + 1] = animal;
        //переписываем старый массив на новый
        this.robots = newRobots;
    }

    public Robot[] getRobots() {
        return robots;
    }

    public void showRobotPossibility(Robot[] robots) {
        System.out.println("Сегодня на выставке роботов:");
        for (Robot x : robots) {
            x.uniquePossibility();
        }
    }

}
