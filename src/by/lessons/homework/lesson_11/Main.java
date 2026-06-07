package by.lessons.homework.lesson_11;

import by.lessons.homework.lesson_09.Animal;

public class Main {
    public static void main(String[] args) {
        RobotCook robotCook1 = new RobotCook("Coo-1", 125, "Германия", "микроволновка", true);
        RobotCook robotCook2 = new RobotCook("Coo-2", 130, "Германия", "гриль", true);
        RobotSapper robotSapper1 = new RobotSapper("Sap-001", 200, 123654, "карбон", true);
        RobotSapper robotSapper2 = new RobotSapper("Sap-002", 250, 123655, "карбон", true);
        RobotBuilder robotBuilder1 = new RobotBuilder("Bui-01", 555, "Венгрия", "Кельма", "металл", true);
        RobotBuilder robotBuilder2 = new RobotBuilder("Bui-02", 777, "Румыния", "Правило", "алюминий", true);
        robotCook1.repair();
        robotSapper1.repair();
        robotBuilder1.repair();

        System.out.println("============= Выставка роботов =============");
        Showroom showroomRobots = new Showroom();
        showroomRobots.addRobot(robotCook1);
        showroomRobots.addRobot(robotCook2);
        showroomRobots.addRobot(robotSapper1);
        showroomRobots.addRobot(robotSapper2);
        showroomRobots.addRobot(robotBuilder1);
        showroomRobots.addRobot(robotBuilder2);

        showroomRobots.showRobotPossibility(showroomRobots.getRobots());

        System.out.println("============= Выставка инженерных роботов =============");
        RobotIngineer[] showroomIngRobots = {robotBuilder1, robotBuilder2, robotSapper1, robotSapper2};
        for (RobotIngineer x : showroomIngRobots) {
            x.uniquePossibility();
            x.createItem();
        }

        System.out.println("============= Выставка роботов-саперов =============");
        RobotSapper[] showroomSapperRobots = {robotSapper1, robotSapper2};
        for (RobotSapper x : showroomSapperRobots) {
            x.uniquePossibility();
        }
    }
}
