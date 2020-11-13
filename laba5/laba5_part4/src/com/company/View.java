package com.company;

import java.util.Map;

public class View {
    public  String orderKey = "Order by key";
    public String orderValue = "Order by value";
    public String r = "----------------------------";

    public void printMap (Map<String, Integer> map){
        System.out.println(r);
        for (Map.Entry<String, Integer> i:
                map.entrySet()) {
            System.out.println("Key: " + i.getKey() + ", "+
                    "Value: "+i.getValue());
        }
    }

    public void showStr(String str){
        System.out.println(str);
    }

}
