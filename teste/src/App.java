import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Animal> listaAnimais = new ArrayList();
        Scanner in = new Scanner(System.in);
        int entrada;
        String textoMenu = "1. Cadastrar animal\n" +
                            "2. Lista de animais\n" +  
                            "3. Editar animal\n" + 
                            "4. Excluir animal\n" + 
                            "5. Sair\n" + 
                            "Selecione sua opção:\n" + 
                            "-------------------------";


        do{
            System.out.println(textoMenu);
            entrada = in.nextInt();
            in.nextLine();
            
            switch(entrada){
                case 1:
                    listaAnimais.add(Menu.cadastrarAnimal(in));
                    break;
                case 2:
                    for(Animal a : listaAnimais){
                        System.out.println(a.toString());
                    }
                    break;
                case 3:
                    Menu.editarAnimal(listaAnimais, in);
                    break;
                case 4:
                    Menu.excluirAnimal(listaAnimais, in);
                    break;
                default:
                    System.out.println("Valor inválido!");
            }
        }while(entrada != 5);
        in.close();
    }
}
