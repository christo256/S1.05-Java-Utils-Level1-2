package task3_S1_05_JavaUtils_Level1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DirectoryPrintToFile {

    public static final DateTimeFormatter FORMATTER =
            DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")
                    .withZone(ZoneId.systemDefault());


    public static void print(File file, int level) {

        String indent = "  ".repeat(level);
        String type = file.isDirectory() ? "(D)" : "(F)";
        String lastModified = FORMATTER.format(Instant.ofEpochMilli(file.lastModified()));

        System.out.println(indent + file.getName() + " " + type + " - Last Modified: " + lastModified);

    }
    public static void printToFile(File file, int level, FileWriter writer) throws IOException {
        String indent = "  ".repeat(level);
        String type = file.isDirectory() ? "(D)" : "(F)";
        String lastModified = FORMATTER.format(Instant.ofEpochMilli(file.lastModified()));
        writer.write(indent + file.getName() + " " + type + " - Last Modified: " + lastModified + "\n");
    }
}
