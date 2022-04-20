package precoDeCelulares;

import java.util.Locale;
import java.util.Scanner;

public class Cell2 {
    //NOME...
    String nome;
    String so;
    String sn = " ";
    String modelo = " ";
    String n;
    int precoNovo;
    int precoVelho;
    int precoReal;
    boolean statusNovo;

    public void nome() {
        Scanner scanner0 = new Scanner(System.in);
        System.out.println("Digite o número que corresponde com a marca de seu aparelho: \n 0 - [SAMSUNG]\n 1 - [LG]\n 2 - [APPLE]\n 3 - [ASUS]");
        n = scanner0.nextLine().toUpperCase();

        if (n.equals("0")) {
            this.nome = "SAMSUNG";
        } else if (n.equals("1")) {
            this.nome = "LG";
        } else if (n.equals("2")) {
            this.nome = "APPLE";
        } else if (n.equals("3")) {
            nome = "ASUS";
        }
    }


    //;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
    //SAMSUNG
    public void modelo() {
        if (n.equals("0")) {
            Scanner scannermod = new Scanner(System.in);
            System.out.println("Escolha um modelo:\n[0] - Galaxy S20 Plus \n[1] - Galaxy A71 \n[2] - Galaxy M51 ");
            modelo = scannermod.nextLine();
            if (modelo.equals("0")) {
                modelo = "Galaxy S20 Plus";
                System.out.println("A marca escolhida foi: " + nome + ", modelo: " + modelo);
                precoVelho = 1500;
                precoNovo = 2200;
            } else if (modelo.equals("1")) {
                modelo = "Galaxy A71";
                System.out.println("A marca escolhida foi: " + nome + ", modelo: " + modelo);
                precoVelho = 1500;
                precoNovo = 2800;
            } else if (modelo.equals("2")) {
                modelo = "Galaxy M51";
                System.out.println("A marca escolhida foi: " + nome + ", modelo: " + modelo);
                precoVelho = 800;
                precoNovo = 1500;
            }
        }

        //;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
        //LG
        else if (n.equals("1")) {
            Scanner scannermod = new Scanner(System.in);
            System.out.println("Escolha um modelo:\n[0] - Smartphone LG G8X\n[1] - Smartphone LG K11+\n[2] - Smartphone LG K40S");
            modelo = scannermod.nextLine();
            if (modelo.equals("0")) {
                modelo = "Smartphone LG G8X";
                System.out.println("A marca escolhida foi: " + nome + ", modelo: " + modelo);
                precoVelho = 1200;
                precoNovo = 2000;
            } else if (modelo.equals("1")) {
                modelo = "Smartphone LG K11+";
                System.out.println("A marca escolhida foi: " + nome + ", modelo: " + modelo);
                precoVelho = 1000;
                precoNovo = 2200;
            } else if (modelo.equals("2")) {
                modelo = "Smartphone LG K40S";
                System.out.println("A marca escolhida foi: " + nome + ", modelo: " + modelo);
                precoVelho = 500;
                precoNovo = 1000;
            }
        }

        //;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
        //IPHONE
        else if (n.equals("2")) {
            Scanner scannermod = new Scanner(System.in);
            System.out.println("Escolha um modelo:\n[0] - iPhone 13 Pro Max\n[1] - XS Max\n[2] - iPhone XR");
            modelo = scannermod.nextLine();
            if (modelo.equals("0")) {
                modelo = "iPhone 13 Pro Max";
                System.out.println("A marca escolhida foi: " + nome + ", modelo: " + modelo);
                precoVelho = 1500;
                precoNovo = 2200;
            } else if (modelo.equals("1")) {
                modelo = "XS Max";
                System.out.println("A marca escolhida foi: " + nome + ", modelo: " + modelo);
                precoVelho = 1500;
                precoNovo = 2800;
            } else if (modelo.equals("2")) {
                modelo = "iPhone XR";
                System.out.println("A marca escolhida foi: " + nome + ", modelo: " + modelo);
                precoVelho = 800;
                precoNovo = 1500;
            }
        }

        //;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
        //ASUS
        else if (n.equals("3")) {
            Scanner scannermod = new Scanner(System.in);
            System.out.println("Escolha um modelo:\n[0] - Zenfone 5 Selfie Pro \n[1] - ROG Phone 2 \n[2] - Max M2 ");
            modelo = scannermod.nextLine();
            if (modelo.equals("0")) {
                modelo = "Zenfone 5 Selfie Pro";
                System.out.println("A marca escolhida foi: " + nome + ", modelo: " + modelo);
                precoVelho = 1500;
                precoNovo = 2200;
            } else if (modelo.equals("1")) {
                modelo = "ROG Phone 2";
                System.out.println("A marca escolhida foi: " + nome + ", modelo: " + modelo);
                precoVelho = 1500;
                precoNovo = 2800;
            } else if (modelo.equals("2")) {
                modelo = "Max M2";
                System.out.println("A marca escolhida foi: " + nome + ", modelo: " + modelo);
                precoVelho = 800;
                precoNovo = 1500;
            }

        }

    }

    public void so() {
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Qual o Sistema Operacional de seu aparelho?\n[0] - ANDROID\n[1] - IOS");
        this.so = scanner2.nextLine().toUpperCase(Locale.ROOT);
        if (so.equals("0")) {
            so = "ANDROID";
        } else {
            so = "IOS";
        }
    }

    public void statusNovo() {
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("O aparelho esta novo? \n1 - [S]Sim\n2 - [N]Não ");
        String s = scanner3.nextLine().toUpperCase(Locale.ROOT);
        if (s.equals("1")) {
            sn = "NOVO";
            precoReal = precoNovo;
            statusNovo = true;
        } else if (!statusNovo) {
            sn = "USADO";
            precoReal = precoVelho;
        }
    }

}

