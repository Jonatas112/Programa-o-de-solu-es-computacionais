// Nome: Jonatas Natanael Antunes Oliveira
// Matrícula: 1232021950

import java.util.Scanner;

public class atv1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.print("Digite um número inteiro: ");
        numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println(numero + " é par.");
        } else {
            System.out.println(numero + " é ímpar.");
        }

        sc.close();
    }
}
