package com.academy.people;

import java.io.Serializable;
import java.util.Arrays;

public class Student extends Person {

    String facultate;
    int id;

    public Student(String np, String pp, String f, long cnp, int idnou) {
        super(np, pp, cnp);
        id = idnou;
        facultate = f;
    }

    public Student(String fac) {
        super();
        facultate = fac;
    }

    public int calculateSum(int x, int y) {
//        int sum;
//        sum = x + y;
//        System.out.println(sum);
//        return new int[]{1, 2, 3};
        return x + y;
    }

    public int calculateSum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
//        System.out.println(sum);
        return sum;
    }

    public int[] copyArray(int[] input) {
        int[] copie = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            copie[i] = input[i];
        }
        return copie;
    }

    // fields, methods, constructor

}