package com.company;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class IOService {

    public File writePath(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your path: ");
        String path = scanner.nextLine();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter your filename: ");
        String filename = scanner1.nextLine();
        File file = new File(path, filename);
        if(file.exists()) System.out.println("File exists!");
        else System.out.println("File was created!");
        return file;
    }

    public void go(File file){
        try {
            FileInputStream fi = new FileInputStream(file);
            Scanner reader = new Scanner(file);
            String maxWord = "";
            String curr = "";
            System.out.println("All words:");
            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                System.out.println(data);
                curr = data;
                if (curr.length() > maxWord.length()) maxWord = curr;
            }
            System.out.println("The longest word is " + maxWord);
            reader.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("The file cannot be read");
            e.printStackTrace();
        }
    }
}
