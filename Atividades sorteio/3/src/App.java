import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Poluicao g1 = new Poluicao();

        System.out.print("Insira o índice de poluição das indústrias do grupo: ");
        System.out.println("De acordo com os dados informados, " + g1.lerIndice(input.nextFloat()));

        input.close();
    }
}
