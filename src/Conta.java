public class Conta {
    double saldo;
    int agencia;
    int numero;
    Cliente titular;

    public void deposita(double valor) {
        saldo += valor;
    }

    public boolean saca(double valor) {
        if(saldo >= valor) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    public boolean transfere(double valor, Conta destino) {
        if(saldo >= valor) {
            saldo -= valor;
            destino.deposita(valor);
            return true;
        }
        return false;
    }
}
