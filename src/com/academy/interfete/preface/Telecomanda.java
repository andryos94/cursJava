package com.academy.interfete.preface;

public class Telecomanda {

    private Masina masina;///referinta la masina

    public Telecomanda(Masina masina) {//distrug constructorul default
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