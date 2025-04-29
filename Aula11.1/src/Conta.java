public class Conta {
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        if(valor >= this.saldo){
            this.saldo -= valor;
        }else{
            System.out.println("Saque indisponível!");
        }
    }

    public void atualizarSaldo(double taxa){}      
    }
    
    
}
