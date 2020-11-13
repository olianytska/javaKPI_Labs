package com.company.IOService;

import java.io.FilterWriter;
import java.io.IOException;

public class Writer extends FilterWriter {

    /**
     * Create a new filtered writer.
     *
     * @param out a Writer object to provide the underlying stream.
     * @throws NullPointerException if {@code out} is {@code null}
     */
    public Writer(java.io.Writer out) {
        super(out);
    }

    public void write(char c) throws IOException {
        super.write(c);
    }
}
