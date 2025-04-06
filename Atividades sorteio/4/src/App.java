import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int entrada;
        int numPessoas = 0;
        float somaSalario = 0;
        float mediaSalario = 0;
        int maiorIdade = 0;
        int menorIdade = 10000;
        int homensSalarioMenor = 0;
        int mulheres = 0;

        do {
            System.out.println("----------------------");
            System.out.println("1. Cadastrar pessoa");
            System.out.println("2. Verificar dados");
            System.out.println("3. Sair");
            System.out.println("----------------------");
            System.out.println("Insira sua opção:");
            entrada = in.nextInt();
            System.out.println("----------------------");

            switch (entrada) {
                case 1:
                    Pessoa p1 = Menu.cadastrarPessoa();

                    somaSalario += p1.getRenda();
                    numPessoas++;
                    mediaSalario = somaSalario / numPessoas;

                    if (p1.getIdade() > maiorIdade) {
                        maiorIdade = p1.getIdade();
                    }
                    if (p1.getIdade() < menorIdade) {
                        menorIdade = p1.getIdade();
                    }

                    if ((p1.getSexo() == 'M' || p1.getSexo() == 'm') && p1.getRenda() <= 1000) {
                        homensSalarioMenor++;
                    } else if (p1.getSexo() == 'F' || p1.getSexo() == 'f') {
                        mulheres++;
                    }

                    break;
                case 2:
                    System.out.println("Média de salário do grupo: R$" + mediaSalario);
                    System.out.println("Maior idade do grupo: " + maiorIdade);
                    System.out.println("Menor idade do grupo:" + menorIdade);
                    System.out.println("Quantidade de habitantes do sexo masculino com salário de até R$1000,00:"
                            + homensSalarioMenor);
                    System.out.println("Quantidade de mulheres:" + mulheres);

                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Valor inválido!");
            }
        } while (entrada != 3);
    }
}
