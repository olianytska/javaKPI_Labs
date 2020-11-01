package com.company.Aviary;

import com.company.Animals.Bird;

public class AviaryBird <T extends Bird> extends Aviary<T>{

    @Override
    public void setCapacity(int capacity) {
        super.setCapacity(capacity);
    }

}
