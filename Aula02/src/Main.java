import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int codAluno = 0;
            float media = 0;

            do{
                for(int i=1; i<=3; i++){
                    System.out.println("Digite a nota" + i + " do aluno ");
                    media += scanner.nextFloat();
                }
                String texto = JOptionPane.showInputDialog(null, "Digite o código do aluno");
                codAluno = integer.parse
            }while(codAluno != 0);
        }
    }