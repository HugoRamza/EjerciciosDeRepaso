package Ejercicios;

import java.util.Scanner;

public class MayorAMenor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num[] = new int[3];
        int t;

        for (int i = 0; i < 3; i++) {
            System.out.print("Sistema que detecta mayor a menor\nTeclee un número: ");
            int Numero = scanner.nextInt();
            num[i] = Numero;

        }

        for (int a = 1; a < num.length; a++) {
            for (int b = num.length - 1; b >= a; b--) {
                if (num[b - 1] > num[b]) {
                    t = num[b - 1];
                    num[b - 1] = num[b];
                    num[b] = t;
                }
            }
        }

        for (int i = 2; i >= 0; i--) {
            System.out.println("\n" + num[i]);
        }

    }

}
