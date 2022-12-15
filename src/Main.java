public class Main {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(10, 123);
        contaCorrente.deposita(100);

        ContaPoupanca contaPoupanca = new ContaPoupanca(10, 147);
        contaPoupanca.deposita(200);

        contaCorrente.transfere(50, contaPoupanca);

        System.out.println("Saldo da conta corrente: R$" + contaCorrente.getSaldo());
        System.out.println("Saldo da conta poupança: R$" + contaPoupanca.getSaldo());
    }
}
