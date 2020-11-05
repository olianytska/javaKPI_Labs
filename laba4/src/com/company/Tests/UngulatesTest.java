package com.company.Tests;

import com.company.Animals.*;
import com.company.Aviary.AviaryBird;
import com.company.Aviary.AviaryUngulates;
import com.company.Zoo;
import org.junit.Assert;
import org.junit.Test;

public class UngulatesTest {
    @Test
    public void testCountOfAnimalsInTheZoo(){
        Zoo zoo = new Zoo();
        AviaryUngulates<Zebra> aviaryUngulates = new AviaryUngulates<>();
        aviaryUngulates.setCapacity(6);
        aviaryUngulates.setAnimals(new Zebra());
        aviaryUngulates.setAnimals(new Zebra());
        aviaryUngulates.setAnimals(new Zebra());

        zoo.addCage(aviaryUngulates);

        zoo.show();

        Assert.assertEquals(3, zoo.getCountOfAnimals());

    }

    @Test
    public void testSetAnimals(){
        AviaryUngulates<Ungulates> aviaryUngulates = new AviaryUngulates<>();
        aviaryUngulates.setCapacity(5);
        aviaryUngulates.setAnimals(new Zebra());
        aviaryUngulates.setAnimals(new Giraffe());
        aviaryUngulates.setAnimals(new Zebra());

        AviaryUngulates<Giraffe> aviaryUngulates2 = new AviaryUngulates<>();
        aviaryUngulates2.setCapacity(3);
        aviaryUngulates2.setAnimals(new Giraffe());
        aviaryUngulates2.setAnimals(new Giraffe());

        Assert.assertEquals(3, aviaryUngulates.getPlaces());
    }

    @Test
    public void testRemoveAnimals(){
        AviaryUngulates<Ungulates> aviaryUngulates = new AviaryUngulates<>();
        aviaryUngulates.setCapacity(4);
        Zebra z1 = new Zebra();
        Giraffe g2 = new Giraffe();
        aviaryUngulates.setAnimals(new Giraffe());
        aviaryUngulates.setAnimals(z1);
        aviaryUngulates.setAnimals(new Zebra());
        aviaryUngulates.setAnimals(g2);

        aviaryUngulates.removeAnimal(g2);
        Assert.assertEquals(3, aviaryUngulates.getPlaces());
        Assert.assertEquals(1, aviaryUngulates.getEmptyPlaces());
    }

    @Test
    public void testAddCage(){
        Zoo zoo = new Zoo();

        AviaryUngulates<Ungulates> aviaryUngulates = new AviaryUngulates<>();
        aviaryUngulates.setCapacity(13);
        aviaryUngulates.setAnimals(new Giraffe());
        aviaryUngulates.setAnimals(new Zebra());
        aviaryUngulates.setAnimals(new Giraffe());
        zoo.addCage(aviaryUngulates);

        AviaryUngulates<Zebra> aviaryUngulates2 = new AviaryUngulates<>();
        aviaryUngulates2.setCapacity(2);
        aviaryUngulates2.setAnimals(new Zebra());
        zoo.addCage(aviaryUngulates2);

        AviaryUngulates<Giraffe> aviaryUngulates3 = new AviaryUngulates<>();
        aviaryUngulates3.setCapacity(5);
        aviaryUngulates3.setAnimals(new Giraffe());
        aviaryUngulates3.setAnimals(new Giraffe());
        aviaryUngulates3.setAnimals(new Giraffe());

        Assert.assertEquals(4, zoo.getCountOfAnimals());
    }
}
