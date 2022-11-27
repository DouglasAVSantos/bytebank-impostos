public class ContaCorrente extends Conta implements Tributavel{

    public ContaCorrente(double saldo, int numero, int agencia) {
        super(saldo, numero, agencia);
    }

    @Override
    public void transfere(double saldo, Conta c) {
       double saldo_atual = this.getSaldo();
       if (saldo_atual < saldo*1.05) {
           System.out.println("valor inferior ao valor da conta\nA tranferência não foi concluida.");
       }else{
           saldo_atual = saldo_atual - saldo*1.05;
           c.setSaldo(c.getSaldo()+saldo);
           System.out.printf("valor: R$%.2f tranferido com sucesso.\nImpostos de 5%% por transferêcia de Conta Corrente (R$%.2f) \n",saldo,saldo*0.05);
           this.setSaldo(saldo_atual);
       }
    }

    @Override
    public double getvalorimposto() {
        double imposto = 0.14;
        return this.getSaldo()* imposto;

    }
}
