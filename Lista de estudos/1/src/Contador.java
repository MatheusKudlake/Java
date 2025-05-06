public class Contador {
    private int contagem = 0;

    public int getContagem() {
        return contagem;
    }

    public void setContagem(int contagem) {
        this.contagem = contagem;
    }

    public void zerar(){
        this.contagem = 0;
    }

    public void incrementar(){
        this.contagem++;
    }
}
