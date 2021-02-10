package com.br.zup;

public class Rua extends Jogo {

    private boolean perigosa;
    private LocalJogo localBrincar;
    private int quantidadeJogadores;

    public boolean isPerigosa() {
        return perigosa;
    }

    public void setPerigosa(boolean perigosa) {
        this.perigosa = perigosa;
    }

    public LocalJogo getLocalBrincar() {
        return localBrincar;
    }

    public void setLocalBrincar(LocalJogo localBrincar) {
        this.localBrincar = localBrincar;
    }

    public int getQuantidadeJogadores() {
        return quantidadeJogadores;
    }

    public void setQuantidadeJogadores(int quantidadeJogadores) {
        this.quantidadeJogadores = quantidadeJogadores;
    }
}