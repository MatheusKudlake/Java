import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o tipo do carro:");
        String tipo = input.nextLine();
        System.out.println("Digite a cor do carro:");
        String cor = input.nextLine();
        System.out.println("Digite a placa do carro:");
        String placa = input.nextLine();
        System.out.println("Digite o número de portas do carro:");
        int numPortas = input.nextInt();


        carro gol = new carro(tipo, cor, placa, numPortas);
        System.out.println(gol.toString());

        carro car2 = new carro();
        System.out.println(car2.toString());
    }
}
