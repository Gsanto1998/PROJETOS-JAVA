package campeonatoTheBest;

public class Times implements CaracteristicasTimes {
    private String nomeTime;private int treino;private int cansaco;private int potencialDoTime;
    private boolean jogo;private int gol;private int vitorias;private int derrotas;private int empates;


    public Times(String nomeTime, int treino, int cansaco, int potencialDoTime, boolean jogo, int gol, int vitorias, int derrotas, int empates) {
        this.nomeTime = nomeTime;this.treino = treino;this.cansaco = cansaco;this.potencialDoTime = potencialDoTime;
        this.jogo = jogo;this.gol = gol;this.vitorias = vitorias;this.derrotas = derrotas;this.empates = empates;
        apresentarTime();
    }
    Jogo placar = new Jogo();

    //CORES
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String YELLOW_BACKGROUND = "\u001B[43m\u001B[30m";
    public static final String RED_BACKGROUND = "\u001B[41m\u001B[30m";
    public static final String BLUE_BACKGROUND = "\u001B[44m\u001B[30m";
    public static final String CYAN_BACKGROUND = "\u001B[46m\u001B[30m";
    public static final String PURPLE_BACKGROUND = "\u001B[45m\u001B[30m";
    public static final String FUNDO_BRANCO = "\u001B[47m\u001B[30m";



    //GETTERS
    public String getNomeTime() {return nomeTime;}public int getTreino(){return treino;}public int getCansaco(){return cansaco;}
    public int getPotencialDoTime(){return potencialDoTime;}public boolean getJogo(){return jogo;}public int getGol(){return gol;}
    public int getVitorias() {return vitorias;}public int getDerrotas() {return derrotas;}public int getEmpates() {return empates;}


    //SETTERS
    public void setNomeTime(String nomeTime) {
        this.nomeTime = nomeTime;
    }

    public void setTreino(int treino){
        this.treino=treino;
        if (this.treino == 6){//AQUI ADCIONA 1 DE CANSASO PARA O TIME QUE ATINGIR 6 TREINOS DIRETOS;
            this.cansaco = cansaco +1;
        }
        else if (this.treino >= 7){//AQUI ADCIONA 2 DE CANSASO PARA O TIME QUE ATINGIR 7 TREINOS DIRETOS OU MAIS;
            this.potencialDoTime = potencialDoTime -1;
            this.cansaco = cansaco +2;

            if (this.cansaco >= 3 && this.cansaco <=5){//AQUI VERIFICA SE CANSASO ESTA ENTRE 3 E 5, CASO SIM ELE DA INPUT NA MSG DE ATENÇÃO (JOGADORES CANSADOS);
                System.out.println(YELLOW_BACKGROUND+"O time esta cansado, diminua a frequência dos treinos!"+ANSI_RESET);
            }
            else if (this.cansaco > 5 && this.cansaco <= 10 ){//AQUI ADCIONA 1 CANSASO PARA O TIME QUE ATINGIR 6 TREINOS DIRETOS
                System.out.println(RED_BACKGROUND+"+++++Os jogadores titulares estão se lezionando nos treinos frequentes!!+++++"+ANSI_RESET);
            }
            else {//ACIMA DE CANSASO = 10 OS JOGADORES PASSAM A ESTAREM INAPTOS PARA JOGAREM(NO MÉTODO "JOGAR()" SE CANSASO ESTIVER ACIMA DE 10 NÃO É POSSIVEL INICIAR A PARTIDA DEVIDO AS CONDIÇÕES FÍSICAS DOS ATLETAS);
                System.out.println(RED_BACKGROUND+"Os jogadores estão restritos de entrar campo devido a problemas físicos "+ANSI_RESET);
            }
        }
        else if (this.treino <= 4){// AQUI ENQUANTO A SOMA DOS TREINOS DIRETOS FOR MENOR QUE 4 O POTENCIAL DO TIME É ACRESCIDO EM +1;
            this.potencialDoTime = potencialDoTime +1;
        }

    }

    public void setCansaco(int cansaco){this.cansaco = cansaco;}public void setPotencialDoTime(int potencialDoTime){this.potencialDoTime = potencialDoTime;}
    public void setJogo(boolean jogo){this.jogo = jogo;}private void setGol(int gol){this.gol = gol;}public void setVitorias(int vitorias) {this.vitorias = vitorias;}
    public void setDerrotas(int derrotas) {this.derrotas = derrotas;}public void setEmpates(int empates) {this.empates = empates;}

