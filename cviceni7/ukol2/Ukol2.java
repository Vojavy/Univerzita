package com.vojavy.ukol2;

public class Ukol2 {
    public static void main(String[] args) {
        ValidatorTextu validatorTextu1 = new ValidatorTextu("AndriiStreblichenko");
        ValidatorTextu validatorTextu2 = new ValidatorTextu("Vladimir Putin");
        ValidatorTextu validatorTextu3 = new ValidatorTextu("egorSklianka");
        ValidatorTextu validatorTextu4 = new ValidatorTextu("Rufer");

        System.out.println(validatorTextu1.toString());
        System.out.println(validatorTextu2.toString());
        System.out.println(validatorTextu3.toString());
        System.out.println(validatorTextu4.toString());
    }
}
