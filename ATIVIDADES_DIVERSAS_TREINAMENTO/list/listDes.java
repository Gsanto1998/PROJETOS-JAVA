package list;

import java.util.Locale;
import java.util.Scanner;

public class listDes {
    String primeiroNome;
    String sobreNome;

    public listDes(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro nome: ");
        this.primeiroNome = scanner.nextLine().toUpperCase(Locale.ROOT);
        System.out.println("Digite o segundo nome: ");
        this.sobreNome = scanner.nextLine().toUpperCase(Locale.ROOT);

    }

    public void setPrimeiroNome(String primeiroNome) {

        this.primeiroNome = primeiroNome.toUpperCase();
    }

    public String getPrimeiroNome(){

        return primeiroNome;
    }
    public void setSobreNome(String sobreNome) {

        this.sobreNome = sobreNome.toUpperCase();
    }

    //GETTERS
    public String getSobreNome (){
        return sobreNome;

    }
}

//    public listDes(String primeiroNome, String sobreNome){
//        primeiroNome = primeiroNome.toUpperCase(Locale.ROOT);
//        sobreNome = sobreNome.toUpperCase(Locale.ROOT);
//        System.out.println(primeiroNome+" "+sobreNome);
//    }



