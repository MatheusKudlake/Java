public class App {
    public static void main(String[] args) {
        Contador dias = new Contador();
        for(int i=0; i<10; i++){
            dias.incrementar();
        }        
        System.out.println("Contagem atual incrementando 10 vezes: " + dias.getContagem());

        dias.somar(5);
        System.out.println("Somando 5: " + dias.getContagem());

        dias.subtrair(5);
        System.out.println("Subtraindo 5: " + dias.getContagem());

        for(int i=0; i<5; i++){
            dias.decrementar();
        }   
        System.out.println("Decrementando 5 vezes: " + dias.getContagem());

        dias.zerar();
        System.out.println("Zerado: " + dias.getContagem());
    }
}
