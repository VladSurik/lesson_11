package com.company;
//1. Создать класс Person который описывает человека, с полями: имя, фамилия, возраст, вес, рост.
//        Создать один или несколько конструкторов которые гарантирует что у каждого есть имя, фамилия.
//        Создать массив из 100 обьектов типа Person заполненных случайными данными (Например создать
//        массив на несколько имен и выбирать из него случайным образом).
//        1.1*. Обеспечить чтобы случайные данные (вес, рост, возраст) выглядели правдоподобно:
//        не было человека весом 3 кг и ростом 180 итд.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        Random random = new Random();
//        String[] namePerson = new String[]{"Petr", "Alex", "Roman", "Evgeniy", "Mark", "Victor", "Matvey", "Miron", "Oleg", "Yaroslav"};
//        String[] surnamePerson = new String[]{"Petrovich", "Simonyn", "Nesterov", "Durmanov", "Vasilenko", "Ostrovskiy", "Matveychenko", "Migor", "Lenin", "Pslovko", "Artev"};
//        ArrayList<Person> people = new ArrayList<>();
//
//        for (int i = 0; i < 100; i++) {
//            String name = namePerson[random.nextInt(namePerson.length)];
//            String surname = surnamePerson[random.nextInt(surnamePerson.length)];
//            int age = random.nextInt(95 - 18) + 18;
//            int height = random.nextInt(200 - 165) + 165;
//            int weight = height - 100 - (height - 150) / 2;
//            people.add(new Person(name, surname, age, weight, height));
//        }

        int[] arr = { 8, 0, 4, 7, 3, 7, 10, 12, -3,-12, 9,50 ,80 };
        int low = 0;
        int high = arr.length - 1;
//        QuickSort.quickSort(arr, low, high);
//        System.out.println("QuickSort: "+ Arrays.toString(arr));

        MergeSort.mergeSort(arr, low, high);
        System.out.println("MergeSort: "+ Arrays.toString(arr));



    }
}
