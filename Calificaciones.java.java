import java.util.Scanner;
public class calificacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double parciales = 0, proyecto = 0, examenfnl= 0;
        boolean datosvalidos = false; 
        // calificacion parcial
        while (!datosvalidos) {
            System.out.print("Ingresa la calificacion de los parciales 0-100: ");
            parciales = scanner.nextDouble();
            if (parciales >= 0 && parciales <= 100) {
                datosvalidos = true;
            } else {
                System.out.println("La calificacion debe estar entre 0 y 100");
            }
        }
        datosvalidos = false; // regresar
        //calif proyecto
        while (!datosvalidos) {
            System.out.print("Ingresa la calificacion del proyecto 0-100: ");
            proyecto = scanner.nextDouble();
            if (proyecto >= 0 && proyecto <= 100) {
                datosvalidos = true;
            } else {
                System.out.println("La calificacion debe estar entre 0 y 100.");
            }
        }
        datosvalidos = false; // regresar
        //calif exam final
        while (!datosvalidos) {
            System.out.print("Ingresa la calificacion del examen final 0-100: ");
            examenfnl = scanner.nextDouble();
            if (examenfnl >= 0 && examenfnl <= 100) {
                datosvalidos = true;
            } else {
                System.out.println("La calificacion debe estar entre 0 y 100");
            }
        }
        //sacar calificacion 
        double fnl = 0;
        for (int i = 0; i < 3; i++) {
            switch (i) {
                case 0:
                    fnl += parciales * 0.4;
                    break;
                case 1:
                    fnl += proyecto * 0.3;
                    break;
                case 2:
                    fnl += examenfnl * 0.3;
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }
        //resultado
        System.out.println("La calificacion final es: " + fnl);
        //cerrar
        scanner.close();
    }
}