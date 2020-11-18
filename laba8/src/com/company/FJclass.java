package com.company;

import java.util.Arrays;

import java.util.concurrent.RecursiveTask;

public class FJclass extends RecursiveTask<Long>{
    private int[] arr;

    public  FJclass(int[] arr){
        this.arr = arr;
    }

    public long sum(int[] arr){
        int suma = 0;
        for (int i = 0; i < arr.length; i++)
            suma += arr[i];
        return suma;
    }

    @Override
    protected Long compute() {
        if(arr.length < 20) {
            return sum(arr);
        }
        else {
            FJclass subtask1 = new FJclass(Arrays.copyOfRange(arr, 0, arr.length/2));
            subtask1.fork();

            FJclass subtask2 = new FJclass(Arrays.copyOfRange(arr, arr.length/2, arr.length));

            Long subtask1Result = subtask1.join();
            Long subtask2Result = subtask2.compute();

            return  subtask1Result + subtask2Result;
        }
    }
}



