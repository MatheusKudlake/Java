public class Pessoa {
    private int idade;
    private String cpf;

    public Pessoa(String cpf){
        this.cpf = cpf;
    }

    public Pessoa(String cpf, int idade){
        this.idade = idade;
    }

    public int getIdade(){
        return this.idade;
    }
    public void setIdade(int valor){
        this.idade = valor;
    }

    public String getCpf(){
        return this.cpf;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    @Override
    public String toString(){
        return "Idade:" + this.idade + 
                "\nCPF: " + this.cpf;
    }
}
