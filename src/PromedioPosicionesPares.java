import java.util.Scanner;

public class PromedioPosicionesPares {

    public static void promedioPosicionesPares(Scanner scanner) {
        int[] arr = new int[10];
        int suma = 0, count = 0;

        System.out.println("\n[Promedio de valores en posiciones pares]");
        System.out.println("¡Vamos a ver si los números en posiciones pares son más inteligentes que los impares!");

        // Leer los 10 números
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            while (!scanner.hasNextInt()) {
                System.out.println("¡Hey! ¿Seguro que ese es un número entero? Prueba otra vez.");
                scanner.next(); // Limpiar el buffer
            }
            arr[i] = scanner.nextInt();
        }

        // Calcular promedio de números en posiciones pares
        for (int i = 0; i < arr.length; i += 2) {
            suma += arr[i];
            count++;
        }

        // Mostrar resultado
        if (count > 0) {
            System.out.println("\n¡Vaya! El promedio de los números en posiciones pares es: " + (double) suma / count);
        } else {
            System.out.println("\nParece que los números en posiciones pares no existen. ¡Qué raro!");
        }
    }
}
