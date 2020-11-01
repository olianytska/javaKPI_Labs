package com.company.Controller;

import com.company.Models.Data;
import com.company.View.View;

public class Controller {
    private final Data data = new Data();
    private final View v = new View();

    public void go(){
        data.create();

        v.Line();
        v.showStr(v.all);
        v.Line();
        v.showAll(data.getShapes());

        v.Line();
        v.showStr(v.sumAll);
        v.showFloat(data.Summa());

        v.Line();
        v.showStr((v.sumRec));
        v.showFloat(data.SummaSome("Rectangle"));

        v.Line();
        v.showStr(v.sumTr);
        v.showFloat(data.SummaSome("Triangle"));

        v.Line();
        v.showStr(v.sumC);
        v.showFloat(data.SummaSome("Circle"));

        v.Line();
        v.showStr(v.sortArea);
        v.Line();
        data.areaSort(data.getShapes());
        v.showAll(data.getShapes());

        v.Line();
        v.showStr(v.sortColor);
        v.Line();
        data.colorSort(data.getShapes());
        v.showAll(data.getShapes());
    }
}
