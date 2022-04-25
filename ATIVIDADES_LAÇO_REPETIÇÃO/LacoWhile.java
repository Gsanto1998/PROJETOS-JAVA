public class LacoWhile {
    public static void main(String[] args) {
        System.out.println("Contando de 0 a 10");
        int contador = 0;
        while (contador <= 10){
            System.out.println("Contador "+ contador);
            contador++;
        }
        int valor = 0;
        int contador1 = 0;
        while (contador1 <= 10){
            valor += contador1;
            System.out.println(valor);
            contador1++;
        }
    }
}
