import java.util.Scanner;

public class Menu {
    static Scanner in = new Scanner(System.in);
    public static Pessoa cadastrarPessoa(){
        Pessoa p1 = new Pessoa();
            System.out.println("Insira a idade:");
            p1.setIdade(in.nextInt());
            System.out.println("Insira o sexo:");
            p1.setSexo(in.next().charAt(0));
            System.out.println("Insira a renda:");
            p1.setRenda(in.nextFloat());
            return p1;
    }
}
