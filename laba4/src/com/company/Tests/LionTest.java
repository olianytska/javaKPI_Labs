package com.company.Tests;

import com.company.Animals.*;
import com.company.Aviary.AviaryLion;
import com.company.Zoo;
import org.junit.Assert;
import org.junit.Test;

public class LionTest {
    @Test
    public void testCountOfAnimalsInTheZoo(){
        Zoo zoo = new Zoo();
        AviaryLion aviaryLion= new AviaryLion();
        aviaryLion.setCapacity(7);
        aviaryLion.setAnimals(new Lion());
        aviaryLion.setAnimals(new Lion());
        aviaryLion.setAnimals(new Lion());
        aviaryLion.setAnimals(new Lion());
        zoo.addCage(aviaryLion);

        zoo.show();

        Assert.assertEquals(4, zoo.getCountOfAnimals());

    }

    @Test
    public void testSetAnimals(){
        AviaryLion aviaryLion = new AviaryLion();
        aviaryLion.setCapacity(5);
        aviaryLion.setAnimals(new Lion());
        aviaryLion.setAnimals(new Lion());
        aviaryLion.setAnimals(new Lion());

        AviaryLion aviaryLion2 = new AviaryLion();
        aviaryLion2.setCapacity(3);
        aviaryLion2.setAnimals(new Lion());
        aviaryLion2.setAnimals(new Lion());

        Assert.assertEquals(3, aviaryLion.getPlaces());
    }

    @Test
    public void testRemoveAnimals(){
        AviaryLion aviaryLion = new AviaryLion();
        aviaryLion.setCapacity(4);
        Lion l1 = new Lion();
        Lion l2 = new Lion();
        aviaryLion.setAnimals(new Lion());
        aviaryLion.setAnimals(l1);
        aviaryLion.setAnimals(new Lion());
        aviaryLion.setAnimals(l2);

        aviaryLion.removeAnimal(l1);
        Assert.assertEquals(3, aviaryLion.getPlaces());
        Assert.assertEquals(1, aviaryLion.getEmptyPlaces());
    }

    @Test
    public void testAddCage(){
        Zoo zoo = new Zoo();

        AviaryLion aviaryLion = new AviaryLion();
        aviaryLion.setCapacity(13);
        aviaryLion.setAnimals(new Lion());
        aviaryLion.setAnimals(new Lion());
        aviaryLion.setAnimals(new Lion());
        zoo.addCage(aviaryLion);

        AviaryLion aviaryLion2 = new AviaryLion();
        aviaryLion2.setCapacity(2);
        aviaryLion2.setAnimals(new Lion());
        zoo.addCage(aviaryLion2);

        AviaryLion aviaryLion3 = new AviaryLion();
        aviaryLion3.setCapacity(5);
        aviaryLion3.setAnimals(new Lion());
        aviaryLion3.setAnimals(new Lion());
        aviaryLion3.setAnimals(new Lion());

        Assert.assertEquals(4, zoo.getCountOfAnimals());
    }
}
