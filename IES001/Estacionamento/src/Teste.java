import static org.junit.Assert.*;

import org.junit.Test;

public class Teste {

	@Test
	public void test() {
		Estacionamento estacionamento = new Estacionamento();
		assertEquals(estacionamento.getCarros().size(), 0);
		
	}

}
