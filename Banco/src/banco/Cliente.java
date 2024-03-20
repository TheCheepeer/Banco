package banco;

/**
 *
 * @author TheCheepeer
 */

public class Cliente {
    private String nome, email, telefone;
    private double renda;
    private Endereco endereco;
    private Conta conta;

    // Construtor
    public Cliente(String nome, String email, String telefone, double renda, Conta conta, Endereco endereco) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.renda = renda;
        this.endereco = endereco;
        this.conta = null; // Inicialmente, o cliente não tem uma conta
    }

    // Inicio Getters and Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    // Final dos Getters and Setters

    // Abrir a Conta do cliente

    public void abrirConta() {
        if (this.conta == null) {

            this.conta = new Conta();
        } else {

            System.out.println("O cliente já possui uma conta.");

        }
    }

    // Fechar a conta

    public void fecharConta() {
        this.conta = null;
    }

    // Imprimir Informação

    public String imprimirInfo() {
        return "Nome: " + getNome() + "\\n Email: " + getEmail() + "\\nTelefone: " + getTelefone() + "\\nRenda: R$" +
                String.format("%.2f", getRenda()) + "\\nConta: " + getConta() + "\\nEndereço: " + getEndereco();
    }
}
