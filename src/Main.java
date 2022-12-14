public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta(10, 1234);
        Conta conta2 = new Conta(10, 1235);
        Conta conta3 = new Conta(11, 1456);

        conta.deposita(500);
        conta2.deposita(1000);
        conta.saca(200);
        conta2.transfere(500, conta);

        System.out.println(conta.getSaldo());
        System.out.println(conta2.getSaldo());

        System.out.println("O total de contas é: " + Conta.getTotal());

    }
}
