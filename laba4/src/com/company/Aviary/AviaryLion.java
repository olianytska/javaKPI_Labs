package com.company.Aviary;

import com.company.Animals.Animal;
import com.company.Animals.Lion;
import com.company.Animals.Mammal;

public class AviaryLion <T extends Lion> extends AviaryMammal<T>{
    @Override
    public void setCapacity(int capacity) {
        super.setCapacity(capacity);
    }

}
