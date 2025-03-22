import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args){
        Carro c1 = new Carro();
        c1.tipo = "Gol";
        c1.cor = "Preto";
        c1.placa = "AKD3948";
        c1.num_portas = 2;

        Carro c2 = new Carro();

        c2.tipo = JOptionPane.showInputDialog( "Digite o nome do carro:");
        c2.cor = JOptionPane.showInputDialog( "Digite a cor do carro:");
        c2.placa = JOptionPane.showInputDialog( "Digite a placa do carro:");
        c2.num_portas = Integer.parseInt(JOptionPane.showInputDialog( "Digite o número de portas do carro:"));

        JOptionPane.showMessageDialog(null,"Nome do carro: "+c2.tipo+"\nCor do carro: "+c2.cor+
                "\nPlaca do carro: "+c2.placa+"\nNúmero de portas do carro: "+c2.num_portas);


    }
}
