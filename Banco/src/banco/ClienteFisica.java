package banco;

/**
 *
 * @author TheCheepeer
 */

public class ClienteFisica extends Cliente {
    String cpf;

    public ClienteFisica(String cpf, String nome, String email, String telefone, Conta conta,
            Endereco endereco, double renda) {
        super(nome, email, telefone, renda, conta, endereco);
        this.cpf = formatarCpf(cpf);
    }

    // Inicio dos Getters and Setters

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = formatarCpf(cpf);
    }
    // Final dos Getters and Setters

    // Verificar cpf

    public boolean verificarCpf(String cpf) {
        int[] pesosPrimeiroDígito = { 10, 9, 8, 7, 6, 5, 4, 3, 2 };
        int[] pesosSegundoDígito = { 11, 10, 9, 8, 7, 6, 5, 4, 3, 2 };

        // Primeiro Digito

        int soma = 0;
        for (int i = 0; i < 9; i++) {
            soma += Integer.parseInt(cpf.substring(i, i + 1)) * pesosPrimeiroDígito[i];
        }

        int resto = 11 - (soma % 11);
        if (resto == 10 || resto == 11) {
            resto = 0;
        }

        if (resto != Integer.parseInt(cpf.substring(9, 10))) {
            return false;
        }

        // Segundo Dígito

        soma = 0;
        for (int i = 0; i < 10; i++) {
            soma += Integer.parseInt(cpf.substring(i, i + 1)) * pesosSegundoDígito[i];
        }

        resto = 11 - (soma % 11);
        if (resto == 10 || resto == 11) {
            resto = 0;
        }

        return resto == Integer.parseInt(cpf.substring(10));
    }

    // Formatar Cpf

    public static String formatarCpf(String cpf) throws IllegalArgumentException {
        cpf = cpf.trim().replaceAll("\\D", ""); // remover espaços e caracteres não númericos.

        if (cpf.length() == 11) {
            return cpf.substring(0, 3) + "." +
                    cpf.substring(3, 6) + "." + cpf.substring(6, 9) + "-" +
                    cpf.substring(9);
        } else {
            throw new IllegalArgumentException("CPF inválido!");
        }

    }

    // Imprimir Informação
    public String imprimirInfo() {
        return super.imprimirInfo() + "\\nCPF: " + getCpf();
    }
}
