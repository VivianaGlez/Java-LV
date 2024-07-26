import java.util.Scanner;
public class Rectangulo {
	public static double area(double base, double altura) {
		return base * altura;
	}
	public static void main (String[] args) {
		// usuario
		Scanner scanner = new Scanner (System.in);
		// la base
		System.out.println("Ingresa la base del rectangulo: ");
		double base = scanner.nextDouble();
		//la altura
		System.out.println("Ingresa la altura del rectangulo: ");
		double altura = scanner.nextDouble();
		//numeros positvos
		if (base <= 0 || altura <= 0) {
			System.out.println ("La base y altura tienen que ser en numeros positivos");
		}else{
	//calcular
	double area = area(base, altura);
	//resultados
	System.out.printf("El area es: %.2f%n ",area);
		}
		//cerrar
		scanner.close();
	}
}