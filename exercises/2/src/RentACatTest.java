import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import org.mockito.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RentACatTest {

	/**
	 * The test fixture for this JUnit test. Test fixture: a fixed state of a set of
	 * objects used as a baseline for running tests. The test fixture is initialized
	 * using the @Before setUp method which runs before every test case. The test
	 * fixture is removed using the @After tearDown method which runs after each
	 * test case.
	 */

	RentACat r; // Object to test
	Cat c1; // First mock cat object
	Cat c2; // Second mock cat object
	Cat c3; // Third mock cat object

	@Before
	public void setUp() throws Exception {
		// Turn on automatic bug injection in the Cat class, to emulate a buggy Cat.
		// Your unit tests should work regardless of these bugs if you mock all Cats.
		Cat.bugInjectionOn = true;

		// INITIALIZE THE TEST FIXTURE
		// 1. Create a new RentACat object and assign to r
		r = RentACat.createInstance();

		// 2. Create an unrented mock Cat with ID 1 and name "Jennyanydots", assign to c1
		// TODO: Fill in DONE
		c1 = Mockito.mock(Cat.class);
		Mockito.when(c1.getId()).thenReturn(1);
		Mockito.when(c1.getName()).thenReturn("Jennyanydots");
		
		
		// 3. Create an unrented mock Cat with ID 2 and name "Old Deuteronomy", assign to c2
		// TODO: Fill in DONE
		c2 = Mockito.mock(Cat.class);
		Mockito.when(c2.getId()).thenReturn(2);
		Mockito.when(c2.getName()).thenReturn("Old Deuteronomy");


		// 4. Create an unrented mock Cat with ID 3 and name "Mistoffelees", assign to c3
		// TODO: Fill in DONE
		c3 = Mockito.mock(Cat.class);
		Mockito.when(c3.getId()).thenReturn(3);
		Mockito.when(c3.getName()).thenReturn("Mistoffelees");


		
		// Hint: You will have to stub the mocked Cats to make them behave as if the ID
		// is 1 and name is "Jennyanydots", etc.
	}

	@After
	public void tearDown() throws Exception {
		// Not necessary strictly speaking since the references will be overwritten in
		// the next setUp call anyway and Java has automatic garbage collection.
		r = null;
		c1 = null;
		c2 = null;
		c3 = null;
	}

	/**
	 * Test case for Cat getCat(int id). Preconditions: r has no cats. Execution
	 * steps: Call getCat(2). Postconditions: Return value is null.
	 */

	@Test
	public void testGetCatNullNumCats0() {		
		// TODO PARTNER 2
	}

	/**
	 * Test case for Cat getCat(int id). Preconditions: c1, c2, and c3 are added to
	 * r using addCat(Cat c). Execution steps: Call getCat(2). Postconditions:
	 * Return value is not null. Returned cat has an ID of 2.
	 */

	@Test
	public void testGetCatNumCats3() {
		// TODO PARTNER 2
		
	
	}

	/**
	 * Test case for boolean catAvailable(int id). Preconditions: r has no cats.
	 * Execution steps: Call catAvailable(2). Postconditions: Return value is false.
	 */

	@Test
	public void testCatAvailableFalseNumCats0() {
		assertTrue(r.catAvailable(2) == false);
		// TODO
	}

	/**
	 * Test case for boolean catAvailable(int id). Preconditions: c1, c2, and c3 are
	 * added to r using addCat(Cat c). c3 is rented. c1 and c2 are not rented.
	 * Execution steps: Call catAvailable(2). Postconditions: Return value is true.
	 */

	@Test
	public void testCatAvailableTrueNumCats3() {
		r.addCat(c1);
		r.addCat(c2);
		r.addCat(c3);
		assertTrue(r.catAvailable(2) == true);
		// TODO
	}

	/**
	 * Test case for boolean catAvailable(int id). Preconditions: c1, c2, and c3 are
	 * added to r using addCat(Cat c). c2 is rented. c1 and c3 are not rented.
	 * Execution steps: Call catAvailable(2). Postconditions: Return value is false.
	 */

	@Test
	public void testCatAvailableFalseNumCats3() {
		// TODO
		
		r.addCat(c1);
		r.addCat(c2);
		Mockito.when(c2.getRented()).thenReturn(true); 
		r.addCat(c3);
		assertTrue(r.catAvailable(2) == false);
		
	}

	/**
	 * Test case for boolean catExists(int id). Preconditions: r has no cats.
	 * Execution steps: Call catExists(2). Postconditions: Return value is false.
	 */

	@Test
	public void testCatExistsFalseNumCats0() {
		assertTrue(r.catExists(2)== false);
		// TODO
	}

	/**
	 * Test case for boolean catExists(int id). Preconditions: c1, c2, and c3 are
	 * added to r using addCat(Cat c). Execution steps: Call catExists(2).
	 * Postconditions: Return value is true.
	 */

	@Test
	public void testCatExistsTrueNumCats3() {
		
		// TODO PARTNER 2
	}

	/**
	 * Test case for String listCats(). Preconditions: r has no cats. Execution
	 * steps: Call listCats(). Postconditions: Return value is "".
	 */

	@Test
	public void testListCatsNumCats0() {
		assertTrue(r.listCats() == "");
		// TODO
	}

	/**
	 * Test case for String listCats(). 
	 * Preconditions: c1, c2, and c3 are added to r
	 * using addCat(Cat c).
	 *  Execution steps: Call listCats(). 
	 * Postconditions: Return
	 * value is "ID 1. Jennyanydots\nID 2. Old Deuteronomy\nID 3. Mistoffelees\n".
	 */

	@Test
	public void testListCatsNumCats3() {
		r.addCat(c1);
		r.addCat(c2);
		r.addCat(c3);
		// TODO
	}

	/**
	 * Test case for boolean rentCat(int id). Preconditions: r has no cats.
	 * Execution steps: Call rentCat(2). Postconditions: Return value is false.
	 */

	@Test
	public void testRentCatFailureNumCats0() {
		assertTrue(r.rentCat(2) == false);
		// TODO
	}

	/**
	 * Test case for boolean rentCat(int id). Preconditions: c1, c2, and c3 are
	 * added to r using addCat(Cat c). c2 is rented. Execution steps: Call
	 * rentCat(2). Postconditions: Return value is false. c1.rentCat(),
	 * c2.rentCat(), c3.rentCat() are never called.
	 * 
	 * Hint: See Example/NoogieTest.java in testBadgerPlayCalled method to see an
	 * example of behavior verification.
	 */

	@Test
	public void testRentCatFailureNumCats3() {
		r.addCat(c1);
		r.addCat(c2);
		r.addCat(c3);
		Mockito.when(c2.getRented()).thenReturn(true);
		assertTrue(r.rentCat(2) == false);
		
		// TODO
	}

	/**
	 * Test case for boolean returnCat(int id). Preconditions: r has no cats.
	 * Execution steps: Call returnCat(2). Postconditions: Return value is false.
	 */

	@Test
	public void testReturnCatFailureNumCats0() {
		// TODO  PARTNER 2
	}

	/**
	 * Test case for boolean returnCat(int id). Preconditions: c1, c2, and c3 are
	 * added to r using addCat(Cat c). c2 is rented. Execution steps: Call
	 * returnCat(2). Postconditions: Return value is true. c2.returnCat() is called
	 * exactly once. c1.returnCat() and c3.returnCat are never called.
	 * 
	 * Hint: See Example/NoogieTest.java in testBadgerPlayCalled method to see an
	 * example of behavior verification.
	 */

	@Test
	public void testReturnCatNumCats3() {
		// TODO partner 2
	}
}
