package by.lessons.homework.lesson_20;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) {
        //Запустить 10 задач параллельно в пуле из 3 потоков. Вывести ход программы на экран с указанием имени потока, который выполняет работу.
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        List<Future<Collection<String>>> futures = new ArrayList<>();

        System.out.println("Запуск 10 задач CallFile");

        // Отправляем 10 экземпляров класса на выполнение
        for (int i = 1; i <= 10; i++) {
            CallFile callFile = new CallFile(i);
            futures.add(executorService.submit(callFile));
        }

        for (int i = 0; i < futures.size(); i++) {
            try {
                Collection<String> fileNames = futures.get(i).get();
                System.out.print("Результат задачи " + (i + 1) + " => ");
                System.out.println(fileNames);
            } catch (Exception e) {
                System.out.println("Ошибка" + e.getMessage());
            }
        }
        // Закрываем пул
        executorService.shutdown();
    }
}
