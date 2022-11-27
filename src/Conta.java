public abstract class Conta {
    private double saldo;
    private int numero;
    private int agencia;

    public Conta(double saldo, int numero, int agencia) {
        this.saldo = saldo;
        this.numero = numero;
        this.agencia = agencia;
    }

    public abstract void transfere(double saldo, Conta c);

    public double getSaldo() {
        return saldo;
    }

    public double setSaldo(double saldo) {
        return this.saldo = saldo;
    }

    public void deposita(double saldo) {
        this.saldo += saldo;
    }

}

