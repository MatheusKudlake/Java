import javax.swing.JOptionPane;

public class Main {
    public static void main (String[] args){
       String entrada = JOptionPane.showInputDialog(null, "Escolha um número de 1 a 10:");
       int numero = Integer.parseInt(entrada);
       String tabuada = "";
       if(numero < 1 || numero > 10){
           JOptionPane.showMessageDialog(null, "O número precisa estar entre 0 e 10!");
       }else{
           for(int i = 1; i<=10; i++){
               tabuada += i + "x" + numero + "=" + numero*i + "\n";
           }
           JOptionPane.showMessageDialog(null,"Tabuada do " + numero + ":\n" + tabuada);
       }
    }
}