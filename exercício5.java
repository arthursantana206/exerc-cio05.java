// Nome: Arthur Gabriel Santana dos Santos 
// Matrícula: 1261940088

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numero = 1;
        int soma = 0;

        while (numero != 0) {
            System.out.print("Digite um número (0 para encerrar): ");
            numero = input.nextInt();

            soma += numero;
        }

        System.out.println("Soma total: " + soma);

        input.close();
    }
}
