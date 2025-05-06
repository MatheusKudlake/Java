public class ContaPoupanca extends Conta {
    public ContaPoupanca(){}

    public ContaPoupanca(double saldo){
        super(saldo);
    }

    @Override
    public boolean atualizarSaldo(double taxa){
        return super.atualizarSaldo(taxa * 3);
    }
}