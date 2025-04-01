import javax.swing.JOptionPane;

public class Boleto {
    private float valor;
    private float valorAtraso;
    private int diasAtraso;

    Boleto(){}
    Boleto(float valor, int diasAtraso){
        this.valor = valor;
        this.diasAtraso = diasAtraso;
    }

    public float getValor(){
        return this.valor;
    }

    public void setValor(float valor){
        this.valor = valor;
    }

    public float getValorAtraso(){
        return this.valorAtraso;
    }

    public void setValorAtraso(float valorAtraso){
        this.valorAtraso = valorAtraso;
    }

    public float getDiasAtraso(){
        return this.diasAtraso;
    }

    public void setDiasAtraso(int diasAtraso){
        this.diasAtraso = diasAtraso;
    }

    public void calcularValor(){
        valorAtraso = valor + valor*5/100;
        for(int i = 0; i < diasAtraso; i++){
            valorAtraso += 0.01*valorAtraso;
        }
        JOptionPane.showMessageDialog(null, "Valor original do boleto: " + valor);
        JOptionPane.showMessageDialog(null, "Novo valor do boleto: " + valorAtraso);
    }
}
