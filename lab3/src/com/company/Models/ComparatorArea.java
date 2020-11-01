package com.company.Models;

import java.util.Comparator;

public class ComparatorArea implements Comparator<Shape> {
    @Override
    public int compare(Shape o1, Shape o2) {
        if(o1.calcArea() > o2.calcArea()) return 1;
        if(o1.calcArea() < o2.calcArea()) return -1;
        return 0;
    }
}
