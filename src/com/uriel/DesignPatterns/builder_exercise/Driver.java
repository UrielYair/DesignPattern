package com.uriel.DesignPatterns.builder_exercise;

public class Driver {
    public static void main(String[] args) {
        CodeBuilder cb = new CodeBuilder("Person")
                .addField("name","String")
                .addField("age","int");
        System.out.println(cb);
    }

    /*
     * Expected output should be:
     * **************************
     *
     * public class Person
     * {
     *   public String name;
     *   public int age;
     * }
     *
     * Note: two-space indentation.
     */

}
