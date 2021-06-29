public class Caixa {

    public double calculaValorFinal(Produto produto, int quantidade) {

        double valorFinal = produto.getValor() * quantidade;

        if (produto.getTipo().equals(1)) {
            //Aplica 10%
        } else if (produto.getTipo().equals(2)) {
            //Aplica 20%
        } else if (produto.getTipo().equals(3)) {
            if (deveAplicarDesconto(quantidade)) {
                //Aplica 10%
            }
        } else {
            throw new RuntimeException("Tipo inválido");
        }

        return valorFinal;
    }

    private boolean deveAplicarDesconto(int quantidade) {
        if (quantidade >= 5) return true;
        return false;
    }
}