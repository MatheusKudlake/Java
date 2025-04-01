public class Retangulo {
    private int lado1;
    private int lado2;

    public Retangulo(){
        this.lado1 = 10;
        this.lado2 = 10;
    }
    public Retangulo(int lado1, int lado2){
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public int getLado1(){
        return this.lado1;
    }

    public void setLado1(int lado1){
        this.lado1 = lado1;
    }

    public int getLado2(){
        return this.lado2;
    }

    public void setLado2(int lado2){
        this.lado2 = lado2;
    }

    public int calculaArea(){
        return lado1*lado2;
    }

    public int calculaPerimetro(){
        return (lado1+lado2)*2;
    }

    public String toString(){
        return "Lado 1: " + lado1 + "\nLado 2: " + lado2;
    }
}
