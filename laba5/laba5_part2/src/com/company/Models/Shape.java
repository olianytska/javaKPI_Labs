package com.company.Models;

import java.io.Serializable;

public abstract class Shape implements Drawable, Serializable {
    private String shapeColor;

    Shape(String shapeColor){
        this.shapeColor = shapeColor;
    }

    public String getShapeColor(){
        return  shapeColor;
    }

    public abstract float calcArea();

    @Override
    public String toString() {
        return this.getShapeColor() + " " + this.getClass().getSimpleName() + " area is " + this.calcArea();
    }
}
