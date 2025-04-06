import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("1. Inserir idade");
        System.out.println("2. Inserir CPF");
        System.out.println("Selecione o método:");
        int entrada = in.nextInt();
        in.nextLine();

        if(entrada == 1){
            System.out.println("Insira a idade:");
            Pessoa p1 = new Pessoa(in.nextInt());
            System.out.println(p1.toString()); 
        }else if(entrada == 2){
            System.out.println("Insira o CPF:");
            Pessoa p1 = new Pessoa(in.nextLine());
            System.out.println(p1.toString()); 
        }else{
            System.out.println("Valor inválido!");
        }
    }
}
