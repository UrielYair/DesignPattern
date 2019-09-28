package com.uriel.DesignPatterns.factory_exercise;

class PersonFactory {

    private int id = 0;

    Person createPerson(String name)
    {
        return new Person(id++,name);
    }
}
