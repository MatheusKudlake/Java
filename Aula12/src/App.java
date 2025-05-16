import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        ArrayList<Forma2D> formas = new ArrayList();

        int entrada;
        do {
            entrada = Menu.gerarMenu(scan);
            switch (entrada) {
                case 1:
                    int entradaForma = Menu.selecionarForma(scan);
                    switch (entradaForma) {
                        case 1:
                            formas.add(Menu.criarRetangulo(scan));
                            break;
                        case 2:
                            formas.add(Menu.criarCirculo(scan));
                            break;
                        case 3:
                            formas.add(Menu.criarTriangulo(scan));
                            break;
                        case 4:
                            System.out.println("Saindo...");
                            break;
                        default:
                            System.out.println("Opção inválida!");
                    }
                    break;
                case 2:
                    if (formas.size() < 1){
                        System.out.println("Nenhum objeto foi criado!");
                    }else{
                        int indice = Menu.listarObjetos(scan, formas);
                        Menu.editarForma(scan, formas.get(indice));
                    }
                    break;
                case 3:
                    if (formas.size() < 1){
                        System.out.println("Nenhum objeto foi criado!");
                    }else{
                        int indice2 = Menu.listarObjetos(scan, formas);
                        formas.remove(formas.get(indice2));
                    }
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (entrada != 4);
    }
}