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
        for(Jogo jogo : jogos) {
            if (jogo instanceof Rua) {
                Rua rua = (Rua) jogo;
                System.out.println("Nome: "+rua.getNome());
                System.out.println("Quantidade de Jogadores: "+rua.getQuantidadeJogadores());
                System.out.println("Horas de jogo: "+rua.getHorasDeJogo());
                System.out.println("Perigosa: "+rua.isPerigosa());
                System.out.println("LocalParaBrinca: "+rua.getLocalBrincar());
                System.out.println("TipoDeJogo: "+rua.getTipoDeJogo());

            }else if (jogo instanceof Tabuleiro){
                Tabuleiro tabuleiro = (Tabuleiro) jogo;
                System.out.println("Nome: "+tabuleiro.getNome());
                System.out.println("Quantidade de Jogadores: "+tabuleiro.getQuantidadeJogadores());
                System.out.println("Horas de jogo: "+tabuleiro.getHorasDeJogo());
                System.out.println("Quantidade de peças: "+tabuleiro.getQuantidadePecas());
                System.out.println("TipoDeJogo: "+tabuleiro.getTipoDeJogo());

            }else if (jogo instanceof Videogame){
                Videogame videogame = (Videogame) jogo;
                System.out.println("Nome: "+videogame.getNome());
                System.out.println("Quantidade de Jogadores: "+videogame.getQuantidadeDeJogadores());
                System.out.println("Horas de jogo: "+videogame.getHorasDeJogo());
                System.out.println("Online: "+videogame.isOnline());
                System.out.println("TipoDeJogo: "+videogame.getTipoDeJogo());
            }
            System.out.println();
        }
    }

    private void cadastrarJogo() {
        System.out.println("Qual o tipo de jogo? (Videogame, Rua ou Tabuleiro)");
        String opcao = teclado.next();
        if (opcao.equalsIgnoreCase("Videogame")) {
            Videogame videogame = new Videogame();
            System.out.println("Nome:");
            videogame.setNome(teclado.next());
            System.out.println("Quantidade de jogadores:");
            videogame.setQuantidadeDeJogadores(teclado.nextInt());
            System.out.println("Horas de jogo:");
            videogame.setHorasDeJogo(teclado.next());
            System.out.println("Online?");
            videogame.setOnline(teclado.nextBoolean());
            videogame.setTipoDeJogo(TipoJogo.VIDEOGAME);
            jogos.add(videogame);

        } else if (opcao.equalsIgnoreCase("Rua")) {
            Rua rua = new Rua();
            System.out.println("Nome:");
            rua.setNome(teclado.next());
            System.out.println("Local para brincar (Rua, Passeio):");

            if (teclado.next().equalsIgnoreCase("Rua")) {
                rua.setLocalBrincar(LocalJogo.RUA);

            } else if (teclado.next().equalsIgnoreCase("Passeio")) {
                rua.setLocalBrincar(LocalJogo.PASSEIO);
            }
                System.out.println("Horas de jogo:");
                rua.setHorasDeJogo(teclado.next());
            System.out.println("Perigosa:");
            rua.setPerigosa(teclado.nextBoolean());
            System.out.println("Quantidade de jogadores:");
            rua.setQuantidadeJogadores(teclado.nextInt());
                rua.setTipoDeJogo(TipoJogo.RUA);
                jogos.add(rua);

            } else if (opcao.equalsIgnoreCase("Tabuleiro")) {
            Tabuleiro tabuleiro = new Tabuleiro();
            System.out.println("Nome:");
            tabuleiro.setNome(teclado.next());
            System.out.println("Quantidade de peças:");
            tabuleiro.setQuantidadePecas(teclado.nextInt());
            System.out.println("Quantidade de jogadores:");
            tabuleiro.setQuantidadeJogadores(teclado.nextInt());
            System.out.println("Horas de jogo:");
            tabuleiro.setHorasDeJogo(teclado.next());
            tabuleiro.setTipoDeJogo(TipoJogo.TABULEIRO);
            jogos.add(tabuleiro);

            }
        }
    }
