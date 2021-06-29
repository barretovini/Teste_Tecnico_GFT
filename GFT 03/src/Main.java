import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor: ");

        double entradaUsuario;
        try {
            entradaUsuario = sc.nextDouble();
        } catch (Exception e) {
            throw new RuntimeException("Valor inválido");
        }

        Imposto icms = new ICMS();
        double impostoICMS = icms.calculaImposto(entradaUsuario);

        Imposto cofins = new COFINS();
        double impostoCOFINS = cofins.calculaImposto(entradaUsuario);

        Imposto ipi = new IPI();
        double impostoIPI = ipi.calculaImposto(entradaUsuario);

        System.out.println("ICMS: " + impostoICMS);
        System.out.println("COFINS: " + impostoCOFINS);
        System.out.println("IPI: " + impostoIPI);

        double valorTotal = impostoICMS + impostoCOFINS + impostoIPI + entradaUsuario;

        System.out.println("Valor Final: " + valorTotal);
    }
}