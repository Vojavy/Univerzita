package com.vojavy;

public class Manager extends Person{
    public Manager(String jmeno, double plat) {
        super(jmeno, plat);
    }

    @Override
    void pracuj() {
        System.out.println("ted' telefonuje zakaznikam");
    }

    @Override
    void odpocivej() {
        System.out.println("ted' netelefonuje zakaznikam");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
