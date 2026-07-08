package by.lessons.homework.lesson_20;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.ThreadLocalRandom;

public class CallFile implements Callable<Collection<String>> {
    //1. Создать задачу Callable, которая генерирует 10 файлов с 10 произвольными строками
    // -> засыпает произвольно на 1-3 секунды,
    // результат выполнения –коллекция имен файлов.

    private final int id;

    //конструктор
    public CallFile(int id) {
        this.id = id;
    }

    @Override
    public Collection<String> call() throws Exception {
        Thread.currentThread().setName("thread_" + this.id);
        String threadName = Thread.currentThread().getName();
        System.out.println("Start => " + threadName);

        Collection<String> files = new ArrayList<>();
        //генерим 10 файлов
        for (int i = 1; i <= 10; i++) {
            String fileName = "task_" + threadName + "_file_" + i + ".txt";
            //String.format("task_%d_file_%d_%s.txt", Id, f, UUID.randomUUID().toString().substring(0, 5));
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
                for (int l = 1; l <= 10; l++) {
                    writer.write("Произвольная строка текста " + l);
                    writer.newLine();
                }
                files.add(fileName);
            } catch (IOException e) {
                System.out.printf("Ошибка записи файла " + fileName + " ->" + e.getMessage());
            }
        }
        // случайная пауза от 1 до 3 секунд
        long sleepTime = ThreadLocalRandom.current().nextLong(1000, 5001);
        System.out.println(threadName + " sleeps " + sleepTime / 1000 + " seconds");

        Thread.sleep(sleepTime);

        System.out.println("Finish => " + threadName);
        return files;
    }
}
