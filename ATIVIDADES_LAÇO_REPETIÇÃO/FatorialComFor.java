public class FatorialComFor {
    public static void main(String[] args) {
        int fatorial = 1;
        for (int i = 1; i < 11; i++) {
            System.out.println("Fatorial de "+i);
            fatorial*= i;
            System.out.println(fatorial);
        }
    }
}
