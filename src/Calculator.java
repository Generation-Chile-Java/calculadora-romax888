import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Calculadora básica en Java
 * ---------------------------
 * Solicita dos números al usuario y realiza operaciones aritméticas:
 * suma, resta, multiplicación, división y módulo.
 * Incluye validación para evitar errores de entrada y división por cero.
 *
 * Autor: Rodrigo Valderrama
 * Cohorte 20 - Generation Chile
 */

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Solicitar primer número
            System.out.print("Ingresa el primer número: ");
            double numero1 = scanner.nextDouble();

            // Solicitar segundo número
            System.out.print("Ingresa el segundo número: ");
            double numero2 = scanner.nextDouble();

            // Operaciones básicas
            double suma = numero1 + numero2;
            double resta = numero1 - numero2;
            double multiplicacion = numero1 * numero2;
            double division = (numero2 != 0) ? numero1 / numero2 : Double.NaN;
            double modulo = (numero2 != 0) ? numero1 % numero2 : Double.NaN;

            // Mostrar resultados
            System.out.println("\n--- Resultados ---");
            System.out.println("Suma: " + suma);
            System.out.println("Resta: " + resta);
            System.out.println("Multiplicación: " + multiplicacion);

            if (numero2 != 0) {
                System.out.println("División: " + division);
                System.out.println("Módulo: " + modulo);
            } else {
                System.out.println("No se puede dividir ni calcular módulo por cero.");
            }

        } catch (InputMismatchException e) {
            System.out.println("⚠️ Error: debes ingresar solo números válidos.");
        } finally {
            scanner.close();
        }
    }
}

