package com.epam.informationhandling.resourcebundle.resources;

import java.util.ListResourceBundle;


public class ResourcesExample extends ListResourceBundle {
    public Object[][] getContents() {
        return new Object[][] {
                { "my.key1", "value01" },
                { "my.key2", "value02" },
        };
    }
}
