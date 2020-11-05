package com.company.Tests;

import com.company.Animals.Bird;
import com.company.Animals.Eagle;
import com.company.Aviary.*;
import com.company.Zoo;
import org.junit.Assert;
import org.junit.Test;

public class BirdTest {
    @Test
    public void testCountOfAnimalsInTheZoo(){
        Zoo zoo = new Zoo();
        AviaryBird<Eagle> aviaryBird = new AviaryBird<>();
        aviaryBird.setCapacity(6);
        aviaryBird.setAnimals(new Eagle());
        aviaryBird.setAnimals(new Eagle());
        aviaryBird.setAnimals(new Eagle());

        zoo.addCage(aviaryBird);

        zoo.show();

        Assert.assertEquals(3, zoo.getCountOfAnimals());

    }

    @Test
    public void testSetAnimals(){
        AviaryBird<Eagle> aviaryBird = new AviaryBird<>();
        aviaryBird.setCapacity(5);
        aviaryBird.setAnimals(new Eagle());
        aviaryBird.setAnimals(new Eagle());
        aviaryBird.setAnimals(new Eagle());

        AviaryBird<Eagle> aviaryBird2 = new AviaryBird<>();
        aviaryBird2.setCapacity(3);
        aviaryBird2.setAnimals(new Eagle());
        aviaryBird2.setAnimals(new Eagle());

        Assert.assertEquals(3, aviaryBird.getPlaces());
    }

    @Test
    public void testRemoveAnimals(){
        AviaryBird<Eagle> aviaryBird = new AviaryBird<>();
        aviaryBird.setCapacity(4);
        Eagle e1 = new Eagle();
        Eagle e2 = new Eagle();
        aviaryBird.setAnimals(new Eagle());
        aviaryBird.setAnimals(e1);
        aviaryBird.setAnimals(new Eagle());
        aviaryBird.setAnimals(e2);

        aviaryBird.removeAnimal(e1);
        Assert.assertEquals(3, aviaryBird.getPlaces());
        Assert.assertEquals(1, aviaryBird.getEmptyPlaces());
    }

    @Test
    public void testAddCage(){
        Zoo zoo = new Zoo();

        AviaryBird<Bird> aviaryBird = new AviaryBird<>();
        aviaryBird.setCapacity(13);
        aviaryBird.setAnimals(new Eagle());
        aviaryBird.setAnimals(new Eagle());
        aviaryBird.setAnimals(new Eagle());
        zoo.addCage(aviaryBird);

        AviaryBird<Eagle> aviaryBird2 = new AviaryBird<>();
        aviaryBird2.setCapacity(2);
        aviaryBird2.setAnimals(new Eagle());
        zoo.addCage(aviaryBird2);

        AviaryBird<Bird> aviaryBird3 = new AviaryBird<>();
        aviaryBird3.setCapacity(5);
        aviaryBird3.setAnimals(new Eagle());
        aviaryBird3.setAnimals(new Eagle());
        aviaryBird3.setAnimals(new Eagle());

        Assert.assertEquals(4, zoo.getCountOfAnimals());
    }
}
