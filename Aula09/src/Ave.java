public class Ave extends Animal{
    private String local;
    private boolean fazMigracao;

    public Ave(){}
    public Ave(String nome, double peso, int recinto, String local, boolean fazMigracao){
        super(nome, peso, recinto);
        this.local = local;
        this.fazMigracao = fazMigracao;
    }

    public String getLocal() {
        return local;
    }
    public void setLocal(String local) {
        this.local = local;
    }
    public boolean fazMigracao() {
        return fazMigracao;
    }
    public void setFazMigracao(boolean fazMigracao) {
        this.fazMigracao = fazMigracao;
    }

    @Override
    public String toString(){
        return super.toString() +
                "\nLocal: " + this.local +
                (this.fazMigracao ? "\nFaz migração" : "\nNão faz migração");
    }
}
