package com.company;

public class Person {

    private String name;
    private String surname;
    private int age;
    private int weight;
    private int height;

    public Person(String name, String surname, int age, int weight, int height) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
}
