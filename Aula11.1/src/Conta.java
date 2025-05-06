public class Conta {
    private double saldo;
    
    public Conta(){}
    public Conta(double saldo){
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean depositar(double valor) {
        if(valor > 0){
            this.saldo += valor;
            return true;
        }else{
            return false;
        }
    }

    public boolean sacar(double valor) {
        if(valor <= this.saldo){
            this.saldo -= valor;
            return true;
        }else{
            return false;
        }
    }

    public boolean atualizarSaldo(double taxa){
        if(this instanceof Conta && this.getClass() != Conta.class){
            if(taxa > 0){
                this.saldo += this.saldo * taxa / 100;
                return true;
            }else{
                return false;
            }
        }else{
            if(taxa > 0 && taxa <= 100){
                this.saldo += this.saldo * taxa / 100;
                return true;
            }else{
                return false;
            }
        }       
    }    
}