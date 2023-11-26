public class Ejercicio3 {
    public static void main(String[] args) {
        int contador = 0; // Variable para contar los múltiplos
        System.out.println("Los números múltiplos de 2 o 3 entre 1 y 100 son:");

        // Utilizamos un bucle for para iterar sobre los números del 1 al 100
        for (int i = 1; i <= 100; i++) {
            // Verificamos si el número es múltiplo de 2 o de 3
            if (i % 2 == 0 || i % 3 == 0) {
                System.out.println(i);
                contador++; // Incrementamos el contador si es múltiplo
            }
        }

        // Mostramos el total de números encontrados
        System.out.println("Total de números múltiplos de 2 o 3: " + contador);
    }
}