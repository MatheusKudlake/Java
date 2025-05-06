import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("1. Inserir somente CPF");
        System.out.println("2. Inserir CPF e idade");
        System.out.println("Selecione o método:");
        int entrada = in.nextInt();
        in.nextLine();

        if(entrada == 1 || entrada == 2){
            System.out.println("Insira o CPF:");
                String cpf = in.nextLine();
                if(Integer.parseInt(cpf) > 99999999999L){
                    System.out.println("CPF inválido!");
                }else if(entrada == 2){
                    System.out.println("Insira a idade:");
                    int idade = in.nextInt();
                    Pessoa p1 = new Pessoa(idade, cpf);
                    System.out.println(p1.toString());
                }else{
                    Pessoa p1 = new Pessoa(cpf);
                    System.out.println(p1.toString());
                }
        }else{
            System.out.println("Valor inválido!");
        }
    }
}