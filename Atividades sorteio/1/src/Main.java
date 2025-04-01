import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        vendas cadastro = new vendas();
        int entrada;

        do{
            System.out.println("-------------------------------------------");
            System.out.println("1. Cadastro de vendas.");
            System.out.println("2. Consulta de imposto a pagar no mês.");
            System.out.println("0. Sair.");
            System.out.println("Escolha uma opção:");
            System.out.println("-------------------------------------------");
            entrada = input.nextInt();
            System.out.println("-------------------------------------------");

            switch(entrada){
                case 1:
                    cadastro.cadastrarVenda();
                    break;
                case 2:
                    cadastro.consultarImposto();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }while(entrada!=0);
    }
}
