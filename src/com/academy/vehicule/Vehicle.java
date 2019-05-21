package com.academy.vehicule;

import com.academy.people.Person;

public class Vehicle  {

    public static final double PI = 3.14;

    private Person owner;
    private int uniqueId;
    private static int counter = 1;

    public Vehicle() {
    }

    public Vehicle(Person owner) {
        this.owner = owner;
        uniqueId = counter;
        counter++;
    }

    public int getUniqueId() {
        return this.uniqueId;
    }

    private boolean checkRange(int uniqueId) {
        return uniqueId <= 0;
    }

//    public void setUniqueId(int uniqueId) {
//        if(checkRange(uniqueId)) {
//            return;
//        }
//        this.uniqueId = uniqueId;
//        if(uniqueId > 0 ) {
//            this.uniqueId = uniqueId;
//        }
//    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public Person getOwner() {
        return this.owner;
    }

    public static int getCounter() {
 //       System.out.println(this.uniqueId);
        return counter;
    }


}