package com.academy.interfete.solutie;


public class Telecomanda {

    private RemoteControlled remoteControlled;

    public Telecomanda(RemoteControlled remoteControlled) {
        this.remoteControlled = remoteControlled;
    }

    public void apasButonInainte() {
        System.out.println("Apasat buton inainte!!!");
        remoteControlled.mergiInainte();
    }

    public void apasButonInapoi() {
        System.out.println("Apasat buton inapoi!!!");
        remoteControlled.mergiInapoi();

    }


}