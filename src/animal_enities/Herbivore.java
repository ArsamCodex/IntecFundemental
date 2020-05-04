package animal_enities;

import plant_enities.Plant;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Herbivore extends Animal   {

    Set<Plant> plantDiet ;

    public Herbivore(String name) {
        super(name);
    }

    public Herbivore(String name, double weight, double height, double length) {
        super(name, weight, height, length);
    }

    public Set<Plant> getPlantDiet() {
        return plantDiet;
    }

    public void setPlantDiet(Set<Plant> plantDiet) {
        this.plantDiet = plantDiet;
    }

    public void addPlanetToDiet(Plant plant){
        //TODO
        this.plantDiet.add(plant);

    }

    public void printDiet(){


    }

    @Override
    public String toString() {
        return "\n" + "Herbivore{" +
                " Name = " + super.getName()+ " , " +
                " Height = " + super.getHeight() +
                " Weight = " + super.getWeight() +
                " Lenght = " + super.getLength()  + " - > "+
                "plantDiet =" + plantDiet +
                '}';
    }
}
