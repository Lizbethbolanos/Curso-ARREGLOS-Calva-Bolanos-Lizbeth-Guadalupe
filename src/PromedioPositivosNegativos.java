import java.util.Scanner;

public class PromedioPositivosNegativos {

    public static void promedioPositivosNegativos(Scanner scanner) {
        int[] arr = new int[10];
        int sumaPositivos = 0, sumaNegativos = 0, countPositivos = 0, countNegativos = 0;

        System.out.println("\n[Promedio de valores positivos y negativos]");
        System.out.println("¡Aquí vamos a ver si tus números están más felices (positivos) o más tristes (negativos)!");

        // Leer los 10 números
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            while (!scanner.hasNextInt()) {
                System.out.println("¡Ups! Por favor, ingresa un número entero válido. No te vayas por las ramas.");
                scanner.next(); // Limpiar el buffer
            }
            arr[i] = scanner.nextInt();
        }

        // Calcular promedios
        for (int num : arr) {
            if (num > 0) {
                sumaPositivos += num;
                countPositivos++;
            } else if (num < 0) {
                sumaNegativos += num;
                countNegativos++;
            }
        }

        // Mostrar resultados
        if (countPositivos > 0) {
            System.out.println("\n¡Mira qué optimistas! El promedio de números positivos es: "
                    + (double) sumaPositivos / countPositivos);
        } else {
            System.out.println("\nNo hay números positivos. ¡Parece que los números están de mal humor!");
        }

        if (countNegativos > 0) {
            System.out.println("¡Ay! El promedio de números negativos es: " + (double) sumaNegativos / countNegativos);
        } else {
            System.out.println("No hay números negativos. ¡Qué alivio, los números no están tan tristes!");
        }

        // Si no hay ni positivos ni negativos
        if (countPositivos == 0 && countNegativos == 0) {
            System.out.println("\n¡Oh no! No hay ni números positivos ni negativos. ¡Solo ceros en el horizonte!");
        }
    }
}
