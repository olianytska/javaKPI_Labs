package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Enter the number from 1 to 9:");
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        if (scanner.hasNextInt()) {
            n = scanner.nextInt();
        } else {
            System.out.println("Please, enter the number");
        }
        if(n > 9 || n < 1) throw new IllegalArgumentException("The number should be more than 0 and less than 10");
        else{
            System.out.println( "Your pyramid"+"\n");
            for (int i=1; i<=n; i++){
                for(int s1=n; s1>i; s1--) System.out.print(" ");
                for(int x1=1; x1<=i; x1++) System.out.print(x1);
                for(int x2=i-1; x2>=1; x2--) System.out.print(x2);
                System.out.println();
            }
        }

    }
}
