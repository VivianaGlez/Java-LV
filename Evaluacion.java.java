import java.util.Scanner;
public class evaluacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //agregar calificaciones 
        System.out.print("Ingresa la calificacion 0-100: ");
        int calificacion = scanner.nextInt();
        //que este en el rango permitido
        if (calificacion < 0 || calificacion > 100) {
            System.out.println("La calificacion tiene que estar entre 0 y 100");
        } else {
            //hacer evaluacion con letras
            char letra;
            if (calificacion >= 90) {
                letra = 'A';
            } else if (calificacion >= 80) {
                letra = 'B';
            } else if (calificacion >= 70) {
                letra = 'C';
            } else if (calificacion >= 60) {
                letra = 'D';
            } else {
                letra = 'F';
            }
            //imprimir resultado
            System.out.println("La calificacion es: " + letra);
        }
        scanner.close();
    }
}