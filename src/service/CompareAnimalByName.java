package service;

import animal_enities.Animal;

import java.util.Comparator;

public class CompareAnimalByName  implements Comparator<Animal> {



    @Override
    public int compare(Animal animal, Animal t1) {
        return animal.getName().compareTo(t1.getName());
    }

}



