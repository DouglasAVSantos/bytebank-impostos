public class ContaPaupanca extends Conta{


    public ContaPaupanca(double saldo, int numero, int agencia) {
        super(saldo, numero, agencia);
    }

    @Override
    public void transfere(double saldo, Conta c) {
        if (this.getSaldo() < saldo){
            System.out.println("valor inferior ao valor da conta.");

        } else{
            c.setSaldo(c.getSaldo()+saldo);
            this.setSaldo(this.getSaldo()-saldo);
            System.out.printf("valor: R$%.2f tranferido com sucesso.\n",saldo);
            System.out.println("Conta Poupança não paga imposto sobre a tranferência");
        }
    }
}
