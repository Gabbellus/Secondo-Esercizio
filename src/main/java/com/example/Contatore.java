package com.example;

public class Contatore {
    private int valore = 0;
    private int valMax; 

    public Contatore(int val){

        this.valore = 0;
        this.valMax = val;

    }

    public synchronized boolean incrementa(String nomeThread){
        if(this.valore < this.valMax){
            this.valore ++;
            System.out.println(nomeThread + " ha incrementato il contatore a: " + this.valore);
            return true;
        }
        return false;
    }
}
