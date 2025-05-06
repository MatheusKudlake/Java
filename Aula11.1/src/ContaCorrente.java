public class ContaCorrente extends Conta{
    public ContaCorrente(){}

    public ContaCorrente(double saldo){
        super(saldo);
    }

    @Override
    public boolean depositar(double valor){
        if(valor > 0.1){
            return super.depositar(valor - 0.1);
        }else{
            return false;
        }
    }

    @Override
    public boolean atualizarSaldo(double taxa){
        return super.atualizarSaldo(taxa * 2);
    }
}
