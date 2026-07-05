package by.lessons.homework.lesson_19.stream;

public enum Continent {
    ASIA ("Азия"),
    AFRICA ("Африка"),
    NORTH_AMERICA ("Северная Америка"),
    SOUTH_AMERICA ("Южная Америка"),
    ANTARCTICA("Антарктида"),
    EUROPE ("Европа"),
    AUSTRALIA ("Австралия");
    private final String description;

    Continent(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
