package com.example;

public class Carta extends Naipe{

    private static int numero;
    private Naipe naipe;

    public Carta(int numero, Naipe naipe) {
        this.naipe = naipe;
        this.numero = numero;
    }
    
    public String imagePath(){
        return "classic-cards/" + numero + this.Naipe + ".png";
    }
    public int getNumero(){
        return numero;
    }
    
    public Naipe getNaipe() {
        return naipe;
    }
    
}
