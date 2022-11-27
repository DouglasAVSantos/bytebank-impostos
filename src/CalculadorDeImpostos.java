public class CalculadorDeImpostos {
    static double calculaImposto(Tributavel t){
        return t.getvalorimposto();

    }
    public double getImpostos(Conta c){
        SeguroDeVida s1 = new SeguroDeVida();
        s1.setSaldoDoSeguro(c);
        double x = calculaImposto(s1);
        double y = calculaImposto((Tributavel) c);
        System.out.printf("O imposto do seguro de vida é de: R$%.2f\n",x);
        System.out.printf("O imposto de renda é de: R$%.2f \n",y);
        return x+y;
    }
    public double saldoComImpostos(Conta c){
        SeguroDeVida s1 = new SeguroDeVida();
        s1.setSaldoDoSeguro(c);
        double x = calculaImposto(s1);
        double y = calculaImposto((Tributavel) c);
        return c.setSaldo(c.getSaldo()-x-y);


    }

}
