package com.company.View;

import com.company.Models.Shape;

public class View {
    public String sumRec = "The sum of all rectangle's areas: ";
    public String sumTr = "The sum of all triangle's areas: ";
    public String sumC = "The sum of all circle's areas: ";
    public String sumAll = "The sum of all shape's areas: ";
    public String all = "All shapes: ";
    public String sortColor = "Sorted by color: ";
    public String sortArea = "Sorted by area: ";

    public void Line(){
        System.out.println("---------------------------------");
    }

    public  void  showAll(Shape[] sh){
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
