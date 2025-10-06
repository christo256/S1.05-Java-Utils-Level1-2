package task1_S1_05_JavaUtils_Level2;

import task3and4_S1_05_JavaUtils_Level1.DirectoryListerToFile;
import task3and4_S1_05_JavaUtils_Level1.DirectoryValidator2;
import task3and4_S1_05_JavaUtils_Level1.TextFileReader;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MainDirectoryToFile {

    public static void main(String[] args) {


        ConfigReader config = new ConfigReader("config.properties");
        String directoryPath = config.getDirectoryToRead();
        String outputFilePath = config.getOutputFile();

        File directory = new File(directoryPath);

        if (!DirectoryValidator2.isValid(directory)) {
            System.out.println("The given path is not a valid directory.");
            return;
        }

        try (FileWriter writer = new FileWriter(outputFilePath)) {
            DirectoryListerToFile.listSortedContentToFile(directory, 0, writer);
            writer.flush();
            System.out.println("Directory content saved to: " + outputFilePath);
        } catch (IOException error) {
            System.out.println("Error writing to file: " + error.getMessage());
        }

        File outputFile = new File(outputFilePath);
        TextFileReader.readAndPrintFile(outputFile);
    }
}

