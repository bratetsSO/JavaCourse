package by.lessons.homework.lesson_09;

public class Zoo {
    //1.3 Создать класс Зоопарк в котором будут жить наши животные. В качестве поля в новом классе будет массив из животных (private Animal[]animals).
    private Animal[] animals = new Animal[0];
    //1.4 Реализовать метод в классе зоопарк по добавлению нового животного.
    // Сигнатура метода будет такая: public void addAnimal(Animal animal);
    // Данный метод должен будет скопировать текущий массив с животными в новый массив с животными.
    // Размерность нового массива должна увеличиться на 1, так как метод добавляет новое животное.
    // Полученный массив нужно перезаписать в поле animals в классе Зоопарк.

    public void addAnimal(Animal animal) {
        // создаем новый массив, с длинной больше на 1
        Animal[] newAnimals = new Animal[this.animals.length + 1];
        // переносим "старый" массив в "новый"
        for (int i = 0; i < this.animals.length; i++) {
            newAnimals[i] = this.animals[i];
        }
        // добавляем новое животное
        newAnimals[newAnimals.length - 1] = animal;
        //newAnimals[this.animals.length + 1] = animal;
        //переписываем старый массив на новый
        this.animals = newAnimals;
    }

    public void removeAnimalById(int id) {
        //ищем животное с заданным id
        int searchInd = -1; // -1, т.к. индекс в массиве начинается с 0
        for (int i = 0; i < animals.length; i++) {
            if (animals[i].getId() == id) {
                searchInd = i;
                break;
            }
        }
        if (searchInd != -1) {
            Animal[] newAnimals = new Animal[animals.length - 1]; // новый массив, длинной меньше на 1
            int j = 0; //индекс для нового массива
            for (int i = 0; i < animals.length; i++) {
                if (i == searchInd) { // пропускаем "удаленное" животное
                    continue;
                }
                newAnimals[j] = animals[i];
                j++;
            }
            animals = newAnimals;
            System.out.println("Животное с Id = " + id + " удалено");
        } else {
            System.out.println("Животное с Id = " + id + " не найдено в зоопарке");
        }
    }

    public void showAnimals(Animal[] animals) {
        System.out.println("Сегодня в нашем зоопарке:");
        for (Animal x : animals) {
            System.out.println(x.toString());
        }
    }

    //1.5 Реализовать метод getAnimals в классе зоопарк который будет возвращать всех животных в зоопарке.
    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }
}
