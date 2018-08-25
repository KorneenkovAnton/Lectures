package com.epam.informationhandling.format;


import java.util.Calendar;
import java.util.Formatter;

public class DateTimeFormatExample {

    public static void main(String[] args) {
        Formatter formatter = new Formatter();
        Calendar calendar = Calendar.getInstance();

        formatter.format("%tr", calendar);
        System.out.println(formatter);
    }

}
