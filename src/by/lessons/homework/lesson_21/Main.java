package by.lessons.homework.lesson_21;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class Main {
    public static void main(String[] args) {

        LocalDateTime currentDateTime = LocalDateTime.now();
        //1. Вывести текущую дату в формате (пример формата: 1 апреля 2023). На выходе дата должна быть класса String
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        System.out.println(currentDateTime.format(dateTimeFormatter));
        //2. Вывести текущую дату в формате (пример формата: 1 апреля 2023, 10:59:20 PM). На выходе дата должна быть класса String
        dateTimeFormatter = DateTimeFormatter.ofPattern("dd MMMM yyyy, HH:mm:ss a"); //a - признак AM/PM
        System.out.println(currentDateTime.format(dateTimeFormatter));
        //3. Перевести String (2023-03-19 : 10:12:24 AM) в формат LocalDateTime по умолчанию:
        dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd : HH:mm:ss a"); //a - признак AM/PM
        System.out.println(currentDateTime.format(dateTimeFormatter));
        //4. Перевести String (пн 20.03.23 г. время: 15:07:28  ) в формат LocalDateTime по умолчанию:
        dateTimeFormatter = DateTimeFormatter.ofPattern("E dd.MM.yy 'г. время' : HH:mm:ss"); //a - признак AM/PM; E - короткое имя дня недели
        System.out.println(currentDateTime.format(dateTimeFormatter));
        //5. *Вывести текущую дату в формате (пример формата: понедельник 20 марта 2023 время: 11.54.06 PM). На выходе дата должна быть класса String
        dateTimeFormatter = DateTimeFormatter.ofPattern("EEEE dd MMMM yyyy ' время' : HH:mm:ss a"); //a - признак AM/PM, EEEE - длинное имя дня недели
        System.out.println(currentDateTime.format(dateTimeFormatter));
        //DateTimeFormatterBuilder
    }
}
