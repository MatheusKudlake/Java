public class Circulo extends Forma2D {  
    public Circulo(){
        super();
    }
    public Circulo(double altura, double largura, String nome){
        if(altura == largura){
            this.setAltura(altura);
            this.setLargura(largura);
            this.setNome(nome);
        }else{
            System.out.println("Erro: Largura e altura diferentes! Objeto \"círculo\" não instanciado.");
        }
    }
    public Circulo(double diametro, String nome){
        this.setAltura(diametro);
        this.setLargura(diametro);
        this.setNome(nome);
    }

    public double calculaArea(){
        double raio = this.getAltura() / 2;
        return 3.14 * Math.pow(raio, 2);
    }
}
