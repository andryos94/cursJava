package com.academy.interfete.preface;

public class Telecomanda {

    private Masina masina;

    public Telecomanda(Masina masina) {
        this.masina = masina;
    }

    public void apasButonInainte() {
        System.out.println("Apasat buton inainte!!!");
        masina.mergiInainte();
    }

    public void apasButonInapoi() {
        System.out.println("Apasat buton inapoi!!!");
        masina.mergiInapoi();

    }
}