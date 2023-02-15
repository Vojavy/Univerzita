/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Record.java to edit this template
 */
package record;

import cz.upce.fei.boop.nemennatrida.MojeException;
import java.util.Locale;


public record Rozmer() {

//<editor-fold defaultstate="collapsed" desc="Veřejné konstanty">
    static final double DIMENZE_MAX = 100d;
    static final double DIMENZE_MIN = 0.10d;

//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Instanční proměnné/Atributy">
    // Stav objektu-u neměných objektu použít final
    /**
     * Délka rozměru jako celé číslo v centimetrech
     */
    static private double delkaCent;
    /**
     * Šířka rozměru jako celé číslo v centimetrech
     */
    static private double sirkaCent;
    /**
     * Výška rozměru jako celé číslo v centimetrech
     */
    static private double vyskaCent;

//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Konstruktory">
  
    public Rozmer(final double delka, final double sirka, final double vyska) throws MojeException {
    this();
    if (!check(delka)) {
        throw new MojeException("Delka, neni uvnitr hranice: [" + DIMENZE_MIN + ";" + DIMENZE_MAX + "]");
    } else {
        Rozmer.delkaCent = Math.round(delka * 100d);
    }
    if (!check(sirka)) {
        throw new MojeException("Sirka, neni uvnitr hranice: [" + DIMENZE_MIN + ";" + DIMENZE_MAX + "]");
    } else {
        Rozmer.sirkaCent = Math.round(sirka * 100d);
    }
    if (!check(vyska)) {
        throw new MojeException("Vyska, neni uvnitr hranice: [" + DIMENZE_MIN + ";" + DIMENZE_MAX + "]");
    } else {
        Rozmer.vyskaCent = Math.round(vyska * 100d);
    }
}
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Přístupové metody ke stavu">
    public double getDelka() {
        return delkaCent / 100d;
    }
    
    public double getSirka() {
        return sirkaCent / 100d;
    }
    
    public double getVyska() {
        return vyskaCent / 100d;
    }
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Sestavení informace o stavu - toString">
    @Override
    public String toString() {
        return String.format(Locale.ENGLISH, ("Rozmer{delka=%5.2f,sirka=%5.2f,vyska=%5.2f}"),
                getDelka(), getSirka(), getVyska());
    }
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Metody equals a hashCode">
    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        Rozmer rozm = (Rozmer) obj;
        return (this.getDelka() == rozm.getDelka() && this.getSirka() == rozm.getSirka() && this.getVyska() == rozm.getVyska()); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + (int) getDelka();
        hash = 31 * hash + (int) getVyska();
        hash = 31 * hash + (int) getSirka();
        return hash;
    }

//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Ostatní veřejné metody">

    public static boolean kontrolaDimenze(double dimenze) {
        return (dimenze <= DIMENZE_MAX && dimenze >= DIMENZE_MIN);
    }
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Privátní metody">

    private static boolean check(double dimenze) {
        return (dimenze <= DIMENZE_MAX && dimenze >= DIMENZE_MIN);
    }
//</editor-fold>
}
