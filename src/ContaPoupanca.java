public class ContaPoupanca extends Conta{

    public ContaPoupanca(int agencia, int numero) {
        super(agencia, numero);
        System.out.println("Conta Poupança criada na agência: " + agencia + " e número " + numero);
    }

    @Override
    public void deposita(double valor) {
        super.saldo += valor;
    }
}
