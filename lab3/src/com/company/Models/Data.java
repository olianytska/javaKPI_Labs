package com.company.Models;

import java.util.Arrays;

public class Data {
    private Shape[] shapes = new Shape[12];

    public void create(){
        shapes[0] = new Rectangle(5,4,"Black");
        shapes[1] = new Triangle(3, 4, 5, "Red");
        shapes[2] = new Circle(5, "White");
        shapes[3] = new Rectangle(20,14,"Purple");
        shapes[4] = new Triangle(13, 12, 2, "White");
        shapes[5] = new Circle(20, "Yellow");
        shapes[6] = new Rectangle(3,14,"Green");
        shapes[7] = new Triangle(3, 6, 8, "Orange");
        shapes[8] = new Circle(17, "Grey");
        shapes[9] = new Rectangle(2,12,"Blue");
        shapes[10] = new Triangle(13, 11, 21, "Pink");
        shapes[11] = new Circle(7, "Burgundy");
    }

    public float Summa(){
        float s = 0;
        for (Shape sh:
             this.shapes) {
            s += sh.calcArea();
        }
        return s;
    }

    public float SummaSome(String type){
        float s = 0;
        for (Shape sh:
             this.shapes) {
            if(sh.getClass().getSimpleName().equals(type)){
                s += sh.calcArea();
            }
        }
        return s;
    }

    public void colorSort(Shape[] sh){
        Arrays.sort(sh, new  ComparatorColor());
    }

    public void areaSort(Shape[] sh){
        Arrays.sort(sh, new ComparatorArea());
    }

    public Shape[] getShapes(){
        return shapes;
    }
}
