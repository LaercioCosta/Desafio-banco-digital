public class contaPoupanca extends conta {


    public contaPoupanca(cliente Cliente) {
        super(Cliente);
    }

    @Override
    public void imprimirExtado() {
        System.out.println("***Extrado Conta poupaça***");
        super.imprimirInfos();
    }

}
