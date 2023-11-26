import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese 3 números
        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();

        System.out.print("Ingrese el tercer número: ");
        int num3 = scanner.nextInt();

        // Solicitar al usuario el orden de ordenamiento
        System.out.print("Ingrese el orden de ordenamiento (ascendente o descendente): ");
        String orden = scanner.next();

        // Crear un array con los números ingresados
        int[] numeros = {num1, num2, num3};

        // Ordenar el array según el orden especificado
        if (orden.equalsIgnoreCase("ascendente")) {
            Arrays.sort(numeros); // Orden ascendente
        } else if (orden.equalsIgnoreCase("descendente")) {
            Arrays.sort(numeros);
            // Invertir el array para obtener el orden descendente
            for (int i = 0; i < numeros.length / 2; i++) {
                int temp = numeros[i];
                numeros[i] = numeros[numeros.length - 1 - i];
                numeros[numeros.length - 1 - i] = temp;
            }
        } else {
            System.out.println("Orden no válido. Por favor, ingrese 'ascendente' o 'descendente'.");
            extracted(); // Salir del programa si el orden no es válido
        }

        // Mostrar los números en el orden especificado
        System.out.println("Los números en orden " + orden + " son:");
        for (int numero : numeros) {
            System.out.println(numero);
        }

        scanner.close();
    }

	private static void extracted() {
	}
}