package com.company.Aviary;

import com.company.Animals.Ungulates;

public class AviaryUngulates <T extends Ungulates> extends AviaryMammal<T>{

    @Override
    public void setCapacity(int capacity) {
        super.setCapacity(capacity);
    }

}
