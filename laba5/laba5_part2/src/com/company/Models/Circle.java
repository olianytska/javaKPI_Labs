package com.company.Models;

import java.io.Serializable;

public class Circle extends Shape implements Serializable {
    private float r;

    public float getR() {
        return r;
    }

    Circle(float r, String color){
        super(color);
        this.r = r;
    }

    @Override
    public float calcArea() {
        return (float)(Math.PI * r * r);
    }

    @Override
    public void draw() {

    }

    @Override
    public String toString() {
        return this.getShapeColor() + " " + this.getClass().getSimpleName() + " area is " + this.calcArea() + "( radius = " + this.getR() + " )";
    }
}
