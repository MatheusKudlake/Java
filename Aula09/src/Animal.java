public class Animal {
    private String nome;
    private double peso;
    private int recinto;

    public Animal(){}
    public Animal(String nome, double peso, int recinto) {
        this.nome = nome;
        this.peso = peso;
        this.recinto = recinto;
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
    public int getRecinto() {
        return recinto;
    }
    public void setRecinto(int recinto) {
        this.recinto = recinto;
    }

    public void emitirSom(int quantidade){
        for(int i = 1; i <= quantidade; i++){
            System.out.println("muuuuuuuuuuu");
        }
    }

    @Override
    public String toString() {
        return "------------------" + 
                "\nNome: " + this.nome +
                "\nPeso: " + this.peso + " Kg" +  
                "\nRecinto: " + this.recinto;
    }
}
