package bjmm.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.BeforeClass;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import bjmm.app.Calculadora;

class CalculadoraTest {
	
	Calculadora calc=new Calculadora();
	@BeforeClass
	@Test
	void calc () {
		assertEquals(11,calc.sumar(5, 6));
	}
	@Test
	public void calRe() {
		assertEquals(12,calc.restar(1, 2));
	}
	
}
