package precoDeCelulares;

public class CellDes2 {

    public static void main(String[] args) {
        Cell2 main = new Cell2();
        main.nome();
        main.modelo();
        main.so();
        main.statusNovo();
        System.out.println("O aparelho escolhido foi: "+main.nome+", modelo: "+ main.modelo +" possui o sistema operacional "+main.so+ " e é um aparelho " +main.sn+" .Custa em média: US$"+main.precoReal+" dólars.");

    }
}
