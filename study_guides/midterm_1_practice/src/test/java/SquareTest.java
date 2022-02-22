
import static org.junit.Assert.*;
import org.mockito.*;

import org.junit.Test;

public class SquareTest {

	/*
	 * Preconditions: A new Square square is created
	 *                A new Number number is created
	 * Execution Steps: Call square.setSquared(number, 3)
	 * PostConditions: The value of number is set to 9
	 */
	@Test
	public void testSetSquared() {
		// TODO: Fill in!
		
		Square square = new Square();
		Number number = new Number();
		//Mockito.when(number.getVal()).thenReturn(3);
		square.setSquared(number, 3);
		assertEquals(number.getVal(),9 );
		
		
		
	}
	
	/*
	 * Preconditions: A new Square square is created
	 *                A new Number number is created
	 * Execution Steps: Call square.setSquared(number, 3)
	 * PostConditions: The value of number is set to 9
	 */
	@Test
	public void testSetSquaredMocks() {
		// TODO: Fill in!
		
		Square square = new Square();
		Number number = Mockito.mock(Number.class);
		square.setSquared(number, 3);
		Mockito.when(number.getVal()).thenReturn(9);

		assertEquals(number.getVal(),9 );
		
		
		
	}

}
