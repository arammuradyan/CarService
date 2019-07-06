package com.company.carservice;

public enum Model {
    BMW("BMW"),
    MERCEDES("Mercedes"),
    KIA("KIA"),
    VAZ("VAZ"),
    ERAZ("Eraz"),
    NOSELECTED("No Selected");

    private String name;

    Model(String name) {

        this.name=name;
    }
public String getName(){

        return name;
}
}
