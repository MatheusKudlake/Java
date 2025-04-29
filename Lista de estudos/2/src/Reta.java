public class Reta {
    private double a, b;

    public Reta(double a, double b){
        this.a = a;
        this.b = b;
    }

    public Reta(Ponto2D p1, Ponto2D p2){
        double x1 = p1.getAbcissa();
        double y1 = p1.getOrdenada();
        double x2 = p2.getAbcissa();
        double y2 = p2.getOrdenada();

        this.a = (y2-y1) / (x2 - x1);
        this.b = y1-this.a*x1;
    }

    public Reta (double x1, double x2, double y1, double y2){
        this.a = (y2-y1) / (x2 - x1);
        this.b = y1-this.a*x1;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public boolean verificarPonto(Ponto2D p){
        if((this.getA() * p.getAbcissa() + this.getB()) == p.getOrdenada()){
            return true;
        }else {
            return false;
        }
    }

    /*public Ponto2D verificarIntersecao(Reta r){
        if(this.a == r.getA()){
            return null;
        }else{

        }

    }*/

    @Override

    public String toString(){
        return "y = " + this.a + "x + " + this.b;
    }
    
}
