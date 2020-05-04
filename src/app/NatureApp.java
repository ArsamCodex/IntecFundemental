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

        // 5 PLANTEN TOEGEVOEGD
        Tree TI = new Tree("Apple", 275);
        TI.setLeafType(LeafType.HAND);
        noteBook.addPlant(TI);

        Weed wI = new Weed("SantaMaria", 87);
        wI.setArea(1210);
        noteBook.addPlant(wI);

        Flower fI = new Flower("Tulp", 42);
        fI.setSmell(Scent.PINEAPPLE);
        noteBook.addPlant(fI);


        Bush bI = new Bush("Chenat", 425);
        bI.setFruit("Pear");
        bI.setLeafType(LeafType.HEART);
        noteBook.addPlant(bI);

        Tree tII = new Tree("SinasAppleSap", 452);
        tII.setLeafType(LeafType.SPEAR);
        noteBook.addPlant(tII);

        //JE KAN HIER ALLEN MAAR PLANTEN IJST PRINTEN
        noteBook.printNotebook();
        System.out.println();
        noteBook.sortPlantsByName();

        // 10 DIER TOEGEVOVEGD
        Carnivore I = new Carnivore("Lion", 50, 40, 450);
        I.setMaxFoodSize(6500);
        noteBook.addAnimal(I);


        Carnivore II = new Carnivore("Elephant", 700, 220, 120);
        II.setMaxFoodSize(150);
        noteBook.addAnimal(II);

        Carnivore III = new Carnivore("Cat", 50, 700, 210);
        III.setMaxFoodSize(750);
        noteBook.addAnimal(III);


        Omnivore oI = new Omnivore("Vogel", 59, 30, 25);
        oI.setMaxFoodSize(20);
        oI.setPlantDiet(new HashSet<>(Arrays.asList(tII)));
        noteBook.addAnimal(oI);


        Omnivore oII = new Omnivore("Girrafe", 10, 205, 17);
        oII.setMaxFoodSize(155);
        oII.setPlantDiet(new HashSet<>(Arrays.asList(bI)));
        noteBook.addAnimal(oII);

        Omnivore oIII = new Omnivore("Vlinder", 605, 70, 19);
        oIII.setMaxFoodSize(21);
        oIII.setPlantDiet(new HashSet<>(Arrays.asList(wI)));
        noteBook.addAnimal(oIII);


        Herbivore hI = new Herbivore("Leopaard", 200, 140, 500);
        hI.setPlantDiet(new HashSet<>(Arrays.asList(bI, fI)));
        noteBook.addAnimal(hI);


        Herbivore hII = new Herbivore("Monkey", 510, 20, 300);
        hII.setPlantDiet(new HashSet<>(Arrays.asList(bI, TI)));
        noteBook.addAnimal(hII);


        Herbivore hVI = new Herbivore("Meer", 40, 90, 12);
        hVI.setPlantDiet(new HashSet<>(Arrays.asList(tII, TI)));
        noteBook.addAnimal(hVI);

        Herbivore IV = new Herbivore("Meer", 41, 450, 640);
        IV.setPlantDiet(new HashSet<>(Arrays.asList(tII, TI)));
        noteBook.addAnimal(IV);

        
          // COUNT ANIMALS EN PLANTS
        System.out.println("ANTAAL PLANTEN   : " + noteBook.getPlantCount());
        System.out.println("AANTAL ANIMALS   : " + noteBook.getAnimalCount());

       // noteBook.printNotebook();
        System.out.println("--------- SORT ANIMALS BY NAME -------");
        noteBook.sortAnimalsByName();
        System.out.println("------ SORT ANIMALS BY HEIGHT -------");
        noteBook.sortAnimalsByHeight();

         System.out.println("--------- SORT PLANT BY NAME ---------");
         System.out.println();
         noteBook.sortPlantsByName();
         System.out.println();

         System.out.println("----- SORT PLANT BY HEIGHT--------");
         System.out.println();
         noteBook.sortPlantByHeight();


    }



}
