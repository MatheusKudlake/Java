import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        Boleto b1 = new Boleto(Float.parseFloat(JOptionPane.showInputDialog("Insira o valor do boleto:")),
        Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de dias de atraso:")));

        b1.calcularValor();
    }
}