
public class TesteCalculadordeImpostos {
    public static void main(String[] args) {

    Conta c1 = new ContaCorrente(100,44,5898);
    CalculadorDeImpostos calc = new CalculadorDeImpostos();

    c1.setSaldo(100);
    c1.deposita(100);


        System.out.println(calc.getImpostos(c1));
    System.out.println(calc.saldoComImpostos(c1));
        System.out.println(c1.getSaldo());



    }
}