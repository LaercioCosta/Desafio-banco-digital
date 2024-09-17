public class contaCorrente extends conta {

    public contaCorrente(cliente Cliente) {
        super(Cliente);
    }

    @Override
    public void imprimirExtado() {
        System.out.println("***Extrado Conta corrente***");
        super.imprimirInfos();

    }


}
