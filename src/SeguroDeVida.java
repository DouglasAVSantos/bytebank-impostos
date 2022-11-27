public class SeguroDeVida implements Tributavel{
    private double saldo;


    public void setSaldoDoSeguro(Conta c){
        this.saldo = c.getSaldo();

    }


    @Override
    public double getvalorimposto() {
        double imposto = 0.10;
        return saldo* imposto;

    }
}
