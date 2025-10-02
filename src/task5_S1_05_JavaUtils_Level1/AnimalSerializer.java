package task5_S1_05_JavaUtils_Level1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class AnimalSerializer {
    public static void serializerAnimal( Animal animal, String filename) {

        try (ObjectOutputStream out = new OutputStream(new FileOutputStream(filename))) {
            out.writeObject(animal);

            }
        }
    }
}
