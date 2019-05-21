package com.academy;

import com.academy.people.Person;
import com.academy.people.Student;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        Person person = new Person();

//        Student student = new Student("Ciungulescu",
//                "Alex",
//                 "poli",
//                188213,
//                1);
//
//        Student catalin = new Student("fara");

//        Student student = new Student();

//        int suma = student.calculateSum(1, 2);
//
////        System.out.println(suma);
//
//        int sumaArray = student.calculateSum(new int[]{1, 2});
//
//        int[] array = new int[]{1, 2, 3};
//
//        int[] copie = student.copyArray(array);
//        System.out.println(Arrays.toString(array));
//        System.out.println(Arrays.toString(copie));
//
//        array[0] = 2000;
//
//        copie[0] = 500000;
//        System.out.println(Arrays.toString(array));
//        System.out.println(Arrays.toString(copie));

        Person alin = new Person("abc", "alex", 11123214);

        Person dan = new Person("dan");

        System.out.println(alin.toString());
        System.out.println(dan.toString());

//        int x = 10;
//        schimbaVariabila(x);
//
//        System.out.println(x);


//        int[] array = new int[]{1, 2, 3};
//        schimbaVariabila(array);
//        System.out.println(Arrays.toString(array));
//
//        array = new int[]{30, 30, 30};
//        System.out.println(Arrays.toString(array));
    }

    public static void schimbaVariabila(int[] array) {
        array[0] = 10;
        array[1] = 10;
        array[2] = 10;
        array = new int[]{20, 20, 20};
        System.out.println(Arrays.toString(array));
    }


//    public static void schimbaVariabila(int newx) {
//        System.out.println(x);
//        newx = 20;
//    }



}