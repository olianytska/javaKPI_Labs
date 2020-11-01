package com.company;

import java.util.Date;

public class Person {
    private String surname;
    private String name;
    private Date date;
    private int telNumb;
    private String address;

    Person(String surname,
            String name,
            Date date,
            int telNumb,
            String address){
        this.surname=surname;
        this.name=name;
        this.date=date;
        this.telNumb=telNumb;
        this.address=address;
    }

    public void setSurname(String surname){
        this.surname=surname;
    }

    public void setName(String name){
        this.name=name;
    }

    public void  setDate(Date date){
        this.date=date;
    }

    public void setTelNumb(int telNumb){
        this.telNumb=telNumb;
    }

    public  void setAddress(String address){
        this.address=address;
    }

    public String getSurname(){ return this.surname; }
    public String getName(){ return  this.name; }
    public Date getDate(){ return  this.date;}
    public int getTelNumb(){ return this.telNumb; }
    public  String getAddress(){ return this.address; }


}
