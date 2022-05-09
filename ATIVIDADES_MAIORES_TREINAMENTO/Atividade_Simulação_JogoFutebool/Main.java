package campeonatoTheBest;

public class Main {
    public static void main(String[] args) {
        //RECOMENDA-SE A TREINAR DE 4 A 6 VEZES POR SEMANA, NEM A MAIS E NEM A MENOS QUE ISSO;
        Jogo premier = new Jogo();
        Times[] executar = new Times[5];
        System.out.println("");
        executar[0] = new Times(Times.BLUE_BACKGROUND+" Chelsea FC "+Times.ANSI_RESET, 0,0, 2,false,0,4,0,0);
        System.out.println("");
        executar[1] = new Times(Times.RED_BACKGROUND+" Liverpool FC "+ Times.ANSI_RESET, 0,0, 1,false,0,1,1,2);
        System.out.println("");
        executar[2] = new Times(Times.CYAN_BACKGROUND+" Manchester City "+ Times.ANSI_RESET, 0,0, 1,false,0,2,1,1);
        System.out.println("");
        executar[3] = new Times(Times.PURPLE_BACKGROUND+" Arsenal "+ Times.ANSI_RESET, 0,0, 0,false,0,0,2,2);
        System.out.println("");
        executar[4] = new Times(Times.FUNDO_BRANCO+" Tothenham "+ Times.ANSI_RESET, 0,0, 1,false,0,1,2,1);
        System.out.println("");
        executar[0].treinar();
        executar[1].treinar();
        executar[2].treinar();
        executar[3].treinar();
        executar[4].treinar();
        premier.marcarJogo(executar[0], executar[1]);
        executar[0].marcarGol();
        premier.placar();

    }
}
