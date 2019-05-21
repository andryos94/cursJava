package com.academy;

import com.academy.people.Person;
import com.academy.vehicule.Vehicle;

import java.security.acl.Owner;

public class Main2 {

    public static void main(String[] args) {

        Person owner = new Person("alex",

                "vasile",
                11111);
        Vehicle vehicle = new Vehicle(owner);
        System.out.println(owner);
        System.out.println(vehicle);
//
       Person cata = new Person("alin", "cata", 22222);
       Vehicle anotherVehicle = new Vehicle(cata);
        System.out.println(cata);
        System.out.println(anotherVehicle);
//
//
        System.out.println(Vehicle.getCounter()); // 1
        System.out.println(Vehicle.getCounter()); //1

//        Vehicle vehicle;

        Calcule.suma(2, 3);

 //       System.out.println(Vehicle.getCounter());

        System.out.println(vehicle.getUniqueId()); // 1
        System.out.println(anotherVehicle.getUniqueId()); // 2
    }

}