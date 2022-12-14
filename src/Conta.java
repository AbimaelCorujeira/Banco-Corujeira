public class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total;

    public Conta(int agencia, int numero) {
        total++;
        this.agencia = agencia;
        this.numero = numero;
        System.out.println("Conta criada na agência: " + agencia + " e número " + numero);
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

    public void deposita(double valor) {
        saldo += valor;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setNumero(int numero) {
        if(numero <= 0) {
            System.out.println("Valor menor ou igual a zero não permitido!");
            return;
        }
        this.numero = numero;
    }

    public void setAgencia(int agencia) {
        if (agencia <= 0) {
            System.out.println("Valor menor ou igual a zero não permitido!");
            return;
        }
        this.agencia = agencia;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public static int getTotal() {
        return Conta.total;
    }
}
