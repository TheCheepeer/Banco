package banco;

/**
 *
 * @author TheCheepeer
 */

public class ClienteFisica extends Cliente {
    String cpf;

    public ClienteFisica(String cpf, String nome, String email, String telefone, Conta conta,
            Endereco endereco, double renda) {
        super(nome, email, telefone, renda, endereco);
        this.cpf = cpf;
    }

    // Inicio dos Getters and Setters

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    // Final dos Getters and Setters

}
