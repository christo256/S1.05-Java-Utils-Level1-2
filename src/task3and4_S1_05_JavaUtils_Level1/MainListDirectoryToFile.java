package task3and4_S1_05_JavaUtils_Level1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MainListDirectoryToFile {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide a directory path and an output file path as a parameter.");
            return;
        }

        String directoryPath = args[0];
        String outputFilePath = args[1];

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


