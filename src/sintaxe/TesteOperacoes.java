package sintaxe;

public class TesteOperacoes {
    public static void main (String[] args) {
        Operacoes objOperacoes = new Operacoes ();

        double result = objOperacoes.soma(50, 50);
        System.out.println("Resultado: "+result);
        System.out.println("Resultado: "+objOperacoes.soma(20,20));

        Operacoes objOperacoes2 = new Operacoes();
        objOperacoes2.n1=100;
        objOperacoes.n2=20;
    }
}
