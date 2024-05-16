import java.util.Objects;

public class ContaBancaria {
    private int numero;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    public ContaBancaria() {

    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContaBancaria that = (ContaBancaria) o;
        return numero == that.numero && Double.compare(saldo, that.saldo) == 0 && Objects.equals(agencia, that.agencia) && Objects.equals(nomeCliente, that.nomeCliente);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero, agencia, nomeCliente, saldo);
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "numero=" + numero +
                ", agencia='" + agencia + '\'' +
                ", nomeCliente='" + nomeCliente + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
