package com.fabriciomatos.pedrapapeltesoura.model;

public class Jogada {

    private int numeroJogadorHumano;
    private int numeroJogadorPc;
    private String descricaoJogada;

    public Jogada(int numeroJogadorHumano, int numeroJogadorPc){
        this.numeroJogadorHumano = numeroJogadorHumano;
        this.numeroJogadorPc = numeroJogadorPc;
    }

    public int getNumeroJogadorHumano() {
        return numeroJogadorHumano;
    }

    public int getNumeroJogadorPc() {
        return numeroJogadorPc;
    }

    public String getDescricaoJogada() {
        return descricaoJogada;
    }

    public void setDescricaoJogada(String descricaoJogada) {
        this.descricaoJogada = descricaoJogada;
    }
}
