package zadania.zadanie30;

import java.io.*;
import java.util.*;

/**
 * Napisz program, który odczyta dowolny plik i zapisze go w tym samym folderze.
 * Zawartość jak i tytuł nowego pliku powinny być odwrócone (od tyłu).
 */
public class Zadanie30 {

    public static void main(String[] args) throws IOException {
        var filename = "zadanie30";

        Zadanie30 zadanie30 = new Zadanie30();

        //odczytanie pliku
        var list = zadanie30.readByBufferedReader(filename);

        //odwrócenie listy
        Collections.reverse(list);
        var output = list.stream().map(zadanie30::reverseString).toList();

        //zapis pliku
        zadanie30.writeByBufferedWriter(output, zadanie30.reverseString(filename));
    }

    public String reverseString(String s) {
        var filenameListString = new ArrayList<>(Arrays.asList(s.split("")));
        Collections.reverse(filenameListString);
        StringBuilder stringBuilder = new StringBuilder();
        for (String b : filenameListString) {
            stringBuilder.append(b);
        }
        return stringBuilder.toString();
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

    public void readFileByScanner() throws FileNotFoundException {
        File file = new File("src/main/resources/zadanie30");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        scanner.close();
    }

    public void readByFileReader() throws IOException {
        FileReader fileReader = new FileReader("src/main/resources/zadanie30");
        System.out.println(fileReader.read());
    }
}
