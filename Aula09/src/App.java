import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        
        ArrayList<Animal> listaAnimais = new ArrayList<>();

        //--Animal--
        listaAnimais.add(Menu.cadastrarAnimal());
        Scanner input = new Scanner(System.in);
        
        //--Ave--
        Ave papagaio = new Ave();

        input.nextLine();
        
        System.out.println("Digite o nome da ave:");
        papagaio.setNome(input.nextLine());
        
        System.out.println("Digite o peso da ave:");
        papagaio.setPeso(input.nextFloat());
        
        System.out.println("Digite o recinto da ave:");
        papagaio.setRecinto(input.nextInt());

        input.nextLine();

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