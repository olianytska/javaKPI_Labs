package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Lambda lambda = new Lambda();
        //List<Integer> primes = new ArrayList<>();
        System.out.println("Please, enter your number: ");
        int n = lambda.read();
        System.out.println("Numbers of very prime numbers: ");
        int primes = lambda.primeNumbers(n);
        System.out.println(primes);
    }
}
