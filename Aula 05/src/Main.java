import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Carro Porsche = new Carro();
        Porsche.tipo = "Porsche";
        Porsche.cor = "Vermelho";
        Porsche.placa = "ADG-4D561";
        Porsche.num_portas = 2;

        Scanner input = new Scanner(System.in);

        int entrada=5;
       do{
           System.out.println("1. Ligar");
           System.out.println("2. Acelerar");
           System.out.println("3. Frear");
           System.out.println("4. Desligar");
           System.out.println("5. Sair");
           System.out.println("----------------------------");
           System.out.println("Selecione a opção:");
           entrada = input.nextInt();
           System.out.println("----------------------------");
           switch (entrada) {
               case 1:
                   Porsche.Ligar();
                   break;
               case 2:
                   Porsche.Acelerar();
                   break;
               case 3:
                   Porsche.Frear();
                   break;
               case 4:
                   Porsche.Desligar();
                   break;
               case 5:
                   System.out.println("Encerrando...");
                   break;
               default:
                   System.out.println("Entrada inválida!");
           }
           System.out.println("----------------------------");
       }while(entrada!=5);
    }
}
