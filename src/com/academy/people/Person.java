package com.academy.people;

public class Person extends Object {

    private String nume;
    public String prenume;
    long cnp;

    public Person() {
        super();
    }

    public Person(String prenumePersoana) {
        super();
        prenume = prenumePersoana;
    }

    public Person(String numePersoana, String prenumePersoana, long cnpPersoana) {
        this(prenumePersoana);
        nume = numePersoana;
//        prenume = prenumePersoana;
        cnp = cnpPersoana;
    }

    @Override
    public String toString() {
        return "Person{" +
                "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", cnp=" + cnp +
                '}';
    }

    //    public Person(/* parametrii*/) {
//        //corp
//    }

    // fielduri, metode, constructor

}
