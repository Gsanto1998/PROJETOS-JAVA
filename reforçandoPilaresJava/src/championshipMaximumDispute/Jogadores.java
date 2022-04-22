package championshipMaximumDispute;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Jogadores extends Times {
    List<String> nomesAtacantes = new ArrayList<String>(1);
    List<String> nomesMeiocampistas = new ArrayList<String>(1);
    List<String> nomesLaterais = new ArrayList<String>(1);
    List<String> nomesZagueiros = new ArrayList<String>(1);
    List<String> nomesGoleiros = new ArrayList<String>(1);

    private String nomeJogador;
    private String posicao;
    private String habilidades;
    private int cansaco = 0;
    int qtdAtacante = 0;
    int qtdMeioCampo = 0;
    int qtdLateral = 0;
    int qtdZagueiro = 0;
    int qtdGoleiro = 0;
    int forcaAtaque = 0;
    int forcaMeioCampo = 0;
    int forcaLaterais = 0;
    int forcaZagueiros = 0;
    int forcaGoleiros = 0;
    int forcaJogadores = 0;

    Scanner scanner = new Scanner(System.in);
    Scanner scanner1 = new Scanner(System.in);

    public void criarJogadores() {
        for (int i = 1; i < 16; i++) {
            System.out.println("Registre o " + i + "° jogador: ");
            this.nomeJogador = scanner.nextLine();
            System.out.println("Qual a posição desse jogador?\n1 - [ATACANTE];\n2 - [MEIO CAMPO];\n3 - [LATERAL];\n4 - [ZAGUEIRO];\n5 - [GOLEIROS];");
            int posi = scanner1.nextInt();
            if (posi == 1) {
                nomesAtacantes.add(getNomeJogador());
                this.qtdAtacante++;
                atacante();
            } else if (posi == 2) {
                nomesMeiocampistas.add(getNomeJogador());
                this.qtdMeioCampo++;
                meioCampista();
            } else if (posi == 3) {
                nomesLaterais.add(getNomeJogador());
                this.qtdLateral++;
                lateral();
            } else if (posi == 4) {
                nomesZagueiros.add(getNomeJogador());
                this.qtdZagueiro++;
                zagueiro();
            } else if (posi == 5) {
                nomesGoleiros.add(getNomeJogador());
                this.qtdGoleiro++;
                goleiro();
            } else {
                System.out.println("Digite um número valido: \n1 - [ATACANTE];\n2 - [MEIO CAMPO];\n3 - [LATERAL];\n4 - [ZAGUEIRO];\n5 - [GOLEIROS];");
                posi = scanner1.nextInt();
                //CRIAR MÉTODO PARA VOLTAR CASO O USUARIO DIGITE UM NÚMERO ERRADO
            }
        }
    }

    public void ganharExperiencia() {
    }

    public void atacante() {
        if (getQtdAtacante() <= 3) {
            setPosicao("ATACANTE");
            if (getQtdAtacante() == 3) {
                System.out.println("Os ATACANTES registrados foram: ");
                nomesAtacantes.forEach(System.out::println);
            }
        } else {
            System.out.println("Imposivel inscrever mais ATACANTES");
        }
    }

    public void meioCampista() {
        if (getQtdMeioCampo() <= 4) {
            setPosicao("MEIO CAMPO");
            if (getQtdMeioCampo() == 4) {
                System.out.println("Os MEIO CAMPISTAS registrados foram: ");
                nomesMeiocampistas.forEach(System.out::println);
            }
        } else {
            System.out.println("Imposivel inscrever mais MEIO CAMPISTAS");
        }
    }

    public void lateral() {
        if (getQtdLateral() <= 3) {
            setPosicao("LATERAL");
            if (getQtdLateral() == 3) {
                System.out.println("Os LATERAIS registrados foram: ");
                nomesLaterais.forEach(System.out::println);
            }
        } else {
            System.out.println("Imposivel inscrever mais LATERAIS");
        }
    }

    public void zagueiro() {
        if (getQtdZagueiro() <= 3) {
            setPosicao("ZAGUEIRO");
            if (getQtdZagueiro() == 3) {
                System.out.println("Os ZAGUEIROS registrados foram: ");
                nomesZagueiros.forEach(System.out::println);
            }
        } else {
            System.out.println("Imposivel inscrever mais ZAGUEIROS");
        }
    }

    public void goleiro() {
        if (getQtdGoleiro() <= 2) {
            setPosicao("GOLEIROS");
            if (getQtdGoleiro() == 2) {
                System.out.println("Os GOLEIROS registrados foram: ");
                nomesGoleiros.forEach(System.out::println);
            }
        } else {
            System.out.println("Imposivel inscrever mais GOLEIRO");
        }
    }

    public String getNomeJogador() {
        return nomeJogador;
    }

    public void setNomeJogador(String nomeJogador) {
        this.nomeJogador = nomeJogador;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public String getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(String habilidades) {
        this.habilidades = habilidades;
    }

    public int getQtdAtacante() {
        return qtdAtacante;
    }

    public void setQtdAtacante(int qtdAtacante) {
        this.qtdAtacante = qtdAtacante;
    }

    public int getQtdMeioCampo() {
        return qtdMeioCampo;
    }

    public void setQtdMeioCampo(int qtdMeioCampo) {
        this.qtdMeioCampo = qtdMeioCampo;
    }

    public int getQtdLateral() {
        return qtdLateral;
    }

    public void setQtdLateral(int qtdLateral) {
        this.qtdLateral = qtdLateral;
    }

    public int getQtdZagueiro() {
        return qtdZagueiro;
    }

    public void setQtdZagueiro(int qtdZagueiro) {
        this.qtdZagueiro = qtdZagueiro;
    }

    public int getQtdGoleiro() {
        return qtdGoleiro;
    }

    public void setQtdGoleiro(int qtdGoleiro) {
        this.qtdGoleiro = qtdGoleiro;
    }

    public int getCansaco() {
        return cansaco;
    }

    public void setCansaco(int cansaco) {
        this.cansaco = cansaco;
    }

    public int getForcaAtaque() {
        return forcaAtaque;
    }

    public void setForcaAtaque(int forcaAtaque) {
        this.forcaAtaque = forcaAtaque;
    }

    public int getForcaMeioCampo() {
        return forcaMeioCampo;
    }

    public void setForcaMeioCampo(int forcaMeioCampo) {
        this.forcaMeioCampo = forcaMeioCampo;
    }

    public int getForcaLaterais() {
        return forcaLaterais;
    }

    public void setForcaLaterais(int forcaLaterais) {
        this.forcaLaterais = forcaLaterais;
    }

    public int getForcaZagueiros() {
        return forcaZagueiros;
    }

    public void setForcaZagueiros(int forcaZagueiros) {
        this.forcaZagueiros = forcaZagueiros;
    }

    public int getForcaGoleiros() {
        return forcaGoleiros;
    }

    public void setForcaGoleiros(int forcaGoleiros) {
        this.forcaGoleiros = forcaGoleiros;
    }

    public int getForcaJogadores() {
        return forcaJogadores;
    }

    public void setForcaJogadores(int forcaJogadores) {
        this.forcaJogadores = forcaJogadores;
    }
}
