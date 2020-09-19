import java.util.Scanner;

public class Calculadora {
	static Scanner teclado = new Scanner(System.in);
	static Integer a=0;
	static Integer b=0;
	static Integer opcion;
	static double resultado;
	public static void main(String[] args) {
		
		do {
			System.out.println("ingrese:\n1-si desea realizar una suma\n2-si desea realizar una resta\n3-si desea realizar una multiplicacion\n4-si desea realizar una divicion\n0-si desea salir");
			opcion=teclado.nextInt();
			switch (opcion) {
		case 1:
			suma();
			break;
		case 2:
			resta();
			break;
		case 3:
			multiplicacion();
			break;
		case 4:
			divicion();
			break;
		case 0:
			break;

		default:System.out.println("intentelo de nuevo");
			break;
		}
			System.out.println("\n\n");
		}while(opcion!=0);
	
		}
	
	
	
	public static void suma() {
		System.out.print("ingresar el primer numero:");
		a=teclado.nextInt();
		System.out.print("ingresar el segundo numero:");
		b=teclado.nextInt();
		resultado=a+b;
		System.out.println("El resultado es:"+ resultado);
		
	}
	public static void resta() {
		System.out.print("ingresar el primer numero:");
		a=teclado.nextInt();
		System.out.print("ingresar el segundo numero:");
		b=teclado.nextInt();
		resultado=a-b;
		System.out.println("El resultado es:"+ resultado);
	}
	public static void multiplicacion() {
		System.out.print("ingresar el primer numero:");
		a=teclado.nextInt();
		System.out.print("ingresar el segundo numero:");
		b=teclado.nextInt();
		resultado=a*b;
		System.out.println("El resultado es:"+ resultado);
	}
	public static void divicion() {
		System.out.print("ingresar el primer numero:");
		a=teclado.nextInt();
		System.out.print("ingresar el segundo numero:");
		b=teclado.nextInt();
		resultado=(double)a/b;
		System.out.println("El resultado es:"+ resultado);
	}
	
}
