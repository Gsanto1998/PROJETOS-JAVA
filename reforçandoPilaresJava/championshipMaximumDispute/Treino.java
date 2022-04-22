package championshipMaximumDispute;

import java.util.Locale;

public class Treino extends Jogadores {
    private Jogadores treinar;
    private boolean treinoAtacantes = false;
    private boolean treinoMeioCampistas = false;
    private boolean treinoLaterais = false;
    private boolean treinoZagueiros = false;
    private boolean treinoGoleiros = false;
    private boolean treinando = false;

    @Override
    public void treinar() {
        while (true) {
            int posiTreino;
            setForcaTime(getForcaTime()+1);
            if (getTreinando()) {
                setCansaco(getCansaco() + 1);
                System.out.println("Cansaço do time: " + getCansaco() + ", deseja continuar treinando? SIM - [S] NÃO - [N]");
                String seq = scanner.nextLine().toUpperCase(Locale.ROOT);
                if (seq.equals("S")) {
                    System.out.println("Qual posição ainda precissa de treinamento?\n1 - [ATACANTE];\n2 - [MEIO CAMPO];\n3 - [LATERAL];\n4 - [ZAGUEIRO];\n5 - [GOLEIROS];");
                }
                else {
                    break;
                }
            }
            else {
                System.out.println("Qual posição deseja reforçar o treinamento?\n1 - [ATACANTE];\n2 - [MEIO CAMPO];\n3 - [LATERAL];\n4 - [ZAGUEIRO];\n5 - [GOLEIROS];");
            }
            posiTreino = scanner1.nextInt();
            setTreinando(true);
            if (posiTreino == 1) {
                setTreinoAtacantes(true);
                ganharExperiencia();
            } else if (posiTreino == 2) {
                setTreinoMeioCampistas(true);
                ganharExperiencia();
            } else if (posiTreino == 3) {
                setTreinoLaterais(true);
                ganharExperiencia();
            } else if (posiTreino == 4) {
                setTreinoZagueiros(true);
                ganharExperiencia();
            } else if (posiTreino == 5) {
                setTreinoGoleiros(true);
                ganharExperiencia();
            }
            else {
                System.out.println("Digite um número valido: \n1 - [ATACANTE];\n2 - [MEIO CAMPO];\n3 - [LATERAL];\n4 - [ZAGUEIRO];\n5 - [GOLEIROS];");
            }
        }
    }

    @Override
    public void ganharExperiencia() {
        setForcaJogadores(getForcaJogadores() + 1);
        if (getTreinoAtacantes()) {
            System.out.println("Você esta colocando seus atacantes para treinar mais as finalizações!");
            setForcaAtaque(getForcaAtaque() + 1);
            forcaTimeJogadores();
        } else if (getTreinoMeioCampistas()) {
            System.out.println("Você esta colocando seus meio campistas para treinar mais as cobranças de faltas, lançamentos, passes e desarmes!");
            setForcaMeioCampo(getForcaMeioCampo() + 1);
            forcaTimeJogadores();
        } else if (getTreinoLaterais()) {
            System.out.println("Você esta colocando seus laterais para treinar a marcação, chegada no ataque e cruzamentos!");
            setForcaLaterais(getForcaLaterais() + 1);
            forcaTimeJogadores();
        } else if (getTreinoZagueiros()) {
            System.out.println("Você esta colocando seus zagueiros para treinar a marcação, posicionamento nas áreas de defesa e ataque e cabeceio!");
            setForcaZagueiros(getForcaZagueiros() + 1);
            forcaTimeJogadores();
        } else if (getTreinoGoleiros()) {
            System.out.println("Você esta colocando seus goleiros para treinar a saída de bola, defesas difíceis e orientação de barreiras!");
            setForcaGoleiros(getForcaGoleiros() + 1);
            forcaTimeJogadores();
        }
    }
    @Override
    public void forcaTimeJogadores(){
        System.out.println("FORÇA DO SEU TIME E JOGADORES (POR POSIÇÃO):\n\nFORÇA DO TIME EM GERAL: "+getForcaTime()+"\nFORÇA DO ATAQUE: "
                +getForcaAtaque()+"\nFORÇA DO MEIO CAMPO: "+ getForcaMeioCampo()+"\nFORÇA DOS LATERAIS: "+getForcaLaterais()+"\nFORÇA DOS ZAGUEIROS: "
                +getForcaZagueiros()+ "\nFORÇA DOS GOLEIROS: "+getForcaGoleiros());
    }

    public Jogadores getTreinar() {
        return treinar;
    }

    public void setTreinar(Jogadores treinar) {
        this.treinar = treinar;
    }

    public boolean getTreinoAtacantes() {
        return treinoAtacantes;
    }

    public void setTreinoAtacantes(boolean treinoAtacantes) {
        this.treinoAtacantes = treinoAtacantes;
    }

    public boolean getTreinoMeioCampistas() {
        return treinoMeioCampistas;
    }

    public void setTreinoMeioCampistas(boolean treinoMeioCampistas) {
        this.treinoMeioCampistas = treinoMeioCampistas;
    }

    public boolean getTreinoLaterais() {
        return treinoLaterais;
    }

    public void setTreinoLaterais(boolean treinoLaterais) {
        this.treinoLaterais = treinoLaterais;
    }

    public boolean getTreinoZagueiros() {
        return treinoZagueiros;
    }

    public void setTreinoZagueiros(boolean treinoZagueiros) {
        this.treinoZagueiros = treinoZagueiros;
    }

    public boolean getTreinoGoleiros() {
        return treinoGoleiros;
    }

    public void setTreinoGoleiros(boolean treinoGoleiros) {
        this.treinoGoleiros = treinoGoleiros;
    }

    public boolean getTreinando() {
        return treinando;
    }

    public void setTreinando(boolean treinando) {
        this.treinando = treinando;
    }
}
