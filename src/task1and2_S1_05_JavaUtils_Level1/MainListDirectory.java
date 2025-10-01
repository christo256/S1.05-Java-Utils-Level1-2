package task1and2_S1_05_JavaUtils_Level1;

import java.io.File;

public class MainListDirectory {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please provide a directory path as a parameter.");
            return;
        }

        String directoryPath = args[0];
        File directory = new File(directoryPath);

        if (!DirectoryValidator.isValid(directory)) {
            System.out.println("The given path is not a valid directory.");
            return;
        }

        DirectoryLister.listSortedContent(directory, 0);
    }
}

