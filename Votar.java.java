import java.util.Scanner;

public class edad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //pedir edad
        System.out.print("Ingresa tu edad: ");
        int edad = scanner.nextInt();
        
        if (edad >= 18) {
            System.out.println("Puedes votar");
        } else {
            System.out.println("No puedes votar");
        }
        scanner.close();
    }
}