    //INTERFACE
    @Override
    public void apresentarTime() {
        System.out.println(""+ getNomeTime()+" É um time com "+getVitorias()+" vitórias, "+getEmpates()+" empates, "+getDerrotas()+" derrotas.");
    }

    @Override
    public void apresentarEntrada(){
        System.out.println(" "+getNomeTime()+" Esta entrando em campo!");

    }

    @Override
    public void treinar() {
        if (!getJogo()){
        System.out.println(BLUE_BACKGROUND+"Seu time esta treinando!!!"+ANSI_RESET);
        setTreino(getTreino() +1);}
        else
        {System.out.println(YELLOW_BACKGROUND+"Seu time esta jogando, impossivel treinar e jogar ao mesmo tempo!"+ANSI_RESET);}
    }

    @Override
    public void descansar(){
        if (getJogo()){
            System.out.println(YELLOW_BACKGROUND+"Imposível descansar durante os jogos, somente apoós os treinos"+ANSI_RESET);
        }
        else{
            setCansaco(getCansaco()-1);}
    }

    @Override
    public void jogar() {
        if (getCansaco() >= 11) {//DESCOBRIR PORQUE CONTADOR ESTA ERRADO ******************************************
            System.out.println(RED_BACKGROUND+"Impossivel entrar em campo nas condições físicas atuais de seu time, recupere-os e retorne aos gramados!!"+ANSI_RESET);
            setJogo(false);
        }
        else if (!getJogo() && this.cansaco <= 9) {
            apresentarEntrada();
            setJogo(true);
        }
        else {
            System.out.println(YELLOW_BACKGROUND + "Seu time ja esta jogando!" + ANSI_RESET);
        }
    }

    public void placar2(){
        System.out.println(getNomeTime()+" - : "+getGol() );
    }

    @Override
    public void marcarGol() {
        if (getJogo() && getPotencialDoTime() >= 3 && getCansaco() <= 5) {
            setPotencialDoTime(getPotencialDoTime() + 1);
            setGol(getGol() + 1);
            System.out.println(ANSI_GREEN_BACKGROUND + "----------GOLLLLLLLLLLLLL----------" + ANSI_RESET);
            System.out.println("################################");
            System.out.println("ÉÉÉÉÉÉÉÉÉE DO "+ getNomeTime());
            System.out.println("################################");
            setCansaco(getCansaco()+2);//Recebe 1 cansaso para não executar o método "marcar gol()" várias vezes e sair vários gols;
        }else if (getJogo() && getPotencialDoTime() <= 3 && getCansaco() >= 6 && getCansaco() <= 8) {
            System.out.println(YELLOW_BACKGROUND + "PRA FORAAA!!!!" + ANSI_RESET);
            System.out.println(YELLOW_BACKGROUND +"O time precisa treinar mais suas finalizações!" + ANSI_RESET);
        }else if (getJogo() && getCansaco() >= 10) {
            setCansaco(getCansaco() + 1);
            System.out.println(RED_BACKGROUND + "Time cansado. Não conseguem evoluir nas jogadas!" + ANSI_RESET);
        }else if (getJogo() && getGol()>=3){
            System.out.println(YELLOW_BACKGROUND+"Reduza o volume de jogo. O time não consegue ficar por muito tempo nessa frequência de jogo. (Time esta cansado e poderá sofrer gols)"+ANSI_RESET);
        }
    }



    @Override
    public void fimJogar() {
        if (getJogo()){
            setJogo(false);
            System.out.println("Fim de partida!");
            resultadoFinal();

        }
    }
    @Override
    public void resultadoFinal() {
        System.out.println("placar final: "+placar.getJogador1() +"-"+placar.getJogador1().getGol()+" / "+placar.getJogador2()+"-"+placar.getJogador2().getGol());
        if (placar.getJogador1().getGol() > placar.getJogador2().getGol() ){
            System.out.println(placar.getJogador1()+" Ganhou o jogo!");
            placar.getJogador1().setVitorias(getVitorias()+1);
        }
        else {
            System.out.println(placar.getJogador2()+" Ganhou o jogo!");
            placar.getJogador2().setVitorias(getVitorias()+1);
        }
    }

}


