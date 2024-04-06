package banco;

public class SaldoInsuficienteException extends RuntimeException {
    public SaldoInsuficienteException(String message) {
        super(message);
    }

    public SaldoInsuficienteException(Throwable t) {
        super(t);
    }
}
