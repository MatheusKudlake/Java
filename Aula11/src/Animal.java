public class Animal {
    private String nome;
    private double peso;
    private double tamanho;
    private double velocidade;
    private int patas;
    private double localizacao;

    public Animal(){}
    public Animal(String nome, double velocidade, double localizacao) {
        this.nome = nome;
        this.velocidade = velocidade;
        this.localizacao = localizacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public double getLocalizacao() {
        return this.localizacao;
    }

    public void setLocalizacao(double localizacao) {
        this.localizacao = localizacao;
    }

    public void mover(){
        System.out.println("> > >");
        this.localizacao+=velocidade;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + 
                "\nPeso: " + this.peso + 
                "\nTamanho: " + this.tamanho + 
                "\nVelocidade: " + this.velocidade + 
                "\nNúmero de patas: " + this.patas + 
                "\nLocalização: " + this.localizacao;
    }

}
