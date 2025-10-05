package task5_S1_05_JavaUtils_Level1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class AnimalDeserializer {

    public static Animal deserializerAnimal(String filename) {

        try {
            FileInputStream fileIn = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(fileIn);

            Animal animal = (Animal) in.readObject();

            in.close();
            fileIn.close();

            return animal;

        } catch (IOException | ClassNotFoundException error) {
            error.printStackTrace();
            return null;
        }
    }
}
