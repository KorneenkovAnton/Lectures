package com.epam.informationhandling.resourcebundle.resources;

import java.util.ResourceBundle;

public class ResourcesBundle {

    ResourceBundle bundle;

    public ResourcesBundle() {
        bundle = ResourceBundle
                .getBundle("_java._se._03 ._resourcebundle.resources .ResourcesExample");
    }

    public String getValue(String key) {
        return bundle.getString(key);
    }


}
