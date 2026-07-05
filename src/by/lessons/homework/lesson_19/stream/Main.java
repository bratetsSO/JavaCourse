package by.lessons.homework.lesson_19.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<City> cities = List.of(
                // EUROPE
                new City(1, "Лондон", 8980000, Continent.EUROPE),
                new City(2, "Париж", 11200000, Continent.EUROPE),
                new City(3, "Берлин", 3700000, Continent.EUROPE),

                // ASIA
                new City(4, "Токио", 37400000, Continent.ASIA),
                new City(5, "Дели", 32900000, Continent.ASIA),
                new City(6, "Пекин", 21700000, Continent.ASIA),

                // NORTH AMERICA
                new City(7, "Нью-Йорк", 8330000, Continent.NORTH_AMERICA),
                new City(8, "Мехико", 22200000, Continent.NORTH_AMERICA),
                new City(9, "Лос-Анджелес", 3800000, Continent.NORTH_AMERICA),

                // SOUTH AMERICA
                new City(10, "Сан-Паулу", 22600000, Continent.SOUTH_AMERICA),
                new City(11, "Буэнос-Айрес", 15300000, Continent.SOUTH_AMERICA),

                // AFRICA
                new City(12, "Каир", 22100000, Continent.AFRICA),
                new City(13, "Лагос", 15900000, Continent.AFRICA),

                // AUSTRALIA
                new City(14, "Сидней", 5300000, Continent.AUSTRALIA),
                new City(15, "Мельбурн", 5000000, Continent.AUSTRALIA)
        );

        //1.2. Найти самый густонаселённый город на континенте (filter по континенту+ max)
        System.out.println("самый густонаселённый город на континенте");
        Arrays.stream(Continent.values()).forEach(currentContinent -> {// перебираем континенты
            cities.stream().filter(city -> city.getContinent() == currentContinent)//отсекаем города по континенту
                    .max(Comparator.comparingInt(City::getPopulation))//ищем самый населенный
                    .ifPresent(city -> System.out.println(currentContinent.getDescription() + " => " + city.getName() + "(" + city.getPopulation() + ")"));
        });
        System.out.println("***************************************");
        //1.3. Найти город, с минимальным населением на континенте. (filter по континенту+ min)
        System.out.println("город, с минимальным населением на континенте");
        Arrays.stream(Continent.values()).forEach(currentContinent -> {// перебираем континенты
            cities.stream().filter(city -> city.getContinent() == currentContinent)//отсекаем города по континенту
                    .min(Comparator.comparingInt(City::getPopulation))//ищем самый населенный
                    .ifPresent(city -> System.out.println(currentContinent.getDescription() + " => " + city.getName() + "(" + city.getPopulation() + ")"));
        });
        System.out.println("***************************************");
        //1.4. Найти самый густонаселённый город (max)
        System.out.println("самый густонаселённый город");
        cities.stream()
                .max(Comparator.comparingInt(City::getPopulation))
                .ifPresent(city -> System.out.println(city.getName() + "(" + city.getPopulation() + ")"));

        System.out.println("***************************************");
        //1.5. Найти город с самым маленьким населением. (min)
        System.out.println("город с самым маленьким населением");
        cities.stream()
                .min(Comparator.comparingInt(City::getPopulation))
                .ifPresent(city -> System.out.println(city.getName() + "(" + city.getPopulation() + ")"));
        System.out.println("***************************************");
        //1.6. Найти первый попавшиеся город, у которого население больше 1млн. (filter + findFirst).
        System.out.println("первый попавшиеся город, у которого население больше 1млн");
        cities.stream()
                .filter(city -> city.getPopulation() > 1000000)
                .findFirst()
                .ifPresent(city -> System.out.println(city.getName() + "(" + city.getPopulation() + ")"));

        System.out.println("***************************************");
        //1.7 Отобрать города с населением больше 1 млн. (filter).
        System.out.println("города с населением больше 1 млн - вариант 1");
        System.out.println(cities.stream()
                .filter(city -> city.getPopulation() > 1000000).toList());
        System.out.println("города с населением больше 1 млн - вариант 2");
        List<City> milCity = cities.stream()
                .filter(city -> city.getPopulation() > 1000000).collect(Collectors.toList()); //можно просто toList()
        milCity.forEach(city -> System.out.println(city.getName() + "(" + city.getPopulation() + ")"));

        System.out.println("***************************************");
        //1.8. Создать коллекцию из названий городов, на основании объектов (map)
        System.out.println("коллекцию из названий городов, на основании объектов");
        System.out.print("Вариант 1 => ");
        List<String> cityNames = cities.stream()
                .map(City::getName)
                .toList();
        System.out.println(cityNames);
        System.out.print("Вариант 2 => ");
        String cityNamesLine = cities.stream()
                .map(City::getName)
                .collect(Collectors.joining(", "));
        System.out.println(cityNamesLine);
    }
}
