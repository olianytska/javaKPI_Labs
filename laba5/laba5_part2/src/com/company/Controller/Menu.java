package com.company.Controller;

import com.company.Models.*;
import  com.company.View.*;

import java.util.Scanner;

public class Menu {

    private final Data data = new Data();
    private final IOService ioServ = new IOService();
    private final View v = new View();

    public void go(){
        //data.create();
        data.autoFill();

        v.showStr(v.menu);
        Scanner sc = new Scanner(System.in);
        switch (sc.nextLine()){
            case "1": ioServ.writeShapes(data.getListOfShapes(), ioServ.writePath());
                break;
            case "2":
                v.showAll(ioServ.readShapes(ioServ.writePath()));
                break;
            case "3":
                v.showStr(v.sortArea);
                v.showAll(data.areaSort(ioServ.readShapes(ioServ.writePath())));
                break;
            case "4":
                v.showStr(v.sortColor);
                v.showAll(data.colorSort(ioServ.readShapes(ioServ.writePath())));
                break;
            default: System.out.println("There is no option");
                break;
        }

    }
}
