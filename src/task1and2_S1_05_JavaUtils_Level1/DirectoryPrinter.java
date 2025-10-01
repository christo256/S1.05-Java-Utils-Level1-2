package task1and2_S1_05_JavaUtils_Level1;

import java.io.File;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DirectoryPrinter {

    public static final DateTimeFormatter FORMATTER =
            DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")
                    .withZone(ZoneId.systemDefault());


    public static void print(File file, int level) {

        String indent = "  ".repeat(level);
        String type = file.isDirectory() ? "(D)" : "(F)";
        String lastModified = FORMATTER.format(Instant.ofEpochMilli(file.lastModified()));

        System.out.println(indent + file.getName() + " " + type + " - Last Modified: " + lastModified);

    }
}
