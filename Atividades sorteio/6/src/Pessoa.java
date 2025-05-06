public class Pessoa {
    private String cpf;
    private int idade;

    public Pessoa(String cpf){
        if(validarCpf(cpf)){
            this.cpf = cpf;
        }else{
            System.out.println("CPF inválido!");
        }    
    }

    public Pessoa(int idade, String cpf){
        if(validarCpf(cpf)){
            this.idade = idade;
            this.cpf = cpf;
        }else{
            System.out.println("CPF inválido!");
        }
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    boolean validarCpf(String cpf){
        if(Integer.parseInt(cpf) < 99999999999L){
            return false;
        }else{
            return true;
        }
    }
}
