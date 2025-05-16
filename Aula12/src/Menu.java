import java.util.Scanner;
import java.util.ArrayList;

public class Menu {
    public static int gerarMenu(Scanner scan) {
        String textoMenu = "1. Criar objeto" +
                            "\n2. Editar objeto" +
                            "\n3. Excluir objeto" +
                            "\n4. Sair" +
                            "\nSelecione uma opção:";
        System.out.println("-----------------------");
        System.out.println(textoMenu);
        return scan.nextInt();
    }

    public static int selecionarForma(Scanner scan) {
        String textoMenu = "1. Retângulo" +
                            "\n2. Círculo" +
                            "\n3. Triângulo" +
                            "\n4. Sair" +
                            "\nSelecione uma opção:" +
                            "\n-----------------------";
        System.out.println(textoMenu);
        return scan.nextInt();
    }

    public static Retangulo criarRetangulo(Scanner scan) {
        double largura, altura;
        String nome;
        System.out.println("Insira a largura:");
        largura = scan.nextDouble();
        scan.nextLine(); // Limpar buffer
        System.out.println("Insira a altura:");
        altura = scan.nextDouble();
        scan.nextLine();
        System.out.println("Insira o nome:");
        nome = scan.nextLine();

        return new Retangulo(altura, largura, nome);
    }

    public static Circulo criarCirculo(Scanner scan) {
        double diametro;
        String nome;
        System.out.println("Insira o diâmetro:");
        diametro = scan.nextDouble();
        scan.nextLine(); // Limpar buffer
        System.out.println("Insira o nome:");
        nome = scan.nextLine();

        return new Circulo(diametro, nome);
    }

    public static Triangulo criarTriangulo(Scanner scan) {
        double largura, altura;
        String nome;
        System.out.println("Insira a largura:");
        largura = scan.nextDouble();
        scan.nextLine(); // Limpar buffer
        System.out.println("Insira a altura:");
        altura = scan.nextDouble();
        scan.nextLine();
        System.out.println("Insira o nome:");
        nome = scan.nextLine();

        return new Triangulo(altura, largura, nome);
    }

    public static void editarForma(Scanner scan, Forma2D forma){
        System.out.println(forma);
        int entrada = selecionarAtributos(scan, forma);
        scan.nextLine(); // Limpar buffer
        switch(entrada){
            case 1:
                System.out.println("Insira o novo valor: ");
                forma.setNome(scan.nextLine());
                break;
            case 2:
                System.out.println("Insira o novo valor: ");
                forma.setAltura(scan.nextDouble());
                break;
            case 3:
                System.out.println("Insira o novo valor: ");
                forma.setLargura(scan.nextDouble());
                break;
            case 4:
                if(forma instanceof Circulo){
                System.out.println("Insira o novo valor: ");
                ((Circulo)forma).setAltura(scan.nextDouble());
                ((Circulo)forma).setLargura(scan.nextDouble());
                }else{
                    System.out.println("Opção inválida!");
                }
                break;
            default:
                System.out.println("Opção inválida!");
        }
        
    }

    public static int listarObjetos(Scanner scan, ArrayList<Forma2D> lista){
        int i = 1;
        for(Forma2D f : lista){
            System.out.println("[" + i + "]:" + f);
            i++;
        }
        System.out.println("Selecione o índice do objeto: ");
        return scan.nextInt()-1;
    }

    private static int selecionarAtributos(Scanner scan, Forma2D forma){
        String textoMenu = "1. Nome" + 
                            "\n2. Altura" + 
                            "\n3. Largura";
        if(forma instanceof Circulo) textoMenu += "\n 4. Diâmetro";
        textoMenu += "\nSelecione o atributo:";
        System.out.println(textoMenu);
        return scan.nextInt();
}
}