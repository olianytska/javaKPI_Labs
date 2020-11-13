package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    private final Map<String, String> dict = new HashMap<>();

    public Map<String,String> getDict(){
        return this.dict;
    }
    public Map<String, String> autoFill(){
        dict.put("book", "книжка");
        dict.put("apple", "яблуко");
        dict.put("family", "родина");
        dict.put("car", "машина");
        dict.put("house", "дім");
        dict.put("white", "білий");
        dict.put("I", "я");
        dict.put("want", "хочу");
        return this.dict;
    }

    public Map<String, String> addWord (String engWord, String ukrWord){
        dict.put(engWord, ukrWord);
        return this.dict;
    }

    public ArrayList<String> translateToUkr (String engText){
        ArrayList<String> ukrText = new ArrayList<>();
        for (String s:
             engText.split(" ")) {
            if(dict.containsKey(s)){
                if(s!=null) ukrText.add(dict.get(s)+" ");
            }
            else System.out.println("THere is no such words in the dictionary.");
        }
        return ukrText;
    }
}
