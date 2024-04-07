package banco;

import java.util.Scanner;

public class Programa {
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);

        Conta minhaConta = new Conta();
        // minhaConta.setCliente("Guilherme Tassinari");
        minhaConta.setLimite(20000);
        minhaConta.deposita(1000);
        minhaConta.saca(100);

        System.out.println("Saldo da minha conta: " + minhaConta.getSaldo());
        //System.out.println("Nome Cliente: " + minhaConta.getCliente());
    }
}
