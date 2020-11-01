package com.company;

import com.company.Animals.*;
import com.company.Aviary.*;
import org.junit.Assert;
import org.junit.Test;

public class Tests {

    @Test
    public void testCountOfAnimalsInTheZoo(){
        Zoo zoo = new Zoo();
        AviaryBird<Bird> aviaryBird= new AviaryBird<>();
        aviaryBird.setCapacity(7);
        aviaryBird.setAnimals(new Eagle());
        aviaryBird.setAnimals(new Eagle());
        aviaryBird.setAnimals(new Eagle());
        aviaryBird.setAnimals(new Eagle());
        zoo.addCage(aviaryBird);

        AviaryLion<Lion> aviaryLion = new AviaryLion<>();
        aviaryLion.setCapacity(2);
        aviaryLion.setAnimals(new Lion());
        aviaryLion.setAnimals(new Lion());

        Assert.assertEquals(4, zoo.getCountOfAnimals());

    }

    @Test
    public void testSetAnimals(){
        AviaryUngulates<Ungulates> aviaryUngulates = new AviaryUngulates<>();
        aviaryUngulates.setCapacity(5);
        aviaryUngulates.setAnimals(new Giraffe());
        aviaryUngulates.setAnimals(new Zebra());
        aviaryUngulates.setAnimals(new Giraffe());

        AviaryLion<Lion> aviaryLion = new AviaryLion<>();
        aviaryLion.setCapacity(3);
        aviaryLion.setAnimals(new Lion());
        aviaryLion.setAnimals(new Lion());

        Assert.assertEquals(3, aviaryUngulates.getPlaces());
    }

    @Test
    public void testRemoveAnimals(){
        AviaryUngulates<Ungulates> aviaryUngulates = new AviaryUngulates<>();
        aviaryUngulates.setCapacity(4);
        Giraffe g1 = new Giraffe();
        Giraffe g2 = new Giraffe();
        aviaryUngulates.setAnimals(new Giraffe());
        aviaryUngulates.setAnimals(g1);
        aviaryUngulates.setAnimals(new Zebra());
        aviaryUngulates.setAnimals(g2);

        aviaryUngulates.removeAnimal(g1);
        Assert.assertEquals(3, aviaryUngulates.getPlaces());
        Assert.assertEquals(1, aviaryUngulates.getEmptyPlaces());
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

        AviaryLion<Lion> aviaryLion = new AviaryLion<>();
        aviaryLion.setCapacity(2);
        aviaryLion.setAnimals(new Lion());
        zoo.addCage(aviaryLion);

        AviaryUngulates<Ungulates> aviaryUngulates = new AviaryUngulates<>();
        aviaryUngulates.setCapacity(5);
        aviaryUngulates.setAnimals(new Giraffe());
        aviaryUngulates.setAnimals(new Zebra());
        aviaryUngulates.setAnimals(new Giraffe());

        Assert.assertEquals(4, zoo.getCountOfAnimals());
    }
}
