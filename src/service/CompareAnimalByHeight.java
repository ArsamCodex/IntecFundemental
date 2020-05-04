package service;

import animal_enities.Animal;

import java.util.Comparator;

public class CompareAnimalByHeight implements Comparator<Animal> {


    @Override
    public int compare(Animal animal, Animal animalII) {
        if (animal.getHeight() < animalII.getHeight()) return -1;
        if (animal.getHeight() > animalII.getHeight()) return 1;
        return 0;
    }
}

