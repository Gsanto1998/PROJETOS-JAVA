import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int numeroAtual = 1;
        int numeroAnterior = 0;
        int guardaAnterior;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite qual o termo da série de Fibonacci que procura ");
        int numDesejado = scanner.nextInt();
        System.out.println("ABAIXO A SEQUÊNCIA DE FIBONACCI ATÉ A SERIE DESEJADA; ");

        for (int i = 1; i < numDesejado; i++) {
            if (i == 1) {
                System.out.print(numeroAnterior + " ");
            }
            System.out.print(numeroAtual + " ");
            guardaAnterior = numeroAtual;
            numeroAtual += numeroAnterior;
            numeroAnterior = guardaAnterior;
        }

        System.out.println("\nO número procurado é: "+numeroAnterior);
    }
}