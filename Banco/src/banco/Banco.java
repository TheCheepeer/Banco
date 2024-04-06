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
        Endereco endereco1 = new Endereco(null, null, 0, null, null, null, null);
        endereco1.setCep("23580-250");
        endereco1.setLogradouro("Estrada da Paciência");
        endereco1.setNumero(645);
        endereco1.setBairro("inhoaiba");
        endereco1.setCidade("Rio de Janeiro");
        endereco1.setUf("Rio de Janeiro");
        endereco1.setComplemento("AP 18");

        // Criando um objeto ClienteFisica utilizando o construtor da classe
        ClienteFisica cliente1 = new ClienteFisica("47790354060", null, null, null, null, endereco1, 0);
        cliente1.setCpf("47790354060");
        cliente1.setNome("Jorgin");
        cliente1.setEmail("jorgingameplays@gmail.com");
        cliente1.setTelefone("21 957475847");
        cliente1.setConta(null);
        cliente1.setEndereco(endereco1);
        cliente1.setRenda(1500.69);

        // Adicionando o objeto ClienteFisica à lista clienteFisicas
        clienteFisicas.add(cliente1);

        // Imprimindo as informações do cliente1
        System.out.println(cliente1.imprimirInfo());

        // Imprimindo as informações do endereco1
        // System.out.println(endereco1.imprimirEndereco());
    }

}