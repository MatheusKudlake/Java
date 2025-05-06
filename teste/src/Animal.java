public class Animal {
    private String nome;
    private float peso;
    private int recinto;

    public Animal(){}
    public Animal(String nome, float peso, int recinto){
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
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }
    public int getRecinto() {
        return recinto;
    }
    public void setRecinto(int recinto) {
        this.recinto = recinto;
    }

    @Override
    public String toString(){
        return "\nNome: " + this.nome + 
                "\nPeso: " + this.peso + 
                "\nRecinto: " + this.recinto;
    }
}
