public class App {
    public static void main(String[] args) throws Exception {
        Ponto2D ponto1 = new Ponto2D(0, 0);
        Ponto2D ponto2 = new Ponto2D(0, 0);

        System.out.println(ponto1.compararPonto(ponto2));
        System.out.println(ponto1.verificarDistancia(ponto2));

        //Complexo

        NumeroComplexo n1 = new NumeroComplexo(1, 2);
        NumeroComplexo n2 = new NumeroComplexo(1, 2);

        System.out.println(n1.equals(n1));
        System.out.println(n1.toString());
        System.out.println(n1.obterModulo());

        //Reta

    }
}
