package com.academy.interfete.solutie;

public class App {

    public static void main(String[] args) {
        RemoteControlled rc = new MasinaDeTest();//trebuie sa ne asiguram ca aducem metodele din contract
//        MasinaDeTest masinaDeTest = new MasinaDeTest();//oricare din cele 2 instante pot fi trimise ca parametru la telecomanda
        RemoteControlled masinaAdev = new Masina();
        Telecomanda telecomanda = new Telecomanda(masinaAdev);
        telecomanda.apasButonInainte();
        System.out.println(RemoteControlled.getANumber(4));
    }

}

