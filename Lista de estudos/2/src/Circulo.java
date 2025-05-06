public class Circulo {
    private double raio;
    private Ponto2D centro;

    public Circulo(double raio, Ponto2D centro){
        this.raio = raio;
        this.centro = centro;
    }

    public double getRaio() {
        return raio;
    }
    public void setRaio(double raio) {
        this.raio = raio;
    }
    public Ponto2D getCentro() {
        return centro;
    }
    public void setCentro(Ponto2D centro) {
        this.centro = centro;
    }

    public double getArea(){
        return 3.14 + Math.pow(raio, 2);
    }

    public void inflar(double valor){
        this.raio += valor;
    }

    public void desinflar(double valor){
        this.raio -= valor;
    }

    public void mover(){
        this.centro.setAbcissa(0);
        this.centro.setOrdenada(0);
    }
    public void mover(double x, double y){
        this.centro.setAbcissa(x);
        this.centro.setOrdenada(y);
    }
    public void mover(Ponto2D p){
        this.centro.setAbcissa(p.getAbcissa());
        this.centro.setOrdenada(p.getOrdenada());
    }
}
