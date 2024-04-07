package banco;

public class TesteConstrutor {
    public static void main(String[] args) {
        Conta x = new Conta(7000);
        Conta y = new Conta(2000);
        Conta w = new Conta(20000, 50000, 12340);
        System.out.println("Saldo x: "+x.getSaldo());
        System.out.println("Saldo y: "+y.getSaldo());
        System.out.println("Saldo w: "+w.getSaldo());
        System.out.println("Total contas: "+Conta.getTotalDeContas());
    }

}
