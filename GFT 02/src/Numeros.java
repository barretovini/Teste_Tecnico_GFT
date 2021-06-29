import java.util.Scanner;

public class Numeros {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        double media = 0;
        int num, maior = 0, menor = 100, soma = 0;
        int contMaior = 0, contMenor = 0, maior10 = 0, maior50 = 0, i;

        for (i = 0; i < 10; i++) {
            System.out.println("Digite um numero entre 0 e 100");
            num = n.nextInt();

            if ((num < 1) || (num > 100)) {
                i = i - 1;
            } else {
                soma = soma + num;
                if (num > maior) {
                    maior = num;
                    contMaior++;
                }
                if (num < menor) {
                    menor = num;
                    contMenor++;
                }
                if(num > 10 && num <50) {
                    num = maior10;
                    maior10++;
                }
                if(num > 50) {
                    num = maior50;
                    maior10++;
                    maior50++;
                }
            }
        }

        System.out.println("O maior nº digitado foi " + maior);
        System.out.println("O menor nº digitado foi " + menor);
        System.out.println("A média foi " + (media = soma / i));
        System.out.println("A quantidade de numeros maiores que 10 foi: " + maior10);
        System.out.println("A quantidade de numeros maiores que 50 foi: " + maior50);
    }
}

