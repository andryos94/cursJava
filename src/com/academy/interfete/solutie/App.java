package com.academy.interfete.solutie;

public class App {

    public static void main(String[] args) {
//        RemoteControlled rc = new MasinaDeTest();
//        MasinaDeTest masinaDeTest = new MasinaDeTest();
        Masina masinaAdev = new Masina();
        Telecomanda telecomanda = new Telecomanda(masinaAdev);
        telecomanda.apasButonInainte();
    }

}

