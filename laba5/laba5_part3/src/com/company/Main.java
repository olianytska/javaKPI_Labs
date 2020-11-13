package com.company;

import com.company.IOService.Path;

import java.io.File;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Path path = new Path();
        File file = path.writePath();
        Crypt crypt = new Crypt();
        crypt.encrypt('k', file, "I like to eat");
        crypt.decrypt('k', file);
    }
}
