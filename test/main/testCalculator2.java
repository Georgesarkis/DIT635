package main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class testCalculator {
	double num1 = 2;
	double num2 = 3;
	double zero = 0;
	calculator calculator = new calculator();
	// ADD
	@Test
	public void PPAdd() throws Exception {
		assertEquals(num1 + num2, calculator.Add(num1, num2));
	}
	@Test
	public void PZAdd() throws Exception {
		assertEquals(num1+ zero, calculator.Add(num1, zero));
	}
	@Test
	public void PMAdd() throws Exception {
		assertEquals(num1 -num1, calculator.Add(num1, -num1));
	}
	@Test
	public void ZPAdd() throws Exception {
		assertEquals(zero + num2, calculator.Add(zero, num2));
	}
	@Test
	public void ZZAdd() throws Exception {
		assertEquals(zero + zero, calculator.Add(zero, zero));
	}
	@Test
	public void ZMAdd() throws Exception {
		assertEquals(zero -num1, calculator.Add(zero, -num1));
	}
	@Test
	public void MPAdd() throws Exception {
		assertEquals(-num1 + num2, calculator.Add(-num1, num2));
	}
	@Test
	public void MZAdd() throws Exception {
		assertEquals(-num1 + zero, calculator.Add(-num1, zero));
	}
	@Test
	public void MMAdd() throws Exception {
		assertEquals(-num1 -num1, calculator.Add(-num1, -num1));
	}
	// SUBTRACT
	@Test
	public void PPSubtract() throws Exception {
		assertEquals(num1 - num2, calculator.Subtract(num1, num2));
	}
	@Test
	public void PZSubtract() throws Exception {
		assertEquals(num1 - zero, calculator.Subtract(num1, zero));
	}
	@Test
	public void PMSubtract() throws Exception {
		assertEquals(num1 - (-num1), calculator.Subtract(num1, -num1));
	}
	@Test
	public void ZPSubtract() throws Exception {
		assertEquals(zero -num2, calculator.Subtract(zero, num2));
	}
	@Test
	public void ZZSubtract() throws Exception {
		assertEquals(zero - zero, calculator.Subtract(zero, zero));
	}
	@Test
	public void ZMSubtract() throws Exception {
		assertEquals(zero - (-num1),  calculator.Subtract(zero, -num1));
	}
	@Test
	public void MPSubtract() throws Exception {
		assertEquals(-num1 - num2, calculator.Subtract(-num1, num2));
	}
	@Test
	public void MZSubtract() throws Exception {
		assertEquals(-num1 - zero, calculator.Subtract(-num1, zero));
	}
	@Test
	public void MMSubtract() throws Exception {
		assertEquals(-num1 -(-num1), calculator.Subtract(-num1, -num1));
	}	
	// MULTIPLY
	@Test
	public void PPMultiply() throws Exception {
		assertEquals(num1*num2, calculator.Multiply(num1, num2));
	}
	@Test
	public void PZMultiply() throws Exception {
		assertEquals(num1*zero, calculator.Multiply(num1, zero));
	}
	@Test
	public void PMMultiply() throws Exception {
		assertEquals(num1 * -num1, calculator.Multiply(num1, -num1));
	}
	@Test
	public void ZPMultiply() throws Exception {
		assertEquals(zero * num2, calculator.Multiply(zero, num2));
	}
	@Test
	public void ZZMultiply() throws Exception {
		assertEquals(zero * zero,  calculator.Multiply(zero, zero));
	}
	@Test
	public void ZMMultiply() throws Exception {
		assertEquals(zero * -num1, calculator.Multiply(zero, -num1));
	}
	@Test
	public void MPMultiply() throws Exception {
		assertEquals(-num1 * num2, calculator.Multiply(-num1, num2));
	}
	@Test
	public void MZMultiply() throws Exception {
		assertEquals(-num1 * zero, calculator.Multiply(-num1, zero));
	}
	@Test
	public void MMMultiply() throws Exception {
		assertEquals(-num1 * -num1, calculator.Multiply(-num1, -num1));
	}
	// SUBTRACT
	@Test
	public void PPDevide() throws Exception {
		assertEquals(num1 / num2, calculator.Devide(num1, num2));
	}
	@Test
	public void PZDevide() throws Exception {
		Exception thrown = assertThrows(Exception.class, () -> calculator.Devide(num1, 0),"Expected doThing() to throw, but it didn't");
		assertTrue(thrown.getMessage().contains("cannot devide by zero"));
	}
	@Test
	public void PMDevide() throws Exception {
		assertEquals(num1 / -num1, calculator.Devide(num1, -num1));
	}
	@Test
	public void ZPDevide() throws Exception {
		assertEquals(zero / num1, calculator.Devide(zero, num1));
	}
	@Test
	public void ZZDevide() throws Exception {
		Exception thrown = assertThrows(Exception.class, () -> calculator.Devide(zero, 0),"Expected doThing() to throw, but it didn't");
		assertTrue(thrown.getMessage().contains("cannot devide by zero"));
	}
	@Test
	public void ZMDevide() throws Exception {
		assertEquals(zero / -num1, calculator.Devide(zero, -num1));
	}
	@Test
	public void MPDevide() throws Exception {
		assertEquals(-num1 / num2, calculator.Devide(-num1, num2));
	}
	@Test
	public void MZDevide() throws Exception {
		Exception thrown = assertThrows(Exception.class, () -> calculator.Devide(-num1, 0),"Expected doThing() to throw, but it didn't");
        assertTrue(thrown.getMessage().contains("cannot devide by zero"));
	}
	@Test
	public void MMDevide() throws Exception {
		assertEquals(-num1 / -num1, calculator.Devide(-num1, -num1));
	}
	// REST
	@Test
	public void PPRest() throws Exception {
		assertEquals(num1%num2, calculator.Rest(num1, num2));
	}
	@Test
	public void PZRest() throws Exception {
		Exception thrown = assertThrows(Exception.class, () -> calculator.Rest(num1, 0),"Expected doThing() to throw, but it didn't");
		assertTrue(thrown.getMessage().contains("cannot devide by zero"));
	}
	@Test
	public void PMRest() throws Exception {
		assertEquals(num1%-num1, calculator.Rest(num1, -num1));
	}
	@Test
	public void ZPRest() throws Exception {
		assertEquals(zero%num2,  calculator.Rest(zero, num1));
	}
	@Test
	public void ZZRest() throws Exception {
		Exception thrown = assertThrows(Exception.class, () -> calculator.Rest(zero, zero),"Expected doThing() to throw, but it didn't");
		assertTrue(thrown.getMessage().contains("cannot devide by zero"));
	}
	@Test
	public void ZMRest() throws Exception {
		assertEquals(zero%-num1, calculator.Rest(zero, -num1));
	}
	@Test
	public void MPRest() throws Exception {
		assertEquals(-num1%num2, calculator.Rest(-num1, num2));
	}
	@Test
	public void MZRest() throws Exception {
		Exception thrown = assertThrows(Exception.class, () -> calculator.Rest(-num1, 0),"Expected doThing() to throw, but it didn't");
		assertTrue(thrown.getMessage().contains("cannot devide by zero"));
	}
	@Test
	public void MMRest() throws Exception {
		final double result = calculator.Rest(-num1, -num1);
		assertEquals(-num1%-num1, result);
	}
}
