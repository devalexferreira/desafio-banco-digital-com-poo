public class ContaPoupanca extends Conta{

    public ContaPoupanca(Cliente cliente) {
        super(cliente, 1);
    }

    @Override
    public void imprimirExtrato() {
        super.imprimirInformacoesComuns();
    }
}
