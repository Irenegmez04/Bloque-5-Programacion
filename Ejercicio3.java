
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        // Creamos el Scanner
        Scanner input = new Scanner(System.in);

        // Pedimos la edad
        System.out.println("Introduce tu edad: ");
        int edad = input.nextInt();

        // Comprobamos si la edad es válida
        if (edad < 0) {

            System.out.println("Edad no valida");

        } else if (edad < 13) {

            System.out.println("Niño/a");

        } else if (edad <= 17) {

            System.out.println("Adolescente");

        } else if (edad <= 64) {

            System.out.println("Adulto/a");

        } else {

            System.out.println("Senior");

        }

        // No se puede usar switch porque tenemos que comprobar rangos de edades.

    }
}
