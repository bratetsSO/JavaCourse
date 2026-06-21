package by.lessons.homework.lesson_16;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //В классе Main создайте пять счетов. Добавьте эти счета в банк (класс Bank)
        Account account01 = new Account(1, "a0001", "BYN", 1000);
        Account account02 = new Account(2, "a0002", "BYN", 2000);
        Account account03 = new Account(3, "a0003", "BYN", 3000);
        Account account04 = new Account(4, "a0004", "BYN", 4000);
        Account account05 = new Account(5, "a0005", "USD", 5000);
        //Добавьте эти счета в банк (класс Bank)
        Bank bank = new Bank();
        Set<Account> bankAccounts = new HashSet<>();
        bankAccounts.add(account01);
        bankAccounts.add(account02);
        bankAccounts.add(account03);
        bankAccounts.add(account04);
        bankAccounts.add(account05);
        bank.setAccounts(bankAccounts);

        System.out.println("Что имеем - храним!");
        bank.printAccounts();

        System.out.println("********** Нет счета в банке ***********");
        try {
            bank.transferMoney("a0002", "a001", 2500.00);
        } catch (AccountNotFoundException e) {
            System.out.println(e.getErrorCode() + " -> " + e.getMessage());
        } catch (NotEnoughMoneyException e) {
            System.out.println(e.getErrorCode() + " -> " + e.getMessage());
        } finally {
            System.out.println("Спасибо,что воспользовались услугами банка");
        }

        System.out.println("********** Не хватает денег на счету ***********");
        try {
            bank.transferMoney("a0002", "a0001", 2500.00);
        } catch (AccountNotFoundException e) {
            System.out.println(e.getErrorCode() + " -> " + e.getMessage());
        } catch (NotEnoughMoneyException e) {
            System.out.println(e.getErrorCode() + " -> " + e.getMessage());
        } finally {
            System.out.println("Спасибо,что воспользовались услугами банка");
        }

        System.out.println("********** БИНГО! ***********");
        try {
            bank.transferMoney("a0002", "a0001", 500.00);
        } catch (AccountNotFoundException e) {
            System.out.println(e.getErrorCode() + " -> " + e.getMessage());
        } catch (NotEnoughMoneyException e) {
            System.out.println(e.getErrorCode() + " -> " + e.getMessage());
        } finally {
            System.out.println("Спасибо,что воспользовались услугами банка");
        }
        System.out.println("После миграции денег");
        bank.printAccounts();
        System.out.println("********** Валютные махинации ***********");
        try {
            bank.transferMoneyCurrency("a0005", "a0004", 100.00, 2.8);
        } catch (AccountNotFoundException e) {
            System.out.println(e.getErrorCode() + " -> " + e.getMessage());
        } catch (NotEnoughMoneyException e) {
            System.out.println(e.getErrorCode() + " -> " + e.getMessage());
        } finally {
            System.out.println("Спасибо,что воспользовались услугами банка");
        }
        System.out.println("После валютных махинаций");
        bank.printAccounts();

    }
}
