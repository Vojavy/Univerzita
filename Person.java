package com.vojavy;

abstract class Person {
    String jmeno;
    double plat;

    public Person(String jmeno, double plat) {
        this.jmeno = jmeno;
        this.plat = plat;
    }

    abstract void pracuj();
    abstract void odpocivej();
    void predstavSe(){
        System.out.println("Jmenuji se " + jmeno + ", a plati me: " + plat);
    }

    @Override
    public String toString() {
        return "Person{" +
                "jmeno='" + jmeno + '\'' +
                ", plat=" + plat +
                '}';
    }
}
