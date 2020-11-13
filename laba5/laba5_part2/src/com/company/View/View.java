package com.company.View;

import com.company.Models.Shape;

import java.util.List;

public class View {
    public String sumRec = "The sum of all rectangle's areas: ";
    public String sumTr = "The sum of all triangle's areas: ";
    public String sumC = "The sum of all circle's areas: ";
    public String sumAll = "The sum of all shape's areas: ";
    public String all = "All shapes: ";
    public String sortColor = "Sorted by color: ";
    public String sortArea = "Sorted by area: ";
    public String chooseWrite = "Please, enter 1 to write all shapes";
    public String chooseRead = "Please, enter 2 to read all shapes";
    public String readSomeShapes = "All shapes which can be read: ";
    public String writeSomeShapes = "All shapes which can be written: ";
    public String menu = "Select the option:\n" +
            " 1 - write shapes to file\n " +
            "2 - read shapes from file\n" +
            " 3 - sort shapes by area\n" +
            " 4 - sort shapes by color";
    public String path = "Enter your path: ";
    public String filename = "Enter your filename: ";
    public String fileCorrect = "File exists!";
    public String fileCreated = "File was created!!";

    public void Line(){
        System.out.println("---------------------------------");
    }

    public  void  showAll(List<Shape> sh){
        for (Shape s:
             sh) {
            System.out.println(s);
            System.out.println(" ");
        }
    }

    public void showStr(String mes){
        System.out.println(mes);
    }

    public void showFloat(float f){
        System.out.println(f);
    }
}
