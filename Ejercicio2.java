

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        // Creamos el Scanner
        Scanner input = new Scanner(System.in);

        // Pedimos el número del mes
        System.out.println("Introduce un número de mes del 1 al 12: ");
        int mes = input.nextInt();

        // Mostramos los días que tiene el mes
        switch (mes) {

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("El mes tiene 31 días");
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("El mes tiene 30 días");
                break;

            case 2:
                System.out.println("El mes tiene 28 días");
                break;

            default:
                System.out.println("Numero no valido");
                break;

        }

    }
}
