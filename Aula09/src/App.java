import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //--Animal--
        Animal cachorro = new Animal();
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o nome do animal:");
        cachorro.setNome(input.nextLine());
        
        System.out.println("Digite o peso do animal:");
        cachorro.setPeso(input.nextFloat());
        
        System.out.println("Digite o recinto do animal:");
        cachorro.setRecinto(input.nextInt());
        
        System.out.println(cachorro.toString());
        
        //--Ave--
        Ave papagaio = new Ave();
        
        System.out.println("Digite o nome da ave:");
        papagaio.setNome(input.nextLine());
        
        System.out.println("Digite o peso da ave:");
        papagaio.setPeso(input.nextFloat());
        
        System.out.println("Digite o recinto da ave:");
        papagaio.setRecinto(input.nextInt());

        System.out.println("Digite o local nativo da ave:");
        papagaio.setLocal(input.nextLine());
        
        System.out.println("A ave faz migração? Digite sim ou não.");
        if(input.nextLine().equalsIgnoreCase("sim")){
            papagaio.setFazMigracao(true);
        }else if(input.nextLine().equalsIgnoreCase("não")){
            papagaio.setFazMigracao(false);
        }else{
            System.out.println("Valor inválido. Atribuindo valor falso à variável.");
            papagaio.setFazMigracao(false);
        }        
        System.out.println(papagaio.toString());
        input.close();
    }
}
