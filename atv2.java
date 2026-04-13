// Nome: Jonatas Natanael Antunes Oliveira
// Matrícula: 1232021950

import java.util.Scanner;

public class atv2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c;

        System.out.print("Lado A: ");
        a = sc.nextInt();

        System.out.print("Lado B: ");
        b = sc.nextInt();

        System.out.print("Lado C: ");
        c = sc.nextInt();

        if (a == b && b == c) {
            System.out.println("Triângulo Equilátero.");
        } else if (a == b || a == c || b == c) {
            System.out.println("Triângulo Isósceles.");
        } else {
            System.out.println("Triângulo Escaleno.");
        }

        sc.close();
    }
}
