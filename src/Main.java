import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            // Menú interactivo con frases chistosas
            System.out.println("\n===============================");
            System.out.println("     MENÚ DE PROGRAMAS EN JAVA");
            System.out.println("===============================");
            System.out.println("1. Promedio de valores positivos y negativos");
            System.out.println("2. Promedio de valores en posiciones pares");
            System.out.println("3. Suma de matrices 3x3");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opción (1-4): ");

            while (!scanner.hasNextInt()) {
                System.out.println("¡Ups! Parece que te comiste un número entero. ¿Podrías intentar de nuevo?");
                scanner.next(); // Limpiar el buffer
            }
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    PromedioPositivosNegativos.promedioPositivosNegativos(scanner);
                    break;
                case 2:
                    PromedioPosicionesPares.promedioPosicionesPares(scanner);
                    break;
                case 3:
                    SumaMatrices.sumaDeMatrices(scanner);
                    break;
                case 4:
                    System.out.println("\n¡Gracias por usar el programa! Ahora, ¡a disfrutar la vida!");
                    break;
                default:
                    System.out.println(
                            "\n¡Error! ¿Te has confundido? La opción debe estar entre 1 y 4. ¡Inténtalo otra vez!");
            }
        } while (opcion != 4);
    }
}
