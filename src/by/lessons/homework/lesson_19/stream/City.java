package by.lessons.homework.lesson_19.stream;

public class City {
    //2. Создать класс Город. Поля id, имя города, население, континент (Enum)
    private Integer id;
    private String name;
    private Integer population;
    private Continent continent;

    public City(Integer id, String name, Integer population, Continent continent) {
        this.id = id;
        this.name = name;
        this.population = population;
        this.continent = continent;
    }

    @Override
    public String toString() {
        return "City {" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", population=" + population +
                ", continent=" + continent.getDescription() +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    public Continent getContinent() {
        return continent;
    }

    public void setContinent(Continent continent) {
        this.continent = continent;
    }
}
