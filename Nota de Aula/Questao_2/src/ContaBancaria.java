public class ContaBancaria {

    private int numeroConta;
    private String titular;
    private double saldo;

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Double consultarSaldo() {
        return saldo;
    }

    public Double depositar(double valor) {
        saldo += valor;
        return saldo;
    }

    public Double sacar(double valor) {
        if (saldo - valor >= 0) {
            saldo -= valor;
            return saldo;
        } else {
            return -1.0;
        }
    }

    public Double transferir(ContaBancaria destino, double valor) {

        if (sacar(valor) != -1) {
            destino.saldo += valor;
            return saldo;
        }  else {
            return -1.0;
        }

    }

}
