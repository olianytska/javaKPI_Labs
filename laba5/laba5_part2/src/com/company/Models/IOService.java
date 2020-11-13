package com.company.Models;

import com.company.View.View;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IOService {

    public void writeShapes(List<Shape> shapes, File file){
        try {
            FileOutputStream fo = new FileOutputStream(file);
            ObjectOutputStream obj = new ObjectOutputStream(fo);
            for (Shape shape:
                    shapes) {
                obj.writeObject(shape);
            }
            obj.close();
            System.out.println("All shapes were written!");
        } catch (FileNotFoundException e) {
            System.out.println("This file cannot be founded.");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public List<Shape> readShapes(File file){
        List<Shape> shapes = new ArrayList<Shape>();
        try{
            FileInputStream fi = new FileInputStream(file);
            ObjectInputStream objInput = new ObjectInputStream(fi);
            while (true){
                try{
                    shapes.add((Shape) objInput.readObject());
                } catch(EOFException e){
                    break;
                }
            }
            objInput.close();
            return shapes;
        } catch (FileNotFoundException e) {
            System.out.println("This file cannot be founded.");
            e.printStackTrace();
            return null;
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            return null;
        } catch (ClassNotFoundException e) {
            System.out.println("This class doesn't exist.");
            e.printStackTrace();
            return null;
        }
    }

    public File writePath(){
        View v = new View();
        Scanner scanner = new Scanner(System.in);
        v.showStr(v.path);
        String path = scanner.nextLine();
        Scanner scanner1 = new Scanner(System.in);
        v.showStr(v.filename);
        String filename = scanner1.nextLine();
        File file = new File(path, filename);
        if(file.exists()) v.showStr(v.fileCorrect);
        else v.showStr(v.fileCreated);
        return file;
    }
}
