// Nome: Jonatas Natanael Antunes Oliveira
// Matrícula: 1232021950

import java.util.Scanner;

public class atv6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, i = 1;

        System.out.print("Digite o número: ");
        n = sc.nextInt();

        while (i <= 10) {
            System.out.println(n + " x " + i + " = " + (n * i));
            i++;
        }

        sc.close();
    }
}
