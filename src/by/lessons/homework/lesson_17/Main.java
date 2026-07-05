package by.lessons.homework.lesson_17;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        String text = "The Rostóvs knew everybody in Moscow. The old count had money enough that year, as all his estates had been remortgaged, and so Nicholas, acquiring a trotter of his own, very stylish riding breeches of the latest cut, such as no one else yet had in Moscow, and boots of the latest fashion, with extremely pointed toes and small silver spurs, passed his time very gaily. After a short period of adapting himself to the old conditions of life, Nicholas found it very pleasant to be at home again. He felt that he had grown up and matured very much. His despair at failing in a Scripture examination, his borrowing money from Gavríl to pay a sleigh driver, his kissing Sónya on the sly—he now recalled all this as childishness he had left immeasurably behind. Now he was a lieutenant of hussars, in a jacket laced with silver, and wearing the Cross of St. George, awarded to soldiers for bravery in action, and in the company of well-known, elderly, and respected racing men was training a trotter of his own for a race. He knew a lady on one of the boulevards whom he visited of an evening. He led the mazurka at the Arkhárovs’ ball, talked about the war with Field Marshal Kámenski, visited the English Club, and was on intimate terms with a colonel of forty to whom Denísov had introduced him.";

        //относительный путь
        writeFile("testFolder\\relPath.txt", text);
        readFile("testFolder\\relPath.txt");

        //абсолютный путь
        writeFile("E:\\testFolder\\relPath.txt", text);
        readFile("E:\\testFolder\\relPath.txt");
    }

    public static void writeFile(String filePathName, String fileText) {
        File file = new File(filePathName);
        try (FileWriter fileWriter = new FileWriter(file)) {
            fileWriter.write(fileText);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Ошибка");
        }
    }

    public static void readFile(String filePathName) {
        File file = new File(filePathName);
        try (FileReader fileReader = new FileReader(file)) {
            BufferedReader bufferedReader = new BufferedReader(fileReader); //
            String fileText = bufferedReader.readAllAsString();
            System.out.println(fileText);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Ошибка");
        }
    }
}
