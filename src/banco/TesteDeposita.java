package banco;

public class TesteDeposita {
    public static void main(String[] args) {
        Conta cp = new ContaPoupanca();
        try {
            cp.deposita(-100);
        } catch (IllegalArgumentException e) {
            System.out.println();
        }
    }
    //Como eu mudei de RuntimeException, como mãe, para exception, agora ele exige que ela seja pega
    //Ou declarada, para que possa ser jogada como erro (exceção)
}
