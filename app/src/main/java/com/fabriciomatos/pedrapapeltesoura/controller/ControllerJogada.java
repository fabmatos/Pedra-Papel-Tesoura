package com.fabriciomatos.pedrapapeltesoura.controller;

import com.fabriciomatos.pedrapapeltesoura.model.Jogada;

import java.util.Random;

public class ControllerJogada {

    protected Jogada jogada;
    Random random = new Random();

    public Jogada calculaResultado(int jogadaHumano){

        int jogadaPC = random.nextInt(3);
        jogada = new Jogada(jogadaHumano,jogadaPC);

        if(jogadaHumano == 0 && jogadaPC == 1){
            jogada.setDescricaoJogada("Você perdeu :/");
        }else if(jogadaHumano == 0 && jogadaPC == 2){
            jogada.setDescricaoJogada("Você ganhou |o|");
        }else if(jogadaHumano == 1 && jogadaPC == 0){
            jogada.setDescricaoJogada("Você ganhou |o|");
        }else if(jogadaHumano == 1 && jogadaPC == 2){
            jogada.setDescricaoJogada("Você perdeu :/");
        }else if(jogadaHumano == 2 && jogadaPC == 0) {
            jogada.setDescricaoJogada("Você perdeu :/");
        }else if(jogadaHumano == 2 && jogadaPC == 1){
            jogada.setDescricaoJogada("Você ganhou |o|");
        }else
            jogada.setDescricaoJogada("Empate! Tente novamente!");

        return jogada;
    }
}
