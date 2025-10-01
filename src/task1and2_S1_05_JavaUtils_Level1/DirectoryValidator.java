package task1and2_S1_05_JavaUtils_Level1;

import java.io.File;

public class DirectoryValidator {
    public static boolean isValid(File directory) {
        return directory != null && directory.exists() && directory.isDirectory();
    }
}
