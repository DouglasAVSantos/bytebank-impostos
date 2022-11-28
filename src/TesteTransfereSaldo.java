public class TesteTransfereSaldo {
    public TesteTransfereSaldo() {
    }

    public static void main(String[] args) {
        Conta c1 = new ContaCorrente(4585, 5898);
        Conta c2 = new ContaPaupanca(4555, 5898);
        c1.deposita(100.0);
        c2.deposita(100.0);

        try {
            c1.transfere(100.0, c2);
        } catch (SaldoInsuficienteException var5) {
            System.out.println(var5.getMessage());
        }

        try {
            c2.transfere(101.0, c1);
        } catch (SaldoInsuficienteException var4) {
            System.out.println(var4.getMessage());
        }

        c1.transfere(10.0, c2);
        System.out.printf("Saldo da conta 1: R$%.2f\n", c1.getSaldo());
        System.out.printf("Saldo da conta 2: R$%.2f\n", c2.getSaldo());
        c2.transfere(10.0, c1);
        System.out.printf("Saldo da conta 1: R$%.2f\n", c1.getSaldo());
        System.out.printf("Saldo da conta 2: R$%.2f\n", c2.getSaldo());
    }
}