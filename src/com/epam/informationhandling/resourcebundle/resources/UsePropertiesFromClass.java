package com.epam.informationhandling.resourcebundle.resources;

public class UsePropertiesFromClass {
    public static void main(String[] args){
        ResourcesBundle myBundle = new ResourcesBundle();
        System.out.println(myBundle.getValue("my.key1"));
    }
}
