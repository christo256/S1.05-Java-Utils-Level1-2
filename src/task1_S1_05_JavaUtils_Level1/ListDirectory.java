package task1_S1_05_JavaUtils_Level1;

import java.io.File;
import java.util.Arrays;

public class ListDirectory {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please provide a directory path as a parameter.");
            return;
        }
        String directoryPath = args[0];
        File directory = new File(directoryPath);

        if (!directory.exists() || !directory.isDirectory()) {
            System.out.println("The given path is not a valid directory.");
            return;
        }
        String[] contentDirectory = directory.list();

        if (contentDirectory == null || contentDirectory.length == 0) {
            System.out.println("The directory is empty");
            return;
        }
        Arrays.sort(contentDirectory);

        for (String fileName : contentDirectory) {
            System.out.println(fileName);
        }
    }
}
