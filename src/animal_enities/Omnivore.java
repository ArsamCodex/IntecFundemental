package animal_enities;

import plant_enities.Plant;

import java.util.HashSet;
import java.util.Set;

public class Omnivore extends  Animal {

    Set<Plant> plantDiet = new HashSet<>();
    private double maxFoodSize;

    public Omnivore(String name) {
        super(name);
    }

    public Omnivore(String name, double weight, double height, double length) {
        super(name, weight, height, length);
    }

    public Set<Plant> getPlantDiet() {
        return plantDiet;
    }

    public void setPlantDiet(Set<Plant> plantDiet) {
        this.plantDiet = plantDiet;
    }

    public double getMaxFoodSize() {
        return maxFoodSize;
    }

    public void setMaxFoodSize(double maxFoodSize) {
        this.maxFoodSize = maxFoodSize;
    }

    public void addPlantToDiet(Plant plant) {
        plantDiet.add(plant);

    }

    @Override
    public String toString() {
        return  " \n" + "Omnivore{" +
                "Name = " + super.getName() +" ,   "+
                "Height = " + super.getHeight() + "  "+
                "Weight = " + super.getWeight() + "   "+
                "Lenght = " + super.getLength() +" -> " +
                "   PlantDiet = " + plantDiet + ","+
                "MaxFoodSize=" + maxFoodSize +" KG"+

                '}';

    }
}
