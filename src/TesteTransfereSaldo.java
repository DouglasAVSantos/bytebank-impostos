public class TesteTransfereSaldo {

    public static void main(String[] args) {
        Conta c1 = new ContaCorrente(100,4585,5898);
        Conta c2 = new ContaPaupanca(100,4555,5898);

        c1.transfere(50,c2);
        System.out.printf("Saldo da conta 1: R$%.2f\n",c1.getSaldo());
        System.out.printf("Saldo da conta 2: R$%.2f\n",c2.getSaldo());

        c2.transfere(10,c1);
        System.out.printf("Saldo da conta 1: R$%.2f\n",c1.getSaldo());
        System.out.printf("Saldo da conta 2: R$%.2f\n",c2.getSaldo());

    }
}
