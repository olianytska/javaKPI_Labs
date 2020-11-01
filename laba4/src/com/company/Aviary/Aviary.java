package com.company.Aviary;

import com.company.Animals.Animal;

import java.util.ArrayList;

public abstract class Aviary <T extends Animal>{
    private int capacity;
    private final ArrayList<T> animals = new ArrayList<>();

    public void setCapacity(int capacity){
        this.capacity = capacity;
    }

    public int getCapacity(){
        return capacity;
    }

    public void setAnimals(T animal){
        if (capacity == animals.size()) throw new IllegalArgumentException();
        animals.add(animal);
    }

    public void removeAnimal(T animal){
        if (!animals.contains(animal)) throw new IllegalArgumentException();
        animals.remove(animal);
    }

    public int getPlaces(){
        return animals.size();
    }

    public int getEmptyPlaces(){
        return getCapacity() - getPlaces();
    }

}
