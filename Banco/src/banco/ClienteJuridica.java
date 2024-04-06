package banco;

/**
 *
 * @author TheCheepeer
 */

public class ClienteJuridica extends Cliente {

    private String cnpj;

    public ClienteJuridica(String cnpj, String nome, String email, String telefone, Conta conta,
            Endereco endereco, double renda) {
        super(nome, email, telefone, renda, conta, endereco);
        this.cnpj = formatarCnpj(cnpj);
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = formatarCnpj(cnpj);
    }

    // Verificar CNPJ

    public static boolean validarCnpj(String cnpj) {
        cnpj = cnpj.trim().replaceAll("\\D", "");

        if (cnpj.length() != 14) {
            return false;
        }

        int[] multiplicadores1 = { 5, 4, 3, 2, 9, 8, 7, 6, 5, 4, 3, 2 };
        int[] multiplicadores2 = { 6, 5, 4, 3, 2, 9, 8, 7, 6, 5, 4, 3, 2 };

        // Primeiro Dígito Verificador
        int soma = 0;
        for (int i = 0; i < 12; i++) {
            soma += Character.getNumericValue(cnpj.charAt(i)) * multiplicadores1[i];
        }

        int resto = (soma % 11);
        int primeiroDígitoVerificador = (resto < 2) ? 0 : 11 - resto;

        // Segundo Dígito Verificador
        soma = 0;
        for (int i = 0; i < 13; i++) {
            soma += Character.getNumericValue(cnpj.charAt(i)) * multiplicadores2[i];
        }

        resto = (soma % 11);
        int segundoDigitoVerificador = (resto < 2) ? 0 : 11 - resto;

        return (Character.getNumericValue(cnpj.charAt(12)) == primeiroDígitoVerificador) &&
                (Character.getNumericValue(cnpj.charAt(13)) == segundoDigitoVerificador);
    }
    // Formatar CNPJ

    public static String formatarCnpj(String cnpj) throws IllegalArgumentException {
        cnpj = cnpj.trim().replaceAll("\\D", "");
        if (cnpj.length() == 14) {
            return cnpj.substring(0, 2) + "." + cnpj.substring(2, 5) + "." +
                    cnpj.substring(5, 8) + "/" + cnpj.substring(8, 12) + "-" +
                    cnpj.substring(12);
        } else {
            throw new IllegalArgumentException("CNPJ inválido!");
        }
    }

    // Imprimir Informação
    public String imprimirInfo() {
        return super.imprimirInfo() + "\nCNPJ: " + getCnpj();
    }

}
