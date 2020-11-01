package com.company;
import java.util.Scanner;



public class Main {

    private static void toBinary(int a) {
        String y="";
        while (a>0) {
            if (a%2!=0) {
                y+="1";
            }
            else {
                y+="0";
            }
            a=a/2;
        }
        StringBuffer x = new StringBuffer(y);
        x=x.reverse();
        System.out.println(x);
    }

    private  static void toOct(int a) {
        String y="";
        int i=0;
        while(a>0) {
                i=a%8;
                y+=Integer.toString(i);
                a=a/8;
        }
        StringBuffer x = new StringBuffer(y);
        x=x.reverse();
        System.out.println(x);
    }

    private static void  toHex(int a) {
        String y="";
        int i=0;
        while(a>0) {
            i=a%16;
            if(i<10) y+=Integer.toString(i);
            else if(i==10) y+="A";
            else if(i==11) y+="B";
            else if(i==12) y+="C";
            else if(i==13) y+="D";
            else if(i==14) y+="E";
            else if(i==15) y+="F";
            a=a/16;
        }
        StringBuffer x = new StringBuffer(y);
        x=x.reverse();
        System.out.println(x);
    }

    public static void main(String[] args) {
	// write your code here
        //boolean err=false;
        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please, enter the number:");
            int n = 0;
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
            } else {
                System.out.println("Error. Please, enter the number.");
                break;
            }
            if(n < 0) throw new IllegalArgumentException("Please, enter the number more than 0");
            System.out.println("System values");
            System.out.println();
            System.out.print("Binary system: ");
            System.out.println(Integer.toBinaryString(n));
            System.out.print("Octal system: ");
            System.out.println(Integer.toOctalString(n));
            System.out.print("Hex system: ");
            System.out.println(Integer.toHexString(n));
            System.out.println();
            System.out.println("Function values");
            System.out.println();
            System.out.print("Binary system: ");
            toBinary(n);
            System.out.print("Octal system: ");
            toOct(n);
            System.out.print("Hex system: ");
            toHex(n);
            //System.out.println("Press any key to continue...");
        }

    }
}
