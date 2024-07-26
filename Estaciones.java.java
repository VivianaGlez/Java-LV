import java.util.Scanner;
public class estacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // pedir numero del mes
        System.out.print("Ingresa el número del mes: ");
        int mes = scanner.nextInt();
//determinar la estacion
        String estacion;
        switch (mes) {
            case 12:
            case 1:
            case 2:
                estacion = "Invierno";
                break;
            case 3:
            case 4:
            case 5:
                estacion = "Primavera";
                break;
            case 6:
            case 7:
            case 8:
                estacion = "Verano";
                break;
            case 9:
            case 10:
            case 11:
                estacion = "Otoño";
                break;
            default:
                estacion = "Numero de mes invalido";
                break;
        }
        // resultado
        System.out.println("La estación es: " + estacion);
        scanner.close();
    }
}