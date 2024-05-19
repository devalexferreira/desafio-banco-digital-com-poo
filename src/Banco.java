import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {
    private List<Conta> contas = new ArrayList<>();
    private String nome;

    public List<Conta> getContas() {
        return contas;
    }

    public List<Conta> getContasCorrente() {
        List<Conta> c = new ArrayList<>();
        if(!contas.isEmpty()) {
            Iterator<Conta> iterator = contas.iterator();
            while (iterator.hasNext()) {
                Conta ct = iterator.next();
                if(ct.getTipo() == 0) {
                    c.add(ct);
                }
            }
        }
        return c;
    }

    public List<Conta> getContasPoupanca() {
        List<Conta> c = new ArrayList<>();
        if(!contas.isEmpty()) {
            Iterator<Conta> iterator = contas.iterator();
            while (iterator.hasNext()) {
                Conta ct = iterator.next();
                if(ct.getTipo() == 1) {
                    c.add(ct);
                }
            }
        }
        return c;
    }

    public void setConta(Conta conta) {
        this.contas.add(conta);
    }

    public void listarClientes() {
        Iterator<Conta> iterator = contas.iterator();
        while (iterator.hasNext()) {
            Conta ct = iterator.next();
            System.out.println(String.format("Nome do cliente: %s", ct.cliente.getNome()));
            System.out.println(String.format("Agencia: %d", ct.getAgencia()));
            System.out.println(String.format("Conta: %d", ct.getConta()));
        }
    }

    @Override
    public String toString() {
        return "Banco{" +
                "contas=" + contas +
                '}';
    }
}
