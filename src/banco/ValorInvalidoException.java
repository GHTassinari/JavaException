package banco;

class ValorInvalidoException extends Exception {
    ValorInvalidoException(double valor) {
        super("Valor invalido:" + valor);
    }
}
