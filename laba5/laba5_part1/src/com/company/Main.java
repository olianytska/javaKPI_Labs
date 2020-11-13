package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        IOService ioService = new IOService();
        File file = ioService.writePath();
        ioService.go(file);
    }
}
