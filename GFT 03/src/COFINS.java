public class COFINS implements Imposto {

    @Override
    public double calculaImposto(double valor) {
        double valorComImposto = 0;

        if (valor > 17000) {
            valorComImposto = valor * 0.08;
        } else {
            valorComImposto = 0;
        }
        return valorComImposto;
    }
}