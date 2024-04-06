package banco;

/**
 *
 * @author TheCheepeer
 */

public class Endereco {
    private String cep, logradouro, bairro, cidade, uf, complemento;
    private int numero;

    public Endereco(String cep, String logradouro, int numero, String bairro, String cidade, String uf,
            String complemento) {
        this.cep = cep;
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        this.complemento = complemento;
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String imprimirEndereco() {
        return "cep: " + getCep() +
                ", logradouro: " + getLogradouro() +
                ", numero: " + getNumero() +
                ", cidade: " + getCidade() +
                ", uf: " + getUf() +
                ", complemento: " + getComplemento();
    }
}
