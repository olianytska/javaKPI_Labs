package com.company.Models;

public class Triangle extends Shape {
    private float side1;
    private float side2;
    private float side3;

    public float getSide1() {
        return side1;
    }

    public float getSide2() {
        return side2;
    }

    public float getSide3() {
        return side3;
    }

    Triangle(float side1, float side2, float side3, String color){
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public float calcArea() {
        float p = (side1 + side2 + side3)/2;
        return (float) Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
    }

    @Override
    public void draw() {

    }

    @Override
    public String toString() {
        return this.getShapeColor() + " " + this.getClass().getSimpleName() + " area is " + this.calcArea() + "( side1 = " + this.getSide1() + " side 2 = " + this.getSide2() + " side3 = " + this.getSide3() + " )";
    }
}
