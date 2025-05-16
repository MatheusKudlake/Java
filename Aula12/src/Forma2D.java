public abstract class Forma2D {
    private double altura;
    private double largura;
    private String nome;
    
    public abstract double calculaArea();

    public Forma2D(){
        this.altura = this.largura = 0;
        this.nome = "nada";
    }
    public Forma2D(double altura, double largura, String nome){
        this.altura = altura;
        this.largura = largura;
        this.nome = nome;
    }

    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getLargura() {
        return largura;
    }
    public void setLargura(double largura) {
        this.largura = largura;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString(){
        return  "[" + this.nome + "]" + "[" + this.altura + "]" + "[" + this.largura + "]";
    }
}
