package level2.ex6;

import level2.ex4.Animal;

import java.util.List;

public class Zoo {
    private List<Animal> animals = null;

    public Zoo(List<Animal> animals) {
        this.animals = animals;
    }

    public List<Animal> getAnimals() {return animals;}

    public Animal getAnimalByIndex(int index) {
        return (animals.get(index));
    }
}
