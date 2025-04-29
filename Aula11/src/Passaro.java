public class Passaro extends Animal {
    public Passaro(){}
    public Passaro(String nome, double velocidade, double localizacao){
        super(nome, velocidade, localizacao);
    }

    public void mover(){
        System.out.println("^^ \t ^^ \t ^^");
        this.setLocalizacao(getLocalizacao()+this.getVelocidade());
    }

    public String toString(){
        return super.toString() + "(Pássaro)";
    }
}
