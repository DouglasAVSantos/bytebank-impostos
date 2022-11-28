public abstract class Conta {
    private double saldo;
    private int numero;
    private int agencia;

    public Conta(int numero, int agencia) {
        this.numero = numero;
        this.agencia = agencia;
    }

    public void transfere(double valor, Conta destino) {
        this.saca(valor);
        destino.deposita(valor);
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void saca(double valor) {
        if (this.saldo < valor) {
            throw new SaldoInsuficienteException("Saldo atual: R$%.2f Valor da operação: R$%.2f não realizada\nSALDO INSUFICIENTE".formatted(this.getSaldo(), valor));
        } else {
            this.saldo -= valor;
        }
    }

    public double setSaldo(double saldo) {
        return this.saldo = saldo;
    }

    public void deposita(double saldo) {
        this.saldo += saldo;
    }
}

