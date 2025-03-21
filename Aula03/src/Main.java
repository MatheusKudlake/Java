import javax.swing.JOptionPane;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       /* -- Exercício 1: --
       String entrada = JOptionPane.showInputDialog(null, "Escolha um número de 1 a 10:");
       int numero = Integer.parseInt(entrada);
       String tabuada = "";
       if(numero < 1 || numero > 10){
           JOptionPane.showMessageDialog(null, "O número precisa estar entre 0 e 10!");
       }else{
           for(int i = 1; i<=10; i++){
               tabuada += i + "x" + numero + "=" + numero*i + "\n";
           }
           JOptionPane.showMessageDialog(null,"Tabuada do " + numero + ":\n" + tabuada);*/

        /*  -- Exercício 2: --
        int inicio=1, limite=5;

        for(int a=0; a<2; a++){
            for (int i = 1; i <= 10; i++) {
                for (int j = inicio; j <= limite ; j++) {
                    System.out.print(j + "x" + i + "=" + j * i + "\t");
                }
                System.out.print("\n");
            }
            if(limite == 5) System.out.println("------------------------------------------");
            inicio=6;
            limite=10;*/

        Scanner input = new Scanner(System.in);
        System.out.println("Insira uma sequência de números:");
        String texto = input.nextLine();

        String[] numerosString = texto.split("-");
        Integer[] numeros = new Integer[numerosString.length];

        for(int i=0; i<numerosString.length; i++){
            numeros[i] = Integer.parseInt(numerosString[i]);
        }
        Arrays.sort(numeros, Collections.reverseOrder());
        System.out.println(Arrays.toString(numeros));
    }
}