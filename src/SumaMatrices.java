import java.util.Scanner;

public class SumaMatrices {

    public static void sumaDeMatrices(Scanner scanner) {
        int[][] matrizA = new int[3][3];
        int[][] matrizB = new int[3][3];
        int[][] matrizS = new int[3][3];

        System.out.println("\n[Introducir matrices 3x3]");
        System.out.println("¡Hora de jugar a ser matemático! Vamos a sumar matrices como si no hubiera un mañana.");

        // Leer matriz A
        System.out.println("Introduce los elementos de la matriz A (3x3):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemento A[" + i + "][" + j + "]: ");
                while (!scanner.hasNextInt()) {
                    System.out.println("¡Ups! Ese no es un número. ¿Podrías poner algo más matemático?");
                    scanner.next(); // Limpiar el buffer
                }
                matrizA[i][j] = scanner.nextInt();
            }
        }

        // Leer matriz B
        System.out.println("Introduce los elementos de la matriz B (3x3):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemento B[" + i + "][" + j + "]: ");
                while (!scanner.hasNextInt()) {
                    System.out.println("¡Oh no! Ese valor no es matemáticamente correcto. ¡Inténtalo de nuevo!");
                    scanner.next(); // Limpiar el buffer
                }
                matrizB[i][j] = scanner.nextInt();
            }
        }

        // Sumar las matrices A y B
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizS[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }

        // Mostrar matrices y la suma
        System.out.println("\nMatriz A:");
        mostrarMatriz(matrizA);

        System.out.println("\nMatriz B:");
        mostrarMatriz(matrizB);

        System.out.println("\nMatriz S (A + B):");
        mostrarMatriz(matrizS);
    }

    // Método auxiliar para mostrar matrices
    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
