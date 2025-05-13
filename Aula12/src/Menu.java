import java.util.Scanner;

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
                            "Selecione uma opção:";
        System.out.println("-----------------------");
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

}
