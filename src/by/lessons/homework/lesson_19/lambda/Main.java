package by.lessons.homework.lesson_19.lambda;

public class Main {
    public static void main(String[] args) {
        //1.1 На основании этого интерфейса создать лямбда выражение,
        // которое будет возвращать строку с большими буквами.
        BigStr bStr01 = (str) -> {
            System.out.println(str);
            System.out.println("Начинаем волшебство => ");
            return str.toUpperCase();
        };
        String str01 = "маленькая строка, маленькая строка";
        System.out.println(bStr01.bigStr(str01));
    }

    public static String bs01 (BigStr bs, String str){
        return bs.bigStr(str);
    }
}
