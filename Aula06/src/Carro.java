public class Carro {
    private String tipo;
    private String cor;
    private String placa;
    private int numPortas;

    public String getTipo(){
        return tipo;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getCor(){
        return cor;
    }

    public void setCor(String cor){
        this.cor = cor; 
    }
    
    public String getPlaca(){
        return placa;
    }
    
    public void setPlaca(String placa){
        this.placa = placa;
    }
    
    public int getNumPortas(){
        return numPortas;
    }
    
    public void setNumPortas(int numPortas){
        this.numPortas = numPortas;
    }
}