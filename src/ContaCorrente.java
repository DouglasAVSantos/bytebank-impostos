public class ContaCorrente extends Conta{


    @Override
    public void transfere(double saldo, Conta c) {
       double saldo_atual = this.getSaldo();
       if (saldo_atual < saldo) {
           System.out.println("valor inferior ao valor da conta\nA tranferência não foi concluida.");
       }else{
           saldo_atual = saldo_atual - saldo*1.01;
           c.setSaldo(c.getSaldo()+saldo);
           System.out.println("Transferencia concluida com sucesso.");
           this.setSaldo(saldo_atual);
       }
    }
}
