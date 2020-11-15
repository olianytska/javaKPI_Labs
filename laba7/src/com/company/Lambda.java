package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Lambda {

    interface IntReverse {
        int func(int n);
    }

    public static int primeNumbers(int number){
        ArrayList<Integer> primeNumb = new ArrayList<>();
        for(int i = 1; i <= number; i++) primeNumb.add(i);

        List<Integer> primeNumb2 = primeNumb.stream()
                .filter(Lambda::isPrime)
                .collect(Collectors.toList());

        List<Integer> primeReverseNumb = new ArrayList<>();

        IntReverse reverse = (n -> {
           int result = 0;
           int value = n;
           while(value > 0) {
               result = result * 10 + value % 10;
               value /= 10;
           }
           return result;
        });

        for(int i = 0; i < primeNumb2.size(); i++)
            primeReverseNumb.add(reverse.func(primeNumb2.get(i)));

        List<Integer> primeReverseNumb2 = primeReverseNumb.stream()
                .filter(Lambda::isPrime)
                .collect(Collectors.toList());

        List<Integer> veryPrimeNumb = new ArrayList<>();
        for(int i = 0; i < primeReverseNumb2.size(); i++)
            veryPrimeNumb.add(reverse.func(primeReverseNumb2.get(i)));

        int c = (int) veryPrimeNumb.stream()
                .count();

        return c;
    }

    private static boolean isPrime(int x){
        if (x <= 1) return false;
        return IntStream.rangeClosed(2, x/2).noneMatch(i -> x % i == 0);
    }

    public int read() {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.next());
        if (n > 1000 || n <= 1)
        {
            System.out.println("Please, enter the number from 2 to 1000.");
            return 0;
        }
        else return n;
    }

}
