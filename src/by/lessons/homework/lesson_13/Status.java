package by.lessons.homework.lesson_13;

public enum Status {
    ACTIVE("Активный"),
    NOT_ACTIVE("Неактивный");
    private final String description;
    //конструктор
    Status(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
