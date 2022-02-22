

import static org.junit.Assert.*;
import static org.mockito.Mockito.times;

import org.mockito.*;

import org.junit.Test;

public class DeathStarTest {

	/*
	 * Preconditions: A new DeathStar deathStar is created
	 *                A new Planet planet is created with hit points 10
	 * Execution Steps: shoot planet with deathStar
	 * PostConditions: Return value of deathStar.shoot(planet) is "Wimpy planet was hit by the superlaser!"
	 *                 Planet receives a damage of 100 hit points
	 */
	@Test
	public void testShootPlanet() {
		DeathStar d = new DeathStar();
		Planet p = new Planet(10);
		
		assertEquals(d.shoot(p), "Wimpy planet was hit by the superlaser!");
		assertEquals(p.getHitPoints(),-90);
		//Mockito.verify(p, times(1)).damage(100);
		// TODO: Fill in!
	}
	
	
	/*
	 * Preconditions: A new DeathStar deathStar is created
	 *                A new Planet planet is created with hit points 10
	 * Execution Steps: shoot planet with deathStar
	 * PostConditions: Return value of deathStar.shoot(planet) is "Wimpy planet was hit by the superlaser!"
	 *                 Planet receives a damage of 100 hit points
	 */
	@Test
	public void testShootPlanetMock() {
		DeathStar d = new DeathStar();
		Planet p = Mockito.mock(Planet.class);
		Mockito.when(p.toString()).thenReturn("Wimpy planet");
		assertEquals(d.shoot(p), "Wimpy planet was hit by the superlaser!");
		Mockito.verify(p, times(1)).damage(100);		

		//assertEquals(p.getHitPoints(),-90);
		// TODO: Fill in!
	}
}
