
import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        // Creamos el Scanner
        Scanner input = new Scanner(System.in);

        // Pedimos un carácter
        System.out.println("Introduce un carácter alfabetico: ");
        char letra = input.next().charAt(0);

        // Comprobamos si es una vocal o una consonante
        switch (letra) {

            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Es una vocal");
                break;

            default:
                System.out.println("Es una consonante");
                break;

        }

    }
}