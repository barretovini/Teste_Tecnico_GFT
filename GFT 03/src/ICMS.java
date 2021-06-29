public class ICMS implements Imposto {

    @Override
    public double calculaImposto(double valor) {
        double valorComImposto = 0;

        valorComImposto = valor * 0.3;

        return valorComImposto;
    }
}
