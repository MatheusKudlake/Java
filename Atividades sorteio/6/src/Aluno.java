import java.util.Scanner;

public class Aluno extends Pessoa {
    private Curso curso;

    Scanner in = new Scanner(System.in);
    
    public Aluno(int idade, String cpf){
        super(idade, cpf);
    }

    public Aluno(String cpf){
        super(cpf);
    }

    public Aluno(int idade, String cpf, Curso curso){
        super(idade, cpf);
        this.curso = curso;
    }

    public Aluno(String cpf, Curso curso){
        super(cpf);
        this.curso = curso;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Aluno cadastrar(){
        System.out.println("Insira a idade:");
        int idade = in.nextInt();
        in.nextLine();

        System.out.println("Insira o CPF:");
        String cpf = in.nextLine();

        
    }
}
