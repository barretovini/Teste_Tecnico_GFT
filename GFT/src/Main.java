public class Main {

    public static void main(String[] args) {

        Caixa caixa = new Caixa();

        Produto banana = new Produto("Banana", 0.99, 2);
        Produto energetico = new Produto("Energético", 5.49, 3);
        Produto arroz = new Produto("Arroz", 20.00,1);
        Produto chocolate = new Produto("Chocolate",4.50, 1);
        Produto leite = new Produto("Leite", 3.73, 3);
        Produto abacaxi = new Produto("Abacaxi", 2.40, 2);

        double valorFinalBanana = caixa.calculaValorFinal(banana, 3);
        double valorFinalEnergetico = caixa.calculaValorFinal(energetico, 7);
        double valorFinalArroz = caixa.calculaValorFinal(arroz,1);
        double valorFinalChocolate = caixa.calculaValorFinal(chocolate,12);
        double valorFinalLeite = caixa.calculaValorFinal(leite,5);
        double valorFinalAbacaxi = caixa.calculaValorFinal(abacaxi,1);

        System.out.println("Nome: " + banana.getNome() + " || " + " Valor: " + banana.getValor() + " || " + " Tipo: " + banana.getTipo() + " || " + " Valor Final: " + valorFinalBanana);
        System.out.println("Nome: " + energetico.getNome() + " || " + " Valor: " + energetico.getValor() + " || " + " Tipo: " + energetico.getTipo() + " || " + " Valor Final: " + valorFinalEnergetico);
        System.out.println("Nome: " + arroz.getNome() + " || " + " Valor: " + arroz.getValor() + " || " + " Tipo: " + arroz.getTipo() + " || " + " Valor Final: " + valorFinalArroz);
        System.out.println("Nome: " + chocolate.getNome() + " || " + " Valor: " + chocolate.getValor() + " || " + " Tipo: " + chocolate.getTipo() + " || " + " Valor Final: " + valorFinalChocolate);
        System.out.println("Nome: " + leite.getNome() + " || " + " Valor: " + leite.getValor() + " || " + " Tipo: " + leite.getTipo() + " || " + " Valor Final: " + valorFinalLeite);
        System.out.println("Nome: " + abacaxi.getNome() + " || " + " Valor: " + abacaxi.getValor() + " || " + " Tipo: " + abacaxi.getTipo() + " || " + " Valor Final: " + valorFinalAbacaxi);


    }

}