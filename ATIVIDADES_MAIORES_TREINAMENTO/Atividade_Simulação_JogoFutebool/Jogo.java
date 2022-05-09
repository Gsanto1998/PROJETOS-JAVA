package campeonatoTheBest;

public class Jogo{
    private Times jogador1;
    private Times jogador2;


    public void marcarJogo(Times j1, Times j2) {
        if (j1 != j2) {
            this.jogador1 = j1;
            this.jogador2 = j2;
            System.out.println(" ");
            System.out.println("Hoje é dia de clássico, e que classico em Galvão!");
            System.out.println(" ");
            System.out.println("### MANDANTE ###");
            System.out.println(" ");
            this.jogador1.apresentarTime();
            System.out.println(" ");
            System.out.println("### VISITANTE ###");
            System.out.println(" ");
            this.jogador2.apresentarTime();
            System.out.println(" ");
            System.out.println("===========================================================");
            System.out.println("Os times estão preparados para entrarem em campo!");
            System.out.println("===========================================================");
            System.out.println("************* QUE LINDA A FESTA NAS ARQUIBANCADAS ***********");
            System.out.println("===========================================================");
            System.out.println(" ");
            this.jogador1.jogar();
            System.out.println(" ");
            this.jogador2.jogar();
            System.out.println(" ");
            System.out.println("                   "+Times.ANSI_GREEN_BACKGROUND+" E começa a partida! " + Times.ANSI_RESET);
            System.out.println(" ");
            placar();
        }
        else {
            this.jogador1 = null;
            this.jogador2 = null;
            System.out.println("O jogo não poderá ocorrer!");
        }
    }

    public void placar() {
        this.jogador1.placar2();
        this.jogador2.placar2();
    }


    public Times getJogador1() {
        return jogador1;
    }

    public void setJogador1(Times jogador1) {
        this.jogador1 = jogador1;
    }

    public Times getJogador2() {
        return jogador2;
    }

    public void setJogador2(Times jogador2) {
        this.jogador2 = jogador2;
    }

}