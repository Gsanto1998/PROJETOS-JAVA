package bancoCentral;

import java.util.Locale;
import java.util.Scanner;

public class Conta extends Banco{
    private int numeroConta;
    private UsuariosBanco usuario;
    private boolean abrindoConta = false;

    public void abrirContaCorrente(){
        System.out.println("Você esta apropriado para abrir uma conta CORRENTE, Digite o número da conta: ");
        setNumeroConta(scanner.nextInt());
        System.out.println("****Conta aberta com SUCESSO****");
    }
    public void abrirContaPoupanca(){
        System.out.println("Você esta apropriado para abrir uma conta POUPANÇA. Digite o número da conta: ");
        setNumeroConta(scanner.nextInt());
        System.out.println("****Conta aberta com SUCESSO****");
    }

    public void sacarDinheiro(){
        int valor;
        System.out.println("Quanto de dinheiro deseja sacar?\n1 - [25 R$] \n2 - [50 R$]\n3 - [100 R$]\n4 - [200 R$]\n5 - [500 R$]\n6 - [OUTRO VALOR]");
        valor = scanner2.nextInt();
        if (valor == 1) {
            System.out.println("Você retirou 25 R$");
        }
        else if (valor == 2) {
            System.out.println("Você retirou 50 R$");
        }
        else if (valor == 3) {
            System.out.println("Você sacou 100 R$");
        }
        else if (valor == 4) {
            System.out.println("Você sacou 200 R$");
        }
        else if (valor == 5) {
            System.out.println("Você sacou 500 R$");
        }
        else if (valor == 6) {
            System.out.println("Quanto de dinheiro deseja sacar? ");
            int valor2 = scanner2.nextInt();
            System.out.println("Você sacou "+valor2+" R$");
        }
        System.out.println("\n\nPROCESSO ENCERRADO COM SUCESSO!");
    }
    public void depositarDinheiro(){
        int valor;
        System.out.println("Digite o valor a ser depositado: ");
        valor = scanner2.nextInt();
        System.out.println("Você acaba de depositar "+valor+" R$ em sua conta!");
        System.out.println("\n\nPROCESSO ENCERRADO COM SUCESSO!");
    }

    Scanner scanner = new Scanner(System.in);
    Scanner scanner2 = new Scanner(System.in);

    @Override
    public void abrirConta(){
        //VERRIFICAR NECESSECIDADE DO MÉTODO DE REPETIÇÃO WHILE;
        setAbrindoConta(true);
        String tipoConta;
        this.usuario = new UsuariosBanco();
        if  (usuario.getMaiorDeIdade() && !usuario.getTemConta()) {
            System.out.println("***** "+usuario.getNome()+" SEJA BEM VINDO AO BANCO CENTRAL. ESPERAMOS QUE TENHA UMA ÓTIMA EXPERIÊNCIA COM NOSSOS SERVIÇOS.*****\nQual tipo de conta deseja abrir? \n[P] - Poupança \n[C] - Corrente ");
            tipoConta = scanner.nextLine().toUpperCase(Locale.ROOT);
            if (tipoConta.equals("P")){
                tipoConta = "POUPANÇA";
                System.out.println("Abrindo conta POUPANÇA em instantes.....");
                abrirContaPoupanca();
                System.out.println("DADOS DA CONTA:\nNOME: "+usuario.getNome()+"\nCPF: "+usuario.getCpf()+"\nIDADE: "+usuario.getIdade()+"\nNÚMERO DE CONTA: "+numeroConta+"\nTIPO DE CONTA: "+tipoConta);
                System.out.println("\n\nPROCESSO ENCERRADO COM SUCESSO!");
            }
            else if (tipoConta.equals("C")){
                tipoConta = "CORRENTE";
                System.out.println("Abrindo conta CORRENTE em instantes.....");
                abrirContaCorrente();
                System.out.println("DADOS DA CONTA:\nNOME: "+usuario.getNome()+"\nCPF: "+usuario.getCpf()+"\nIDADE: "+usuario.getIdade()+"\nNÚMERO DE CONTA: "+numeroConta+"\nTIPO DE CONTA: "+tipoConta);
                System.out.println("\n\nPROCESSO ENCERRADO COM SUCESSO!");
            }
            else {
                System.out.println("Digite uma letra válida! \n[P] - Poupança \n[C] - Corrente ");
            }
        }
        else if (this.usuario.getMaiorDeIdade() && this.usuario.getTemConta()){
            System.out.println(usuario.getNome()+" Deseja acessa-lá? \nSIM - [S] \nNÃO - [N]");
            String acessarC = scanner.nextLine().toUpperCase(Locale.ROOT);
            if (acessarC.equals("S")){
                acessarConta();
            }
            else if (acessarC.equals("N")){
                //VERIFICAR NECESSIDADE DO "BREAK", CASO FOR COLOCAR MÉTODO DE REPETIÇÃO "WHILE";
                System.out.println("Saindo da conta...!");
            }
            else {
                System.out.println("Digite uma letra válida: \nSIM - [S] \nNÃO - [N] ");
            }
        }
        else if (!this.usuario.getMaiorDeIdade()){
            System.out.println("Não é possível abrir conta, você é menor de idade! ");
        }
    }


    @Override
    public void acessarConta(){
        //PRÓXIMOS PASSOS://///////////////////////////////////////////////////////////////////////////////
        //PODERÁ REALIZAR SAQUES, DEPÓSITOS OU FECHAR CONTA;
        if (!getAbrindoConta()){
            this.usuario = new UsuariosBanco();
            System.out.println("***** "+usuario.getNome()+" SEJA BEM VINDO AO BANCO CENTRAL. ESPERAMOS QUE TENHA UMA ÓTIMA EXPERIÊNCIA COM NOSSOS SERVIÇOS.*****\nOque deseja fazer? \n[S] - SACAR DINHEIRO\n[D] - DEPÓSITAR DINHEIRO");
            String sdf = scanner.nextLine().toUpperCase(Locale.ROOT);
            if (sdf.equals("S")){
                sacarDinheiro();
            }
            else if (sdf.equals("D")){
                depositarDinheiro();
            }
            else {
                System.out.println("Digite uma letra valida!");
            }
        }
        else {
            System.out.println( usuario.getNome()+" Oque deseja fazer? \n[S] - SACAR DINHEIRO\n[D] - DEPÓSITAR DINHEIRO");
            String sdf = scanner.nextLine().toUpperCase(Locale.ROOT);
            if (sdf.equals("S")) {
                sacarDinheiro();
            }
            else if (sdf.equals("D")) {
                depositarDinheiro();
            }
             else {
                System.out.println("Digite uma letra valida!");
            }
        }
    }
    @Override
    public void fecharConta(){
        int valor;
        System.out.println("Você realmente deseja excluir sua conta?\n1 - [SIM]\n2 - [NÃO]");
        valor = scanner2.nextInt();
        if (valor == 1) {
            usuario.setTemConta(false);
            System.out.println("Conta INATIVA");
        }
        else if (valor == 2) {
            System.out.println("Conta permanece ATIVA!");
        }
        else {
            System.out.println("DIGITE UM NÚMERO VALIDO!");
        }
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public UsuariosBanco getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuariosBanco usuario) {
        this.usuario = usuario;
    }

    public boolean getAbrindoConta() {
        return abrindoConta;
    }

    public void setAbrindoConta(boolean abrindoConta) {
        this.abrindoConta = abrindoConta;
    }

}
