package Ejercicios;

import java.util.Scanner;

public class NumerosAlReves {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese numero: ");        int n = scanner.nextInt();

        String num = String.valueOf(n); //convierte el int en cadena 
        
        String numeroAlRev = ""; //igualacion de numeroalrev y inicializacion
        
        String a = ""; //inicializacion
        
        char num2[] = num.toCharArray(); //crea arreglo de la cadena tipo char
        //for para mostrar al reves el texto 
        for (int i = 3; i >= 0; i--) {
            a = Character.toString(num2[i]);
            numeroAlRev = numeroAlRev.concat(a);
        }
        int numerofinal = Integer.parseInt(numeroAlRev);
        
        System.out.println("Numero al reves es: "+numerofinal);
    }
}
