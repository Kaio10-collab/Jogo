package com.br.zup;

public class Videogame extends Jogo {
    private int quantidadeDeJogadores;

    private boolean online;

    public boolean isOnline() {
        return online;
    }

    public void setOnline(boolean online) {
        this.online = online;
    }


    public int getQuantidadeDeJogadores() {
        return quantidadeDeJogadores;
    }


    public void setQuantidadeDeJogadores(int quantidadeDeJogadores) {
        this.quantidadeDeJogadores = quantidadeDeJogadores;
    }
}