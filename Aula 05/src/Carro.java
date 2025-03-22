import java.util.Scanner;

public class Carro {
    String tipo;
    String cor;
    String placa;
    int num_portas;
    int velocidade = 0;
    boolean ligado = false;

    public void Ligar(){
        if(ligado){
            System.out.println("O carro já está ligado!");
        }else{
            System.out.println("Carro ligado!");
            ligado = true;
        }
    }

    public void Desligar(){
        if(!ligado){
            System.out.println("O carro já está desligado!");
        }else if(velocidade>0){
            System.out.println("Pare o carro primeiro!");
        }else{
            System.out.println("Carro desligado!");
            ligado = false;
        }
    }

    public void Acelerar(){
        if(ligado){
            velocidade += 10;
            System.out.println("Acelerando...");
            System.out.println("Velocidade: " + velocidade + "km/h");
        }else{
            System.out.println("O carro está desligado!");
        }

    }

    public void Frear(){
        if(velocidade==0){
            System.out.println("O carro já está parado!");
        }else{
            velocidade -= 10;
            System.out.println("Freando...");
            System.out.println("Velocidade: " + velocidade + "km/h");
        }
    }
}
