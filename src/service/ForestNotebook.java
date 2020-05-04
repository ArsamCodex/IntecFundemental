package service;

import animal_enities.Animal;
import animal_enities.Carnivore;
import animal_enities.Herbivore;
import animal_enities.Omnivore;
import app.NatureApp;
import plant_enities.Plant;


import java.util.*;

public class ForestNotebook {

    private List<Carnivore> carnivores = new ArrayList<>();
    private List<Omnivore> omnivores = new ArrayList<>();
    private List<Herbivore> herbivores = new ArrayList<>();
    private int plantCount;
    private int animalCount;
    private List<Animal> animals = new ArrayList<>();
    private List<Plant> plants = new ArrayList<>();

    public ForestNotebook() {
    }

    public List<Carnivore> getCarnivores() {
        return carnivores;
    }

    public void setCarnivores(List<Carnivore> carnivores) {
        this.carnivores = carnivores;
    }

    public List<Omnivore> getOmnivores() {
        return omnivores;
    }

    public void setOmnivores(List<Omnivore> omnivores) {
        this.omnivores = omnivores;
    }

    public List<Herbivore> getHerbivores() {
        return herbivores;
    }

    public void setHerbivores(List<Herbivore> herbivores) {
        this.herbivores = herbivores;
    }

    public int getPlantCount() {
        return plantCount;
    }

    public int getAnimalCount() {
        return animalCount;
    }

    public void addPlant(Plant plant) {
        this.plants.add(plant);
        plantCount++;

    }

    public void printNotebook() {

        for(Plant plant: plants)
            System.out.println(plant);

        for(Animal animal : animals)
            System.out.println(animal);

    }


    public void sortPlantByHeight() {
        List<Plant> set = new ArrayList<>();
        set.addAll(plants);
        set.sort(new ComparePlantByHeight());
        System.out.println(set);

    }
    public void sortAnimalsByHeight() {
        List<Animal> set = new ArrayList<>();
        set.addAll(animals);
        set.sort(new CompareAnimalByHeight());
        System.out.println(set);

    }
    public void sortAnimalsByName() {
        List<Animal> set = new ArrayList<>();
        set.addAll(animals);
        set.sort(new CompareAnimalByName());
        System.out.println(set);

    }

    public void sortPlantsByName() {
        List<Plant> pl = new ArrayList<>();
        pl.addAll(plants);
        pl.sort(new ComparePlantByHeight());
        System.out.println(pl);

    }


    public void addAnimal(Animal animal) {

            this.animals.add(animal);
            this.animalCount++;
        }
    }