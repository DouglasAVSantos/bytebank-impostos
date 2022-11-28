public class TesteSaca {
    public TesteSaca() {
    }

    public static void main(String[] args) {
        Conta c1 = new ContaCorrente(222, 321);
        Conta c2 = new ContaPaupanca(333, 321);
        c1.deposita(200.0);
        c2.deposita(200.0);

        try {
            c1.saca(200.0);
        } catch (SaldoInsuficienteException var5) {
            System.out.println(var5.getMessage());
        }

        try {
            c2.saca(201.0);
        } catch (SaldoInsuficienteException var4) {
            System.out.println(var4.getMessage());
        }

        c1.saca(50.0);
        System.out.printf("Saldo Conta1: %.2f\n", c1.getSaldo());
        c2.saca(50.0);
        System.out.printf("Saldo Conta2: %.2f\n", c2.getSaldo());
    }
}
