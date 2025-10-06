package task1_S1_05_JavaUtils_Level2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    private Properties properties;

    public ConfigReader(String filename) {

        properties = new Properties();

        try (FileInputStream fis = new FileInputStream(filename)) {
            properties.load(fis);
        } catch (IOException error) {
            System.out.println("Error reading config file: " + error.getMessage());
        }
    }

    public String getDirectoryToRead() {
        return properties.getProperty("directoryToRead");
    }

    public String getOutputFile() {
        return properties.getProperty("outputFile");
    }
}
