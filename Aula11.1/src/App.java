public class App {
    public static void main(String[] args) {
        Conta c1 = new Conta(100);
        c1.atualizarSaldo(50);
        System.out.println("Saldo pós taxa:" + c1.getSaldo());

        ContaCorrente cc = new ContaCorrente(100);
        cc.atualizarSaldo(50);
        System.out.println("Saldo pós taxa ContaCorrente:" + cc.getSaldo());
        cc.depositar(50);
        System.out.println("Saldo pós depósito: " + cc.getSaldo());

        ContaPoupanca cp = new ContaPoupanca(100);
        System.out.println(cp.atualizarSaldo(50));
        System.out.println("Saldo pós taxa ContaPoupança:" + cp.getSaldo());

    }
}
