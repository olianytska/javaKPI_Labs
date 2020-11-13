package com.company;

import java.util.Scanner;

public class Controller {
    private final Dictionary dictionary = new Dictionary();
    private final View view = new View();

    public void go(){
        while (true){
            view.showStr(view.menu);
            Scanner sc = new Scanner(System.in);
            switch (sc.nextLine()){
                case "1":
                    dictionary.autoFill();
                    view.showStr(view.isCorr);
                    break;
                case "2":
                    view.showStr(view.enterUkr);
                    dictionary.addWord(view.enterWords(), view.enterWords());
                    break;
                case "3":
                    view.showStr(view.engText);
                    view.showText(dictionary.translateToUkr(view.enterWords()));
                    break;
                case "4":
                    view.showStr(view.allDict);
                    view.printMap(dictionary.getDict());
                    break;
                case "5":
                    System.exit(0);
                    break;
                default: view.showStr(view.noOpt);
                break;
            }
        }
    }
}
