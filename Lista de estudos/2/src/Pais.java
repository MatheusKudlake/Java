public class Pais {
    private String iso;
    private double populacao, dimensao;
    
    public String getIso() {
        return iso;
    }


    public void setIso(String iso) {
        this.iso = iso;
    }


    public double getPopulacao() {
        return populacao;
    }


    public void setPopulacao(double populacao) {
        this.populacao = populacao;
    }


    public double getDimensao() {
        return dimensao;
    }


    public void setDimensao(double dimensao) {
        this.dimensao = dimensao;
    }


    public Pais(String iso, int populacao, double dimensao){
        this.iso = iso;
        this.populacao = populacao;
        this.dimensao = dimensao;
    }

    @Override
    public boolean equals(Object o){
        if(!(o instanceof Pais)){
            return false;
        }
        Pais p = (Pais) o;
        if(this.iso.equals(p.iso)){
            return true;
        }else{
            return false;
        }
    }

    
}
