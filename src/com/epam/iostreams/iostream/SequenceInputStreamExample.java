package com.epam.iostreams.iostream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class SequenceInputStreamExample {
    public static void main(String[] args) {
        FileInputStream inFile1 = null;
        FileInputStream inFile2 = null;
        SequenceInputStream sequenceStream = null;
        FileOutputStream outFile = null;
        try {
            inFile1 = new FileInputStream("src/com/epam/iostreams/iostream/file1.txt");
            inFile2 = new FileInputStream("src/com/epam/iostreams/iostream/file2.txt");
            sequenceStream = new SequenceInputStream(inFile1, inFile2);
            outFile = new FileOutputStream("src/com/epam/iostreams/iostream/file3.txt");
            int readedByte = sequenceStream.read();
            while (readedByte != -1) {
                outFile.write(readedByte);
                readedByte = sequenceStream.read();
            }
        }
        catch (IOException e) {
            System.out.println("IOException: " + e.toString());
        } finally {
            try {
                sequenceStream.close();
            } catch (IOException e) {
            }
            try {
                outFile.close();
            } catch (IOException e) {
            }
        }
    }

}
