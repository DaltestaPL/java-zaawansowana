package zadania.zadanie31;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * ZADANIE 31.
 * Napisz program, który policzy wystąpienia każdego słowa w pliku tekstowym a
 * następnie wyniki zapisze w formie tabelki w nowym pliku.
 */
public class Zadanie31 {

    public static void main(String[] args) {
        Zadanie31 z = new Zadanie31();

        var words = z.readByBufferedReader("words");
        var wordsMap = new HashMap<String, Integer>();

//        for (String s : words) {
//            if (wordsMap.containsKey(s)) {
//                wordsMap.put(s, wordsMap.get(s) + 1);
//            } else {
//                wordsMap.put(s, 1);
//            }
//        }

        words.forEach(word -> {
            if (wordsMap.containsKey(word)) wordsMap.put(word, wordsMap.get(word) + 1);
            else wordsMap.put(word, 1);
        });

        var keys = wordsMap.keySet();

        var output = new ArrayList<String>();
        output.add("| słowo | liczbaWystąpień |");
        for (String key : keys) {
            var value = wordsMap.get(key);
            output.add("|" + key + "|" + value + "|");
        }
        z.writeByBufferedWriter(output, "tabela");
    }

    public List<String> readByBufferedReader(String fileName) {
        List<String> lines = new ArrayList<>();
        try (BufferedReader bufferedReader =
                     new BufferedReader(new FileReader("src/main/resources/" + fileName))) {
            boolean read = true;
            while (read) {
                var line = bufferedReader.readLine();
                if (line == null) {
                    read = false;
                } else {
                    lines.add(line);
                }
            }
        } catch (IOException e) {
            System.out.println("Wystąpił błąd podczas czytania pliku");
            e.printStackTrace();
        }
        return lines;
    }

    public void writeByBufferedWriter(List<String> lines, String fileName) {
        try(BufferedWriter bufferedWriter =
                    new BufferedWriter(new FileWriter("src/main/resources/" + fileName))) {
            for (String line : lines) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            System.out.println("Wystąpił błąd przy zapisie pliku");
            e.printStackTrace();
        }
    }
}
