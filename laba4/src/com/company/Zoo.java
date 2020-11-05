package com.company;

import com.company.Animals.Animal;
import com.company.Aviary.Aviary;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    public List<Aviary> cages = new ArrayList<>();

    public int getCountOfAnimals (){
        int counter = 0;
        for (Aviary<? extends Animal> cage:
             cages) {
            counter = counter + cage.getPlaces();
        }
        return  counter;
    }

    public void addCage(Aviary<? extends Animal> cage){
        cages.add(cage);
    }

    public void show(){
        for (Aviary<? extends Animal> cage:
             cages) {
            System.out.println(cage.getClass().getSimpleName());
            System.out.println();
            System.out.println("Capacity: " + cage.getCapacity());
            System.out.println("Empty Places: " + cage.getEmptyPlaces());
            System.out.println("Places: " + cage.getPlaces());
            System.out.println("-----------------------");
        }
    }

}
