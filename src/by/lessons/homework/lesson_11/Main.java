package by.lessons.homework.lesson_11;

public class Main {
    public static void main(String[] args) {
        RobotCook robotCook = new RobotCook("Coo-1",125,"Германия","микроволновка",true);
        RobotSapper robotSapper= new RobotSapper("Sap-001",200,123654,"карбон", true);
        RobotBuilder robotBuilder = new RobotBuilder("Bui-01",555,"Венгрия", "Кельма", "металл", true);
        robotCook.repair();
        robotSapper.repair();
        robotBuilder.repair();
    }
}
