public class ContaPaupanca extends Conta{

    @Override
    public void transfere(double saldo, Conta c) {
        if (this.getSaldo() < saldo){
            System.out.println("valor inferior ao valor da conta.");

        } else{
            c.setSaldo(c.getSaldo()+saldo);
            this.setSaldo(this.getSaldo()-saldo);
            System.out.println("valor: R$" + saldo + " tranferido com sucesso.");
        }
    }
}
