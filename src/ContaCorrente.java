public class ContaCorrente extends Conta{

    public ContaCorrente(int agencia, int numero) {
        super(agencia, numero);
        System.out.println("Conta Corrente criada na agência: " + agencia + " e número " + numero);
    }

    @Override
    public boolean saca(double valor) {
        double valorASacar = valor + 0.2;
        return super.saca(valorASacar);
    }
}
