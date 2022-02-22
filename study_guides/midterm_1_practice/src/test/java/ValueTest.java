
import static org.junit.Assert.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.validateMockitoUsage;

import java.util.Random;

import org.junit.*;
import org.mockito.*;

public class ValueTest {
//	private Value value;
//
//	@Before
//	public void setUp() {
//		value = Mockito.mock(Value.class);
//	}
//	
//	@Test
//	public void testIncValNone() {
//		Mockito.when(value.getVal()).thenReturn(0);
//		assertEquals(0, value.getVal());
//	}
//	
//	@Test
//	public void testIncValOnce() {
//		value.incVal();
//		Mockito.when(value.getVal()).thenReturn(1);
//		assertEquals(1, value.getVal());
//	}
//
//	@Test
//	public void testIncValTwice() {
//		value.incVal();
//		value.incVal();
//		Mockito.when(value.getVal()).thenReturn(2);
//		assertEquals(2, value.getVal());
//	}
	
	/**
	   * Preconditions: A Value v is created.
	   *                A Buffer b is created from empty string "".
	   *                A Stringify s is created using b.
	   *                Value v contains the int value 2.
	   * Execution steps: Call s.append(v).
	   * Postconditions: The string "2" is appended to Buffer b.
	   */
	@Test
	public void testAppendTwo() {
		
		Value v = new Value();
		Buffer b = new Buffer("");
		Stringify s = new Stringify(b);
		v.incVal();
		v.incVal();
		assertEquals(v.getVal(), 2);
		
		s.append(v);
		assertEquals(b.toString(), "2");
	}
	
	
	/**
	   * Preconditions: A Value v is created.
	   *                A Buffer b is created from empty string "".
	   *                A Stringify s is created using b.
	   *                Value v contains the int value 2.
	   * Execution steps: Call s.append(v).
	   * Postconditions: The string "2" is appended to Buffer b.
	   */
	@Test
	public void testAppendTwoMock() {
		
		Value v = Mockito.mock(Value.class);
		Buffer b = Mockito.mock(Buffer.class);
		Stringify s = new Stringify(b);
	
		Mockito.when(v.getVal()).thenReturn(2);
		
		s.append(v);
		Mockito.verify(b,Mockito.times(1)).append("2");
		
		Mockito.when(b.toString()).thenReturn("2");
		
		assertEquals(b.toString(), "2");
		
	}
	
	/**
	   * Preconditions: A Buffer b is created from empty string "".
	   *                A Random r is created.
	   *                r.nextInt(100) returns 42.
	   * Execution steps: Call appendRandom using r.
	   * Postconditions: The string "42" is appended to Buffer b.
	   */
	@Test
	public void testAppendRandom() {
	  // TODO: Fill in
		Buffer b = new Buffer("");
		Random r = Mockito.mock(Random.class);
		Mockito.when(r.nextInt(100)).thenReturn(42);
		
		b.appendRandom(r);
		assertEquals(b.toString(),"42");
	}
	
}
