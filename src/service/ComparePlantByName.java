package service;

import plant_enities.Plant;

import java.util.Comparator;

public class ComparePlantByName implements Comparator<Plant> {
    @Override
    public int compare(Plant plant, Plant t1) {
        return plant.getName().compareTo(t1.getName());
    }
}
