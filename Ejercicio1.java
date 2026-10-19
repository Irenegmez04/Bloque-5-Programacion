
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        // Creamos el Scanner
        Scanner input = new Scanner(System.in);

        // Pedimos un número del 1 al 7
        System.out.println("Introduce un número del 1 al 7: ");
        int numero = input.nextInt();

        // Mostramos el día correspondiente
        switch (numero) {

            case 1:
                System.out.println("lunes");
                break;

            case 2:
                System.out.println("martes");
                break;

            case 3:
                System.out.println("miércoles");
                break;

            case 4:
                System.out.println("jueves");
                break;

            case 5:
                System.out.println("viernes");
                break;

            case 6:
                System.out.println("sábado");
                break;

            case 7:
                System.out.println("domingo");
                break;

            default:
                System.out.println("Numero no valido");
                break;

        }

    }
}