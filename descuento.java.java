import java.util.Scanner;
public class descuento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // poner el precio original
        System.out.print("Ingresa el precio original del producto: ");
        double precioOriginal = scanner.nextDouble();
        //que el precio sea positivo
        if (precioOriginal < 0) {
            System.out.println("El precio no puede ser negativo.");
        } else {
            //poner el porcentaje de descuento
            double porcentajeDescuento;
            if (precioOriginal <= 100) {
                porcentajeDescuento = 0;
            } else if (precioOriginal <= 200) {
                porcentajeDescuento = 0.10;
            } else if (precioOriginal <= 500) {
                porcentajeDescuento = 0.20; 
            } else {
                porcentajeDescuento = 0.25;
            }
            // calcular descuento
            double montoDescuento = precioOriginal * porcentajeDescuento;
          // calcular el precio final
            double precioFinal = precioOriginal - montoDescuento;
      //resultado
            System.out.printf("El precio final con el descuento aplicado es: %.2f%n", precioFinal);
        }
        scanner.close();
    }
}