import java.util.Random;
import java.util.Scanner;

public class GerarNumeroAleatorio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();

        int numero = 0;
        int aleatorio = random.nextInt(10) + 1;
        do{
            System.out.println(" -------------------------\n");

            System.out.println("Qual seu palpite: ");
            numero = entrada.nextInt();
        }while (numero != aleatorio);
        System.out.println("Voce ganhou!!!");
    }
}
