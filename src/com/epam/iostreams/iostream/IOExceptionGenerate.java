package com.epam.iostreams.iostream;


import java.io.IOException;
import java.io.OutputStream;

public class IOExceptionGenerate {
    public static void main(String[] args) {
        OutputStream stdout = System.out;
        try {
            stdout.write(104);
            stdout.write(105);
            stdout.write(10);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
