public class Peixe extends Animal{
    private boolean aguaDoce;

    public Peixe(){}
    public Peixe(String nome, double velocidade, double localizacao, boolean aguaDoce){
        super(nome, velocidade, localizacao);
        this.aguaDoce = aguaDoce;
    }
    
    public boolean getAguaDoce(){
        return this.aguaDoce;
    }

    public void setAguaDoce(boolean valor){
        this.aguaDoce = valor;
    }

    public void mover(){
        System.out.println(">-> >-> >->");
        super.setLocalizacao(getLocalizacao()+this.getVelocidade());
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nTipo de água: " + (this.aguaDoce ? "Doce" : "Salgada");
    }

    
}
