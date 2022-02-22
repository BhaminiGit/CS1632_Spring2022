
import static org.junit.Assert.*;

import java.util.Random;


import org.junit.*;
import org.mockito.*;

public class RandomValueTest {
	RandomValue value;
	Random rand;

	@Before
	public void setUp() {
		rand = Mockito.mock(Random.class);
		value = new RandomValue(rand);
		Mockito.when(rand.nextInt(2)).thenReturn(1); 

		
	}
	
	@Test
	public void testIncValNone() {
		assertEquals(0, value.getVal());
	}
	
	@Test
	public void testIncValOnce() {

		value.incVal();
		assertEquals(1, value.getVal());
	}

	@Test
	public void testIncValTwice() {
		value.incVal();
		value.incVal();
		assertEquals(2, value.getVal());
	}
	
	@Test
	public void testIncValOnceNextIntZero() {	
		Mockito.when(rand.nextInt(2)).thenReturn(0); 
		value.incVal();
		assertEquals(0,value.getVal());
	}
	
	@Test
	public void testIncValTwiceNextIntZero() {
		Mockito.when(rand.nextInt(2)).thenReturn(0); 
		value.incVal();
		value.incVal();
		assertEquals(0,value.getVal());
	}
}
