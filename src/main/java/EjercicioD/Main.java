package EjercicioD;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Di un numero");
		String num = sc.nextLine();
		System.out.println("Dime el numero que buscas");
		char nu = sc.nextLine().charAt(0);
		Bibioteca.cantidadnum(num, nu);
	}

}
