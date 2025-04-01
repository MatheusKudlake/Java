public class carro {
    private String tipo;
    private String cor;
    private String placa;
    private int numPortas;

    public carro(String tipo, String cor, String placa, int numPortas){
        this.tipo = tipo;
        this.cor = cor;
        this.placa = placa;
        this.numPortas = numPortas;
    }

    public carro(){
        this.cor="Branco";
    }

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

    public String toString(){
        String texto =
                "Tipo: " + this.tipo
                + "\nCor: " + this.cor
                + "\nPlaca: " + this.placa
                + "\nNúmero de portas: " + this.numPortas;
        return texto;
    }
}