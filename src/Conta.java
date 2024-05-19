public abstract class Conta implements Iconta{
    private static int AGENCIA_PADRAO  = 1;
    private static int  SEQUENCIAL = 1;
    protected int agencia;
    protected int conta;
    protected double saldo = 0.0;
    protected Cliente cliente;
    protected int tipo;

    public Conta(Cliente cliente, int tipo) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.conta = SEQUENCIAL++;
        this.cliente = cliente;
        this.tipo = tipo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public int getTipo() {
        return tipo;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getConta() {
        return conta;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void depositar(Double valor) {
        this.saldo += valor;
    }

    @Override
    public void sacar(Double valor) {
        this.saldo -= valor;
    }

    @Override
    public void transferir(Double valor, Conta contadestino) {
        this.sacar(valor);
        contadestino.depositar(valor);
    }

    protected  void imprimirInformacoesComuns() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.conta));
        System.out.println(String.format("Saldo: %.2f" ,this.saldo));
    }

    @Override
    public String toString() {
        return "Conta{" +
                "conta=" + conta +
                '}';
    }
}

