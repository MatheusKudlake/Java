public class Instrutor extends Pessoa {
    private Curso curso;

    public Instrutor(int idade, String cpf){
        super(idade, cpf);
    }

    public Instrutor(String cpf){
        super(cpf);
    }

    public Instrutor(int idade, String cpf, Curso curso){
        super(idade, cpf);
        this.curso = curso;
    }

    public Instrutor(String cpf, Curso curso){
        super(cpf);
        this.curso = curso;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
}
