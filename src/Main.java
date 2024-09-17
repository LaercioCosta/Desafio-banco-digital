public class Main {
    public static void main(String[] args) {

        cliente nome = new cliente();
        nome.setNome("Laercio");

        conta cc = new contaCorrente(nome);
        conta cp = new contaPoupanca(nome);

        cc.depositar(100);
        cc.imprimirExtado();
        cp.imprimirExtado();

        cc.transferir(100, cp);
        cc.imprimirExtado();
        cp.imprimirExtado();

    }
}