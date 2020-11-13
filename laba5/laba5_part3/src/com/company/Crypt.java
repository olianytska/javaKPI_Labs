package com.company;

import com.company.IOService.Reader;
import com.company.IOService.Writer;

import java.io.*;

public class Crypt {
    public void encrypt(char symb, File file, String text){
        try{
            FileWriter fw = new FileWriter(file);
            Writer filterWriter = new Writer(fw);
            for(int i=0; i<text.length(); i++){
                char c = (char)((int)text.charAt(i)+(int)symb);
                filterWriter.write(c);
            }
            filterWriter.close();
        } catch (IOException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public void decrypt(char symb, File file) {
        try {
            FileReader fr = new FileReader(file);
            int k;
            Reader reader = new Reader(fr);
            k = reader.read(symb);
            while (k + (int)symb != -1) {
                System.out.print((char) k);
                k = reader.read(symb);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
