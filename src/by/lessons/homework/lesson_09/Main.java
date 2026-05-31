package by.lessons.homework.lesson_09;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //1.1 Создать по объекту соответствующих классов продемонстрировать поведение собак и птиц. (вызвать соответствующие методы в классах собака и птица)
        Dog dog1 = new Dog("черный", 12, "мясо", "Жуля", "двортерьер", 25.5);
        dog1.bite();
        dog1.jump();
        dog1.makeSound();
        System.out.println(dog1);

        Bird bird1 = new Bird("черно-белая", 8, "насекомые", "сорока", 500);
        bird1.incubate();
        bird1.makeSound();
        System.out.println(bird1);
//1.6 Используя метод по добавлению животного в зоопарк (п.1.4) добавить по три собаки и по три птицы.
// (Выполнять это в методе Main, создав соответствующие объекты зоопарка, птиц, собак и т.д.)
        Zoo zoo = new Zoo();
        Dog dog2 = new Dog("бежевый", 11, "мясо", "Чейз", "чихуахуа", 10);
        Dog dog3 = new Dog("черно-серый", 11, "мясо", "Алый", "овчарка", 20);
        Bird bird2 = new Bird("черно-серый", 5, "насекомые", "галка", 600);
        Bird bird3 = new Bird("коричневый", 3, "насекомые", "воробей", 300);

        zoo.addAnimal(dog1);
        zoo.addAnimal(dog2);
        zoo.addAnimal(dog3);

        zoo.addAnimal(bird1);
        zoo.addAnimal(bird2);
        zoo.addAnimal(bird3);
        // выводи данные о животный в зоопарке
        zoo.showAnimals(zoo.getAnimals());
        System.out.println("==========================================");
        //1.7 Получить всех животных из зоопарка.
        // Пройтись по всем животным в зоопарке и вызвать методы (издание звуков, животное играет).
        // У вас должны вывестись соответствующие реализации для 3 собак и для трёх птиц(Выполнять это в методе Main)
        System.out.println("Животные поют и играют (все - "+ zoo.getAnimals().length+"):");
        for (Animal x : zoo.getAnimals()) {
            x.makeSound();
            x.play();
        }
        System.out.println("==========================================");
        // 1.8 Добавить трех львов в зоопарк. У вас должно быть девять животных в зоопарке.
        // Ещё раз пройдитесь по всем животным и вызовите методы (издание звуков, животное играет)..
        // У вас должны вывестись соответствующие реализации для 3 собак, для трёх птиц и 3 львов (Выполнять это в методе Main)
        Lion lion1 = new Lion("рыжий", 15, "мясо", "Лёва");
        Lion lion2 = new Lion("рыжий", 15, "мясо", "Бонифаций");
        Lion lion3 = new Lion("рыжий", 15, "мясо", "Никодим");

        zoo.addAnimal(lion1);
        zoo.addAnimal(lion2);
        zoo.addAnimal(lion3);
        System.out.println("Животные поют и играют (уже со львами - "+ zoo.getAnimals().length+"):");
        for (Animal x : zoo.getAnimals()) {
            x.makeSound();
            x.play();
        }
        // 1.9
        System.out.println("==========================================");
        System.out.println("Еще все здесь");
        zoo.showAnimals(zoo.getAnimals());
        int removeId = 8;
        zoo.removeAnimalById(removeId);
        System.out.println(removeId + "-ки больше неееееет");
        zoo.showAnimals(zoo.getAnimals());
    }
}
