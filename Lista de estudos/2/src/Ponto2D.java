import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Ponto2D {
    private double abcissa;
    private double ordenada;

    public Ponto2D(){}
    public Ponto2D(double abcissa, double ordenada){
        this.abcissa = abcissa;
        this.ordenada = ordenada;
    }
    public Ponto2D(Ponto2D ponto){
        this.abcissa = ponto.getAbcissa();
        this.ordenada = ponto.getOrdenada();
    }

    public double getAbcissa() {
        return abcissa;
    }
    public void setAbcissa(double abcissa) {
        this.abcissa = abcissa;
    }
    public double getOrdenada() {
        return ordenada;
    }
    public void setOrdenada(double ordenada) {
        this.ordenada = ordenada;
    }

    public void moverPonto(double abcissa, double ordenada){
        this.abcissa = abcissa;
        this.ordenada = ordenada;
    }

    public void moverPonto(Ponto2D ponto){
        this.abcissa = ponto.getAbcissa();
        this.ordenada = ponto.getOrdenada();
    }

    public boolean compararPonto(Ponto2D ponto){
        if(ponto.getAbcissa() == this.abcissa && ponto.getOrdenada() == this.ordenada){
            return true;
        }else{
            return false;
        }
    }

    public double verificarDistancia(Ponto2D ponto){
        double distX = this.getAbcissa() - ponto.getAbcissa();
        double distY = this.getOrdenada() - ponto.getOrdenada();
        return sqrt(pow(distX, 2) + pow(distY, 2));
    }

    public Ponto2D clonar(){
        return new Ponto2D(this.abcissa, this.ordenada);
    }

    @Override
    public String toString(){
        return "Abcissa: " + this.getAbcissa() + 
                "\nOrdenada: " + this.getOrdenada();
    }
}
