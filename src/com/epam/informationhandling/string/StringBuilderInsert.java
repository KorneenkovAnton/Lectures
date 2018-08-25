package com.epam.informationhandling.string;

public class StringBuilderInsert {
    public static void main(String[] args) {
    StringBuilder sb = new StringBuilder();
    sb.append("Java StringBuilder");
    sb.insert(5, "insert ");
    System.out.println("StringBuilder :" + sb);
    }
}
