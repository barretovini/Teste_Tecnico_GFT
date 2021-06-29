public class IPI implements Imposto {

    @Override
    public double calculaImposto(double valor) {
        double valorComImposto = 0;

        if (valor >= 25000) {
            valorComImposto = valor * 0.1;
        }

        if (valor < 25000) {
            valorComImposto = valor * 0.05;
        }
        return valorComImposto;
    }
}