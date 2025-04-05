import java.util.Scanner;

public class Menu {
    public static Animal cadastrarAnimal(){
        Scanner input = new Scanner(System.in);
        Animal animal1 = new Animal();

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
