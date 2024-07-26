import java.util.Scanner;
public class Salario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //pedir el salario
        System.out.print("Ingresa el salario mensual: ");
        double salariobruto = scanner.nextDouble();
        //porcentaje impuesto
        System.out.print("Ingresa el porcentaje de impuestos: ");
        double porcentajeimpuestos = scanner.nextDouble();
        // deducciones
        System.out.print("Ingresa las deducciones adicionales: ");
        double deduccionesadicionales = scanner.nextDouble();
        //sacar el impuesto
        double impuesto = salariobruto * (porcentajeimpuestos / 100);
        //sacar el salario
        double salarioneto = salariobruto - impuesto - deduccionesadicionales;
        //resultado
        System.out.println("El salario del empleado es: " + salarioneto);
        //cerrar
        scanner.close();
    }
}