package com.company;

import java.net.*;
import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IOService {
    public String getHTML(String s) {
        StringBuilder sb = new StringBuilder();
        int k;
        try {
            URL url = new URL(s);
            InputStreamReader is = new InputStreamReader(url.openStream());
            BufferedReader reader = new BufferedReader(is);
            k = reader.read();
            while (k != -1) {
                sb.append((char) k);
                k = reader.read();
            }
            reader.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return sb.toString();
    }

    public Map<String, Integer> counter(String text) {
        Map<String, Integer> map = new HashMap<>();
        String regex = "<[a-z]+[\\s>]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        boolean i = true;
        String tag;
        while (i) {
            if (matcher.find()) {
                // tag = matcher.group();
                tag = text.substring(matcher.start() + 1, matcher.end() - 1);
                if (!map.containsKey(tag)) map.put(tag, 1);
                else map.compute(tag, (key, value) -> ++value);
            } else i = false;
        }
        return map;
    }

    public Map<String, Integer> orderByValue(Map<String, Integer> map) {
        List<Map.Entry<String, Integer>> list =
                new LinkedList<Map.Entry<String, Integer>>(map.entrySet());

        // Sort the list
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1,
                               Map.Entry<String, Integer> o2) {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });

        // put data from sorted list to hashmap
        HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }

    public Map<String, Integer> orderByKey(Map<String, Integer> map) {
        List<Map.Entry<String, Integer>> list =
                new LinkedList<Map.Entry<String, Integer>>(map.entrySet());

        // Sort the list
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1,
                               Map.Entry<String, Integer> o2) {
                return (o1.getKey()).compareTo(o2.getKey());
            }
        });

        // put data from sorted list to hashmap
        HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }
}
