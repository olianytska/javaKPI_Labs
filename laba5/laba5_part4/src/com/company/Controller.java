package com.company;

import java.util.HashMap;
import java.util.Map;

public class Controller {
    public View view = new View();
    public IOService ioService = new IOService();

    public void go(){
        String s = ioService.getHTML("https://eda.ru/recepty");
        Map<String, Integer> map = new HashMap<>();
        map = ioService.counter(s);
        view.printMap(map);


        view.showStr(view.orderValue);
        Map<String, Integer> map2 = new HashMap<>();
        map2 = ioService.orderByValue(map);
        view.printMap(map2);


        view.showStr(view.orderKey);
        Map<String, Integer> map3 = new HashMap<>();
        map3 = ioService.orderByKey(map);
        view.printMap(map3);
    }
}
