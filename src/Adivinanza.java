import java.util.Random;
import java.util.Scanner;

public class Adivinanza {
    public static void main(String[] args) {

        int numeroAleatorio = new Random().nextInt(100);
        int intentos = 0;
        Scanner adivinarNumero = new Scanner(System.in);

        while (intentos < 5) {
            System.out.println("Introduzca un número entre 0 y 100(inclusive):");
            int numeroUsuario = adivinarNumero.nextInt();
            intentos++;

            if (numeroUsuario == numeroAleatorio) {
                System.out.println("¡Felicidades! Adivinaste el número en " + intentos + " intentos.");
                break;
            } else if (numeroUsuario > numeroAleatorio) {
                System.out.println("El número que escribiste es mayor que el número generado.");
            } else {
                System.out.println("El número que escribiste es menor al número generado");
            }

            if (intentos == 5) {
                String juegoPerdido = """
                        Lo siento, no lograste adivinar el número generado.
                        Agotaste el máximo de 5 intentos.
                        El número generado era:""" + numeroAleatorio;
                System.out.println(juegoPerdido);
            }
        }
    }
}