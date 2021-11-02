package com.vojavy.ukol2;

public class ValidatorTextu {

    String vzor;

    public ValidatorTextu(String vzor){
        this.vzor = vzor;
    }
    public boolean validuj(){
        boolean flag;
        if (this.vzor.matches("[A-Z][a-z]+\\s[A-Z][a-z]+|[A-Z][a-z]+[A-Z][a-z]+")) flag = true;
                else flag = false;
        return flag;
    }

    @Override
    public String toString() {
        return "ValidatorTextu{" +
                "vzor = '" + validuj() + '\'' +
                '}';
    }
}
