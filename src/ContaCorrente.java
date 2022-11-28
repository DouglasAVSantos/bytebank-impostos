public class ContaCorrente extends Conta implements Tributavel {
    public ContaCorrente(int numero, int agencia) {
        super(numero, agencia);
    }

    public void transfere(double valor, Conta destino) {
        double valor_com_imposto = valor * 1.05;
        this.saca(valor_com_imposto - 0.2);
        destino.deposita(valor);
    }

    public void saca(double valor) {
        valor += 0.2;
        if (this.getSaldo() < valor) {
            throw new SaldoInsuficienteException("Saldo atual: R$%.2f Valor da operação: R$%.2f não realizada\nSALDO INSUFICIENTE".formatted(this.getSaldo(), valor));
        } else {
            super.setSaldo(this.getSaldo() - valor);
        }
    }

    public double getvalorimposto() {
        double imposto = 0.14;
        return this.getSaldo() * imposto;
    }
}
