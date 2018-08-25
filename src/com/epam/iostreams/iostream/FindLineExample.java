package com.epam.iostreams.iostream;

import java.util.Scanner;

public class FindLineExample {
    public static void main(String args[]) {
        String instr = "Name: Joe Age: 28 ID: 77";
        Scanner conin = new Scanner(instr);
        conin.findInLine("Age:");
        if (conin.hasNext())
            System.out.println(conin.next());
        else
            System.out.println("Error!");
    }
}
