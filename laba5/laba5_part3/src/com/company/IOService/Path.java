package com.company.IOService;

import java.io.*;
import java.util.Scanner;

public class Path {

    public File writePath(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the path: ");
        String path = scanner.nextLine();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter the filename: ");
        String filename = scanner1.nextLine();
        File file = new File(path, filename);
        if(file.exists()) System.out.println("File exists!");
        else System.out.println("File was created!");
        return file;
    }

}
