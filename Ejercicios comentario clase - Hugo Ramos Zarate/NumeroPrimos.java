package Ejercicios;

import java.util.Scanner;
//Autor: Hugo Ramos Zarate - 18100746

public class NumeroPrimos {

    public static void main(String[] args) {
        int opc;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Ingrese numero diferente de 0 y 1: ");
            int n = scanner.nextInt();

            if (n == 0 || n == 1) {
                System.out.println("No primos");
            } else {
                boolean prime = true;
                for (int i = 2; i < n; i++) {
                    if (n % i == 0) {
                        prime = false;
                        break;
                    }
                }
                if (prime) {
                    System.out.println("el numero es primo");
                } else {
                    System.out.println("el numero no es primo");
                }
            }
            System.out.println("DESEA INGRESAR OTRO NUMERO? [1-SI, 2-NO]");
            opc = scanner.nextInt();
        } while (opc == 1);
    }
}
