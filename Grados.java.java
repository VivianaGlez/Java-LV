import java.util.Scanner;
public class grados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //pedir temperatura en grados Celsius
        System.out.print("Ingresa la temperatura en grados Celsius: ");
        double celsius = scanner.nextDouble();
        // menú de opciones
        System.out.println("Selecciona a que deseas convertir:");
        System.out.println("1. Fahrenheit");
        System.out.println("2. Kelvin");
        System.out.print("Ingresa el número de la opcion seleccionada: ");
        int opcion = scanner.nextInt();
        // realizar la conversión
        double resultado;
        switch (opcion) {
            case 1:
                // fahrenheit
                resultado = (celsius * 9 / 5) + 32;
                System.out.printf("La temperatura en Fahrenheit es: %.2f%n", resultado);
                break;
            case 2:
                // kelvin
                resultado = celsius + 273.15;
                System.out.printf("La temperatura en Kelvin es: %.2f%n", resultado);
                break;
            default:
                // Opción inválida
                System.out.println("Opcion invalida. Seleccione 1 para Fahrenheit o 2 para Kelvin.");
                break;
        }
        scanner.close();
    }
}