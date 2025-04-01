public class Cliente {
    public String tipoDaConta;
    public String nome;
    public int numero;
    public float saldo;

    public Cliente(){};
    public Cliente(String tipoDaConta, String nome, int numero){
        this.tipoDaConta = tipoDaConta;
        this.nome = nome;
        this.numero = numero;
        this.saldo = 0;
    }

    public void Sacar(float valor){
        if(valor <= saldo){
            saldo -= valor;
            System.out.println("Sacando R$" + valor);
            System.out.println("Saldo atual: R$" + saldo);
        }else{
            System.out.println("Você não tem saldo suficiente!");
        }
    }

    public void Depositar(float valor){
        saldo += valor;
        System.out.println("Depositando R$" + valor);
        System.out.println("Saldo atual: R$" + saldo);
    }

    public void Imprimir(){
        System.out.println("Tipo da conta:" + this.tipoDaConta);
        System.out.println("Nome do cliente:" + this.nome);
        System.out.println("Número da conta:" + this.numero);
        System.out.println("Saldo da conta:" + this.saldo);
    }
}
