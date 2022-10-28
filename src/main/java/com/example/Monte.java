package com.example;

import java.util.List;

public class Monte {
    
    private ArrayList<Carta> cartas = new ArrayList<Carta>();

    public Monte() {
    }


    public void emaralhar(){
         Collections.shuffle(cartas);
    }

    public virar(){
        return cartas.remove(0);
    }

    public parar() {

    }
    public receberCarta() {
        this.cartas.add(new Carta(numero, naipe))
        setPontos(getPontos() + numero);
    }
    

    
}
