package com.academy.interfete.solutie;

public interface RemoteControlled {

    void mergiInainte();

    void mergiInapoi();

    void vireazaStanga();

    default void vireazaDreapta() {

    }

    static int getANumber(int x){
        return x + 3;
    }
}