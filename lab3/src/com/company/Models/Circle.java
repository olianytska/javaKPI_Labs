package com.company.Models;

public class Circle extends Shape{
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
