package by.lessons.homework.lesson_16;

import by.lessons.homework.lesson_13.Student;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Bank {
    //2. Создать класс Банк.
    // В классе банка будет одно поле: коллекция из счетов (Set<Account> accounts)
    private static Set<Account> accounts = new HashSet<>();

    public Set<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(Set<Account> accounts) {
        this.accounts = accounts;
    }

    //5 В классе банк реализовать метод перевода денежных средств с одного счёта на другой.
    //5.1 Если в банке отсутствует номер счёта с которого переводят деньги или номер счёта куда переводят деньги,
    //выбрасывает своё исключение AccountNotFoundException с errorCode= not.found.account
    //5.2 Если на счёте, с которого переводят деньги, сумма меньше переводимой
    //то выбросить своё исключение NotEnoughMoneyException с errorCode=not.enough.money.
    //5.3  Соответственно выполните логику перевода денег в белорусской валюте
    //(отнимаете переводимую сумму со счёта, с которого идёт перевод и прибавляете сумму перевода счёту,
    //на который происходит перевод. При этом сначала надо найти счета по переданным номерам в банке.
    public void transferMoney(String accountNumberFrom, String accountNumberTo, Double amount) {
        if (getAccountByNumber(accountNumberTo) == null || getAccountByNumber(accountNumberFrom) == null) {
            throw new AccountNotFoundException("Откройте счёт в нашем банке для выполнения переводов", "not.found.account");
        }
        Account accountFrom = getAccountByNumber(accountNumberFrom);
        if (accountFrom.getAmount() < amount) {
            throw new NotEnoughMoneyException("Недостаточно средств для перевода", "not.enough.money");
        }
        Account accountTo = getAccountByNumber(accountNumberTo);
        accountFrom.setAmount(accountFrom.getAmount() - amount);//снимаем деньги со счета
        accountTo.setAmount(accountTo.getAmount() + amount);// переводим на другой
    }

    //получаем счет по номеру
    public static Account getAccountByNumber(String accountNumber) {
        Account account = null;
        for (Account a : accounts) {
            if (Objects.equals(a.getNumber(), accountNumber)) {
                account = a;
                break;
            }
        }
        return account;
    }

    public void printAccounts() {
        for (Account a : accounts) {
            System.out.println(a.toString());
        }
    }

    //*В классе банк реализуйте метод перевода денег со счёта на счёт,
    //который будет работать со счетами, у которых разные валюты (USD и BYN). Сигнатура метода такая:
    //public void transferMoney(String  accountNumberFrom, String accountNumberTo, Double amount, double exchangeRate).
    // exchangeRate это курсовая разница между долларом и белорусским рублём. Проверки выполните те же что и в пункте 5.
    public void transferMoneyCurrency(String accountNumberFrom, String accountNumberTo, Double amount, double exchangeRate) {
        if (getAccountByNumber(accountNumberTo) == null || getAccountByNumber(accountNumberFrom) == null) {
            throw new AccountNotFoundException("Откройте счёт в нашем банке для выполнения переводов", "not.found.account");
        }
        Account accountFrom = getAccountByNumber(accountNumberFrom); //счет "откуда"
        if (accountFrom.getAmount() < amount) {
            throw new NotEnoughMoneyException("Недостаточно средств для перевода", "not.enough.money");
        }
        Account accountTo = getAccountByNumber(accountNumberTo); // счет "куда"

        if (Objects.equals(accountFrom.getCurrency(), accountTo.getCurrency())) { //валюты совпадают
            accountFrom.setAmount(accountFrom.getAmount() - amount);//снимаем деньги со счета
            accountTo.setAmount(accountTo.getAmount() + amount);// переводим на другой
        } else if (Objects.equals(accountFrom.getCurrency(), "BYN")) { // переводи белки в доллары
            accountFrom.setAmount(accountFrom.getAmount() - amount);//снимаем деньги со счета
            accountTo.setAmount(accountTo.getAmount() + amount / exchangeRate);// переводим на другой
        } else { // переводим доллары в белки
            accountFrom.setAmount(accountFrom.getAmount() - amount);//снимаем деньги со счета
            accountTo.setAmount(accountTo.getAmount() + amount * exchangeRate);// переводим на другой
        }
    }
}
