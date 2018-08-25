package com.epam.iostreams.iostream;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class IOJavaScheme {
    public static void main(String[] args) {
        try {
            FileWriter out = new FileWriter("test.txt");
            BufferedWriter br = new BufferedWriter(out);
            PrintWriter pw = new PrintWriter(br);
            pw.println("I'm a sentence in a text-file.");
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
