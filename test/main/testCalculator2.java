package main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class testCalculator {
	double num1 = Double.MAX_VALUE;
	double num2 = Double.MAX_VALUE;
	double num3 = 3;
	double num4 = 2;
	double zero = 0;
	calculator calculator = new calculator();
	// ADD MaxValue
	@Test
	public void PPAddMAX() throws Exception {
		Exception thrown = assertThrows(Exception.class, () -> calculator.Add(num1, num2),
				"Expected doThing() to throw, but it didn't");
		assertTrue(thrown.getMessage().contains("the number is too big"));
	}
	@Test
	public void PZAddMAX() throws Exception {
		Exception thrown = assertThrows(Exception.class, () -> calculator.Add(num1, zero),
				"Expected doThing() to throw, but it didn't");
		assertTrue(thrown.getMessage().contains("the number is too big"));
	}
	@Test
	public void PMAddMAX() throws Exception {
		assertEquals(zero, calculator.Add(num1, -num1));
	}
	@Test
	public void ZPAddMAX() throws Exception {
		Exception thrown = assertThrows(Exception.class, () -> calculator.Add(zero, num2),
				"Expected doThing() to throw, but it didn't");
		assertTrue(thrown.getMessage().contains("the number is too big"));
	}
	@Test
	public void ZMAddMAX() throws Exception {
		Exception thrown = assertThrows(Exception.class, () -> calculator.Add(zero, -num2),
				"Expected doThing() to throw, but it didn't");
		assertTrue(thrown.getMessage().contains("the number is too big"));
	}
	@Test
	public void MPAddMAX() throws Exception {
		assertEquals(zero, calculator.Add(-num1, num2));
	}
	@Test
	public void MZAddMAX() throws Exception {
		Exception thrown = assertThrows(Exception.class, () -> calculator.Add(-num1, zero),
				"Expected doThing() to throw, but it didn't");
		assertTrue(thrown.getMessage().contains("the number is too big"));
	}
	@Test
	public void MMAddMAX() throws Exception {
		Exception thrown = assertThrows(Exception.class, () -> calculator.Add(-num1, -num2),
				"Expected doThing() to throw, but it didn't");
		assertTrue(thrown.getMessage().contains("the number is too big"));
	}
	// SUBTRACT MaxValue
	@Test
	public void PPSubtractMAX() throws Exception {
		assertEquals(zero, calculator.Subtract(num1, num2));
	}
	@Test
	public void PZSubtractMAX() throws Exception {
		Exception thrown = assertThrows(Exception.class, () -> calculator.Subtract(num1, zero),
				"Expected doThing() to throw, but it didn't");
		assertTrue(thrown.getMessage().contains("the number is too big"));
	}
	@Test
	public void PMSubtractMAX() throws Exception {
		Exception thrown = assertThrows(Exception.class, () -> calculator.Subtract(num1, -num2),
				"Expected doThing() to throw, but it didn't");
		assertTrue(thrown.getMessage().contains("the number is too big"));
	}
	@Test
	public void ZPSubtractMAX() throws Exception {
		Exception thrown = assertThrows(Exception.class, () -> calculator.Subtract(zero, num2),
				"Expected doThing() to throw, but it didn't");
		assertTrue(thrown.getMessage().contains("the number is too big"));
	}
	@Test
	public void ZMSubtractMAX() throws Exception {
		Exception thrown = assertThrows(Exception.class, () -> calculator.Subtract(zero, -num2),
				"Expected doThing() to throw, but it didn't");
		assertTrue(thrown.getMessage().contains("the number is too big"));
	}
	@Test
	public void MPSubtractMAX() throws Exception {
		Exception thrown = assertThrows(Exception.class, () -> calculator.Subtract(-num1, num2),
				"Expected doThing() to throw, but it didn't");
		assertTrue(thrown.getMessage().contains("the number is too big"));
	}
	@Test
	public void MZSubtractMAX() throws Exception {
		Exception thrown = assertThrows(Exception.class, () -> calculator.Subtract(-num1, zero),
				"Expected doThing() to throw, but it didn't");
		assertTrue(thrown.getMessage().contains("the number is too big"));
	}
	@Test
	public void MMSubtractMAX() throws Exception {
		assertEquals(zero, calculator.Subtract(-num1, -num1));
	}
	// MULTIPLY MaxValue
	@Test
	public void PPMultiplyMAX() throws Exception {
		Exception thrown = assertThrows(Exception.class, () -> calculator.Multiply(num1, num2),
				"Expected doThing() to throw, but it didn't");
		assertTrue(thrown.getMessage().contains("the number is too big"));
	}
	@Test
	public void PZMultiplyMAX() throws Exception {
		assertEquals(zero, calculator.Multiply(num1, zero));
	}
	@Test
	public void PMMultiplyMAX() throws Exception {
		Exception thrown = assertThrows(Exception.class, () -> calculator.Multiply(num1, -num2),
				"Expected doThing() to throw, but it didn't");
		assertTrue(thrown.getMessage().contains("the number is too big"));
	}
	@Test
	public void ZPMultiplyMAX() throws Exception {
		assertEquals(zero, calculator.Multiply(zero, num2));
	}
	@Test
	public void ZMMultiplyMAX() throws Exception {
		assertEquals(zero * -num1 , calculator.Multiply(zero, -num1));
	}
	@Test
	public void MPMultiplyMAX() throws Exception {
		Exception thrown = assertThrows(Exception.class, () -> calculator.Multiply(-num1, num2),
				"Expected doThing() to throw, but it didn't");
		assertTrue(thrown.getMessage().contains("the number is too big"));
	}
	@Test
	public void MZMultiplyMAX() throws Exception {
		assertEquals(-num1 * zero, calculator.Multiply(-num1, zero));
	}
	@Test
	public void MMMultiplyMAX() throws Exception {
		Exception thrown = assertThrows(Exception.class, () -> calculator.Multiply(-num1, -num2),
				"Expected doThing() to throw, but it didn't");
		assertTrue(thrown.getMessage().contains("the number is too big"));
	}
	// SUBTRACT MaxValue
	@Test
	public void PPDevideMAX() throws Exception {
		assertEquals(num1 / num2, calculator.Devide(num1, num2));
	}
	@Test
	public void PZDevideMAX() throws Exception {
		Exception thrown = assertThrows(Exception.class, () -> calculator.Devide(num1, 0),
				"Expected doThing() to throw, but it didn't");
		assertTrue(thrown.getMessage().contains("cannot devide by zero"));
	}
	@Test
	public void PMDevideMAX() throws Exception {
		assertEquals(-1, calculator.Devide(num1, -num1));
	}
	@Test
	public void ZPDevideMAX() throws Exception {
		assertEquals(zero / num1, calculator.Devide(zero, num1));
	}
	@Test
	public void ZMDevideMAX() throws Exception {
		assertEquals(zero / -num1, calculator.Devide(zero, -num1));
	}
	@Test
	public void MPDevideMAX() throws Exception {
		assertEquals(-num1 / num2, calculator.Devide(-num1, num2));
	}
	@Test
	public void MZDevideMAX() throws Exception {
		Exception thrown = assertThrows(Exception.class, () -> calculator.Devide(-num1, 0),
				"Expected doThing() to throw, but it didn't");
		assertTrue(thrown.getMessage().contains("cannot devide by zero"));
	}
	@Test
	public void MMDevideMAX() throws Exception {
		assertEquals(1, calculator.Devide(-num1, -num1));
	}
	// REST MaxValue
	@Test
	public void PPRestMAX() throws Exception {
		assertEquals(num1 % num2, calculator.Rest(num1, num2));
	}
	@Test
	public void PZRestMAX() throws Exception {
		Exception thrown = assertThrows(Exception.class, () -> calculator.Rest(num1, 0),
				"Expected doThing() to throw, but it didn't");
		assertTrue(thrown.getMessage().contains("cannot devide by zero"));
	}
	@Test
	public void PMRestMAX() throws Exception {
		assertEquals(num1 % -num1, calculator.Rest(num1, -num1));
	}
	@Test
	public void ZPRestMAX() throws Exception {
		assertEquals(zero % num2, calculator.Rest(zero, num1));
	}
	@Test
	public void ZMRestMAX() throws Exception {
		assertEquals(zero % -num1, calculator.Rest(zero, -num1));
	}
	@Test
	public void MPRestMAX() throws Exception {
		assertEquals(-num1 % num2, calculator.Rest(-num1, num2));
	}
	@Test
	public void MZRestMAX() throws Exception {
		Exception thrown = assertThrows(Exception.class, () -> calculator.Rest(-num1, 0),
				"Expected doThing() to throw, but it didn't");
		assertTrue(thrown.getMessage().contains("cannot devide by zero"));
	}
	@Test
	public void MMRestMAX() throws Exception {
		assertEquals(-num1 % -num1, calculator.Rest(-num1, -num1));
	}

	// ADD
	@Test
	public void PPAdd() throws Exception {
		assertEquals(num3 + num4, calculator.Add(num3, num4));
	}
	@Test
	public void PZAdd() throws Exception {
		assertEquals(num3 + zero, calculator.Add(num3, zero));
	}
	@Test
	public void PMAdd() throws Exception {
		assertEquals(num3 - num3, calculator.Add(num3, -num3));
	}
	@Test
	public void ZPAdd() throws Exception {
		assertEquals(zero + num4, calculator.Add(zero, num4));
	}
	@Test
	public void ZZAdd() throws Exception {
		assertEquals(zero + zero, calculator.Add(zero, zero));
	}
	@Test
	public void ZMAdd() throws Exception {
		assertEquals(zero - num3, calculator.Add(zero, -num3));
	}
	@Test
	public void MPAdd() throws Exception {
		assertEquals(-num3 + num4, calculator.Add(-num3, num4));
	}
	@Test
	public void MZAdd() throws Exception {
		assertEquals(-num3 + zero, calculator.Add(-num3, zero));
	}
	@Test
	public void MMAdd() throws Exception {
		assertEquals(-num3 - num3, calculator.Add(-num3, -num3));
	}
	// SUBTRACT
	@Test
	public void PPSubtract() throws Exception {
		assertEquals(num3 - num4, calculator.Subtract(num3, num4));
	}
	@Test
	public void PZSubtract() throws Exception {
		assertEquals(num3 - zero, calculator.Subtract(num3, zero));
	}
	@Test
	public void PMSubtract() throws Exception {
		assertEquals(num3 - (-num3), calculator.Subtract(num3, -num3));
	}
	@Test
	public void ZPSubtract() throws Exception {
		assertEquals(zero - num4, calculator.Subtract(zero, num4));
	}
	@Test
	public void ZZSubtract() throws Exception {
		assertEquals(zero - zero, calculator.Subtract(zero, zero));
	}
	@Test
	public void ZMSubtract() throws Exception {
		assertEquals(zero - (-num3), calculator.Subtract(zero, -num3));
	}
	@Test
	public void MPSubtract() throws Exception {
		assertEquals(-num3 - num4, calculator.Subtract(-num3, num4));
	}
	@Test
	public void MZSubtract() throws Exception {
		assertEquals(-num3 - zero, calculator.Subtract(-num3, zero));
	}
	@Test
	public void MMSubtract() throws Exception {
		assertEquals(-num3 - (-num3), calculator.Subtract(-num3, -num3));
	}
	// MULTIPLY
	@Test
	public void PPMultiply() throws Exception {
		assertEquals(num3 * num4, calculator.Multiply(num3, num4));
	}
	@Test
	public void PZMultiply() throws Exception {
		assertEquals(num3 * zero, calculator.Multiply(num3, zero));
	}
	@Test
	public void PMMultiply() throws Exception {
		assertEquals(num3 * -num3, calculator.Multiply(num3, -num3));
	}
	@Test
	public void ZPMultiply() throws Exception {
		assertEquals(zero * num4, calculator.Multiply(zero, num4));
	}
	@Test
	public void ZZMultiply() throws Exception {
		assertEquals(zero * zero, calculator.Multiply(zero, zero));
	}
	@Test
	public void ZMMultiply() throws Exception {
		assertEquals(zero * -num3, calculator.Multiply(zero, -num3));
	}
	@Test
	public void MPMultiply() throws Exception {
		assertEquals(-num3 * num4, calculator.Multiply(-num3, num4));
	}
	@Test
	public void MZMultiply() throws Exception {
		assertEquals(-num3 * zero, calculator.Multiply(-num3, zero));
	}
	@Test
	public void MMMultiply() throws Exception {
		assertEquals(-num3 * -num3, calculator.Multiply(-num3, -num3));
	}
	// SUBTRACT
	@Test
	public void PPDevide() throws Exception {
		assertEquals(num3 / num4, calculator.Devide(num3, num4));
	}
	@Test
	public void PZDevide() throws Exception {
		Exception thrown = assertThrows(Exception.class, () -> calculator.Devide(num3, 0),
				"Expected doThing() to throw, but it didn't");
		assertTrue(thrown.getMessage().contains("cannot devide by zero"));
	}
	@Test
	public void PMDevide() throws Exception {
		assertEquals(num3 / -num3, calculator.Devide(num3, -num3));
	}
	@Test
	public void ZPDevide() throws Exception {
		assertEquals(zero / num3, calculator.Devide(zero, num3));
	}
	@Test
	public void ZZDevide() throws Exception {
		Exception thrown = assertThrows(Exception.class, () -> calculator.Devide(zero, 0),
				"Expected doThing() to throw, but it didn't");
		assertTrue(thrown.getMessage().contains("cannot devide by zero"));
	}
	@Test
	public void ZMDevide() throws Exception {
		assertEquals(zero / -num3, calculator.Devide(zero, -num3));
	}
	@Test
	public void MPDevide() throws Exception {
		assertEquals(-num3 / num4, calculator.Devide(-num3, num4));
	}
	@Test
	public void MZDevide() throws Exception {
		Exception thrown = assertThrows(Exception.class, () -> calculator.Devide(-num3, 0),
				"Expected doThing() to throw, but it didn't");
		assertTrue(thrown.getMessage().contains("cannot devide by zero"));
	}
	@Test
	public void MMDevide() throws Exception {
		assertEquals(-num3 / -num3, calculator.Devide(-num3, -num3));
	}
	// REST
	@Test
	public void PPRest() throws Exception {
		assertEquals(num3 % num4, calculator.Rest(num3, num4));
	}
	@Test
	public void PZRest() throws Exception {
		Exception thrown = assertThrows(Exception.class, () -> calculator.Rest(num3, 0),
				"Expected doThing() to throw, but it didn't");
		assertTrue(thrown.getMessage().contains("cannot devide by zero"));
	}
	@Test
	public void PMRest() throws Exception {
		assertEquals(num3 % -num3, calculator.Rest(num3, -num3));
	}
	@Test
	public void ZPRest() throws Exception {
		assertEquals(zero % num4, calculator.Rest(zero, num3));
	}
	@Test
	public void ZZRest() throws Exception {
		Exception thrown = assertThrows(Exception.class, () -> calculator.Rest(zero, zero),
				"Expected doThing() to throw, but it didn't");
		assertTrue(thrown.getMessage().contains("cannot devide by zero"));
	}
	@Test
	public void ZMRest() throws Exception {
		assertEquals(zero % -num3, calculator.Rest(zero, -num3));
	}
	@Test
	public void MPRest() throws Exception {
		assertEquals(-num3 % num4, calculator.Rest(-num3, num4));
	}
	@Test
	public void MZRest() throws Exception {
		Exception thrown = assertThrows(Exception.class, () -> calculator.Rest(-num3, 0),
				"Expected doThing() to throw, but it didn't");
		assertTrue(thrown.getMessage().contains("cannot devide by zero"));
	}
	@Test
	public void MMRest() throws Exception {
		final double result = calculator.Rest(-num3, -num3);
		assertEquals(-num3 % -num3, result);
	}
}
