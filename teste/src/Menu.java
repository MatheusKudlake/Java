import java.util.Scanner;
import java.util.ArrayList;

public class Menu {
    
    public static Animal cadastrarAnimal(Scanner in){
        

        System.out.println("Digite o nome do animal:");
        String nome = in.nextLine();
        System.out.println("Digite o peso do animal:");
        float peso = in.nextFloat();
        System.out.println("Digite o recinto do animal:");
        int recinto = in.nextInt();

        Animal a1 = new Animal(nome, peso, recinto);
        return a1;
    }

    public static void editarAnimal(ArrayList<Animal> lista, Scanner in){
        System.out.println("Insira a posição do animal, de 1 a " + lista.size() + ":");
                    int posicao = in.nextInt();
                    String menuAtributos = "Selecione um atributo para editar:" + 
                                            "1. Nome" + 
                                            "2. Peso" + 
                                            "3. Recinto" + 
                                            "4. Cancelar";

                    System.out.println(menuAtributos);
                    int entrada = in.nextInt();
                    in.nextLine();
                    switch(entrada){
                        case 1:
                            System.out.println("Digite o novo nome");
                            lista.get(posicao).setNome(in.nextLine());
                            break;
                        case 2:
                            System.out.println("Digite o novo peso");
                            lista.get(posicao).setPeso(in.nextFloat());
                            break;
                        case 3:
                            System.out.println("Digite o novo recinto");
                            lista.get(posicao).setRecinto(in.nextInt());
                            break;
                        case 4:
                            System.out.println("Cancelando...");
                            break;
                        default:
                            System.out.println("Valor inválido! Cancelando operação...");
                    }                
    }
    public static void excluirAnimal(ArrayList<Animal> lista, Scanner in){
            System.out.println("Digite a posição do animal para excluir:");
            int posicao = in.nextInt();
            lista.remove(posicao);
            System.out.println("Animal da posição " + posicao + " excluído!");
    }
}
