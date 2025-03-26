public class Main {
    public static void main(String[] args){
        Carro gol = new Carro();

        gol.setTipo("Gol");
        gol.setCor("Preto");
        gol.setPlaca("DKE-3464");
        gol.setNumPortas(5);


        System.out.println("Tipo do carro: " + gol.getTipo());
        System.out.println("Cor do carro: " + gol.getCor());
        System.out.println("Placa do carro: " + gol.getPlaca());
        System.out.println("Número de portas do carro: " + gol.getNumPortas());
    }
}
