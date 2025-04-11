package EjercicioD;

public class Bibioteca {
	public static int cantidadnum (String a , char b) throws Exception {
		int suma =0;
        boolean encontrado = false;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == b) {
                System.out.println("Encontrado en la posición: " + (i + 1));
                encontrado = true;
                suma+=i+1;
            }
        }

        if (!encontrado) {
            throw new Exception("El dígito no se encuentra en el número.");
        }else {
        	return suma;
        }
	}
}
