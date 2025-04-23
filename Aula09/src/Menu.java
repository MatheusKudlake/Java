import java.util.Scanner;
import java.util.ArrayList;


public class Menu {
    public static ArrayList<Animal> listaAnimais = new ArrayList<>();

    public static void cadastrarAnimal(){
        Scanner input = new Scanner(System.in);
        int entrada;
        do{
            System.out.println("Selecione um animal para cadastrar:");
            System.out.println("1. Animal");
            System.out.println("2. Ave");
            System.out.println("3. Sair");
            System.out.println("Insira a opção desejada:");
            entrada = input.nextInt();

            switch(entrada){
                case 1:
                    Animal animal1 = new Animal();
                case 2:
                    Ave animal1 = new Ave();
                    System.out.println("Digite o nome:");
                    animal1.setNome(input.nextLine());
                    System.out.println("Digite o peso:");
                    animal1.setNome(input.nextLine());
                    System.out.println("Digite o recinto:");
                    animal1.setRecinto(input.nextInt());

                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Valor inválido!");
        
            }
        }while(entrada != 3);
        Ave animal1 = new Ave();

        System.out.println("Digite o nome do animal:");
        animal1.setNome(input.nextLine());
        
        System.out.println("Digite o peso do animal:");
        animal1.setPeso(input.nextFloat());
        
        System.out.println("Digite o recinto do animal:");
        animal1.setRecinto(input.nextInt());

        listaAnimais.add(animal1);
        
        input.close();
    }
    
    public void cadastro(){
       
    }
}