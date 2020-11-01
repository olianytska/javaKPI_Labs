package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Menu {
    private ArrayList<Person> journal = new ArrayList<Person>();
    private SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");

    private String printSurname(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please, enter your surname:");
        String  n = null;
        if (scanner.hasNextLine()) {
            n = scanner.nextLine();
        } else {
            System.out.println("Error. Please, enter the string.");
        }
        return n;
    }
    private String printName(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please, enter your name:");
        String  n = null;
        if (scanner.hasNextLine()) {
            //n = scanner.nextLine();
            return scanner.nextLine();
        } else {
            System.out.println("Error. Please, enter the string.");
        }
        //return n;
    }
    private Date printDate(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please, enter date like dd-mm-yyyy:");
        String  n = null;
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        if (scanner.hasNextLine()) {
            n = scanner.nextLine();
        } else {
            System.out.println("Error. Please, enter int.");
        }
        Date date = null;
        try {
            date = formatter.parse(n);
        }
        catch (ParseException e) {
            System.out.println("Error, please enter normal date");
            return null;
        }
        return  date;
    }
    private int printNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please, enter the telephone number in type 992540001:");
        int n = 0;
        if (scanner.hasNextInt()) {
            n = scanner.nextInt();
        } else {
            System.out.println("Error. Please, enter the normal telephone number.");
        }
        if(String.valueOf(n).length()!=9) n=0;
        return n;
    }
    private String printAddress(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please, enter your address (street, house, apartment):");
        String  n = null;
        if (scanner.hasNextLine()) {
            n = scanner.nextLine();
        } else {
            System.out.println("Error. Please, enter the string.");
        }
        return n;
    }

    private String newSurname(){
        while (true)
        {
            String surname = printSurname();
            while (surname == null) surname = printSurname();
            return surname;
        }
    }

    private String newName(){
        while (true)
        {
            String name=printName();
            while (name==null) name=printName();
            return name;
        }
    }

    private Date newDate(){
        while (true)
        {
            SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
            Date date = printDate();
            while (date==null) date=printDate();
            return date;
        }
    }

    private int newNumber(){
        while (true)
        {
            int number=printNumber();
            while (number==0){
                System.out.println("Error.Please, enter normal telephone number which consist of 10 elements:");
                number=printNumber();
            }
            return number;
        }
    }

    private String newAddress(){
        while (true)
        {
            String address=printAddress();
            while (address==null) address=printAddress();
            return address;
        }
    }

    private void addRecord(){
        journal.add(new Person(newSurname(), newName(), newDate(), newNumber(), newAddress()));
        System.out.println("Well done!");
    }

    private void showRecords(){
        if(journal.isEmpty()) System.out.println("The journal is empty");
        else{
            for(Person i: journal){
                System.out.println("Surname: "+i.getSurname());
                System.out.println("Name: "+i.getName());
                System.out.println("Date of birth: "+formatter.format(i.getDate()));
                System.out.println("Telephone number: "+i.getTelNumb());
                System.out.println("Address: "+i.getAddress());
                System.out.println();
            }
        }
    }

    private void showMenu(){
        System.out.println("Press 1 to add the record");
        System.out.println("Press 2 to show the records");
        System.out.println("Press 3 to exit");
    }

    public int menuNumb(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please, enter the number what you want to do:");
        int n = 0;
        if (scanner.hasNextInt()) {
            n = scanner.nextInt();
        } else {
            System.out.println("Error. Please, enter the number.");
        }
        if(n>3 || n<1) {
            System.out.println("Please, enter 1, 2 or 3 ");
            n=0;
        }
        return n;
    }

    public int newMenuNumb(){
        int number = menuNumb();
        while (number==0) number=menuNumb();
        return number;
    }

    public void show(){
        while (true){
            showMenu();
            int n = newMenuNumb();
            switch (n) {
                case(1): addRecord(); break;
                case(2): showRecords(); break;
                case(3): return;
            }

        }
    }
}
