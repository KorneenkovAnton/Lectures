package com.epam.informationhandling.resourcebundle.property.bundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceProperty {
    ResourceBundle bundle;
    public ResourceProperty(Locale locale) {
        bundle = ResourceBundle.getBundle("java._se._03 ._resourcebundle .property.property.prop", locale);
    }
    public String getValue(String key) {
        return bundle.getString(key);
    }
}
