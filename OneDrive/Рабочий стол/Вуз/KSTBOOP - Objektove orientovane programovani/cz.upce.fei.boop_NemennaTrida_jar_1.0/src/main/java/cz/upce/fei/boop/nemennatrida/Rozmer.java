package cz.upce.fei.boop.nemennatrida;

import java.util.Locale;


public class Rozmer {

//<editor-fold defaultstate="collapsed" desc="Veřejné konstanty">
    static final double DIMENZE_MAX = 100;
    static final double DIMENZE_MIN = 0.10;
    
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Privátní konstanty ">
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Instanční proměnné/Atributy">
    // Stav objektu-u neměných objektu použít final
    /**
     * Délka rozměru jako celé číslo v centimetrech
     */
    private double delkaCent;
    /**
     * Šířka rozměru jako celé číslo v centimetrech
     */
    private double sirkaCent;
    /**
     * Výška rozměru jako celé číslo v centimetrech
     */
    private double vyskaCent;
    
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Konstruktory">
    /**
     * Konstruktor třídy zajistí definici (inicializaci) hodnot privátních
     * instančních proměnných
     *
     * @param delka rozměr délka v m
     * @param sirka rozměr šířka v m
     * @param vyska rozměr výška v m
     *
     * @throws MojeException se vystaví, když alespoň hodnota jednoho vstupního
     * parametruje mimo povolený rozsah
     */
    public Rozmer(final double delka, final double sirka, final double vyska) throws MojeException{
            if (!check(delka)){
                throw new MojeException("Delka, neni uvnitr hranice: [" + DIMENZE_MIN + ";" + DIMENZE_MAX + "]" );
            } else
                this.delkaCent = Math.round(delka * 100d);
            if (!check(sirka)){
                throw new MojeException("Sirka, neni uvnitr hranice: [" + DIMENZE_MIN + ";" + DIMENZE_MAX + "]" );
            } else
                this.sirkaCent = Math.round(sirka * 100d);
            if (!check(vyska)){
                throw new MojeException("Vyska, neni uvnitr hranice: [" + DIMENZE_MIN + ";" + DIMENZE_MAX + "]" );
            } else
                this.vyskaCent = Math.round(vyska * 100d);
    }
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Přístupové metody ke stavu">
    /**
     * @return hodnota délky rozměru v m
     */
    public double getDelka() {
        return delkaCent/ 100d;
    }

    /**
     * @return hodnota šířky rozměru v m
     */
    public double getSirka() {
        return sirkaCent/ 100d;
    }

    /**
     * @return hodnota výšky rozměru v m
     */
    public double getVyska() {
        return vyskaCent/ 100d;
    }
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Sestavení informace o stavu - toString">
    /**
     * Nápověda: format(Locale.ENGLISH,
     * "Rozmer{delka=%5.2f,sirka=%5.2f,vyska=%5.2f}",
     *
     * @return
     */
//    @Override
//    public String toString() {
//        return String.format(Locale.ENGLISH, ("Rozmer{delka= " + getDelka() +",sirka= "+getSirka()+",vyska= " + getVyska()+" }"  ));
//    }
    @Override
public String toString() {
    return String.format(Locale.ENGLISH, ("Rozmer{delka=%5.2f,sirka=%5.2f,vyska=%5.2f}"),
        getDelka(), getSirka(), getVyska());
}
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Metody equals a hashCode">

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) return false;
        if (this == obj) return true;
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
    /**
     * @param dimenze hodnota dílčího rozměru ke kontrole v metrech
     * @return vraci true, kdyz je dimenze v povoleném rozsahu
     */
    public static boolean kontrolaDimenze(double dimenze) {
        return (dimenze <= DIMENZE_MAX && dimenze >= DIMENZE_MIN);
    }
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Privátní metody">
    private static boolean check(double dimenze){
       return (dimenze <= DIMENZE_MAX && dimenze >= DIMENZE_MIN);
    }
//</editor-fold>
}
