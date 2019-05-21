package com.academy.cnst;


import static com.academy.cnst.EnumExamples.Month.JANUARY;

public class EnumExamples {


    static enum Month {
        JANUARY(31),
        FEBRUARY(28);
        //..

        int nrOfDays;

        Month(int nrOfDays) {
            this.nrOfDays = nrOfDays;
        }

        public int getNrOfDays() {
            return nrOfDays;
        }
    }

    public static void main(String[] args) {
        Month aMonth = Month.JANUARY;
        System.out.println(JANUARY.ordinal());
        System.out.println(JANUARY.getNrOfDays());
        Month[] values = Month.values();
        for (int i = 0; i < values.length; i++) {
            System.out.println("enum => " + values[i]);
        }

    }
}