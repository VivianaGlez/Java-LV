import java.util.Scanner;
public class CalcularPromedio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // pedir tres números
        System.out.print("Primer numero: ");
        double numero1 = scanner.nextDouble();
        System.out.print("Segundo numero: ");
        double numero2 = scanner.nextDouble();
        System.out.print("Tercer numero: ");
        double numero3 = scanner.nextDouble();
        // sacar promedio
        double promedio = (numero1 + numero2 + numero3) / 3;
        //resultado
        System.out.println("El promedio es: " + promedio);
        // cerrar
        scanner.close();
    }
}