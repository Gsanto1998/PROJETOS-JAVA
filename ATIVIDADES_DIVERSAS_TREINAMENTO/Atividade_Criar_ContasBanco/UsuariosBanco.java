package bancoCentral;

import java.util.Locale;
import java.util.Scanner;

public class UsuariosBanco extends Pessoas{

    private boolean temConta;

    Scanner scanner = new Scanner(System.in);
    Scanner scanner1 = new Scanner(System.in);

    public UsuariosBanco(){
        System.out.println("Qual seu nome: ");
        this.setNome(scanner.nextLine());
        System.out.println("Registre seu CPF: ");
        this.setCpf(scanner.nextLine());
        System.out.println("Qual sua idade: ");
        this.setIdade(scanner1.nextInt());
        if (getIdade() >= 18) {
            setMaiorDeIdade(true);
            System.out.println("Já possui uma conta?\n[S] - SIM \n[N] - NÂO ");
            String simNao = scanner.nextLine().toUpperCase(Locale.ROOT);
            if (simNao.equals("S")){
                setTemConta(true);
            }
            else if (simNao.equals("N")){
                setTemConta(false);
            }
        }
        else {
            System.out.println("Você ainda não pode abrir uma conta no banco, pois é menor de idade! ");
            setMaiorDeIdade(false);
            setTemConta(false);
        }
    }

    public boolean getTemConta() {
        return temConta;
    }

    public void setTemConta(boolean temConta) {
        this.temConta = temConta;
    }
}
