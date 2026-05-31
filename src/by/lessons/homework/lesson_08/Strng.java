package by.lessons.homework.lesson_08;

public class Strng {
    //1.1.Напишите метод, который будет возвращать String и принимать в качестве 1-ого параметра и 2-ого параметра объекты типа String.
    //1.2.В этом методе необходимо выполнить следующую логику.
    // Если строка в 1-ом параметре заканчивается строкой из второго параметра,
    // то необходимо вырезать из строки 1-ого параметра значение строки не включающей строку из второго параметра.
    // Иначе вернуть строку из 1-ого параметра приведённую к верхнему регистру.
    public static String method01(String str1, String str2) {
        String str;
        if (str1.endsWith(str2)) {
            str = str1.substring(0, str1.indexOf(str2));
        } else {
            str = str1.toUpperCase();
        }
        return str;
    }

    //2.1 В тексте после символа каждого слова с индексом k вставить заданную подстроку. Используемые методы (split(), substring())
    //Вынести это в отдельный метод с сигнатурой public String (int k, String text)
    public static String method02(String str, int k, String subStr) {
        //StringBuilder outText= new StringBuilder();
        String outText = "";
        String[] words = str.split(" ");
        for (String word : words) {
            if (word.length() > k) {
                word = word.substring(0, k) + subStr + word.substring(k + 1);
            }
            //outText = new StringBuilder(outText + " " + word);
            outText = outText + " " + word;
        }
        return outText.trim();
    }
    //3.1 Из текста удалить все символы, кроме пробелов, не являющиеся буквами.
    // Между последовательностями подряд идущих букв оставить хотя бы один пробел. (задача с использованием регулярных выражений)
    public static String method03(String str){
        //меняем все, кроме букв (даже цифры) на пробел
        str = str.replaceAll("[^\\p{L}+]", " ").replaceAll("\\s+", " "); // \\p{L}+ - буквы (русские и нерусские) ^ - "переворачивает" правило
        // меняем "много" пробелов на один
        str = str.replaceAll("\\s+", " ");// \\s+ - пробелы
        return str.trim(); //чистим крайние пробелы
    }
}
