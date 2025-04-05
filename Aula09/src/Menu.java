import java.util.Scanner;

public class Menu {
    public static Animal cadastrarAnimal(){
        Scanner input = new Scanner(System.in);
        int entrada;
        do{
            System.out.println("Selecione um animal para cadastrar:");
            System.out.println("1. Animal");
            System.out.println("2. Ave");
            System.out.println("3. Sair");
            System.out.println("Insira a opção desejada:");
            entrada = input.nextInt();
        }while(entrada != 3);
        Ave animal1 = new Ave();

        System.out.println("Digite o nome do animal:");
        animal1.setNome(input.nextLine());
        
        System.out.println("Digite o peso do animal:");
        animal1.setPeso(input.nextFloat());
        
        System.out.println("Digite o recinto do animal:");
        animal1.setRecinto(input.nextInt());
        
        input.close();
        return animal1;
    }    
}
