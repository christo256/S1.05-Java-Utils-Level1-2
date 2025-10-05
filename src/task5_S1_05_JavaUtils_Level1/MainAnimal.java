package task5_S1_05_JavaUtils_Level1;

public class MainAnimal {
    public static void main(String[] args) {

        String filename = "animal.ser";

        Animal animal = new Animal("Michi", "Cat");

        AnimalSerializer.serializerAnimal(animal, filename);

        Animal deserializedAnimal = AnimalDeserializer.deserializerAnimal(filename);

        System.out.println("Deserialized object: " + deserializedAnimal);

    }
}
