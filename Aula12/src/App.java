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
                    switch (entrada) {
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
            }
        } while (entrada != 4);
    }
}