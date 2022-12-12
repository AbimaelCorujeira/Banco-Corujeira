public class TestaBanco {
    public static void main(String[] args) {
        Cliente abimael = new Cliente();
        abimael.nome = "Abimael Corujeira";
        abimael.cpf = "12345678912";
        abimael.profissao = "Desenvolvedor";

        Conta contaDoAbimael = new Conta();
        contaDoAbimael.deposita(100);

        contaDoAbimael.titular = abimael;
        System.out.println(contaDoAbimael.titular.nome);

    }
}
