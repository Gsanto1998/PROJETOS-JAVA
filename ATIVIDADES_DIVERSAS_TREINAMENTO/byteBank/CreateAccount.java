package byteBank;

public class CreateAccount {

    public static void main(String[] args) {
        Account firstAccount = new Account();
        firstAccount.deposit(500);
        System.out.println("O valor depositado foi de: " + firstAccount.balance);
        boolean withdraw = firstAccount.toWithdraw(400);
        System.out.println("Você agora tem em conta: "+firstAccount.balance );
        System.out.println("Você conseguiu sacar seu dinheiro? "+withdraw);
        Account secondAccount = new Account();
        secondAccount.deposit(1000);
        System.out.println("Você conseguiu transferir seu dinheiro? "+secondAccount.transfer(300, firstAccount));
        System.out.println("Saldo na primeira conta: "+firstAccount.balance+" Saldo na segunda conta: "+secondAccount.balance);

    }

}
