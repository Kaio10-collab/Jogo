package com.br.zup;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    ArrayList<Jogo> jogos = new ArrayList<>();
    Scanner teclado = new Scanner(System.in);

    public void criarMenu() {
        while (true) {
            System.out.println("1 Cadastrar jogo \n2 Pesquisar jogo \n3 Sair");

            int opcao = teclado.nextInt();

            if (opcao == 1) {
                cadastrarJogo();

            } else if (opcao == 2) {
                pesquisar();

            } else if (opcao == 3) {
                break;
            }
        }
    }
    private void pesquisar(){
        System.out.println(jogos);
    }

    private void cadastrarJogo() {
        System.out.println("Qual o tipo de jogo? (Videogame, Rua ou Tabuleiro)");
        String opcao = teclado.nextLine();
        if (opcao.equalsIgnoreCase("Videogame")) {
            Videogame videogame = new Videogame();
            System.out.println("Nome:");
            videogame.setNome(teclado.nextLine());
            System.out.println("Quantidade de jogadores:");
            videogame.setQuantidadeDeJogadores(teclado.nextInt());
            System.out.println("Horas de jogo:");
            videogame.setHorasDeJogo(teclado.nextLine());
            System.out.println("Online?");
            videogame.setOnline(teclado.nextBoolean());
            videogame.setTipoDeJogo(TipoJogo.VIDEOGAME);
            jogos.add(videogame);

        } else if (opcao.equalsIgnoreCase("Rua")) {
            Rua rua = new Rua();
            System.out.println("Nome:");
            rua.setNome(teclado.nextLine());
            System.out.println("Local para brincar (Rua, Passeio):");

            if (teclado.nextLine().equalsIgnoreCase("Rua")) {
                rua.setLocalBrincar(LocalJogo.RUA);

            } else if (teclado.nextLine().equalsIgnoreCase("Passeio")) {
                rua.setLocalBrincar(LocalJogo.PASSEIO);
            }
                System.out.println("Horas de jogo:");
                rua.setHorasDeJogo(teclado.nextLine());
                rua.setTipoDeJogo(TipoJogo.RUA);
                jogos.add(rua);

            } else if (opcao.equalsIgnoreCase("Tabuleiro")) {
            Tabuleiro tabuleiro = new Tabuleiro();
            System.out.println("Nome:");
            tabuleiro.setNome(teclado.nextLine());
            System.out.println("Quantidade de peças:");
            tabuleiro.setQuantidadePecas(teclado.nextInt());
            System.out.println("Quantidade de jogadores:");
            tabuleiro.setQuantidadeJogadores(teclado.nextInt());
            System.out.println("Horas de jogo:");
            tabuleiro.setHorasDeJogo(teclado.nextLine());
            tabuleiro.setTipoDeJogo(TipoJogo.TABULEIRO);
            jogos.add(tabuleiro);

            }
        }
    }
