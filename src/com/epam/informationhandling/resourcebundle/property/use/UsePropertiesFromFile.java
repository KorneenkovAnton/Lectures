package com.epam.informationhandling.resourcebundle.property.use;

import com.epam.informationhandling.resourcebundle.property.bundle.ResourceProperty;

import java.util.Locale;

public class UsePropertiesFromFile {
    public static void main(String[] args){
        ResourceProperty myBundle = new ResourceProperty(
                new Locale("en","US"));
        System.out.println(myBundle.getValue("my.key1"));

        myBundle = new ResourceProperty(new Locale("en","UK"));
        System.out.println(myBundle.getValue("my.key2"));

        myBundle = new ResourceProperty(new Locale("ru","BY"));
        System.out.println(myBundle.getValue("my.key1"));
        myBundle = new ResourceProperty(new Locale("ru","RU"));
        System.out.println(myBundle.getValue("my.key2"));
    }
}
