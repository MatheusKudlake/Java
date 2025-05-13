public class Endereco {
    private String logradouro;
    private int numero;

    public Endereco(String logradouro, int numero){
        this.logradouro = logradouro;
        this.numero = numero;
    }

    public String getLogradouro(){
        return this.logradouro;
    }

    public void setLogradouro(String logradouro){
        this.logradouro = logradouro;
    }

    @Override
    public String toString(){
        return "Logradouro: " + this.logradouro + ", " + this.numero;
    }
}