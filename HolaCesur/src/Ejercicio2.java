import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número hasta que sea positivo
        int numero;
        do {
            System.out.print("Ingrese un número positivo: ");
            numero = scanner.nextInt();
        } while (numero <= 0);

        // Mostrar los primeros 20 números sucesivos al número ingresado
        System.out.println("Los primeros 20 números sucesivos son:");
        for (int i = numero; i < numero + 20; i++) {
            System.out.println(i);
        }

        scanner.close();
    }
}