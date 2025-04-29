import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class NumeroComplexo {
    private double real, imaginario;

    public NumeroComplexo(double real, double imaginario) {
        this.real = real;
        this.imaginario = imaginario;
    }
    public double getReal() {
        return real;
    }
    public void setReal(double real) {
        this.real = real;
    }
    public double getImaginario() {
        return imaginario;
    }
    public void setImaginario(double imaginario) {
        this.imaginario = imaginario;
    }

    public NumeroComplexo somar(NumeroComplexo numero){
        return new NumeroComplexo(this.real + this.getReal(), this.imaginario + this.getImaginario());
    }

    public NumeroComplexo subtrair(NumeroComplexo numero){
        return new NumeroComplexo(this.real - numero.getReal(), this.imaginario - numero.getImaginario());
    }

    public NumeroComplexo multiplicar(NumeroComplexo numero){
        return new NumeroComplexo(this.real*numero.getReal() - this.getImaginario()*numero.getImaginario(), this.real*numero.getReal() + this.imaginario*numero.getImaginario());
    }

    public NumeroComplexo dividir(NumeroComplexo numero){
        double c2d2 = pow(numero.getReal(), 2) + pow(numero.getImaginario(), 2);
        double r = (this.real * numero.getReal() + this.imaginario * numero.getImaginario())/c2d2;
        double i = (this.imaginario * numero.getReal() - this.real * numero.getImaginario())/c2d2;
        return new NumeroComplexo(r, i);
    }

    public double obterModulo(){
        return sqrt(pow(this.real, 2) + pow(this.imaginario, 2));
    }

    @Override

    public boolean equals(Object numero){
        if(!(numero instanceof NumeroComplexo)) return false; // Retorna false se o objeto não for da classe NumeroComplexo

        NumeroComplexo c = (NumeroComplexo) numero; //Cast para conseguir checar os valores

        if(this.real == c.getReal() && this.imaginario == c.getImaginario()){
            return true;
        }else{
            return false;
        }
    }

    public String toString(){
        return this.real + " + " + this.imaginario + "i";
    }
}