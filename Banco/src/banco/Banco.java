package banco;

import java.util.ArrayList;

/**
 *
 * @author TheCheepeer
 */
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<ClienteFisica> clienteFisicas = new ArrayList<ClienteFisica>();

        // Criando um objeto Endereco utilizando o construtor da classe
        Endereco endereco1 = new Endereco("23580-250", "Estrada da Paciência", 645, "Paciência", "Rio de Janeiro",
                "Rio de Janeiro", "AP 18");

        // Criando um objeto ClienteFisica utilizando o construtor da classe
        ClienteFisica cliente1 = new ClienteFisica("14319083717", "Jorjin", "jorjingameplays@gmail.com", "21 968824470",
                null, endereco1, 1500.69);

        // Adicionando o objeto ClienteFisica à lista clienteFisicas
        clienteFisicas.add(cliente1);

        // Imprimindo as informações do cliente1 utilizando o método imprimirInfo()
        System.out.println(cliente1.imprimirInfo());

        // Imprimindo as informações do endereco1 utilizando o método imprimirEndereco()
        System.out.println(endereco1.imprimirEndereco());
    }

}
