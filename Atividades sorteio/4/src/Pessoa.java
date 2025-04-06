public class Pessoa {
    private int idade;
    private char sexo;
    private float renda;
    
    public Pessoa() {}
    
    public Pessoa(int idade, char sexo, float renda) {
        this.idade = idade;
        this.sexo = sexo;
        this.renda = renda;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    public float getRenda() {
        return renda;
    }
    public void setRenda(float renda) {
        this.renda = renda;
    }

    
}
