public class Contador {
    private int contagem;

    public int getContagem(){
        return this.contagem;
    }

    public void setContagem(int valor){
        this.contagem = valor;
    }

    public void zerar(){
        this.contagem = 0;
    }

    public void incrementar(){
        this.contagem++;
    }

    public void decrementar(){
        this.contagem--;
    }

    public void somar(int valor){
        this.contagem += valor;
    }

    public void subtrair(int valor){
        this.contagem -= valor;
    }
}
