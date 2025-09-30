package task1_S1_05_JavaUtils_Level1;

import java.io.File;
import java.util.Arrays;

public class DirectoryLister {
    public static String[] listSortedContent(File directory) {
        String[] content = directory.list();
        if (content != null) {
            Arrays.sort(content);
        }
        return content;
    }
}
