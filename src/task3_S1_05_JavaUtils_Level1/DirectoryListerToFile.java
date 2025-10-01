package task3_S1_05_JavaUtils_Level1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class DirectoryListerToFile {
    public static void listSortedContentToFile(File directory, int level, FileWriter writer) throws IOException {
        File[] files = directory.listFiles();
        if (files == null || files.length == 0) {
            return;
        }
        Arrays.sort(files, (f1, f2) -> f1.getName().compareToIgnoreCase(f2.getName()));

        for (File file : files) {
            DirectoryPrintToFile.printToFile(file, level, writer);
            if (file.isDirectory()) {
                listSortedContentToFile(file, level + 1, writer);
            }
        }
    }
}

