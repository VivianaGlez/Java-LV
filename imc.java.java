import java.util.Scanner;

public class imc{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        //peso de usuario
        System.out.print("Su peso en kilogramos: ");
        double peso = scanner.nextDouble();
        //altura al usuario
        System.out.print("Su altura en metros: ");
        double altura = scanner.nextDouble();
        //imc
        double imc = peso / (altura * altura);
        //resultado
        System.out.println("Su indice de masa corporal es: " + imc);
        //cerrar
        scanner.close();
    }
}