package com.company.Models;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Data {
   private List<Shape> shapes = new ArrayList<Shape>();

//    public void create(){
//        shapes[0] = new Rectangle(5,4,"Black");
//        shapes[1] = new Triangle(3, 4, 5, "Red");
//        shapes[2] = new Circle(5, "White");
//        shapes[3] = new Rectangle(20,14,"Purple");
//        shapes[4] = new Triangle(13, 12, 2, "White");
//        shapes[5] = new Circle(20, "Yellow");
//        shapes[6] = new Rectangle(3,14,"Green");
//        shapes[7] = new Triangle(3, 6, 8, "Orange");
//        shapes[8] = new Circle(17, "Grey");
//        shapes[9] = new Rectangle(2,12,"Blue");
//        shapes[10] = new Triangle(13, 11, 21, "Pink");
//        shapes[11] = new Circle(7, "Burgundy");
//    }

    public void autoFill(){
        //List<Shape> shapes = new ArrayList<Shape>();
        this.shapes.add(new Rectangle(5,4,"Black"));
        this.shapes.add(new Triangle(3, 4, 5, "Red"));
        this.shapes.add(new Circle(5, "White"));
        this.shapes.add(new Circle(17, "Grey"));
        this.shapes.add(new Triangle(13, 11, 21, "Pink"));
    }

    public List<Shape> getListOfShapes(){return this.shapes;}

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

    public List<Shape> colorSort(List<Shape> sh){
        sh.sort(new  ComparatorColor());
        return sh;
    }

    public List<Shape> areaSort(List<Shape> sh){
        sh.sort(new ComparatorArea());
        return sh;
    }

//    public Shape[] getShapes(){
//        return shapes;
//    }

}
