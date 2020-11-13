package com.company.Models;

import java.io.Serializable;

public class Rectangle extends Shape implements Serializable {
    private float side1;
    private float side2;

    public float getSide1(){
        return side1;
    }

    public float getSide2(){
        return side2;
    }

    Rectangle(float side1, float side2, String color){
        super(color);
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public float calcArea() {
        return side1 * side2;
    }

    @Override
    public void draw() {

    }

    @Override
    public String toString() {
        return this.getShapeColor()+ " " + this.getClass().getSimpleName() + " area is " + this.calcArea() + "( side1 = " + this.getSide1() + " side 2 = " + this.getSide2() + " )";
    }
}
