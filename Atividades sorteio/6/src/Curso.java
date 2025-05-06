import java.util.ArrayList;

public class Curso {
    private String nome;
    private Instrutor instrutor;
    private ArrayList<Aluno> alunos = new ArrayList<>();

    public Curso(){}

    public Curso(String nome, Instrutor instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Instrutor getInstrutor() {
        return instrutor;
    }

    public void setInstrutor(Instrutor instrutor) {
        this.instrutor = instrutor;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }
    
    @Override
    public String toString(){
        return "Curso: " + this.nome + 
                "Instrutor" + this.instrutor +
                "Alunos: " + this.alunos;
    }
}
