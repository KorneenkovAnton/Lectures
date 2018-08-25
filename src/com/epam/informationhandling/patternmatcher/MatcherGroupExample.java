package com.epam.informationhandling.patternmatcher;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherGroupExample {
    public static void main(String[] args) {
        Matcher m = Pattern.compile("\\w+").matcher("Today is Sunday");
        while (m.find()){
            System.out.println(m.group());
        }
        int i = 0;
        while(m.find(i)){
            System.out.println(m.group() + " ");
            i++;
        }
    }
}
