package Ejercicios;

import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinarNumero {

    public static void main(String[] args) 
    {
        Random aleatorio = new Random(System.currentTimeMillis());
        Scanner scanner = new Scanner(System.in);
        
        int intAleatorio = aleatorio.nextInt(30); //genera numero de 1 al 100
        int oportunidades = 1; //cantidad de oportunidades, puede ser un for, while o do while

        for (int intento = 0; intento < oportunidades; intento++)
        {
            System.out.print("Ingrese un numero: ");
            int Numero = scanner.nextInt();

            if (Numero == intAleatorio) {
                System.out.println("HAZ GANADO!!!\nEl numero es: " + Numero);
               break; //sale si gano
            } else {
                oportunidades++; //una oportunidad mas si es que perdio 
                if (Numero > intAleatorio) {
                    System.out.println("Muy cerca, el "+Numero+" es mayor\n");
                } else {
                    System.out.println("Muy lejos, el "+Numero+" es menor\n");
                }
            }
        }

    }

}
