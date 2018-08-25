package com.epam.iostreams.iostream;


import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

public class ByteArrayStreamExample {
    public static void main(String[] args) {
        {
            byte[] bytes = { 1, -1, 0 };
            ByteArrayInputStream in = new ByteArrayInputStream(bytes);
            int readedInt = in.read();
            System.out.println("first element read is: " + readedInt);
            readedInt = in.read();
            System.out.println("second element read is: " + readedInt);
            readedInt = in.read();
            System.out.println("third element read is: " + readedInt);
        }
        {
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            out.write(10);
            out.write(11);
            byte[] bytes = out.toByteArray();
        }
    }

}
