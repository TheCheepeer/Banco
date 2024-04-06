package banco;

import java.util.Scanner;

/**
 *
 * @author TheCheepeer
 */

public class Conta {
    private String agencia, idConta, senha;
    private double saldo;
    private Cliente cliente;
    private Cartao cartao;

    public Conta(String agencia, String idConta, String senha, double saldo, Cliente cliente, Cartao cartao) {
        this.agencia = agencia;
        this.idConta = idConta;
        this.senha = senha;
        this.saldo = saldo;
        this.cliente = cliente;
        this.cartao = cartao;
    }

    // Inicio Getters and Setters

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getIdConta() {
        return idConta;
    }

    public void setIdConta(String idConta) {
        this.idConta = idConta;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cartao getCartao() {
        return cartao;
    }

    public void setCartao(Cartao cartao) {
        this.cartao = cartao;
    }

    // Final dos Getters and Setters

    /*
     * public void transferir(Conta destino, double saldo) {
     * Scanner teclado = new Scanner(System.in);
     * System.out.println("Digite o valor que deseja transferir:");
     * double transferencia = teclado.nextDouble();
     * teclado.close();
     * 
     * try {
     * if (transferencia <= 0) {
     * throw new
     * IllegalArgumentException("O valor da transferência deve ser positivo.");
     * } else if (transferencia > saldo) {
     * throw new
     * SaldoInsuficienteException("Saldo insuficiente para a transferência.");
     * }
     * 
     * } catch (SaldoInsuficienteException e) {
     * System.err.println("Saldo insuficiente para a transferência.");
     * } catch (IllegalArgumentException e) {
     * System.err.println("O valor da transferência deve ser positivo.");
     * }
     * }
     */

}
