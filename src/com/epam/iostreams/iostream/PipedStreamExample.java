package com.epam.iostreams.iostream;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipedStreamExample {
    public static void main(String[] args) {
        PipedInputStream pipeIn = null;
        PipedOutputStream pipeOut = null;

        try {
            int countRead = 0;
            int[] toRead = null;
            pipeIn = new PipedInputStream();
            pipeOut = new PipedOutputStream(pipeIn);

            for (int i = 0; i < 20; i++) {
                pipeOut.write(i);
            }
            int willRead = pipeIn.available();
            toRead = new int[willRead];

            for (int i = 0; i < willRead; i++) {
                toRead[i] = pipeIn.read();
                System.out.print(toRead[i] + " ");
            }
        } catch (IOException e) {
            System.out.println("Impossible IOException occur: ");
            e.printStackTrace();
        }
    }
}
