import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args){
        Retangulo ret1 = new Retangulo();

        int lado1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o lado 1 do retângulo:"));
        int lado2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o lado 2 do retângulo:"));

        Retangulo ret2 = new Retangulo(lado1, lado2);

        System.out.println("Retângulo 1: \n" + ret1.toString());
        System.out.println("------------------------------------------");
        System.out.println("Retângulo 2: \n" + ret2.toString());

        System.out.println("------------------------------------------");

        System.out.println("Área do retângulo 1: " + ret1.calculaArea());
        System.out.println("Perímetro do retângulo 1: " + ret1.calculaPerimetro());

        System.out.println("------------------------------------------");

        System.out.println("Área do retângulo 2: " + ret2.calculaArea());
        System.out.println("Perímetro do retângulo 2: " + ret2.calculaPerimetro());

    }
}
