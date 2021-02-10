package com.br.zup;

public class Jogo {

    private String nome;
    private String horasDeJogo;
    private TipoJogo tipoDeJogo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHorasDeJogo() {
        return horasDeJogo;
    }

    public void setHorasDeJogo(String horasDeJogo) {
        this.horasDeJogo = horasDeJogo;
    }

    public TipoJogo getTipoDeJogo() {
        return tipoDeJogo;
    }

    public void setTipoDeJogo(TipoJogo tipoDeJogo) {
        this.tipoDeJogo = tipoDeJogo;
    }
}
