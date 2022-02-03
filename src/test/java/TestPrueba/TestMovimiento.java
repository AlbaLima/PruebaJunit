package TestPrueba;

import static org.junit.Assert.*;

import org.hamcrest.CoreMatchers;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestMovimiento extends CoreMatchers {
	
	private Movimiento mov;

	@Before
	public void setUp() throws Exception {
		mov = new Movimiento();
				
	}
	
	
	@Test
	public void compruebaImporte() {
		mov.setImporte(25.5);
		assertThat("El importe es doble", mov.getImporte(), isA(Double.class));
		assertThat("El importe es correcto", mov.getImporte(), is (25.5));
	}
	
	@Test
	public void compruebaConcepto() {
		mov.setConcepto("CompraZara");
		assertThat("El concepto es un String", mov.getConcepto(), isA(String.class));
		assertThat("El concepto es correcto", mov.getConcepto(), is ("CompraZara"));
	}
	
	
	@After
	public void tearDown() throws Exception {
	}


}
