package by.lessons.homework.lesson_16;

import java.text.DecimalFormat;
import java.util.Objects;

public class Account {
    //1. Создать класс счёт (Account). Поля идентификатор счёта (id), номер счёта, валюта счёт (String), сумма счёта (Double).
    //Выполнить переопределение equals и hashcode по двум полям (id и номер счёта), так как логически, эти поля будут уникальными для каждого счёта.
    private int id;
    private String number;
    private String currency;
    private double amount;

    public Account(int id, String number, String currency, double amount) {
        this.id = id;
        this.number = number;
        this.currency = currency;
        this.amount = amount;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.00");
        return "Счет {" +
                "id=" + id +
                ", номер ='" + number + '\'' +
                ", валюта ='" + currency + '\'' +
                ", сумма = " + df.format(amount) +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Account account = (Account) object;
        return id == account.id && number == account.number;
    }

    @Override
    public int hashCode() {
        //return Objects.hash(id, number);
        return id * 100 + number.hashCode();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
