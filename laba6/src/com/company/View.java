package com.company;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class View {
    //private Dictionary dictionary = new Dictionary();

    public String menu = "\nSelect the option:\n" +
            "1 - autofill\n" +
            "2 - add new word\n" +
            "3 - translate English text to Ukrainian\n" +
            "4 - show our dictionary\n" +
            "5 - exit\n";
    public String enterUkr = "Please, enter English word, than enter Ukrainian word ";
    public String engText = "Please, enter your English text and this applet translates it to Ukrainian! ";
    public String allDict = "Your dictionary: ";
    public String noOpt = "There is no option here!";
    public String isCorr = "You autofill this dictionary!";

    public void showText(ArrayList<String> text){
        for (String s:
             text) {
            System.out.print(s);
        }
    }

    public void showStr(String str){
        System.out.println(str);
    }

    public String enterWords(){
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public void printMap (Map<String, String> map){
        for (Map.Entry<String, String> i:
                map.entrySet()) {
            System.out.println( i.getKey() + " -- " + i.getValue());
        }
    }
}
