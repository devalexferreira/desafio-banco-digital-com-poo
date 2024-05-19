public class CaixaEletronico {
    public static void main(String[] args) {
        Banco bc = new Banco();
        Cliente alex = new Cliente("Alex");
        Conta cc = new ContaCorrente(alex);
        Conta cp = new ContaPoupanca(alex);

        bc.setConta(cc);
        bc.setConta(cp);

        cc.depositar(100.0);
        cc.transferir(100.0, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();

        //exibe a qtd de contas que o banco possui
        System.out.println("=========Total de contas do banco=========");
        System.out.println(bc.getContas().size());

        System.out.println("=========Total de contas corrente=========");
        System.out.println(bc.getContasCorrente().size());

        System.out.println("=========Total de contas poupanca=========");
        System.out.println(bc.getContasPoupanca().size());

        System.out.println("=========Clientes do banco=========");
        bc.listarClientes();



    }
}
