package com.example;

public class Computador extends Jogador {
    
    public Computador(int pontos, boolean parou) {
        super(pontos, parou);
    }
    public Computador(){
        
    }

    @Override
    public boolean parou() {
        if (this.getPontos() >= 16){
            return true;
        }
        return false;
    }

}
