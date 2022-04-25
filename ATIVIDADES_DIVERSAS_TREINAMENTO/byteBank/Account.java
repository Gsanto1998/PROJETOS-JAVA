package byteBank;

public class Account {
    double balance;
    int agency;
    int number;
    String holder;

    public void deposit(double value) {
        this.balance += value;
    }
    public boolean toWithdraw(double value){
        if (this.balance >= value) {
            this.balance -= value;
            System.out.println("Você acaba de sacar: "+value+" R$");
            return true;
        }
        else {
            System.out.println("Você não possui dinheiro suficiente!");
            return false;
        }
    }

    public boolean transfer(double value, Account destiny){
        if (this.balance >= value) {
            this.balance -= value;
            destiny.deposit(value);
            System.out.println("Você acaba de transferir: "+value+" R$");
            return true;
        }
        else {
            System.out.println("Vcê não possui saldo suficiente para realizar transferência! ");
            return false;
        }
    }
}

