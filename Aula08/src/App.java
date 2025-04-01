import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        Calculadora calc = new Calculadora();

        calc.setN1(Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:")));
        calc.setN2(Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:")));

        JOptionPane.showMessageDialog(null, calc.getN1() + " + " + calc.getN2() + " = " + calc.soma() +
        "\n" + calc.getN1() + " - " + calc.getN2() + " = " + calc.subtracao() +
        "\n" + calc.getN1() + " * " + calc.getN2() + " = " + calc.multiplicacao() +
        "\n" + calc.getN1() + " / " + calc.getN2() + " = " + calc.divisao());
    }
}