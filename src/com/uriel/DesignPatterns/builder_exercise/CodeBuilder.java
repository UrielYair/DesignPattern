package com.uriel.DesignPatterns.builder_exercise;


public class CodeBuilder
{

    private Class aClass = new Class();

    public CodeBuilder(String className) {
        this.aClass.setClassName(className);
    }

    public CodeBuilder addField(String name, String type)
    {
        this.aClass.getFields().add(new Field(name, type));
        return this;
    }

    @Override
    public String toString()
    {
        return aClass.toString();
    }

}