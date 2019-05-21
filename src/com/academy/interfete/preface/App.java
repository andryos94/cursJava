package com.academy.interfete.preface;

public class App {

    public static void main(String[] args) {
        Masina masina = new Masina();
        Telecomanda telecomanda = new Telecomanda(masina);
        telecomanda.apasButonInainte();
    }

}