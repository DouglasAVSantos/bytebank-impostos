public class Main {
    public static void main(String[] args) {

    Conta c1 = new ContaCorrente();
    Conta c2 = new ContaPaupanca();

    c1.setSaldo(100);
    c2.setSaldo(100);
        c1.transfere(1,c2);
        System.out.println(c1.getSaldo());
        System.out.println(c2.getSaldo());



    }
}