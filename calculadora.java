import java.util.Scanner;

public class calculadora {
	public static Scanner teclado = new Scanner(System.in);

	
	public static void menu() {
		System.out.println("*******MENU*******");
		System.out.println("1. SUMA ");
		System.out.println("2. RESTA");
		System.out.println("3. MULTIPLICACION ");
		System.out.println("4. DIVISION ");
		System.out.println("5. SALIR");
		System.out.println("Elija opcion [1-5]");
	}

	public static void suma() {
		String operador1, operador2;
		double resultado = 0;
		System.out.println("Primer operador: ");
		operador1 = teclado.nextLine();
		double num1 = Double.parseDouble(operador1);
		double n1 = new Double(operador1);
		System.out.println("Segundo operador: ");
		operador2 = teclado.nextLine();
		double num2 = Double.parseDouble(operador2);
		double n2 = new Double(operador2);
		resultado = n1 + n2;
		System.out.println("(" + operador1 + ") " + "+" + " (" + operador2
				+ ")" + " = " + resultado);
	}

	public static void resta() {
		String operador1, operador2;
		double resultado = 0;
		System.out.println("Primer operador: ");
		operador1 = teclado.nextLine();
		double num1 = Double.parseDouble(operador1);
		double n1 = new Double(operador1);
		System.out.println("Segundo operador: ");
		operador2 = teclado.nextLine();
		double num2 = Double.parseDouble(operador2);
		double n2 = new Double(operador2);
		resultado = n1 - n2;
		System.out.println("(" + operador1 + ") " + "-" + " (" + operador2
				+ ")" + " = " + resultado);
	}

	public static void multiplicacion() {
		String operador1, operador2;
		double resultado = 0;
		System.out.println("Primer operador: ");
		operador1 = teclado.nextLine();
		double num1 = Double.parseDouble(operador1);
		double n1 = new Double(operador1);
		System.out.println("Segundo operador: ");
		operador2 = teclado.nextLine();
		double num2 = Double.parseDouble(operador2);
		double n2 = new Double(operador2);
		resultado = n1 * n2;
		System.out.println("(" + operador1 + ") " + "*" + " (" + operador2
				+ ")" + " = " + resultado);
	}

	public static void division() {
		String operador1, operador2;
		double resultado = 0;
		System.out.println("Primer operador: ");
		operador1 = teclado.nextLine();
		double num1 = Double.parseDouble(operador1);
		double n1 = new Double(operador1);
		System.out.println("Segundo operador: ");
		operador2 = teclado.nextLine();
		double num2 = Double.parseDouble(operador2);
		double n2 = new Double(operador2);
		if (n2 == 0) {
			System.out.println(" En el denominador se encuentra \n"
					+ "un cero, para evitar errores coloca otro número.");
			operador2 = teclado.nextLine();
			num2 = Double.parseDouble(operador2);
			n2 = new Double(operador2);
			resultado = n1 / n2;
			System.out.println("(" + operador1 + ") " + "/" + " (" + operador2
					+ ")" + " = " + resultado);
		} else {
			num2 = Double.parseDouble(operador2);
		n2 = new Double(operador2);
		resultado = n1 / n2;
		System.out.println("(" + operador1 + ") " + "/" + " (" + operador2
				+ ")" + " = " + resultado);
		}
	}

	public static void error() {
		System.out.println("Opción no válida, intente de nuevo");
	}

	public static void salir() {
		System.out.println("Fin del sistema");
	}

	public static void lineasenblanco() {
		System.out.println();
		System.out.println();
		System.out.println();
	}

	public static void main(String[] args) {
		int option;
		do {
			lineasenblanco();
			menu();
			option = Integer.valueOf(teclado.nextLine());
			switch (option) {
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
				division();
				break;
			case 5:
				salir();
				break;
			default:
				error();
				break;
			}
		} while (option != 5);

		teclado.close();
	}

}