import java.util.Scanner;

public class vendas {
    public float V;
    public float excessoAno;
    public float E;
    public float M;
    public float multaAno;
    Scanner input = new Scanner(System.in);

    public void cadastrarVenda(){
        System.out.println("Insira o valor da venda:");
        float venda = input.nextFloat();
        this.V += venda;
        if(V > 500) {
            E = venda - 500;
            M = (int) E * 0.1f;
            excessoAno += E;
            multaAno += M;
        }
        System.out.println("Venda cadastrada!");
        System.out.println("Excesso: R$" + this.E);
        System.out.println("Multa a pagar: R$" + this.M);
    }

    public void consultarImposto(){
        System.out.println("Imposto a pagar no mês: R$" + this.M);
        System.out.println("Imposto a pagar no ano: R$" + this.multaAno);
    }

}
