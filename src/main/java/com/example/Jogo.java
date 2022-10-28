public class Jogo {
    
    Monte monte = new Monte();

    Jogador jogador = new jogador();

    Computador computador = new Computador();

    public Jogo(){
        monte.embaralhar();
    }

    public distribuiCartaParaJogador(Jogador) {
        return Carta;
    }

    public boolean acabou() {
        if(jogador.getPontos() > 21 || computador.getPontos() > 21){
            jogador.setParou(true);
            return true;
        }else if(jogador.isParou() == true && computador.parou() == true){
            jogador.setParou(true);
            return true;
        }

        return false;
    }

    public String resultado() {
        if(acabou()==true){
            if(jogador.getPontos() > 21){
                return "Computador ganhou!";
            }
            else if(computador.getPontos()>21){
                return "Jogador ganhou!"
            }
            else if(21-jogador.getPontos()<computador.getPontos()){
                return "Joagador ganhou!";
            }
            else if(21-computador.getPontos()<jogador.getPontos()){
                return "computador ganhou!";
            }
        return null;
        }
    }

    public Jogador getJogador() {
        return jogador;
    }
    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }
    public Computador getComputador() {
        return computador;
    }
    public void setComputador(Computador computador) {
        this.computador = computador;
    }
}
