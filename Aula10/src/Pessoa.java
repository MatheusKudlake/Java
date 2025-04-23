public class Pessoa {
    private String nome;
    private String cpf;
    private int cod;
    private Endereco endereco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public Endereco getEndereco() {
        return this.endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome +
                "\nCódigo: " + this.cod +
                "\nCPF: " + this.cpf + 
                "\nEndereço: " + endereco.toString();
    }
}
