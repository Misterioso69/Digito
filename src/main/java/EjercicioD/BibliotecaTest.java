package EjercicioD;

import org.junit.Assert;
import org.junit.Test;

public class BibliotecaTest {
	@Test
	public void cantidadnumtest () throws Exception {
		String a = "1646464";
		char b = '1';
		int c = Bibioteca.cantidadnum(a, b);
		Assert.assertEquals(1, c);
	}
	
	@Test (expected = Exception.class)
	public void cantidadtest () throws Exception {
		String a = "1646464";
		char b = '9';
		Bibioteca.cantidadnum(a, b);	
	}
}
