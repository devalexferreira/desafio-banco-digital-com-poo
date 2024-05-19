public class ContaCorrente extends Conta{

    public ContaCorrente(Cliente cliente) {
        super(cliente, 0);
    }

    @Override
    public void imprimirExtrato() {
        super.imprimirInformacoesComuns();
    }
}
