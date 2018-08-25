package com.epam.informationhandling.locale.locale.date;


import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatExample {
    public static void main(String[] args) {
        DateFormat[] dateTimeFormatters = new DateFormat[]{
                DateFormat.getDateTimeInstance(DateFormat.FULL,
                        DateFormat.FULL, Locale.US),
                DateFormat.getDateTimeInstance(DateFormat.LONG,
                        DateFormat.LONG, Locale.US),
                DateFormat.getDateTimeInstance(DateFormat.MEDIUM,
                        DateFormat.MEDIUM, Locale.US),
                DateFormat.getDateTimeInstance(DateFormat.SHORT,
                        DateFormat.SHORT, Locale.US)
        };
        String[] styles = { "FULL", "LONG", "MEDIUM", "SHORT" };
        Date date = new Date();
        int i = 0;
        for (DateFormat dtf : dateTimeFormatters) {
            System.out.printf("%-6s: %s%n",
                    styles[i++], dtf.format(date));
        }
    }
}
