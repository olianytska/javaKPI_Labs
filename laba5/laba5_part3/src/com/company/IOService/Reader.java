package com.company.IOService;

import java.io.FilterReader;
import java.io.IOException;

public class Reader extends FilterReader {
    /**
     * Creates a new filtered reader.
     *
     * @param in a Reader object providing the underlying stream.
     * @throws NullPointerException if {@code in} is {@code null}
     */
    public Reader(java.io.Reader in) {
        super(in);
    }

    public int read(char symb) throws IOException {
        return super.read()-(int) symb;
    }
}
