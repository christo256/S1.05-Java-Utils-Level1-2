package task1and2_S1_05_JavaUtils_Level1;

import java.io.File;
import java.util.Arrays;

public class DirectoryLister {
    public static void listSortedContent(File directory, int level) {
        File[] files = directory.listFiles();
        if (files == null || files.length == 0) {
            return;
        }
        Arrays.sort(files, (f1, f2) -> f1.getName().compareToIgnoreCase(f2.getName()));

        for (File file : files) {
            DirectoryPrinter.print(file, level);

            if (file.isDirectory()) {
                listSortedContent(file, level + 1);
            }

        }
    }
}
