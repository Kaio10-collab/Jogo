package com.br.zup;

public class Main {

    public static void main(String[] args) {

        Menu menu = new Menu();
        menu.criarMenu();

    }
}
//Faça um sistema que possibilite cadastrar informações sobre jogos favoritos de uma pessoa.
//Nesse sistema podemos cadastrar jogos de Tabuleiro, Videogame ou de Rua, após o cadastro de
// um jogo o sistema deve permitir visualizar a LISTA INTEIRA de jogos cadastrados.

//Jogos de Tabuleiro tem:
//Nome String
//Quantidade de Jogadores int
//Quantidade de Peças int
//Horas de jogo
//TipoDeJogo Enum

//Jogos de Videogame tem:
//Nome String
//Quantidade de Jogadores int
//Horas de jogo
//Online boolean
//TipoDeJogo Enum

//Jogos de Rua tem:
//Nome String
//Quantidade de Jogadores int
//Horas de jogo
//Perigosa Boolean
//LocalParaBrinca Enum
//TipoDeJogo Enum