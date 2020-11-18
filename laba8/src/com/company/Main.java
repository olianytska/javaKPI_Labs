package com.company;

import java.util.concurrent.ForkJoinPool;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] arr = new int[1000000];
        for(int i = 0; i < arr.length; i++)
            arr[i] = (int)(Math.random()*100);

        ForkJoinPool forkJoinPool = new ForkJoinPool(5);

        FJclass fj = new FJclass(arr);

        long sum = forkJoinPool.invoke(fj);

        System.out.println("Results with parallel: " + sum);

        long sum2 = 0;
        for (int i:
             arr) {
            sum2 += i;
        }

        System.out.println("Default results: " + sum2);
    }
}
