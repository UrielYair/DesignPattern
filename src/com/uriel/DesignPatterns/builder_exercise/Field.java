package com.uriel.DesignPatterns.builder_exercise;

public class Field {
    String type,name;

    public Field(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {
        return String.format("public %s %s;",type, name);

    }
}
