package com.company;

import com.company.Animals.Bird;
import com.company.Animals.Eagle;
import com.company.Animals.Lion;
import com.company.Aviary.AviaryBird;
import com.company.Aviary.AviaryLion;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Zoo zoo = new Zoo();
        AviaryBird<Bird> aviaryBird = new AviaryBird<>();
        aviaryBird.setCapacity(25);
        aviaryBird.setAnimals(new Eagle());
        aviaryBird.setAnimals(new Eagle());
        aviaryBird.setAnimals(new Eagle());
        aviaryBird.setAnimals(new Eagle());
        zoo.addCage(aviaryBird);
        //zoo.show();

        AviaryLion<Lion> aviaryLion = new AviaryLion<>();
        aviaryLion.setCapacity(10);
        aviaryLion.setAnimals(new Lion());
        aviaryLion.setAnimals(new Lion());
        zoo.addCage(aviaryLion);
        zoo.show();
        System.out.println("Number of all animals: " + zoo.getCountOfAnimals());

    }
}
