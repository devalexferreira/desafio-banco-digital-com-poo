public interface Iconta {
    void depositar(Double valor);
    void sacar(Double valor);
    void transferir(Double valor, Conta contadestino);
    void imprimirExtrato();
}
