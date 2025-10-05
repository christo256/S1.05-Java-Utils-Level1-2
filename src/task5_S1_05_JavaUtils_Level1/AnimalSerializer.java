package task5_S1_05_JavaUtils_Level1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class AnimalSerializer {
    public static void serializerAnimal(Animal animal, String filename) {

        try {
            FileOutputStream fileOut = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);

            out.writeObject(animal);

            out.close();
            fileOut.close();

            System.out.println("Animal saved in: " + filename);

        } catch (IOException error) {
            error.printStackTrace();
        }
    }
}
