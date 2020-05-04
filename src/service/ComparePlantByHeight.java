package service;

import plant_enities.Plant;

import java.util.Comparator;

public class ComparePlantByHeight implements Comparator<Plant> {
    @Override
    public int compare(Plant plant, Plant t1) {
        if (plant.getHeight() < t1.getHeight()) return -1;
        if (plant.getHeight() > t1.getHeight()) return 1;
        return 0;
    }
}
