package com.vojavy;

public class Programator extends Person{
    public Programator(String jmeno, double plat) {
        super(jmeno, plat);
    }

    @Override
    void pracuj() {
        System.out.println("ted' pise kod");
    }

    @Override
    void odpocivej() {
        System.out.println("ted' nepise kod");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
