package com.academie.contribuabili;

public class ContribuabilTest implements Contribuabil {

    private static int counter = 0;

    private final int id;

    public ContribuabilTest() {
        counter++;
        id = counter;
    }

    public int getId() {
        return id;
    }

    public double getVenituri() {
        return 0;
    }

    public double getTaxePlatite() {
        return 0;
    }

    public double getTaxeNeplatite() {
        return 0;
    }
}