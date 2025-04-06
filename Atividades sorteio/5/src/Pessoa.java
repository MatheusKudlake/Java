public class Pessoa {
    private int idade;
    private String cpf;

    public Pessoa() {};
    public Pessoa(int idade){
        this.idade = idade;
    }
    public Pessoa(String cpf){
        this.cpf = cpf;
    }

    @Override
    public String toString(){
        return "Idade:" + this.idade + 
                "\nCPF: " + this.cpf;
    }
}
