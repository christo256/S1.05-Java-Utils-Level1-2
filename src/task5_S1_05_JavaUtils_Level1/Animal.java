package task5_S1_05_JavaUtils_Level1;

import java.io.Serial;
import java.io.Serializable;

public class Animal implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private String name;
    private String species;

    public Animal(String name, String species) {
        this.name = name;
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", species='" + species + '\'' +
                '}';
    }
}
