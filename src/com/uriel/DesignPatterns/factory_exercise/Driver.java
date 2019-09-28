package com.uriel.DesignPatterns.factory_exercise;

public class Driver {
    public static void main(String[] args) {
        PersonFactory personFactory = new PersonFactory();
        Person p1 = personFactory.createPerson("Uriel");
        Person p2 = personFactory.createPerson("Yair");

        System.out.println(p1);
        System.out.println(p2);
    }
}
