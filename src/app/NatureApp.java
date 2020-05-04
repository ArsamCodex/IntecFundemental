package app;

import animal_enities.Animal;
import animal_enities.Carnivore;
import animal_enities.Herbivore;
import animal_enities.Omnivore;
import plant_enities.*;
import service.ForestNotebook;

import java.util.*;


public class NatureApp {
    public static void main (String [] args) {


        ForestNotebook noteBook = new ForestNotebook();


        Tree TI = new Tree("Apple", 175);
        TI.setLeafType(LeafType.HAND);
        noteBook.addPlant(TI);

        Weed wI = new Weed("SantaMaria", 55);
        wI.setArea(1210);
        noteBook.addPlant(wI);

        Flower fI = new Flower("Tulp", 40);
        fI.setSmell(Scent.PINEAPPLE);
        noteBook.addPlant(fI);


        Bush bI = new Bush("Chenat", 7.5);
        bI.setFruit("Not");
        bI.getName();
        bI.setLeafType(LeafType.HEART);
        noteBook.addPlant(bI);

        Tree tII = new Tree("Kaj", 7000);
        tII.setLeafType(LeafType.SPEAR);
        noteBook.addPlant(tII);

        //JE KAN HIER ALLEN MAAR PLANTEN IJST PRINTEN
    //  noteBook.printNotebook();

        // 10 DIER TOEGEVOVEGD
        Carnivore I = new Carnivore("Lion", 50, 40, 450);
        I.setMaxFoodSize(6500);
        noteBook.addAnimal(I);


        Carnivore II = new Carnivore("Elephant", 700, 220, 120);
        II.setMaxFoodSize(150);
        noteBook.addAnimal(II);

        Carnivore III = new Carnivore("Cat", 50, 700, 2150);
        III.setMaxFoodSize(750);
        noteBook.addAnimal(III);


        Omnivore oI = new Omnivore("Vogel", 51, 30, 25);
        oI.setMaxFoodSize(20);
        oI.setPlantDiet(new HashSet<Plant>(Arrays.asList(tII)));
        noteBook.addAnimal(oI);


        Omnivore oII = new Omnivore("Girrafe", 10, 25, 17);
        oII.setMaxFoodSize(155);
        oII.setPlantDiet(new HashSet<Plant>(Arrays.asList(bI)));
        noteBook.addAnimal(oII);

        Omnivore oIII = new Omnivore("Crow", 15, 20, 19);
        oIII.setMaxFoodSize(21);
        oIII.setPlantDiet(new HashSet<Plant>(Arrays.asList(wI)));
        noteBook.addAnimal(oIII);


        Herbivore hI = new Herbivore("Leopaad", 2000, 1540, 500);
        hI.setPlantDiet(new HashSet<Plant>(Arrays.asList(bI, fI)));
        noteBook.addAnimal(hI);


        Herbivore hII = new Herbivore("Monkey", 510, 20, 300);
        hII.setPlantDiet(new HashSet<Plant>(Arrays.asList(bI, TI)));
        noteBook.addAnimal(hII);


        Herbivore hVI = new Herbivore("Meer", 400, 950, 90);
        hVI.setPlantDiet(new HashSet<Plant>(Arrays.asList(tII, TI)));
        noteBook.addAnimal(hVI);

        Herbivore IV = new Herbivore("Meer", 700, 450, 640);
        IV.setPlantDiet(new HashSet<Plant>(Arrays.asList(tII, TI)));
        noteBook.addAnimal(IV);


        noteBook.printNotebook();
        System.out.println(" NA SORTEER METHODE");
        noteBook.sortAnimalsByName();
        System.out.println(" SORT ANIMAL BY HEIGHT");
        noteBook.sortAnimalsByHeight();
        System.out.println("Compare plants bye heihght");
        noteBook.sortPlantByHeight();




        // COUNTER
        System.out.println("Tottal Planten : " + noteBook.getPlantCount());
        System.out.println("Total Animal   : " + noteBook.getAnimalCount());


    }



}