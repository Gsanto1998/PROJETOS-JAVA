package championshipMaximumDispute;

import java.util.Scanner;

public class Times {
    private String nomeTime;
    private Jogadores jogadoresTime;
    private String estadio;
    private int forcaTime;

    Scanner scanner = new Scanner(System.in);
    Scanner scanner1 = new Scanner(System.in);

    public void criarTime() {
        System.out.println("Qual o nome do time que deseja criar? ");
        this.nomeTime = scanner.nextLine();
        System.out.println("Dê um nome para seu estádio: ");
        this.estadio = scanner.nextLine();
        System.out.println("E qual a força inicial desse time: ");
        this.forcaTime = scanner1.nextInt();
        System.out.println("REGISTRADO COM SUCESSO:\nNOME: " + getNomeTime() + ";\nESTÁDIO: " + getEstadio() + ";\nFORÇA INICIAL: " + getForcaTime() + ";");
        setJogadores();
    }

    public void treinar() {
    }

    public void jogar() {
    }

    public void ganhaTrofeus() {

    }

    public String getNomeTime() {
        return nomeTime;
    }

    public void setNomeTime(String nomeTime) {
        this.nomeTime = nomeTime;
    }

    public Jogadores getJogadoresTime() {
        return jogadoresTime;
    }

    public void setJogadores() {
        System.out.println("Agora vamos criar seus jogadores, lembre-se que deve ser no mínimo 15;");
        this.jogadoresTime = new Jogadores();
        jogadoresTime.criarJogadores();
        System.out.println("TIME:" + getNomeTime() + "; ESTÁDIO:" + getEstadio() + " \nJogadores: " + "ATACANTES: " + jogadoresTime.nomesAtacantes + "; FORÇA: " + jogadoresTime.getForcaAtaque() + "\nMEIO CAMPO: " + jogadoresTime.nomesMeiocampistas + ";FORÇA: " + jogadoresTime.getForcaLaterais() + "\nLATERAIS: " + jogadoresTime.nomesLaterais + "; FORÇA: " + jogadoresTime.getForcaLaterais() + "\nZAGUEIROS: " + jogadoresTime.nomesZagueiros + "; FORÇA: " + jogadoresTime.getForcaZagueiros() + "\nGOLEIROS: " + jogadoresTime.nomesGoleiros + "; FORÇA: " + jogadoresTime.getForcaGoleiros());
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public int getForcaTime() {
        return forcaTime;
    }

    public void setForcaTime(int forcaTime) {
        this.forcaTime = forcaTime;
    }
}
