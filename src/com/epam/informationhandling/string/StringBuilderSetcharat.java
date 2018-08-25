package com.epam.informationhandling.string;

public class StringBuilderSetcharat {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Java tringBuilder");
        sb.setCharAt(5, 'S');
        System.out.println("StringBuilder : "+sb);
    }
}
