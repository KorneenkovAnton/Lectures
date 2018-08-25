package com.epam.informationhandling.locale.locale.date;


import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

public class DateFormatParseExample {
    public static void main(String[] args) throws ParseException {
        Locale localeNOR = new Locale("no", "NO");

        DateFormat[] dateFormatters = new DateFormat[] {
                DateFormat.getDateInstance(DateFormat.SHORT, localeNOR),
                DateFormat.getDateInstance(DateFormat.MEDIUM, localeNOR),
                DateFormat.getDateInstance(DateFormat.LONG, localeNOR),
                DateFormat.getDateInstance(DateFormat.FULL, localeNOR),
        };
        System.out.println("Parsing: ");
        Date date = new Date();
        for(DateFormat df : dateFormatters){
            try{
                String strDate = df.format(date);
                Date parseDate = df.parse(strDate);
                System.out.println(strDate + "|"
                        + df.format(parseDate));
            } catch(ParseException e){
                System.out.println(e);
            }

            System.out.println("Leniency: ");
            System.out.println("32.01.08|"
                    + dateFormatters[0].parse("32.01.08"));
        }
    }
}


