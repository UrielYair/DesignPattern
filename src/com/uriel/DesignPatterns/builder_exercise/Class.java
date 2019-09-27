package com.uriel.DesignPatterns.builder_exercise;


import java.util.ArrayList;
import java.util.List;

public class Class {
    private String className;
    private List<Field> fields = new ArrayList<>();

    public Class(){}

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public List<Field> getFields() {
        return fields;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        String newLine = System.lineSeparator();

        sb.append("public class " + className).append(newLine);
        sb.append("{").append(newLine);

        for (Field f : fields)
            sb.append("  " + f).append(newLine);

        sb.append("}").append(newLine);

        return sb.toString();
    }
}
