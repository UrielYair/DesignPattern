package com.uriel.DesignPatterns.factory_exercise;

public class Person
    {
        private int id;
        private String name;

        Person(int id, String name)
        {
            this.id = id;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }

