package task3and4_S1_05_JavaUtils_Level1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TextFileReader {

    public static void readAndPrintFile(File file) {

        if (file == null || !file.exists() || !file.isFile()) {
            System.out.println("Invalid file provided");
            return;
        }
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException error) {
            System.out.println("Error reading file: " + error.getMessage());
        }
    }
}

