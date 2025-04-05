public class Poluicao {
    private float indice;

    public float getIndice(){
        return this.indice;
    }

    public void setIndice(float valor){
        this.indice = valor;
    }

    public String lerIndice(float valor){
        this.indice = valor;
        if(){

        }else if(this.indice < 0.25){
            return "as indústrias do grupo deverão reduzir em 50% suas atividades.";
        }else if(this.indice < 0.4){
            return "as indústrias do grupo deverão suspender suas atividades.";
        }else{
            return "todos os grupos deverão paralisar suas atividades.";
        }
    }
}
