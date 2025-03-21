import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        /*ArrayList<Integer> numeros = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        Integer n = -1;
        do{
            System.out.println("Digite um número positivo ou -1 para sair");
            n = input.nextInt();
            if(n!=-1){
                numeros.add(n);
            }
        }while(n!=-1);

        System.out.println("Foram registrados " + numeros.size() + " números:");

        for(int i=0; i<numeros.size(); i++) {
            System.out.print("[" + numeros.get(i) + "]");
        }

        System.out.println("");
        System.out.println("Digite um número para buscar no ArrayList:");
        int busca = input.nextInt();
        if(numeros.contains(busca)){
            System.out.println("Está no ArrayList.");
        }else{
            System.out.println("Não está no ArrayList.");
        }

        //Exercício 01

        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        int n = -1;

        do{
            System.out.println("Digite um número não repetido, ou -1 para sair:");
            n = input.nextInt();
            if(numeros.contains(n)){
                System.out.println("O número é repetido, portanto não será adicionado.");
            }else if(n!=-1){
                numeros.add(n);
            }
        }while(n!=-1);

        numeros.sort(null);
        for(int i=0; i<numeros.size(); i++){
            System.out.print("["+numeros.get(i)+"]");

        //Exercício 02

        Scanner input = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();
        String entrada;
        do{
            System.out.println("Digite um nome para inserir na lista:");
            entrada = input.nextLine();
            if(!entrada.equalsIgnoreCase("fim")){
                nomes.add(entrada);
            }
        }while(!entrada.equalsIgnoreCase("fim"));

        System.out.println("Digite um nome para verificar se está na lista:");
        entrada = input.nextLine();
        if(nomes.contains(entrada)){
            System.out.println("O nome está na lista, na posição " + (nomes.indexOf(entrada)+1));
        }else{
            System.out.println("O nome não está na lista.");
        }

        System.out.println(nomes);

        System.out.println("Digite um nome para remover da lista:");
        entrada = input.nextLine();
        nomes.remove(entrada);

        System.out.println(nomes);*/

        //Exercício 03

        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int entrada;

        do{
            System.out.println("1. Adicionar um número.");
            System.out.println("2. Remover um número.");
            System.out.println("3. Verificar a posição de um número.");
            System.out.println("4. Modificar o número de uma posição.");
            System.out.println("5. Média dos valores.");
            System.out.println("6. Imprimir números.");
            System.out.println("7. Sair.");
            System.out.println("-------------------------------");
            System.out.println("Digite a opção escolhida:");
            entrada = input.nextInt();
            System.out.println("-------------------------------");

            switch (entrada){
                case 1:
                    numeros.add(ReceberNumero());
                    break;
                case 2:
                    numeros.remove(numeros.indexOf(ReceberNumero()));
                    break;
                case 3:
                    int num = ReceberNumero();
                    System.out.println("O número " + num + "está na posição" + numeros.indexOf(num));
                    break;
                case 4:
                    int pos, valor;
                    System.out.println("Selecione uma posição da lista:");
                    pos = ReceberNumero();
                    System.out.println("Selecione o novo valor:");
                    valor = ReceberNumero();
                    numeros.set(pos, valor);
                    break;
                case 5:
                    int soma;
                    float media;

            }
        }while(entrada!=7);
    }

    static int ReceberNumero(){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número:");
        return input.nextInt();
    }
}